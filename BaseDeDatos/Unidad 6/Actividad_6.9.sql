use empresa;

-- Empleados
SELECT e.id, e.nombre, e.apellidos, e.salario, e.departamento_id, d.nombre AS nombre_departamento
FROM Empleados e
inner JOIN Departamentos d ON e.departamento_id = d.id
ORDER BY e.id;

-- Departamentos
SELECT d.id, d.nombre, d.localizacion, d.componentes, d.jefe_departamento_id, e.apellidos, e.nombre AS nombre_jefe
FROM Departamentos d
LEFT JOIN Empleados e ON d.jefe_departamento_id = e.id
ORDER BY d.nombre;

-- Empleados con supervisor
SELECT e.id, e.nombre, e.apellidos, e.nss, e.salario, s.nombre AS nombre_supervisor, s.apellidos AS apellidos_supervisor
FROM Empleados e
LEFT JOIN Empleados s ON e.supervisor_id = s.id
ORDER BY e.id;

-- Beneficiarios con empleados
SELECT b.id, b.nombre, b.genero, b.parentesco, b.fecha_nac, b.empleado_id, e.nombre AS nombre_empleado, e.apellidos AS apellidos_empleado
FROM Beneficiarios b
inner JOIN Empleados e ON b.empleado_id = e.id;

-- Proyectos
SELECT p.id, p.descripcion, p.num_proyecto, p.localizacion, p.fecha_inicio, p.fecha_fin, p.departamento_id, d.nombre AS nombre_departamento
FROM Proyectos p
inner JOIN Departamentos d ON p.departamento_id = d.id;

-- Proyectos con jefe de departamento
SELECT p.id, p.descripcion, p.num_proyecto, p.localizacion, p.fecha_inicio, p.fecha_fin, p.departamento_id, d.nombre AS nombre_departamento, e.nombre AS nombre_jefe, e.apellidos AS apellidos_jefe
FROM Proyectos p
inner JOIN Departamentos d ON p.departamento_id = d.id
LEFT JOIN Empleados e ON d.jefe_departamento_id = e.id;

-- Informe empleados_proyectos
SELECT ep.empleado_id, ep.proyecto_id, ep.horas, e.nombre AS nombre_empleado, e.apellidos AS apellidos_empleado, p.descripcion AS descripcion_proyecto
FROM empleados_proyectos ep
inner JOIN Empleados e ON ep.empleado_id = e.id
inner JOIN Proyectos p ON ep.proyecto_id = p.id
ORDER BY e.apellidos;