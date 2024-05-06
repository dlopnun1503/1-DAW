-- 1. Crear Base de Datos
drop database if exists fmatematicas;
CREATE DATABASE if not exists fmatematicas;

USE fmatematicas;

drop table if exists Angulos;
CREATE TABLE if not exists Angulos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    grados smallint unsigned,
    radianes DOUBLE(31, 30),
    seno DOUBLE(31, 30),
    coseno DOUBLE(31, 30),
    tangente DOUBLE(31, 30)
);


-- 2. Añadir registros
INSERT INTO Angulos (grados) VALUES (0),(45),(90),(135),(180),(225),(270),(315),(360);

-- 3. Actualizar Radianes.
UPDATE Angulos
SET radianes = radians(grados);

-- 4. Actualizar Seno, Coseno y Tangente
UPDATE Angulos
SET seno = ROUND(SIN(radianes), 30),
    coseno = ROUND(COS(radianes), 30),
    tangente = ROUND(TAN(radianes), 30);