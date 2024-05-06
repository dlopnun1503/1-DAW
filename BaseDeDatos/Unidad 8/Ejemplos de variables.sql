-- Ejemplo variables

-- Declaramos una variable tipo varchar
set @nombre = 'David';
-- Mostramos la variable
select @nombre;

-- Declaramos dos variables de tipo integer
set @valor1 = 20, @valor2 = 30;
set @suma = @valor1 + @valor2;
select @suma;

-- Declaramos variables tipo date
set @fecha_nacimiento = '2010-10-20';
set @edad = timestampdiff(year, @fecha_nacimiento, now());
select @edad;
select @edad, @fecha_nacimiento;

-- Declaramos variables a partir del resultado de un select
use maratoon;
set @id_veterano = (select id from corredores where edad = (select max(edad) from corredores) limit 1);
select * from corredores where id = @id_veterano;

-- Declaramos una variable que almacena varios valores
set @id_ubrique = (select id from corredores where ciudad = 'Ubrique');
select @id_ubrique;