DELETE FROM futbol.jugadores WHERE fecha_nac = (SELECT MIN(fecha_nac) FROM futbol.jugadores) ORDER BY fecha_nac limit 1 ;
DELETE FROM futbol.jugadores  WHERE equipo_id = 2;
DELETE FROM futbol.jugadores WHERE equipo_id = (SELECT id FROM fulbol.equipos WHERE nombre = 'Barcelona F.C');
DELETE FROM futbol.jugadores WHERE YEAR(fecha_nac) = '1970';
DELETE FROM futbol.goles WHERE jugador_id = 12;
DELETE FROM futbol.goles WHERE jugador_id = (SELECT id FROM futbol.jugadores WHERE nombre = 'Pacheco');


SELECT * FROM futbol.equipos;
SELECT * FROM futbol.goles;
SELECT * FROM futbol.jugadores;
SELECT * FROM futbol.partidos;