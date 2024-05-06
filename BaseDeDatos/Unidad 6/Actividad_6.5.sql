SELECT * FROM jugadores;
SELECT * FROM equipos;
SELECT * FROM partidos;
SELECT * FROM partidos ORDER BY fecha DESC LIMIT  3;


SELECT * FROM goles ORDER BY minuto ASC LIMIT  5;
SELECT * FROM goles WHERE id_gol BETWEEN  5 AND  10;
SELECT * FROM partidos ORDER BY fecha DESC LIMIT  3;
SELECT * FROM partidos WHERE id_equipo_fuera = 'Villatortas' ORDER BY fecha DESC LIMIT  1;
SELECT * FROM partidos WHERE id_equipo_fuera != 'Villatortas' AND goles_equipo_fuera =  0 ORDER BY fecha DESC LIMIT  1;
SELECT * FROM goles WHERE id_gol >  4 ORDER BY id_gol ASC LIMIT  5;


SELECT id, nombre, id_equipo FROM jugadores;
SELECT jugadores.id AS Numero, jugadores.nombre AS 'Nombre Jugador', jugadores.id_equipo AS 'Código Equipo' FROM jugadores;
SELECT jugadores.id, jugadores.nombre, jugadores.id_equipo FROM jugadores;
SELECT jugadores.id, jugadores.nombre, jugadores.id_equipo FROM jugadores;
SELECT db_name.tabla_name.id, db_name.tabla_name.nombre, db_name.tabla_name.id_equipo FROM jugadores;
SELECT (32 + (0.33 *  10)) /  4 AS resultado;


SELECT * FROM jugadores WHERE id_equipo =  1;
SELECT * FROM jugadores WHERE id_equipo =  1 AND id_jugador =  9;
SELECT * FROM jugadores WHERE id_equipo =  2 ORDER BY fecha_nacimiento ASC LIMIT  3;
SELECT * FROM equipos WHERE capacidad_estadio >  10000;
SELECT * FROM equipos WHERE capacidad_estadio >  12000 AND ano_fundacion >  1970;
SELECT * FROM goles WHERE id_jugador =  1;
SELECT * FROM goles WHERE id_jugador =  1 AND id_equipo_local = (SELECT id_equipo FROM jugadores WHERE id_jugador =  1);
SELECT * FROM jugadores WHERE nombre = 'Pacheco';
SELECT * FROM jugadores WHERE id_equipo =  1 AND nombre = 'Fonseca';
SELECT * FROM partidos WHERE id_equipo_local =  1 AND resultado_local > resultado_visitante;
SELECT * FROM partidos WHERE resultado_local > resultado_visitante;
SELECT * FROM partidos WHERE resultado_local = resultado_visitante;
SELECT * FROM partidos WHERE id_equipo_visitante =  1 AND resultado_visitante > resultado_local;
SELECT * FROM partidos WHERE resultado_diferencia >  1;


SELECT * FROM jugadores WHERE id_equipo IN ('Villatrabuco', 'Villatorta', 'Valdeajos');
SELECT * FROM equipos WHERE capacidad_estadio BETWEEN  20000 AND  40000;
SELECT * FROM equipos WHERE capacidad_estadio >=  30000;
SELECT * FROM jugadores WHERE fecha_nacimiento BETWEEN '1970-01-01' AND '1973-12-31';
SELECT * FROM jugadores WHERE nombre LIKE 'D%';
SELECT * FROM jugadores WHERE nombre = 'Macarena';


SELECT * FROM jugadores ORDER BY nombre DESC;
SELECT * FROM equipos ORDER BY capacidad_estadio DESC;
SELECT * FROM jugadores ORDER BY id_equipo, nombre;
SELECT * FROM jugadores WHERE id_equipo =  1 ORDER BY fecha_nacimiento ASC;
SELECT * FROM jugadores WHERE id_equipo =  2 ORDER BY fecha_nacimiento DESC;