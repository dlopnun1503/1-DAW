use maratoon;

-- 1. Añadir Corredores
INSERT INTO Corredores (Nombre, Apellidos, Ciudad, FechaNacimiento, Sexo, Club_id)
VALUES 
('Laura', 'López Martínez', 'Jerez de la Fra.', '1995-03-15', 'M', 5),
('David', 'Gómez Ruiz', 'Jerez de la Fra.', '1990-08-20', 'H', 5),
('Ana', 'Díaz Sánchez', 'Jerez de la Fra.', '1988-11-10', 'M', 5);

-- 2. Actualizar Edad
UPDATE Corredores SET Edad = TIMESTAMPDIFF(YEAR, FechaNacimiento, NOW());

-- 3. Actualizar Categoría
UPDATE Corredores SET categoria_id = 
    CASE
        WHEN Edad < 12 THEN 1
        WHEN Edad < 15 THEN 2
        WHEN Edad < 18 THEN 3
        WHEN Edad < 30 THEN 4
        WHEN Edad < 40 THEN 5
        WHEN Edad < 50 THEN 6
        WHEN Edad < 60 THEN 7
        ELSE 8
    END;

-- 4. Mostrar Corredores
SELECT 
    c.id,
    c.Nombre,
    c.Apellidos,
    c.FechaNacimiento,
    c.Edad,
    cat.Nombre AS Categoria,
    cl.Nombre AS Club
FROM 
    Corredores c
JOIN Categorias cat ON c.categoria_id = cat.id
JOIN Clubs cl ON c.Club_id = cl.id;

-- 4. Maratón de Sevilla
INSERT INTO Registros (carrera_id, corredor_id, Salida, Llegada) 
VALUES 
(2, 2, '2019-12-02 09:00:00', '2019-12-02 11:05:00'),
(2, 3, '2019-12-02 09:00:00', '2019-12-02 11:15:00'),
(2, 4, '2019-12-02 09:00:00', '2019-12-02 11:25:00'),
(2, 5, '2019-12-02 09:00:00', '2019-12-02 11:30:00');

-- 5. Actualizar Tiempo de LLegada
UPDATE Registros SET TiempoInvertido = TIMEDIFF(Llegada, Salida) WHERE carrera_id = 2;

-- 6. Mostrar Clasificación
SELECT 
    c.id,
    c.Nombre,
    c.Apellidos,
    cl.Nombre AS Club,
    cat.Nombre AS Categoria,
    r.TiempoInvertido
FROM 
    Registros r
JOIN Corredores c ON r.corredor_id = c.id
JOIN Clubs cl ON c.Club_id = cl.id
JOIN Categorias cat ON c.categoria_id = cat.id
WHERE 
    r.carrera_id = 2
ORDER BY 
    r.TiempoInvertido;

-- 7. Mostrar Clasificación con Total de Segundos
SELECT 
    c.id,
    c.Nombre,
    c.Apellidos,
    cl.Nombre AS Club,
    cat.Nombre AS Categoria,
    r.TiempoInvertido,
    TIME_TO_SEC(r.TiempoInvertido) AS Total_Segundos
FROM 
    Registros r
JOIN Corredores c ON r.corredor_id = c.id
JOIN Clubs cl ON c.Club_id = cl.id
JOIN Categorias cat ON c.categoria_id = cat.id
WHERE 
    r.carrera_id = 2
ORDER BY 
    r.TiempoInvertido;

-- 8. Mostrar Clasificación con Tiempo que falta para batir récord mundial
SELECT 
    c.id,
    c.Nombre,
    c.Apellidos,
    cl.Nombre AS Club,
    cat.Nombre AS Categoria,
    r.TiempoInvertido,
    TIME_TO_SEC(r.TiempoInvertido) AS Total_Segundos,
    TIMEDIFF('02:01:39', r.TiempoInvertido) AS Tiempo_Falta_Récord
FROM 
    Registros r
JOIN Corredores c ON r.corredor_id = c.id
JOIN Clubs cl ON c.Club_id = cl.id
JOIN Categorias cat ON c.categoria_id = cat.id
WHERE 
    r.carrera_id = 2
ORDER BY 
    r.TiempoInvertido;

-- 9. Mostrar Clasificación de la Categoría SNA
SELECT 
    c.id,
    c.Nombre,
    c.Apellidos,
    cl.Nombre AS Club,
    cat.Nombre AS Categoria,
    r.TiempoInvertido
FROM 
    Registros r
JOIN Corredores c ON r.corredor_id = c.id
JOIN Clubs cl ON c.Club_id = cl.id
JOIN Categorias cat ON c.categoria_id = cat.id
WHERE 
    r.carrera_id = 2
    AND c.categoria_id = 4
ORDER BY 
    r.TiempoInvertido;