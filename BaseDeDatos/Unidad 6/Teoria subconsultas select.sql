-- Subconsultas select
use maratoon;

-- Esto para hacerlo normal, muestra los corredores mayores de 29 años = edad de pedro
select * from corredores where edad > 29 order by fechaNacimiento;
-- Esto para subconsulta
select * from corredores where edad > (select edad from corredores where id = 5) order by fechaNacimiento;
-- Esto es lo mismo pero con más subconsultas
select * from corredores where edad > (select edad from corredores where id = (select id from corredores where nombre like 'Pedro%' and apellidos like '%Ortega%')) order by fechaNacimiento;

-- Devuelve el corredor mas mayor
select * from corredores where edad = (select max(edad) from corredores);

-- Devuelvelos corredores cuya edad es mayor a la media
select * from corredores where edad > (select avg(edad) from corredores) order by edad desc;

-- Datos del corredor mas joven
select * from corredores where edad = (select min(edad) from corredores);

 -- Detalle de la mujer mas joven 
 select * from corredores where edad = (select min(edad) from corredores where sexo = 'M') and sexo = 'M';
 
 -- Determinar los corredores que son mayores que todos los de Villamartín
SELECT * FROM Corredores WHERE Edad> ALL (SELECT Edad From Corredores WHERE Ciudad = 'Villamartín');

-- Muestra todos los corredores cuya edaad es inferior a la de todos los corredores de villamartin
SELECT * FROM Corredores WHERE Edad< ALL (SELECT Edad From Corredores WHERE Ciudad = 'Villamartín');
select * from corredores where edad < (select min(edad) from corredores where ciudad = 'Villamartín');

-- Determinar los corredores cuya edad sea inferior a
-- la edad de algún corredor de Villamartín, sirve any o some
SELECT * FROM Corredores WHERE Edad< ANY (SELECT Edad From Corredores WHERE Ciudad = 'Villamartín');

-- Determinar los corredores cuya edad coincida
-- con la edad de cualquiera de los corredores de Villamartín
SELECT * FROM Corredores WHERE Edad IN (SELECT Edad FROM Corredores WHERE Ciudad = 'Villamartín') and ciudad != 'Villamartín';

-- Determinar los clubs que no tengan corredores
SELECT * FROM clubs WHERE NOT EXISTS (SELECT * FROM Corredores WHERE clubs.id=Corredores.club_id);

-- Determinar los clubs que tengan corredores
SELECT * FROM clubs WHERE EXISTS (SELECT * FROM Corredores WHERE clubs.id=Corredores.club_id);