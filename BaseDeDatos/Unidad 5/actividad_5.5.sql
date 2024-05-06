USE tipos_datos;

DROP  TABLE IF EXISTS tipos_datos_fechas;
CREATE TABLE IF NOT EXISTS tipos_datos_fechas(
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    fecha_nacimiento DATE,
    fecha_hora_nacimiento DATETIME,
    hora_llegada TIME,
    hora_salida TIME,
    anno_nacimiento YEAR,
    anno_fundacion YEAR,
    fecha_hora_salida DATETIME(3),
    fecha_hora_entrada DATETIME(3),
    fecha_hora_actual DATETIME(1),
    edad TINYINT UNSIGNED,
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
); 


INSERT INTO tipos_datos_fechas VALUES
(
NULL,
'2004/03/15',
'2004/03/15 12:15:50',
'12:00:15',
'17:30:00',
'2004',
'2010',
'2009/06/15 18:15:50.465',
'2009/06/15 15:10:50.865',
NOW(1),
19,
DEFAULT, 
DEFAULT
),
(
NULL,
'2010/06/15',
'2010/06/15 20:15:50',
'10:00:15',
'09:30:00',
'2010',
'2015',
'2017/04/15 18:15:50.465',
'2017/04/15 15:10:50.865',
NOW(1),
13,
DEFAULT, 
DEFAULT
),
(
NULL,
'2000/10/15',
'2000/10/15 00:15:50',
'00:00:15',
'12:30:00',
'2000',
'2002',
'2003/05/15 19:15:50.465',
'2003/05/15 17:10:50.865',
NOW(1),
23,
DEFAULT, 
DEFAULT
);
