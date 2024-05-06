-- Ejemplos procedimientos

-- 1.Hola Mundo
delimiter $$
drop procedure if exists hola_mundo$$
create procedure test.hola_mundo()
begin
    select "HOLA MUNDO PL/SQL";
end $$
delimiter ;

-- Ejemplo 2
-- BBDD maratoon
-- Clasificacion general de la carrera cuyo id pasaré por parametro
delimiter $$
drop procedure if exists maratoon.clasificacion_carrera$$
create procedure maratoon.clasificacion_carrera(id_carrera int unsigned)
begin
    SELECT
       r.id Reg,
	   co.id,
       co.apellidos,
       co.nombre,
       co.Club_id,
       cl.NombreCorto Club,
       co.Categoria_id,
       ca.NombreCorto Categoria,
       r.TiempoInvertido
	FROM
       maratoon.corredores co
    INNER JOIN
       maratoon.clubs cl ON co.Club_id = cl.id
    INNER JOIN
       maratoon.categorias ca ON co.categoria_id = ca.id
    INNER JOIN
       maratoon.registros r ON co.id = r.corredor_id
    WHERE
       r.carrera_id = id_carrera
   ORDER BY r.TiempoInvertido ASC;
end $$
delimiter ;


-- Ejemplo 3.
-- Base de datos maratoon
-- Actualizar la edad de todos los corredores
DELIMITER $$
DROP PROCEDURE IF EXISTS maratoon.ActualizarEdad $$
CREATE PROCEDURE maratoon.ActualizarEdad()
BEGIN
UPDATE Corredores SET Edad = TIMESTAMPDIFF(YEAR,FechaNacimiento,NOW());
END
delimiter ;


-- Ejmplo07: Parámetros de salida OUT
DELIMITER $$
DROP PROCEDURE IF EXISTS test.proc04 $$
CREATE PROCEDURE test.proc04(OUT p INT)
BEGIN
SET p = - 5 ;
END$$
-- Cambiamos el delimitador
DELIMITER ;
CALL test.proc04(@valor);
SELECT @valor;
-- Siendo el resultado -5


-- Ejmplo08: Parámetros de salida OUT
DELIMITER $$
DROP PROCEDURE IF EXISTS test.proc05 $$
CREATE PROCEDURE test.proc05(INOUT p INT)
BEGIN
SET p = p - 5 ;
END$$
-- se cambia el delimitador a ;
DELIMITER ;
SET @valor=20;
CALL test.proc05(@valor);
SELECT @valor;
-- Siendo el resultado 15

