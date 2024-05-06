-- Actividad_8.3

-- 1.  Id de Categoría
-- Funcion : maratoon.Categoria()
-- parametros: int unsigned
-- Descripcion: devuleve la categoria de un corredor segun su edad
delimiter $$
drop function if exists maratoon.Categoria$$
create function maratoon.Categoria(edad int unsigned)
   returns int unsigned 
begin
   DECLARE categoria INT UNSIGNED;
   CASE
      WHEN edad< 12 THEN SET categoria = 1;
      WHEN edad< 14 THEN SET categoria = 2;
      WHEN edad< 17 THEN SET categoria = 3;
	  WHEN edad< 29 THEN SET categoria = 4;
      WHEN edad< 39 THEN SET categoria = 5;
      WHEN edad< 49 THEN SET categoria = 6;
      WHEN edad< 60 THEN SET categoria = 7;
      ELSE SET categoria = 8;
   END CASE;
 RETURN categoria;
END $$
delimiter ;



-- 2. Procedimiento ActualizarCategoria
-- Procedimiento : maratoon.ActualizarCategoria()
-- parametros: null
-- Descripcion: Actualiza la categoria de los corredores a partir e la funcion anterior 
use maratoon;
delimiter $$
drop procedure if exists maratoon.ActualizarCategoria $$
create procedure maratoon.ActualizarCategoria()
begin 
     update corredores set corredores.categoria_id = maratoon.Categoria(edad);
end $$
delimiter ;


-- 3. Procedmiento ProximoCumpleaños
-- Procedimiento : maratoon.ProximoCumpleanios()
-- parametros: null
-- Descripcion: Muestra los corredores que cmplen años la semana que viene
delimiter $$
drop procedure if exists maratoon.ProximoCumpleanios $$
create procedure maratoon.ProximoCumpleanios()
begin
    select * from corredores where WEEK(FechaNacimiento) = week(now()) +  1;
end $$
delimiter ;

-- 4. Función Números Primos
-- Funcion : test.NumerosPrimos()
-- parametros: int unsigned
-- Descripcion: devuleve la suma de los numeros primos que hay desde el uno hasta el numero introducido
delimiter $$
drop function if exists test.NumerosPrimos$$
create function test.NumerosPrimos(numero int unsigned)
returns int unsigned
begin
    DECLARE suma INT = 0;
    DECLARE i INT = 1;
    
    WHILE i <= numero
    BEGIN
        DECLARE es_primo BIT = 1;
        DECLARE j INT = 2;

        WHILE j <= SQRT(i)
        BEGIN
            IF i % j = 0
            BEGIN
                SET es_primo = 0;
                BREAK;
            END
            SET j = j + 1;
        END

        IF es_primo = 1 AND i > 1
        BEGIN
            SET suma = suma + i;
        END

        SET i = i + 1;
    END
   RETURN suma;
delimiter ;


-- 5. Factorial
-- Funcion : test.Factorial()
-- parametros: int unsigned
-- Descripcion: devuelve el factorial de el numero introducido por parametro
delimiter $$
drop function if exists test.Factorial$$
create function test.Factorial(numero int unsigned)
begin
end$$
delimiter ;
    
