-- EXAMEN BD UD6
-- David Lopez Nuñez

uSE geslibros;

-- 1. Script - autores
SELECT 
    id, nombre, nacionalidad, email, fecha_nac, premios
FROM
    autores
WHERE
    nacionalidad LIKE '%España%'
        AND Premios LIKE '%Planeta%'
ORDER BY Id;

-- 2. Script - clientes
SELECT 
    Id, Nombre, Poblacion, C_postal, Nif, Telefono, Movil, Email
FROM
    Clientes
WHERE
    Poblacion LIKE '%Ubrique%'
        AND C_postal LIKE '%11600%'
        AND Nif LIKE 'E%'
        AND Nombre LIKE '%Ubrique%'
ORDER BY Nombre;

-- 3. Script - clientes ventas
SELECT 
    cl.id,
    cl.nombre AS cliente,
    cl.poblacion,
    ve.id AS id_venta,
    ve.fecha,
    ve.importe_bruto,
    ve.importe_iva,
    ve.importe_total
FROM
    (ventas AS ve
    INNER JOIN clientes AS cl ON ve.cliente_id = cl.id)
WHERE
    YEAR(fecha) BETWEEN 2012 AND 2014
        AND importe_total > 400
ORDER BY importe_total ASC;

-- 4. Script - clientes ventas
SELECT 
    clientes.id AS id_cliente,
    clientes.nombre AS nombre_cliente,
    clientes.poblacion,
    ventas.id AS id_venta,
    ventas.fecha,
    ventas.importe_bruto,
    ventas.importe_iva,
    ventas.importe_total
FROM
    clientes
        LEFT JOIN
    ventas ON clientes.id = ventas.cliente_id
WHERE
    ventas.fecha BETWEEN 2012 AND 2014
        AND ventas.importe_total > 400
ORDER BY ventas.importe_total DESC;

-- 5. Script - libros
SELECT 
    libros.id,
    libros.titulo,
    autores.nombre AS autor,
    editoriales.nombre AS editorial,
    libros.fecha_edicion,
    libros.stock,
    libros.precio_coste,
    libros.precio_venta
FROM
    libros
        INNER JOIN
    autores ON libros.autor_id = autores.id
        INNER JOIN
    editoriales ON libros.editorial_id = editoriales.id
WHERE
    (editoriales.nombre IN ('Alfaguara' , 'Anaya',
        'Ediciones Paraninfo S.A.',
        'MCGRAWHILL'))
        AND libros.fecha_edicion BETWEEN '2010-01-01' AND '2020-12-31'
        AND libros.precio_venta < 40
ORDER BY libros.id;

-- 6. Script - editoriales
SELECT 
    ed.id,
    ed.nombre AS editorial,
    ed.poblacion,
    li.id AS id_libro,
    li.titulo,
    li.precio_coste,
    li.precio_venta
FROM
    libros AS li
        INNER JOIN
    editoriales AS ed ON li.editorial_id = ed.id
ORDER BY ed.id; 

-- 7. Script - libros
SELECT 
    li.id,
    li.titulo,
    au.nombre AS autor,
    ed.nombre AS editorial,
    li.stock,
    li.stock_max,
    li.stock_min,
    li.precio_coste,
    li.precio_venta,
    li.stock * li.precio_coste AS valor_almacen
FROM
    ((libros AS li
    INNER JOIN autores AS au ON li.autor_id = au.id)
    INNER JOIN editoriales AS ed ON li.editorial_id = ed.id)
WHERE
    li.stock > li.stock_min
ORDER BY valor_almacen DESC;

-- 8. Script - libros (subconsulta)
select 
li.id,
li.titulo,
au.nombre as autor,
ed.nombre as editorial,
li.fecha_edicion,
li.stock,
li.precio_coste,
li.precio_venta
from 
((libros AS li
    INNER JOIN autores AS au ON li.autor_id = au.id)
    INNER JOIN editoriales AS ed ON li.editorial_id = ed.id) where li.id = (select id from libros where autor_id = 1) order by li.id;
    
-- 9. Estadística de libros de Oscar Wilde
SELECT 
    au.id,
    au.nombre AS autor,
    COUNT(*) libros,
    SUM(li.precio_venta) / 4 AS precio_medio,
    MAX(li.precio_venta) AS precio_max,
    MIN(li.precio_venta) AS precio_max,
    SUM(li.stock) / 4 AS stock_medio,
    MAX(li.stock) AS stock_maximo,
    MIN(li.stock) AS stock_minimo,
    SUM(li.stock) AS stock_acumulado
FROM
    libros AS li
        INNER JOIN
    autores AS au ON li.autor_id = au.id
WHERE
    au.nombre LIKE '%Oscar Wilde%';

-- 10. Script - autores (subconsulta)
SELECT 
    id, nombre, nacionalidad, email, fecha_nac, premios
FROM
    autores
WHERE
    fecha_nac < (SELECT 
            fecha_nac
        FROM
            autores
        WHERE
            id = 5);

-- 11. Script - ventas por clientes (agrupación registros)
SELECT 
    cl.id,
    cl.nombre AS cliente,
    COUNT(*) ventas,
    SUM(ve.importe_bruto) AS importe_bruto_ac,
    SUM(ve.importe_iva) AS importe_iva_ac,
    SUM(ve.importe_total) AS importe_total_ac,
    ve.fecha
FROM
    ventas AS ve
        INNER JOIN
    clientes AS cl ON ve.cliente_id = cl.id
WHERE
    YEAR(ve.fecha) = 2014
GROUP BY cl.id
ORDER BY importe_total_ac DESC;

-- 12. Script - ventas por autor
select 
au.id,
au.nombre as autor,
au.nacionalidad,
sum(lv.cantidad) as unidades_ven,
sum(lv.importe) as importe_ven
from ((lineasventas as lv inner join libros on lv.libro_id = libros.id) inner join autores as au on libros.autor_id = au.id) order by importe_ven desc;

-- 13. View - ventas por autor.
CREATE OR REPLACE VIEW ventas_por_autor AS
    SELECT 
        au.id,
        au.nombre AS autor,
        au.nacionalidad,
        SUM(lv.cantidad) AS unidades_ven,
        SUM(lv.importe) AS importe_ven
    FROM
        ((lineasventas AS lv
        INNER JOIN libros ON lv.libro_id = libros.id)
        INNER JOIN autores AS au ON libros.autor_id = au.id)
    ORDER BY importe_ven DESC;
    
    -- 13.1 Obtener aquellas autores que hayan conseguido vender más libros que Oscar Wilde
    select
    autor
    from ventas_por_autor where unidades_ven > (select unidades_ven from ventas_por_autor where autor like '%Oscar  Wilde%');
    
    
    -- 15. Insertar - Libros 
    insert into libros values
    (null, '1234A', '2222G', 'Base de datos', 5, 8 , 22.00, 25.00, 20, 10, 50, '2014/06/11', default, default),
    (null, '12664A', '226662G', 'ADE', 5, 8 , 20.00, 28.00, 200, 100, 500, '2010/05/11', default, default);
    
    -- 18. Update - Libros
    update libros set 
    precio_venta = precio_venta * 0.9 where editorial_id = 5;
    
 