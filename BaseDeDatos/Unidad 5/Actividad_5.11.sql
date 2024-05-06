-- Actividad_5.11
-- David Lopez

USE restricciones_check;
DROP TABLE IF EXISTS operadorLike;
CREATE TABLE IF NOT EXISTS operadorLike(
   id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   descripcion TEXT CHECK (descripcion LIKE 'a%'),
   nombre VARCHAR(20) CHECK (nombre LIKE 'ju%'),
   email VARCHAR(50) CHECK (email LIKE '%@%'),
   pass VARCHAR(20) CHECK (pass LIKE '__M____%'),
   cPostal CHAR(5) CHECK (cPostal LIKE '11___'),
   codigo CHAR(7) CHECK (codigo LIKE 'ES____9')
);

INSERT INTO operadorLike VALUES
(
NULL, 
'ayer fui a entrenar',
'julio',
'david@gmail.com',
'daM1234',
'11600',
'ES12349'
),
(
NULL, 
'no fui a entrenar ayer',
'david',
'david@gmail.com',
'dav1234',
'41600',
'ES12349'
); -- Registro erróneo
