USE test;

DROP TABLE IF EXISTS pacientes;
CREATE TABLE IF NOT EXISTS pacientes (
   id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   nombre VARCHAR(25) NOT NULL,
   apellidos VARCHAR(50) NOT NULL,
   nss CHAR(11) UNIQUE NOT NULL,
   email VARCHAR(50) UNIQUE,
   telefono CHAR(13) UNIQUE,
   poblacion VARCHAR(20) NOT NULL,
   expediente TEXT NOT NULL,
   dni CHAR(9) UNIQUE NOT NULL,
   historial_clinico TEXT NOT NULL,
   fecha_nac DATE NOT NULL,
   edad TINYINT UNSIGNED NOT NULL
);

INSERT INTO pacientes VALUES
(
1,
'David',
'Lopez Nunez',
'12345678912',
NULL,
NULL,
'Ubrique',
'Positivo',
'77496750K',
'Sin historial',
'2004/03/15',
19
);
