/*
ACTIVIDAD_5.3
*/

-- Creamos la base de datos
DROP DATABASE IF EXISTS tipos_datos;

CREATE DATABASE IF NOT EXISTS tipos_datos
CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

-- Usamsos la base de datos
USE tipos_datos;

-- Creamos la tabla 
DROP TABLE IF EXISTS tipos_datos_num;
CREATE TABLE IF NOT EXISTS tipos_datos_num(
     id INT UNSIGNED auto_increment primary key,
     num_camiseta tinyint(2) unsigned,
     diferencia_goles tinyint,
     goles_a_favor tinyint unsigned,
     goles_en_contra tinyint unsigned,
     num_habitantes int unsigned, 
     humedad float(3,2) unsigned,
     precipitaciones float(6,2) unsigned,
     temperatura_maxima float(5,2),
     temperatura_minima float(5,2),
     velocidad_viento smallint unsigned,
     altura float(7,3) unsigned,
     precio decimal(10,2),
     sueldo decimal(10,2)
);

insert into tipos_datos_num values
(
null,
21,
-34,
200,
30,
9500456,
0.5,
230.2,
300,
-273.15,
300,
8849,
34.67,
6890.34
),
(
null,
7,
54,
130,
62,
9500,
0.3,
23.2,
36,
0,
30,
549,
0.67,
1290.34
),
(
null,
13,
-549,
20,
50,
500456,
0.8,
2111.2,
15,
-15,
45,
20,
550.25,
125.50
);

DROP table IF EXISTS angulos;
CREATE TABLE IF NOT EXISTS angulos(
    id INT UNSIGNED auto_increment primary key,
    angulo_grados tinyint,
    angulo_radianes double(31,30),
    seno double(31,30),
    coseno double(31,30),
    tangente double(31,30)
);

insert into angulos value
(
null,
45,
null,
0.70710678118654752440084436210485,
0.70710678118654752440084436210485,
1
),
(
null,
30,
radians(angulo_grados),
sin(angulo_radianes),
cos(angulo_radianes),
tan(angulo_radianes)
),
(
null,
45,
radians(angulo_grados),
sin(angulo_radianes),
cos(angulo_radianes),
tan(angulo_radianes)
);



