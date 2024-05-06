-- Actividad_5.10
-- David Lopez

DROP DATABASE IF EXISTS restricciones_check;
CREATE DATABASE IF NOT EXISTS restricciones_check
CHARACTER SET UTF8 COLLATE UTF8_GENERAL_CI;

USE restricciones_check;
DROP TABLE IF EXISTS comparacion;
CREATE TABLE IF NOT EXISTS comparacion(
   id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   importe DECIMAL(10,2) CHECK(importe > 400.00),
   saldo DECIMAL(10,2) CHECK(saldo < 0),
   nombre VARCHAR(20) CHECK(ISNULL(nombre)),
   apellidos VARCHAR(50) CHECK(ISNULL(apellidos)),
   nBeneficiarios TINYINT UNSIGNED CHECK(nBeneficiarios >= 5),
   nAsignatura TINYINT UNSIGNED CHECK(nAsignatura <= 5),
   beca BOOLEAN CHECK(beca),
   importeBeca DECIMAL(10,2) CHECK(importeBeca < 2500.00),
   nGoles TINYINT UNSIGNED CHECK(nGoles > 20),
   annoNacimiento YEAR CHECK(annoNacimiento > 1970),
   fecNacimiento DATE CHECK(fecNacimiento < '2000/02/21'),
   horaLlegada TIME CHECK(horaLlegada > '12:00:00')
);

INSERT INTO comparacion VALUES
(
NULL,
450.50,
-50,
NULL,
NULL,
6,
4,
TRUE,
1000.50,
45,
2004,
'1999/02/21',
'15:30:00'
),
(
NULL,
450.50,
5000,
NULL,
NULL,
6,
4,
TRUE,
1000.50,
45,
2004,
'1999/02/21',
'15:30:00'
); -- Registro erróneo



USE restricciones_check;
DROP TABLE IF EXISTS comparacionBetween;
CREATE TABLE IF NOT EXISTS comparacionBetween(
   id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   nGoles TINYINT UNSIGNED CHECK(nGoles BETWEEN 20 AND 30),
   sueldo DECIMAL(10,2) CHECK(sueldo BETWEEN 2000 AND 3000),
   importe DECIMAL(10,2) CHECK(importe BETWEEN 400 AND 600),
   cantidad TINYINT UNSIGNED CHECK(cantidad BETWEEN 5 AND 20),
   valor TINYINT UNSIGNED CHECK(NOT cantidad BETWEEN 4 AND 7),
   tipoDescuento FLOAT(5,4) CHECK(tipoDescuento BETWEEN 0.0525 AND 0.205),
   precio DECIMAL(10,2) CHECK(precio BETWEEN 20 AND 30)
);

INSERT INTO comparacionBetween VALUES
(
NULL,
25,
2500,
500,
15,
8,
0.155,
25.50
),
(
NULL,
25,
500,
500,
15,
8,
15.50,
25.50
); -- Registro erróneo

USE restricciones_check;
DROP TABLE IF EXISTS checkIn;
CREATE TABLE IF NOT EXISTS checkIn(
   id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
   provincia VARCHAR(25) CHECK(provincia IN ('Cádiz', 'Málaga', 'Sevilla')),
   poblacion VARCHAR(25) CHECK(poblacion IN ('Ubrique', 'Villamartín', 'Prado del Rey', 'Olvera')),
   cicloEstudio VARCHAR(25) CHECK(cicloEstudio IN('ESO', 'Bach', 'Medio', 'Superior', 'Adultos')),
   valores TINYINT UNSIGNED CHECK(valores IN(1, 2, 5, 8, 9)),
   nacionalidad VARCHAR(25) CHECK(nacionalidad IN ('España', 'Brasil', 'Portugal', 'Argentina', 'Italia')),
   codEmpleado CHAR(9) CHECK(codEmpleado LIKE '_AB%'),
   nrp CHAR(9) CHECK(nrp LIKE '%Z'),
   dni CHAR(9) CHECK(dni LIKE '25%')
   );
   
   INSERT INTO checkIn VALUES
   (
   NULL,
   'Cádiz',
   'Ubrique',
   'ESO',
   1,
   'España',
   'TAB123456',
   '12345678Z',
   '25123456A'
   ),
   (
   NULL,
   'Cádiz',
   'Jerez',
   'Grado',
   1,
   'España',
   'TAB123456',
   '12345678Z',
   '30123456A'
   ); -- Registro erróneo


