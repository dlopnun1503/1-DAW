use empresa;

-- Actividad 1
SELECT 
    empleados.id,
    empleados.nombre,
    empleados.apellidos,
    empleados.nss,
    YEAR(CURRENT_DATE()) - YEAR(empleados.fecha_nac) - 
    (DATE_FORMAT(CURRENT_DATE(), '%m%d') < DATE_FORMAT(empleados.fecha_nac, '%m%d')) AS edad,
    empleados.salario,
    departamentos.nombre AS nombre_departamento
FROM empleados
LEFT JOIN departamentos ON empleados.departamento_id = departamentos.id
ORDER BY empleados.id;

-- Actividad 2
SELECT 
    departamentos.id,
    departamentos.nombre AS nombre_departamento,
    departamentos.jefe_departamento_id,
    CONCAT(empleados.nombre, empleados.apellidos) AS nombre_jefe_departamento,
    empleados.id AS id_jefe_departamento
FROM departamentos
LEFT JOIN empleados ON departamentos.jefe_departamento_id = empleados.id
ORDER BY departamentos.id;

-- Actividad 3
SELECT 
    e.id AS id_empleado,
    e.nombre AS nombre_empleado,
    e.apellidos AS apellidos_empleado,
    d.nombre AS nombre_departamento,
    p.descripcion AS nombre_proyecto,
    ep.horas
FROM empleados e
LEFT JOIN empleados_proyectos ep ON e.id = ep.empleado_id
LEFT JOIN proyectos p ON ep.proyecto_id = p.id
LEFT JOIN departamentos d ON e.departamento_id = d.id
ORDER BY ep.horas DESC;

-- Actividad 4
SELECT 
    p.id AS id_proyecto,
    p.descripcion AS nombre_proyecto,
    p.num_proyecto,
    p.fecha_inicio,
    d.nombre AS nombre_departamento,
    e.nombre AS nombre_empleado,
    e.apellidos AS apellidos_empleado,
    ep.horas
FROM proyectos p
LEFT JOIN departamentos d ON p.departamento_id = d.id
LEFT JOIN empleados_proyectos ep ON p.id = ep.proyecto_id
LEFT JOIN empleados e ON ep.empleado_id = e.id
ORDER BY ep.horas DESC;