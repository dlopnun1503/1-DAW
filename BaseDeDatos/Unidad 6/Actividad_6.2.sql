UPDATE futbol.equipos SET nombre = 'Villatrabuco' WHERE nombre = 'Miraflores' ;
UPDATE futbol.equipos SET aforo = 3000 WHERE id = 4;
UPDATE futbol.equipos SET capacidad = capacidad -100;
UPDATE futbol.equipos SET fundacion = fundacion + INTERVAL 10 YEAR WHERE id = 3;
UPDATE futbol.jugadores SET	equipo_id = 2 WHERE id = 4;
UPDATE futbol.jugadores SET	fecha_nac = '1976-4-8' WHERE id = 6;

UPDATE futbol.partidos SET	goles_casa = 3 WHERE id = 2;
UPDATE futbol.partidos SET	goles_fuera = 1 WHERE id = 2;


SELECT * FROM futbol.equipos;
SELECT * FROM futbol.goles;
SELECT * FROM futbol.jugadores;
SELECT * FROM futbol.partidos;