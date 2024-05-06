use gesbank;

-- 1
select
mo.id,
cu.id as id_cuenta,
cu.num_cuenta,
cl.apellidos,
cl.nombre,
mo.fecha_hora,
mo.tipo,
mo.cantidad,
mo.saldo
from (movimientos as mo inner join cuentas as cu on mo.id_cuenta = cu.id) inner join clientes as cl on cu.id_cliente = cl.id
order by mo.id asc;

create or replace view mov_clientes as
select
mo.id,
cu.id as id_cuenta,
cu.num_cuenta,
cl.apellidos,
cl.nombre,
mo.fecha_hora,
mo.tipo,
mo.cantidad,
mo.saldo
from (movimientos as mo inner join cuentas as cu on mo.id_cuenta = cu.id) inner join clientes as cl on cu.id_cliente = cl.id
order by mo.id asc;

select * from mov_clientes where year(fecha_hora) = '2021'; 
select * from mov_clientes where tipo = 'I';
select * from mov_clientes where tipo = 'R' and cantidad < 10;
SELECT num_cuenta, sum(saldo) FROM mov_clientes;

