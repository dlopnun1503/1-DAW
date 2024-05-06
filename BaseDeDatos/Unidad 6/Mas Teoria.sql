use maratoon;

-- Actualiza la edad de los corredores a la que tengan en este momento
update corredores set
edad = timestampdiff(year, fechanacimiento, now());

-- Muestra los corredores que tienen asignado un club
select
co.id,
co.apellidos,
co.nombre,
co.edad,
co.categoria_id,
cl.nombrecorto club
from corredores co INNER join clubs cl on co.club_id = cl.id;


-- Muestra los corredores tengan o no asignado un club
select
co.id,
co.apellidos,
co.nombre,
co.edad,
co.categoria_id,
cl.nombrecorto club
from corredores co left join clubs cl on co.club_id = cl.id;

-- Muestra los corredores tengan o no asignado un club y que tengan asignada una categoria
select
co.id,
co.apellidos,
co.nombre,
co.edad,
co.categoria_id,
cl.nombrecorto club
from (corredores co left join clubs cl on co.club_id = cl.id) inner join categorias ca on co.categoria_id = ca.id;

-- Muestra los corredores tengan o no asignado un club y que tengan o no asignada una categoria
select
co.id,
co.apellidos,
co.nombre,
co.edad,
co.categoria_id,
cl.nombrecorto club
from (corredores co left join clubs cl on co.club_id = cl.id) left join categorias ca on co.categoria_id = ca.id;

-- Muestra los corredores que no han participado en la carrera
select * from corredores where not exists(select * from registros where corredores.id = registros.corredor_id);

-- Muestra el id de los corredores que han participado
select corredor_id from registros;

-- Muestra el id de los corredores que no han participado
select * from corredores where id not in(select corredor_id from registros);

-- Mostrar clubs con corredores
select 
cl.id,
cl.nombre club,
cl.nombrecorto,
co.nombre,
co.apellidos,
co.edad
from clubs cl inner join corredores co on cl.id = co.club_id;

-- Mostrar clubs que tienen o no corredores
select 
cl.id,
cl.nombre club,
cl.nombrecorto,
co.nombre,
co.apellidos,
co.edad
from clubs cl left join corredores co on cl.id = co.club_id;

-- Mostrar todos los corredores tengan o no club ya que right hace que salgan todos los registros de la tabla corredores que es la que esta en la derecha, 
-- que en este caso seria club left muestra los de la izquiera
select 
cl.id,
cl.nombre club,
cl.nombrecorto,
co.nombre,
co.apellidos,
co.edad
from clubs cl join corredores co on cl.id = co.club_id;