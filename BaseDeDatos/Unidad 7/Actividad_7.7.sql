use empresa;

-- 1. Añadir apellidos
UPDATE Empleados
SET apellidos = CONCAT(apellidos, ' Pérez') -- Se añade 'Pérez' como segundo apellido
WHERE id = 1; -- Cambiar el ID según corresponda para cada empleado

-- 2. Consulta
SELECT id, nss, CONCAT(apellidos, ', ', nombre) AS nombre_completo
FROM Empleados;

-- 3. Consulta
SELECT id, nss, nombre,
       SUBSTRING_INDEX(apellidos, ' ', 1) AS apellido1,
       SUBSTRING_INDEX(apellidos, ' ', -1) AS apellido2
FROM Empleados;

-- 4. Consulta
SELECT id, nombre, apellidos, nss,
       SUBSTRING_INDEX(direccion, ', ', -1) AS estado,
       SUBSTRING_INDEX(SUBSTRING_INDEX(direccion, ', ', -2), ', ', -1) AS provincia,
       SUBSTRING_INDEX(SUBSTRING_INDEX(direccion, ', ', -3), ', ', -1) AS ciudad,
       SUBSTRING_INDEX(direccion, ', ', 1) AS codigo_postal
FROM Empleados;

-- 5. Crear código
SELECT id, apellidos, nombre, nss,
       CONCAT(RIGHT(nss, 3), '/', UPPER(SUBSTRING(nombre, 1, 2)), UPPER(SUBSTRING(apellidos, 1, 2)), UPPER(SUBSTRING_INDEX(apellidos, ' ', -1))) AS codigo_generado
FROM Empleados;