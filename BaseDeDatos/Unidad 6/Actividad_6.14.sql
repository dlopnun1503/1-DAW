-- David Lopez

use geslibros;

-- 1. Script - libros 
SELECT 
    l.id,
    l.titulo,
    a.nombre AS autor,
    l.fecha_edicion,
    l.stock AS unidades,
    l.precio_coste,
    l.precio_venta
FROM
    libros l
        JOIN
    autores a ON l.autor_id = a.id
ORDER BY l.id;

-- 2. Script - libros 
SELECT 
    l.id,
    l.titulo,
    a.nombre AS autor,
    e.nombre AS editorial,
    l.fecha_edicion,
    l.stock AS unidades,
    l.precio_coste,
    l.precio_venta
FROM
    libros l
        JOIN
    autores a ON l.autor_id = a.id
        JOIN
    editoriales e ON l.editorial_id = e.id
ORDER BY l.id;

-- 3. Script - ventas
SELECT 
    v.id,
    c.nombre AS nombre_cliente,
    v.fecha,
    v.importe_bruto,
    v.importe_iva,
    v.importe_total
FROM
    ventas v
        JOIN
    clientes c ON v.cliente_id = c.id
WHERE
    v.importe_total > 500
ORDER BY v.id;

-- 4. Script - ventas
SELECT 
    v.cliente_id AS id_cliente,
    c.nombre AS nombre_cliente,
    SUM(v.importe_total) AS importe_total_ventas
FROM
    ventas v
        JOIN
    clientes c ON v.cliente_id = c.id
GROUP BY v.cliente_id
ORDER BY importe_total_ventas;