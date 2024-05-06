-- Actividad_8.4 

-- 1. 
-- Procedimiento: actualizar_saldo()
-- parametros: null
-- descripcion: actualzar el saldo a partir de los movimientos de una cuenta
delimiter $$
drop procedure if exists bancos.actualizar_saldo;
create procedure bancos.actualizar_saldo()
begin
     -- declaro variable boolean fin de cursor 
     declare v_lrf boolean default false;
     
     -- Declaro variables para cada columna 
     declare v_id int unsigned;
     declare v_iban char(24);
     declare v_saldo, f_saldo decimal(10,2);
     
     -- Declaro cursor 
     declare c_cuentas cursor for
     select id, iban, saldo from cuentas order by id;
     
     -- Declaro manejo de error
     declare continue handler for not found set v_lrf = 1;
     
     -- abro cursor 
     open c_cuentas;
     fetch c_cuentas into v_id, v_iban, v_saldo;
     while (not v_lrf) do
         set f_saldo = Saldo_cuentas(v_id);
         if f_saldo != v_saldo then
             update cuentas set saldo = f_saldo where id = v_id;
             select 'descuadre';
         end if;
      fetch c_cuentas into v_id, v_iban, v_slado;   
     end while;
end $$
delimiter ;

-- 
call actualizar_saldo();



-- 2. Cursor cuota_mantenimiento()
-- Procedimiento: cuota_mantenimiento()
-- Parámetros:  DECIMAL(10,2)
-- Descripción: Aplica una cuota de mantenimiento a todas las cuentas y registra el movimiento.

DELIMITER $$

DROP PROCEDURE IF EXISTS bancos.cuota_mantenimiento$$
CREATE PROCEDURE bancos.cuota_mantenimiento(IN cuota DECIMAL(10,2))
BEGIN
    DECLARE v_id INT;
    DECLARE done INT DEFAULT 0;

    DECLARE cuentas_cursor CURSOR FOR
        SELECT id FROM cuentas;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    OPEN cuentas_cursor;

    WHILE NOT done DO
        FETCH cuentas_cursor INTO v_id;
        INSERT INTO movimientos(fecha_hora, concepto, tipo_movimiento, importe, cuenta_id)
        VALUES(NOW(), 'Cuota mantenimiento 2021', 'R', -cuota, v_id);

        UPDATE cuentas SET saldo = saldo - cuota WHERE id = v_id;
    END WHILE;

    CLOSE cuentas_cursor;
END$$

DELIMITER ;

-- 3. Cursor cuota_mantenimiento_2()
-- Procedimiento: cuota_mantenimiento_2()
-- parametros: null
-- Descripción: Aplica una cuota de mantenimiento variable según el saldo de la cuenta.

DELIMITER $$

DROP PROCEDURE IF EXISTS bancos.cuota_mantenimiento_2$$
CREATE PROCEDURE bancos.cuota_mantenimiento_2()
BEGIN
    DECLARE v_id int;
    declare v_saldo DECIMAL(10,2);
    DECLARE v_cuota DECIMAL(10,2);
    DECLARE done INT DEFAULT 0;

    DECLARE cuentas_cursor CURSOR FOR
        SELECT id, saldo FROM cuentas;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    OPEN cuentas_cursor;

    WHILE NOT done DO
        FETCH cuentas_cursor INTO v_id, v_saldo;
        IF v_saldo < 2000 THEN
            SET v_cuota = 20;
        ELSEIF v_saldo BETWEEN 2000 AND 10000 THEN
            SET v_cuota = 10;
        ELSE
            SET v_cuota = 5;
        END IF;

        INSERT INTO movimientos(fecha_hora, concepto, tipo_movimiento, importe, cuenta_id)
        VALUES(NOW(), 'Cuota mantenimiento 2021', 'R', -v_cuota, v_id);

        UPDATE cuentas SET saldo = saldo - v_cuota WHERE id = v_id;
    END WHILE;

    CLOSE cuentas_cursor;
END$$

DELIMITER ;


