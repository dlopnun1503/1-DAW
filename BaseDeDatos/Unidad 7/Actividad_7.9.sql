USE maratoon;

-- 1
insert into corredores values
(NULL,"Rafel","Mendoza Pérez","Ubrique","1965-07-31","H",NULL,NULL,1),
(NULL,"María José","Moreno Morales","Ubrique","1945-08-30","M",NULL,NULL,1),
(NULL,"Pedro","Rodríguez Alva","Ubrique","1986-08-25","H",NULL,NULL,1),
(NULL,"Juani","Ríos Pérez","Villamartín","1995-10-15","M",NULL,NULL,2),
(NULL,"Esther","Pérez Ríos","Villamartín","1970-05-14","M",NULL,NULL,2);

-- 2
LOAD DATA INFILE 'C:/Users/dlopnun1503/Desktop/corredores.csv' IGNORE INTO TABLE 
maratoon.corredores FIELDS TERMINATED BY ';' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n';

LOAD DATA INFILE 'C:/Users/dlopnun1503/Desktop/corredores.csv' IGNORE INTO TABLE 
maratoon.corredores FIELDS TERMINATED BY ';' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n';

-- 3
UPDATE Corredores SET Edad = TIMESTAMPDIFF(YEAR,FechaNacimiento,NOW());
UPDATE Corredores SET categoria_id = 1 WHERE Edad<12;
UPDATE Corredores SET categoria_id = 2 WHERE Edad BETWEEN 12 AND 14;
UPDATE Corredores SET categoria_id = 3 WHERE Edad BETWEEN 15 AND 17;
UPDATE Corredores SET categoria_id = 4 WHERE Edad BETWEEN 18 AND 29;
UPDATE Corredores SET categoria_id = 5 WHERE Edad BETWEEN 30 AND 39;
UPDATE Corredores SET categoria_id = 6 WHERE Edad BETWEEN 40 AND 49;
UPDATE Corredores SET categoria_id = 7 WHERE Edad BETWEEN 50 AND 60;
UPDATE Corredores SET categoria_id = 8 WHERE Edad>=60;

-- 4
SELECT * INTO OUTFILE 'C:/Users/dlopnun1503/Desktop/registros.csv'
FIELDS TERMINATED BY ';'
LINES TERMINATED BY '\n'
FROM Registros
WHERE carrera_id = 3
AND corredor_id IN (SELECT id FROM Corredores WHERE id > (SELECT MAX(id) - 5 FROM Corredores));

-- 5
LOAD DATA INFILE 'C:/Users/dlopnun1503/Desktop/registros.csv' IGNORE INTO TABLE 
maratoon.registros FIELDS TERMINATED BY ';' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n';

-- 6
UPDATE registros 
SET 
    TiempoInvertido = TIMEDIFF(Llegada, Salida)
WHERE
    carrera_id = 3;

-- 7

<?xml version="1.0" encoding="UTF-8"?>
<regclubs>
	<NombreCorto>AMC</NombreCorto>
	<Nombre>Atletismo Morón Club</Nombre>
	<Ciudad>Morón</Ciudad>
	<FecFundacion>1960-6-5</FecFundacion>
	<Numsocios>23</Numsocios>
</regclubs>

<regclubs>
	<NombreCorto>RAT</NombreCorto>
	<Nombre>Racing Atletismo Tarragona</Nombre>
	<Ciudad>Tarragona</Ciudad>
	<FecFundacion>1960-6-5</FecFundacion>
	<Numsocios>210</Numsocios>
</regclubs>

-- 8

<?xml version="1.0" encoding="UTF-8"?>
<regcarreras>
	<Nombre>Carrera por el coronavirus</Nombre>
	<Ciudad>Sevilla</Ciudad>
	<Distancia>20</Distancia>
	<MesCelebracion>11</MesCelebracion>
</regcarreras>
<regcarreras>
	<Nombre>Circular Sierra de Grazalema</Nombre>
	<Ciudad>Grazalema</Ciudad>
	<Distancia>90</Distancia>
	<MesCelebracion>4</MesCelebracion>
</regcarreras>

-- 9 
LOAD XML INFILE 'C:/Users/dlopnun1503/Desktop/clubs.xml' 
INTO TABLE maratoon.clubs ROWS IDENTIFIED BY '<regclubs>';

-- 10
LOAD XML INFILE 'C:/Users/dlopnun1503/Desktop/carreras.xml' 
INTO TABLE maratoon.carreras ROWS IDENTIFIED BY '<regcarreras>';

-- 11
SELECT 
    *
FROM
    maratoon.corredores INTO OUTFILE 'C:/Users/Juan Carlos Moreno/Downloads/copiacorredores.csv' 
    FIELDS TERMINATED BY ';' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n';

-- 12.
SELECT 
    *
FROM
    maratoon.registros INTO OUTFILE 'C:/Users/Juan Carlos Moreno/Downloads/copiaregistros.csv' 
    FIELDS TERMINATED BY ';' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n';

-- 13
SELECT 
    r.id Reg,
    co.id,
    co.apellidos,
    co.nombre,
    co.Club_id,
    cl.NombreCorto Club,
    co.Categoria_id,
    ca.NombreCorto Categoria,
    r.TiempoInvertido
FROM
    maratoon.corredores co
        INNER JOIN
	maratoon.clubs cl ON co.Club_id = cl.id
		INNER JOIN
	maratoon.categorias ca ON co.categoria_id = ca.id
		INNER JOIN
    maratoon.registros r ON co.id = r.corredor_id
WHERE
    r.carrera_id = 3
ORDER BY r.TiempoInvertido ASC INTO OUTFILE 'C:/Users/dlopnun1503/Desktop/clasificacion_carrera_1.csv' 
FIELDS TERMINATED BY ';' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n';

 

