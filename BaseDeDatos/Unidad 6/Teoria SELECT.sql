use maratoon;

-- Muestra todas las columnas de la tabla corredores

select 
	* 
from 
	corredores;
    
    -- Muestra solo las columnas que especifiquemos
   
   select
    id, apellidos, nombre, edad
    from
    corredores;
    
    select
    id, apellidos, nombre, categoria_id
    from
    corredores;
    
    -- Cambia el nombre de la columna id por codigo y el de club_id por club, cuando el nuevo nombre tiene mas de una palabra se utilizan comillas
    select 
    id as 'codigo corredor', apellidos, nombre, club_id as club
    from
    corredores;
    
    -- Esto se hace para cuando varias tablas tienen atributos con el mismo nombre
    select
    corredores.id,
	corredores.nombre,
	corredores.apellidos,
    carreras.nombre,
    carreras.ciudad
    from
    corredores,
    carreras;
    
    -- Esto es lo mismo que lo de arriba pero cambiamos el nombre de la tabla corredores a co y carreas a ca mediante el comando as
    select 
    co.id, co.nombre, co.apellidos, ca.nombre, ca.ciudad
    from
    corredores as co,
    carreras as ca;
    
    -- Obtenemos un dato a partir de otro, en este caso mediante year, para la edad siendo campo derivado ponemos el year para mostrarlo en años y muestra la diferencia entre fechanacimiento y ahora
    select
    id,
    nombre,
    apellidos,
    year(FechaNacimiento) as 'Año Nacimiento',
    timestampdiff(year, fechanacimiento, now()) edad
    from
    corredores;
 
 use maratoon;
 -- Muetsra los 5 primeras a partir del segundo registro, esto es porque al limit le ponemos dos numeros, pues el primero es la posicion a partir va a empezar a contar
 SELECT
id, Apellidos, Nombre, Ciudad, Edad
FROM
corredores
ORDER BY apellidos,nombre
LIMIT 2,5;

-- Esto hace lo mismo que arriba
SELECT
id, Apellidos, Nombre, Ciudad, Edad
FROM
corredores
ORDER BY apellidos,nombre
LIMIT 5 OFFSET 2;

-- No muestra los valores repetidos 
SELECT DISTINCT ciudad FROM corredores;

-- Cuenta el numero de corredores de Ubrique
SELECT 
    COUNT(*)
FROM
    Corredores
WHERE
    Ciudad = 'Ubrique';


SELECT
 'Edades Club Ubrique',
MAX(Edad) AS EdadMAX,
MIN(Edad) AS EdadMin,
AVG(Edad) AS EdadMedia,
count(*) as NumCorredores
FROM
corredores
WHERE
 Ciudad = 'Ubrique';


