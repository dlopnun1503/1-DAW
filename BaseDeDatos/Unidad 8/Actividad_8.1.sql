-- Actividad_8.1

-- 1. Procedimiento Clientes
delimiter $$ 
drop procedure if exists bancos.clientes_ciudad $$
create procedure bancos.clientes_ciudad(poblacion varchar(20)) 
begin
select * from clientes where ciudad = poblacion;
end $$
delimiter ;


-- 2. Procedimiento Movimientos
delimiter $$ 
drop procedure if exists bancos.movimientos_cuentas $$
create procedure bancos.movimientos_cuentas(id_cuenta_p int unsigned) 
begin
select * from movimientos where cuenta_id = id_cuenta_p;
end $$
delimiter ;

-- 3. Procedimientos Cuentas
delimiter $$ 
drop procedure if exists bancos.clientes_cuentas $$
create procedure bancos.clientes_cuentas(id_cliente_p int unsigned) 
begin
select * from cuentas where cliente_id = id_cliente_p;
end $$
delimiter ;

-- 4. Procedimiento SaldosBajos
delimiter $$ 
drop procedure if exists bancos.saldosBajos $$
create procedure bancos.saldosBajos() 
begin
select cuentas.id, cuentas.iban, clientes.nombre, clientes.apellidos, clientes.dni, cuentas.saldo from clientes inner join cuentas on cliente_id = clientes.id where cuentas.saldo <= 200 ;
end $$
delimiter ;
