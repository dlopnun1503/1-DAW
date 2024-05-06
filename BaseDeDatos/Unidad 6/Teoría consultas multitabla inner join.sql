-- Ejemplos COMPOSICIONES INTERNAS INNER JOIN

USE MARATOON;
-- Ejemplo 63
-- Mostrar junto con los datos de los corredores los datos del club
-- al que pertenece
SELECT
 *
FROM
 Corredores Co
 INNER JOIN
 clubs cl ON Co.club_id = Cl.id;
 
 
-- Ejemplo 64
-- Mismo ejemplo anterior sin la cláusula INNER
SELECT
 *
FROM
Corredor Co
 JOIN
club cl ON Co.club_id = Cl.id;


-- Ejemplo 66
-- Mostrar IdCorredor, Apellidos, Nombre, Edad, Nombre del Club y Nombre
-- de la categoría a la que pertenece cada corredor.
SELECT
co.id,
co.Apellidos,
co.Nombre,
co.Edad,
cl.nombre AS Club,
ca.nombre AS Categoría,
re.TiempoInvertido as tiempo
FROM
((Corredores co
 INNER JOIN
 Clubs cl ON Co.club_id = Cl.id)
INNER JOIN
 Categorias ca ON co.categoria_id = ca.id)
 inner join
 registros re on re.corredor_id = co.id
ORDER BY re.tiempoinvertido;
-- Como vemos se trata de un DOBLE JOIN donde primero conecto Corredor con
-- Club y a su vez el resultado lo conecto con Categoría. Como condición de los
-- JOINS uso las correspondientes claves ajenas.
