-- Actividad_6.7

USE empresa;

SELECT * FROM proyectos WHERE localizacion = (SELECT localizacion FROM proyectos WHERE descripcion = 'Carretera Madrid Toledo');
SELECT * FROM empleados WHERE departamento_id = (SELECT departamento_id FROM empleados WHERE nombre = 'Jennifer' AND apellidos = 'Wallace');
SELECT * FROM empleados WHERE salario < (SELECT salario FROM empleados WHERE nombre = 'Alicia' AND apellidos = 'Zelaya');
SELECT * FROM beneficiarios WHERE YEAR(fecha_nac) = (SELECT YEAR(fecha_nac) FROM beneficiarios WHERE nombre = 'Alice' AND id = 1);
SELECT * FROM empleados WHERE fecha_nac < (SELECT fecha_nac FROM empleados WHERE nombre = 'James' AND apellidos = 'Bord');
SELECT * FROM Empleados WHERE supervisor_id IN (SELECT id FROM Empleados WHERE departamento_id = 3);
SELECT * FROM Empleados WHERE YEAR(fecha_nac) IN (SELECT DISTINCT YEAR(fecha_nac) FROM Empleados WHERE departamento_id = 3);
SELECT * FROM Empleados WHERE salario IN (SELECT salario FROM Empleados WHERE departamento_id = 2);
INSERT INTO Departamentos (nombre, componentes, localizacion)
VALUES ('Marketing', 10, 'Houston');
SELECT * FROM Departamentos WHERE id NOT IN (SELECT DISTINCT departamento_id FROM Empleados);
SELECT * FROM Departamentos WHERE id IN (SELECT DISTINCT departamento_id FROM Empleados);
SELECT * FROM Departamentos WHERE id NOT IN (SELECT DISTINCT departamento_id FROM Proyectos);
SELECT * FROM Departamentos WHERE id IN (SELECT DISTINCT departamento_id FROM Proyectos);
SELECT * FROM Empleados WHERE salario = ANY (SELECT salario FROM Empleados WHERE departamento_id = 1);
SELECT * FROM Empleados WHERE salario IN (SELECT salario FROM Empleados WHERE departamento_id = 1);
SELECT * FROM Empleados WHERE salario < ANY (SELECT salario FROM Empleados WHERE departamento_id = 2);
SELECT * FROM Empleados WHERE salario > ANY (SELECT salario FROM Empleados WHERE supervisor_id = 1);
SELECT * FROM Empleados WHERE salario < ALL (SELECT salario FROM Empleados WHERE departamento_id = 1);
SELECT * FROM Empleados WHERE salario > ALL (SELECT salario FROM Empleados WHERE departamento_id = 2);