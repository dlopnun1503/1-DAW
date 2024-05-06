-- David Lopez 
-- Actividad_8.6

-- Actividad 1
-- Evento: movimientos_semanales
-- Tipo: Every 
-- Periodo: cada semana
-- Descripcion:  generar un fichero CSV llamado moviweek.csv con 
-- todos los movimientos registrados durante dicha semana. 

delimiter $$
drop event if exists bancos.movimientos_semanales $$
create event if not exists bancos.movimientos_semanales 
on schedule every 1 week 
starts '2024-05-06 00:00:00' 
ends '2024-05-06 00:00:00' + interval 1 year
enable
do
begin
       SELECT * FROM bancos.movimientos where week (now()) - 1 = week(fechahora)
       INTO OUTFILE 'C:\\Users\\dlopnun1503\\Desktop\\BaseDeDatos\\moviweek.csv' 
       FIELDS TERMINATED BY ';'
	   OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n';
end $$
delimiter ;


-- Actividad 2
-- Evento: verificacion_saldo_diario
-- Tipo: Every 
-- Periodo: cada dia
-- Descripcion:  verificar el saldo de todas las cuentas, para ello usar el procedimiento ya creado llamado actualizar_saldo,
-- que a su vez este procedimiento usa la función saldo_cuenta()
delimiter $$
drop event if exists bancos.verificacion_saldo_diario $$
create event if not exists bancos.verificacion_saldo_diario 
on schedule every 1 day 
starts '2024-05-04 00:00:00' 
ends '2024-05-04 00:00:00' + interval 1 year
enable
do call actualizar_saldo;
delimiter ;



-- Actividad 3
-- Evento: verificacion_cliente_mensual.
-- Tipo: At 
-- Periodo: dentro de una hora
-- Descripcion: generar un fichero CSV llamado clientesenrojo.csv con los detalles de los clientes que tienen alguna cuenta en saldo rojo,
-- es decir, con saldo inferior a 0
delimiter $$
drop event if exists bancos.verificacion_cliente_mensual $$
create event if not exists bancos.verificacion_cliente_mensual
ON SCHEDULE AT CURRENT_TIMESTAMP + INTERVAL 1 HOUR 
ENABLE
DO 
begin
      select clientes.id, clientes.nombre, clientes.apellidos, clientes.email, cuentas.iban, cuentas.saldo from
      clientes inner join cuentas on cuentas.cliente_id = clientes.id where cuentas.saldo < 0
      INTO OUTFILE 'C:\\Users\\dlopnun1503\\Desktop\\BaseDeDatos\\clientesenrojo.csv' 
	  FIELDS TERMINATED BY ';'
	  OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n';
end $$
delimiter ;      