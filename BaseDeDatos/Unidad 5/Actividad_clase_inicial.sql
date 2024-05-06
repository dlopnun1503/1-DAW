-- Ejemplos
-- Creacion tablas de ges_alumnos

/*
elimina la base de datos
*/
DROP  DATABASE IF EXISTS ges_alumnos;

/*
Crea base de datos
*/
CREATE DATABASE IF NOT EXISTS ges_alumnos;

-- Selecciona la base de datos
USE ges_alumnos;

/*
Crear tabla para la base de datos
*/
DROP TABLE IF EXISTS alumnos;
CREATE TABLE IF NOT EXISTS alumnos (
   id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,      /* Esta primera linea de ID es igual en todas las tablas */
   nombre VARCHAR (40),     /* El numero es la  longitud maxima (VARCHAR ES PARA STRING) */
   apellidos VARCHAR (40),
   direccion VARCHAR (60),
   poblacion VARCHAR (20),
   cod_postal CHAR  (5),     /* El CHAR también es para String pero los que tienen longitud fija */
   provincia VARCHAR (30),
   fecha_nac DATE,      /* DATE PARA FECHA */
   nif CHAR (9) UNIQUE,     /* UNIQUE = CLAVE SECUNDARIA */
   email VARCHAR (60) UNIQUE,
   edad TINYINT UNSIGNED,
   imagen VARCHAR (60),
   peso FLOAT (5,2) UNSIGNED,
   altura FLOAT (3,2) UNSIGNED,
   importe_beca DECIMAL (10,2) 
   );
   
   
   INSERT INTO alumnos VALUES
   (
   NULL,
   'Juan Carlos',
   'Moreno Jimenez',
   'La Vega 24',
   'Ubrique',
   '11600',
   'Cadiz',
   '1975/07/31',
   '12345678A',
   'aaa@gmail.com',
   timestampdiff(year, fecha_nac, now()),
   'juhrr.jpg',
    78.34,
    1.70,
    500.50
   );
   
    
