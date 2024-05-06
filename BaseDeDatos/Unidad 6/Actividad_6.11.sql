use empresa;

-- 1
SELECT d.id AS id, d.nombre AS Departamento, COUNT(e.id) AS NumEmpleados
FROM Departamentos d
LEFT JOIN Empleados e ON d.id = e.departamento_id
GROUP BY d.id, d.nombre;

-- 2
SELECT d.id AS id, d.nombre AS Departamento, COUNT(e.id) AS NumEmpleados
FROM Departamentos d
LEFT JOIN Empleados e ON d.id = e.departamento_id
WHERE e.salario > 30000
GROUP BY d.id, d.nombre;

-- 3
SELECT d.id AS id, d.nombre AS Departamento, COUNT(e.id) AS NumEmpleados
FROM Departamentos d
LEFT JOIN Empleados e ON d.id = e.departamento_id
WHERE e.salario BETWEEN 20000 AND 50000
GROUP BY d.id, d.nombre;

-- 4
SELECT YEAR(fecha_nac) AS Año, COUNT(id) AS NumEmpleados
FROM Empleados
GROUP BY YEAR(fecha_nac);

-- 5
SELECT proyecto_id AS id, proyecto_id AS Proyecto, SUM(horas) AS HorasAcumuladas
FROM empleados_proyectos
GROUP BY proyecto_id;

-- 6
SELECT supervisor_id AS id, e.apellidos, e.nombre, COUNT(e.id) AS numDependientes
FROM Empleados e
WHERE supervisor_id IS NOT NULL
GROUP BY supervisor_id, e.apellidos, e.nombre;

-- 7
SELECT d.id AS 'Número de Departamento',
       d.nombre AS 'Nombre del Departamento',
       CONCAT(e.nombre, ' ', e.apellidos) AS 'Jefe del Departamento',
       COUNT(em.id) AS 'Numero de Empleados',
       ROUND(AVG(em.salario), 2) AS 'Salario Medio',
       MAX(em.salario) AS 'Salario Máximo',
       MIN(em.salario) AS 'Salario Mínimo',
       SUM(em.salario) AS 'Suma Salarios'
FROM Departamentos d
LEFT JOIN Empleados em ON d.id = em.departamento_id
LEFT JOIN Empleados e ON d.jefe_departamento_id = e.id
GROUP BY d.id, d.nombre, e.nombre, e.apellidos;

-- 8
SELECT e.id AS id, e.nss AS NSS, CONCAT(e.nombre, ' ', e.apellidos) AS 'Nombre del empleado', 
       COUNT(b.id) AS 'Número total de beneficiarios'
FROM Empleados e
LEFT JOIN Beneficiarios b ON e.id = b.empleado_id
GROUP BY e.id, e.nss, e.nombre, e.apellidos;

-- 9
SELECT d.id AS 'id de Departamento',
       d.nombre AS 'Nombre del Departamento',
       COUNT(b.id) AS 'Número de Beneficiarios'
FROM Departamentos d
LEFT JOIN Empleados e ON d.id = e.departamento_id
LEFT JOIN Beneficiarios b ON e.id = b.empleado_id
GROUP BY d.id, d.nombre;

-- 10
SELECT p.id AS 'Id de Proyecto',
       p.descripcion AS 'Nombre de Proyecto',
       d.nombre AS 'Nombre de Departamento',
       SUM(ep.horas) AS 'Horas Acumuladas'
FROM Proyectos p
INNER JOIN Departamentos d ON p.departamento_id = d.id
INNER JOIN empleados_proyectos ep ON p.id = ep.proyecto_id
GROUP BY p.id, p.descripcion, d.nombre;

-- 11
SELECT empleado_id AS 'empleado_id de empleado_proyecto',
       SUM(horas) AS 'Número de horas acumuladas'
FROM empleados_proyectos
GROUP BY empleado_id;

-- 12
SELECT empleado_id AS 'id de empleado_proyecto',
       proyecto_id AS 'IdProyecto de trabaja_en',
       SUM(horas) AS 'Número de horas acumuladas'
FROM empleados_proyectos
GROUP BY empleado_id, proyecto_id;

-- 13
SELECT ep.empleado_id AS 'empleado_id de empleado_proyecto',
       CONCAT(e.nombre, ' ', e.apellidos) AS 'Nombre de Empleado',
       ep.proyecto_id AS 'proyecto_id de empleado_proyecto',
       SUM(ep.horas) AS 'Número de horas acumuladas'
FROM empleados_proyectos ep
INNER JOIN Empleados e ON ep.empleado_id = e.id
GROUP BY ep.empleado_id, e.nombre, e.apellidos, ep.proyecto_id;

-- 14
SELECT ep.empleado_id AS 'empleado_id de empleado_proyecto',
       CONCAT(e.nombre, ' ', e.apellidos) AS 'Nombre de Empleado',
       ep.proyecto_id AS 'proyecto_id de empleado_proyecto',
       p.descripcion AS 'Descripción del Proyecto',
       SUM(ep.horas) AS 'Número de horas acumuladas'
FROM empleados_proyectos ep
INNER JOIN Empleados e ON ep.empleado_id = e.id
INNER JOIN Proyectos p ON ep.proyecto_id = p.id
GROUP BY ep.empleado_id, e.nombre, e.apellidos, ep.proyecto_id, p.descripcion;

-- 15
SELECT AVG(salario) AS 'Sueldo Medio'
FROM Empleados
WHERE departamento_id = 3;

-- 16
SELECT AVG(salario) AS 'Sueldo Medio'
FROM Empleados
GROUP BY departamento_id
HAVING departamento_id = 3;

-- 17
SELECT departamento_id AS 'id del Departamento',
       AVG(salario) AS 'Sueldo Medio',
       MAX(salario) AS 'Sueldo Máximo',
       MIN(salario) AS 'Sueldo Mínimo'
FROM Empleados
WHERE departamento_id IN (1, 2)
GROUP BY departamento_id;

-- 18
SELECT p.departamento_id AS 'id de Departamento'
FROM Proyectos p
INNER JOIN empleados_proyectos ep ON p.id = ep.proyecto_id
GROUP BY p.departamento_id
HAVING SUM(ep.horas) >= 50;

-- 19
SELECT departamento_id AS 'Número de Departamento',
       AVG(salario) AS 'Salario Medio'
FROM Empleados
GROUP BY departamento_id
HAVING AVG(salario) > 40000;

-- 20
SELECT YEAR(fecha_nac) AS 'Año de Nacimiento',
       AVG(salario) AS 'Salario Medio',
       COUNT(*) AS 'Número de Empleados'
FROM Empleados
GROUP BY YEAR(fecha_nac)
HAVING AVG(salario) > 45000;

-- 21
SELECT genero AS 'Sexo',
       COUNT(*) AS 'Número de Beneficiarios'
FROM Beneficiarios
GROUP BY genero;