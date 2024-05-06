USE test; 

DROP TABLE IF EXISTS alumnos;
CREATE TABLE IF NOT EXISTS alumnos(
   id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   nombre VARCHAR(30),
   apellidos VARCHAR(50),
   dni CHAR(9) UNIQUE,
   fecha_nac DATE,
   edad TINYINT UNSIGNED,
   poblacion VARCHAR(20),
   direccion VARCHAR(50),
   codpostal CHAR(5),
   provincia VARCHAR(30),
   nacionalidad VARCHAR(20), 
   telefono CHAR(13) UNIQUE,
   email VARCHAR(50) UNIQUE
   );
   
  USE test;
   
DROP TABLE IF EXISTS articulos;
CREATE TABLE IF NOT EXISTS articulos(
   id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   descripcion VARCHAR (255),
   referencia VARCHAR (255),
   precio_coste DECIMAL(10,2),
   precio_venta DECIMAL(10,2),
   descuento DECIMAL (5,2),
   imagen VARCHAR(30),
   categoria VARCHAR (25),
   stock INT,
   stock_min INT,
   stock_max INT
);

USE test;

DROP TABLE IF EXISTS registro_llegada;
CREATE TABLE IF NOT EXISTS registro_llegada(
id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
fecha_hora_salida DATETIME,
fecha_hora_llegada DATETIME,
tiempo_realizado TIME (3),
corredor_id tinyint unsigned
 );


   
   