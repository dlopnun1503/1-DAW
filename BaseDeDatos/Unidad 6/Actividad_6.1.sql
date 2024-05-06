-- Actividad_6.1 

use futbol;

insert into equipos values
(null,'Athletic Bilbao','San Mamés',55000,1899,'Bilbao'), -- NUEVO REGISTRO
(null,'Real Betis','Benito Villamarín',60000,1907,'Sevilla');  -- NUEVO REGISTRO

insert into jugadores values
(null,'Unai Simón','1998/2/8',5), -- NUEVO REGISTRO
(null,'Fekir','1994/8/9',6);  -- NUEVO REGISTRO

insert into partidos values
(null, 5, 6,'2004/10/8 14:00:00',1,1,'Espontáneo salta al camppo'),  -- NUEVO REGSTRO
(null, 6, 5,'2004/1/4 21:00:00',3,2,'Partido con muchos goles'); -- NUEVO REGISTRO

INSERT INTO goles VALUES
(null,4,'00:26:00','Golazo de chilena',1),
(null,4,'01:00:00','Error del portero',12);

insert into equipos set
id = null, 
nombre = 'Barcelona',
estadio = 'Camp Nou',
aforo = 100000,
fundacion = 1899,
ciudad = 'Barcelona';
