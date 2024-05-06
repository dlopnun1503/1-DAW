-- Ejercicio 1
USE empresa;

SELECT * FROM empleados ORDER BY salario DESC LIMIT 3;
SELECT * FROM empleados ORDER BY salario ASC LIMIT 5;
SELECT * FROM empleados ORDER BY apellidos, nombre;
SELECT * FROM departamentos ORDER BY id LIMIT 3;
SELECT * FROM empleados WHERE departamento_id = 3 ORDER BY salario DESC LIMIT 3;

-- Ejercicio 2
USE empresa;

SELECT COUNT(*) FROM departamentos;
SELECT COUNT(*) FROM beneficiarios where genero = 'M';
SELECT COUNT(*) FROM empleados where salario between 20000 and 50000;
SELECT COUNT(*) FROM empleados where year(fecha_nac) > 1970 ;
SELECT COUNT(*) FROM proyectos where departamento_id = 3;
SELECT COUNT(*) FROM empleados_proyectos;
SELECT distinct departamento_id from proyectos;

-- Ejercicio 3
use empresa;
SELECT SUM(horas) AS 'El total de horas trabajadas en los distintos proyectos' FROM empleados_proyectos;
SELECT SUM(horas) AS 'El total de horas trabajadas en los distintos proyectos' FROM empleados_proyectos WHERE proyecto_id = 2;
SELECT SUM(salario) AS 'La suma total de los salarios de los empleados' FROM empleados;
SELECT SUM(salario) AS 'La suma total de los salarios de los empleados del departamento 5' FROM empleados WHERE departamento_id = 5;
SELECT SUM(salario) AS 'La suma total de los salarios de los empleados cuyo número de supervisor es 3' FROM empleados WHERE supervisor_id = 3;
SELECT COUNT(*) as 'El número total de empleados', SUM(salario) as 'La suma total de sus salarios del departamento 4' FROM empleados WHERE departamento_id = 4;


-- Ejercicio 4
use empresa;
SELECT AVG(horas) FROM empleados_proyectos;
SELECT COUNT(*) as 'Número total de jornadas', SUM(horas) 'Suma total de horas trabajadas', AVG(horas) 'Media de horas tabajadas ' FROM empleados_proyectos;
SELECT COUNT(*), SUM(salario), AVG(departamento_id = 3) FROM empleados;
SELECT AVG(salario) FROM empleados;
SELECT COUNT(*), AVG(salario), SUM(salario) FROM empleados; 
SELECT COUNT(*) ,AVG(salario) FROM empleados WHERE fecha_nac BETWEEN '1960-01-01' and '1980-12-31';
SELECT * FROM empleados WHERE salario > (SELECT AVG(salario) FROM empleados);
SELECT * FROM empleados WHERE salario > (SELECT AVG(salario) FROM empleados) and departamento_id = 3;
SELECT empleados.nss, empleados.nombre, empleados.apellidos FROM  empleados, empleados_proyectos  WHERE empleados_proyectos.horas  > (SELECT AVG(empleados_proyectos.horas) FROM empleados_proyectos) ;


-- Ejercicio 5
use empresa;
SELECT MAX(salario) FROM empleados;
SELECT MIN(salario) FROM empleados;
SELECT MAX(horas) FROM empleados_proyectos;
SELECT * FROM empleados WHERE salario = (SELECT MAX(salario) FROM empleados);
SELECT * FROM empleados WHERE salario =(SELECT MIN(salario) FROM empleados);
SELECT empleados.nss FROM empleados, empleados_proyectos WHERE empleados_proyectos.horas = (SELECT MAX(empleados_proyectos.horas) FROM empleados_proyectos); 
SELECT empleados.nss, empleados.nombre, empleados.apellidos FROM empleados, empleados_proyectos WHERE empleados_proyectos.horas = (SELECT MAX(empleados_proyectos.horas) FROM empleados_proyectos); 
SELECT empleados.nss FROM empleados, empleados_proyectos WHERE empleados_proyectos.horas = (SELECT MIN(empleados_proyectos.horas) FROM empleados_proyectos); 
SELECT empleados.nss , empleados.nombre, empleados.apellidos FROM empleados, empleados_proyectos WHERE empleados_proyectos.horas = (SELECT MIN(empleados_proyectos.horas) FROM empleados_proyectos) ;

