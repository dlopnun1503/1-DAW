-- Ejemplo uso de vsitas
use maratoon;

-- Listado de corredores con club
select
co.id,
concat_ws(', ', co.apellidos, co.nombre) as nombre, -- Muestra el nombre y apellidos en la misma linea
co.edad,
co.ciudad,
co.sexo,
cl.nombrecorto as club,
ca.nombrecorto as categoria,
re.tiempoinvertido as tiempo
from ((corredores as co inner join clubs as cl on co.club_id = cl.id) inner join categorias as ca on co.categoria_id = ca.id) inner join registros as re on re.corredor_id = co.id
order by tiempo asc;

-- Vamos a crear una vista a partir de esta consulta
-- Copiamos la consulta y le añadimos delante create or replace view clasificacion as siendo clasificacion el nombre de la vista
create or replace view clasificacion as
select
co.id,
concat_ws(', ', co.apellidos, co.nombre) as nombre, -- Muestra el nombre y apellidos en la misma linea
co.edad,
co.ciudad,
cl.nombre as club,
ca.nombre as categoria,
re.tiempoinvertido as tiempo
from ((corredores as co inner join clubs as cl on co.club_id = cl.id) inner join categorias as ca on co.categoria_id = ca.id) inner join registros as re on re.corredor_id = co.id
order by tiempo asc;

-- Modificamos la vista para modificar el nombre de la categoria y del club por el nombre corto 
alter view clasificacion as 
select
co.id,
concat_ws(', ', co.apellidos, co.nombre) as nombre, -- Muestra el nombre y apellidos en la misma linea
co.edad,
co.ciudad,
cl.nombrecorto as club,
ca.nombrecorto as categoria,
re.tiempoinvertido as tiempo
from ((corredores as co inner join clubs as cl on co.club_id = cl.id) inner join categorias as ca on co.categoria_id = ca.id) inner join registros as re on re.corredor_id = co.id
order by tiempo asc;

-- Muestra los datos de la clasificacion donde los corredores tiene  categoria Veteranos A
select * from clasificacion where categoria = 'VTA';

-- Clasificacion solo de las mujeres pero en la vista cllasificacion no tenemos el sexo
alter view clasificacion as
select
co.id,
concat_ws(', ', co.apellidos, co.nombre) as nombre, -- Muestra el nombre y apellidos en la misma linea
co.edad,
co.ciudad,
co.sexo,
cl.nombrecorto as club,
ca.nombrecorto as categoria,
re.tiempoinvertido as tiempo
from ((corredores as co inner join clubs as cl on co.club_id = cl.id) inner join categorias as ca on co.categoria_id = ca.id) inner join registros as re on re.corredor_id = co.id
order by tiempo asc;

select * from clasificacion where sexo = 'M';
select * from clasificacion where sexo = 'M' and categoria = 'VTA';

-- Crea una tabla a partir de una consulta
create table clas_femenina as select * from clasificacion where sexo = 'M';