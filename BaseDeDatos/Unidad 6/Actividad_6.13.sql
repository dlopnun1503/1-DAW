USE geslibros;

-- 1 Script Clientes
SELECT
id,
nombre,
direccion,
nif,
telefono,
email
FROM clientes WHERE poblacion LIKE '%Ubrique%' AND email LIKE '%ieslosremedios.org';

-- 2. Script - ventas
SELECT
ve.id,
cl.nombre AS cliente,
ve.fecha,
ve.importe_bruto,
ve.importe_iva,
ve.importe_total
FROM ventas AS ve INNER JOIN clientes AS cl ON ve.cliente_id = cl.id WHERE YEAR(fecha) = 2014 ORDER BY ve.importe_total DESC LIMIT 3 ;

-- 3. Script - libros
SELECT
li.id,
li.titulo,
au.nombre AS autor,
ed.nombre AS editorial,
li.stock,
li.precio_coste,
li.precio_venta
FROM ((libros AS li INNER JOIN autores AS au ON li.autor_id = au.id) INNER JOIN editoriales AS ed ON li.editorial_id = ed.id) WHERE YEAR(fecha_edicion) = 2011 AND stock BETWEEN 10 AND 20 ORDER BY li.id ASC;

-- 4. Script - libros
SELECT
li.id,
li.titulo,
au.nombre AS autor,
ed.nombre AS editorial,
li.stock,
li.precio_coste,
li.precio_venta
FROM ((libros AS li INNER JOIN autores AS au ON li.autor_id = au.id) INNER JOIN editoriales AS ed ON li.editorial_id = ed.id) WHERE titulo LIKE '%PHP%' OR titulo LIKE '%Bases de Datos%' AND precio_venta < 30.00 ORDER BY li.id ASC;

-- 5. Script - libros
SELECT
li.id,
li.titulo,
au.nombre AS autor,
ed.nombre AS editorial,
li.stock,
li.precio_coste,
li.precio_venta,
li.precio_coste - li.precio_venta AS margen_benefico
FROM ((libros AS li INNER JOIN autores AS au ON li.autor_id = au.id) INNER JOIN editoriales AS ed ON li.editorial_id = ed.id) WHERE ed.nombre LIKE '%Anaya%' OR ed.nombre LIKE '%Alfaguara%' ORDER BY margen_benefico DESC;

-- 6. Script - libros
SELECT
li.id,
li.titulo,
au.nombre AS autor,
ed.nombre AS editorial,
li.stock,
li.precio_coste,
li.precio_venta
FROM ((libros AS li INNER JOIN autores AS au ON li.autor_id = au.id) INNER JOIN editoriales AS ed ON li.editorial_id = ed.id) WHERE ed.nombre IN ('Anaya', 'Alfaguara') AND precio_coste = (SELECT precio_coste FROM libros WHERE titulo LIKE '%Camboya%') ORDER BY li.id ASC;

-- 7. Script - ventas
SELECT
ve.cliente_id,
COUNT(*) AS num_ventas,
MAX(ve.importe_total) AS max_venta,
MIN(ve.importe_total) AS min_venta,
SUM(ve.importe_total) AS importe_total_acumulado,
cl.nombre AS cliente,
ve.fecha
FROM (ventas AS ve INNER JOIN clientes AS cl ON ve.cliente_id = cl.id) WHERE YEAR(fecha) = 2014 GROUP BY cliente_id ORDER BY importe_total_acumulado DESC; 

-- 8. Script - ventas de editoriales
SELECT 
li.editorial_id,
ed.nombre AS editorial,
COUNT(*) AS num_ventas,
SUM(lv.importe) AS importe_total
FROM ((lineasventas AS lv INNER JOIN libros AS li ON lv.libro_id = li.id) INNER JOIN editoriales AS ed ON li.editorial_id = ed.id) GROUP BY editorial_id  ORDER BY importe_total DESC;

-- 8.2 Script - ventas de editoriales
SELECT 
li.editorial_id,
ed.nombre AS editorial,
COUNT(*) AS num_ventas,
SUM(lv.importe) AS importe_total
FROM ((lineasventas AS lv INNER JOIN libros AS li ON lv.libro_id = li.id) INNER JOIN editoriales AS ed ON li.editorial_id = ed.id) GROUP BY editorial_id having importe_total > 1000  ORDER BY importe_total DESC;

-- 9. View - ventas editoriales
create or replace view ventas_editoriales as 
SELECT 
li.editorial_id,
ed.nombre AS editorial,
COUNT(*) AS num_ventas,
SUM(lv.importe) AS importe_total
FROM ((lineasventas AS lv INNER JOIN libros AS li ON lv.libro_id = li.id) INNER JOIN editoriales AS ed ON li.editorial_id = ed.id) GROUP BY editorial_id  ORDER BY importe_total DESC;

-- 10. Insertar - Libros
insert into libros values
(
null,
'9788448180833',
'9788888199586',
'BaseDeDatos',
1,
5,
'20.50',
'30.50',
200,
100,
300,
'2020/03/15',
default,
default
);

-- 11. Insertar - Libros_Temas
insert into libros_temas values
(
23,
3,
default,
default
),
(
23,
9,
default,
default
),
(
23,
7,
default,
default
);

-- 12. Insertar - Líneas Ventas y Ventas
insert into ventas values
(null, 3, '2019/11/25', 200, 42, 242, default, default);

insert into lineasventas values
(null, 12, 1, 10, 0.21, 2, 20, 40, default, default),
(null, 12, 2, 8, 0.21, 4, 15, 60, default, default),
(null, 12, 3, 5, 0.21, 5, 20, 100, default, default);

-- 13. Update - Libros
update libros set precio_venta = precio_venta * 1.1 where editorial_id = 6;

-- 14. Update - Libros
update libros set precio_venta = precio_venta * 0.7 where libros.id not in (select libro_id from lineasventas inner join ventas on lineasventas.venta_id = ventas.id where year(ventas.fecha) = 2014);

-- 15. Delete - Libros
delete from libros where id in (select distinct libro_id from libros_temas where tema_id = 5);