-- David Lopez
-- Actividad_8.5


-- Actividad 1. bonificacion_apertura()
DELIMITER $$
DROP TRIGGER IF EXISTS bancos.bonificacion_apertura$$
CREATE TRIGGER bancos.bonificacion_apertura
AFTER INSERT ON cuentas
FOR EACH ROW
BEGIN
    INSERT INTO movimientos (cuenta_id, fechahora, concepto, tipo, cantidad)
    VALUES (new.id  , now(), 'Bonificación de Apertura Cuenta', 'I', 20.00);
END$$
DELIMITER ;



-- Actividad 2. validar_movimiento()
DELIMITER $$
DROP TRIGGER IF EXISTS bancos.validar_movimiento$$
CREATE TRIGGER bancos.validar_movimiento
BEFORE INSERT ON movimientos
FOR EACH ROW
BEGIN
    DECLARE saldo_actual DECIMAL(10, 2);
    
    -- Obtener el saldo actual de la cuenta
    SELECT saldo INTO saldo_actual FROM cuentas WHERE id = NEW.cuenta_id;
    
    -- Si el tipo de movimiento es un reintegro (R)
    IF NEW.tipo = 'R' THEN
        -- Si la cantidad a retirar es mayor que el saldo disponible
        IF NEW.cantidad > saldo_actual THEN
            -- Establecer la cantidad a retirar como cero
            SET NEW.cantidad = 0;
        END IF;
    -- Si el tipo de movimiento es un ingreso (I)
    ELSEIF NEW.tipo = 'I' THEN
        -- Actualizar el saldo de la cuenta
        UPDATE cuentas SET saldo = saldo_actual + NEW.cantidad WHERE id = NEW.cuenta_id;
    END IF;
END$$
DELIMITER ;

