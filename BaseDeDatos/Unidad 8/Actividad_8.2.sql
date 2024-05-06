-- Activida_8.2

-- 1. SaldoTotal
delimiter $$ 
drop function if exists bancos.saldo_total $$
create function bancos.saldo_total() 
	returns decimal(10,2)
begin
	declare v_saldo_total decimal(10,2);
	SET v_saldo_total = (select sum(saldo) from cuentas);
	return (v_saldo_total);
end $$
delimiter ;

-- ejemplo
SELECT bancos.saldo_total();

-- 2. MejorCliente
delimiter $$ 
drop function if exists bancos.Mejor_Cliente $$
create function bancos.Mejor_Cliente() 
    returns int unsigned
begin
    DECLARE mejor_saldo DECIMAL(10, 2);
    DECLARE mejor_cliente_id INT unsigned;
    set mejor_saldo = (select max(saldo) from cuentas);
    set mejor_cliente_id = (select clientes.id from clientes inner join cuentas on cliente_id = clientes.id where saldo = mejor_saldo);
return (mejor_cliente_id);
end $$
delimiter ;

-- Ejemplo
select bancos.Mejor_Cliente();

-- 3. Función SaldoCuentas
delimiter $$ 
drop function if exists bancos.Saldo_cuentas $$
create function bancos.Saldo_cuentas(p_id_cuenta int unsigned)
    returns decimal(10, 2)
begin
	declare v_saldoTotal decimal(10,2);
	set v_saldoTotal = (select sum(cantidad) from movimientos where cuenta_id = p_id_cuenta);
	return (v_saldoTotal);
end $$
delimiter ;

-- Ejemplo
select bancos.Saldo_cuentas(3);

-- 4. Procedimiento VerificarSaldo
delimiter $$
drop procedure if exists bancos.VerificarSaldo $$
create procedure bancos.VerificarSaldo(p_id int unsigned) 
begin 
    if (bancos.Saldo_cuentas(p_id) != (select saldo from cuentas where cuentas.id = p_id)) then
					SELECT 'ERROR DE SALDO';
					select * from cuentas where cuentas.id = p_id;
	end if;
end $$
delimiter ;

-- Ejemplo
call bancos.VerificarSaldo(2);
