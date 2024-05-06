DROP DATABASE IF EXISTS tipos_datos;

CREATE DATABASE IF NOT EXISTS tipos_datos
CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

USE tipos_datos;

DROP TABLE IF EXISTS tipos_datos_string;
CREATE TABLE IF NOT EXISTS tipos_datos_string(
   id INT UNSIGNED auto_increment primary key,
   cod_postal char(5),
   telefono char(13),
   apellidos varchar(50),
   nombre varchar(30),
   nombre_acronimo varchar(5),
   historial text,
   direccion varchar(60),
   provincia varchar(30),
   anotaciones text, 
   contenido_libro longtext,
   categoria enum('Primera', 'Segunda', 'Tercera', 'Regional'),
   create_at timestamp default current_timestamp,
   update_at timestamp default current_timestamp
);

insert into tipos_datos_string values
(
null,
11600,
0034639732950,
'Lopez Nunez',
'David',
'DLN',
'Sin historial',
'Calle Jesus 8',
'Cadiz',
'Ciudad: Ubrique',
'Contenido libro',
'Primera',
default,
default
),
(
null,
11500,
0034639732777,
'Lopez Garcia',
'Jose',
'JLG',
'Sin historial',
'Calle Ramiro 9',
'Cadiz',
'Ciudad: Villamartin',
'Contenido libro',
'Segunda',
default,
default
),
(
null,
11400,
0034639732950,
'Garcia Nunez',
'Jose Carlos',
'JCGN',
'Sin historial',
'Calle Maria 22',
'Cadiz',
'Ciudad: Arcos',
'Contenido libro',
'Regional',
default,
default
);


