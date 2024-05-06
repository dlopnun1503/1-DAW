-- Veamos el siguiente ejemplo donde declaramos un cursor que extraiga de la tabla Corredores
-- de la Base de Datos Maratoon, todos los corredores que sean de Ubrique.
DELIMITER $$
DROP PROCEDURE IF EXISTS corredores_por_poblacion $$
CREATE PROCEDURE corredores_por_poblacion(pciudad VARCHAR(20))
BEGIN
 declare lrf boolean;
 DECLARE vid INT UNSIGNED;
 DECLARE vnombre VARCHAR(20);
 DECLARE vapellidos VARCHAR(40);
 DECLARE vciudad VARCHAR(20);
 DECLARE cursor01 CURSOR FOR SELECT id, nombre, apellidos, ciudad FROM corredores WHERE
ciudad=pciudad;
 DECLARE CONTINUE HANDLER FOR NOT FOUND SET lrf=1;
 OPEN cursor01;
l_cursor: LOOP
FETCH cursor01 INTO vid, vnombre, vapellidos, vciudad;
SELECT Vid, VNombre, VApellidos, VCiudad;
 IF lrf=1 THEN
LEAVE l_cursor;
 END IF;
 END LOOP l_cursor;
 CLOSE cursor01;
END $$
DELIMITER ;
CALL corredores_por_poblacion('Ubrique');


