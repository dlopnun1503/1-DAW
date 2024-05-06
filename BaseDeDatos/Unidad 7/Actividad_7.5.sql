-- Práctica 7.5 - Bloqueos de tablas

-- 1. Usuarios
CREATE USER ubrique01@localhost IDENTIFIED BY '*EC0574FECB8D62FA502D1BC2165A7BBE8754D0F7';
GRANT ALL PRIVILEGES ON *.* TO ubrique01@localhost WITH GRANT OPTION;

CREATE USER arcos01@localhost IDENTIFIED BY '*9D46406132E2344139C9028FFEA6CE31213E83F2';
GRANT ALL PRIVILEGES ON *.* TO arcos01@localhost WITH GRANT OPTION;


-- 2. Usar geslibros
USE geslibros;

-- 3. Usuario ubrique01
-- Bloquear la tabla clientes para lectura
LOCK TABLES clientes READ;

-- Intentar mostrar todos los registros de la tabla libros
SELECT * FROM libros; 

-- Desbloquear la tabla clientes
UNLOCK TABLES;

-- 4. usuario arcos01
-- Seleccionar todos los clientes de la provincia de Guadalajara
SELECT * FROM clientes WHERE provincia_id = 19;

-- Intentar insertar un cliente
INSERT INTO clientes VALUES 
('Nuevo Cliente', 'Calle Nueva 123', 'Guadalajara', '19001', 19, '12345678A', '987654321', '654321987', 'cliente@correo.com');

-- 6. usuario arcos01
-- Bloquear la tabla libros a modo escritura
LOCK TABLES libros WRITE;

-- Insertar un nuevo libro
INSERT INTO libros (isbn, titulo, autor_id, editorial_id, precio_coste, precio_venta, stock, stock_min, stock_max, fecha_edicion)
VALUES ('9781234567890', 'Nuevo Libro', 1, 1, 20.00, 30.00, 10, 1, 20, '2024-04-01');

-- 7. usuario ubrique01
-- Intentar mostrar todos los registros de la tabla libros
SELECT * FROM libros;

-- Intentar bloquear la tabla para lectura
LOCK TABLES libros READ; 

-- 8. usuario arcos01
UNLOCK TABLES;

-- 9. Transacciones
-- Usuario arcos01
START TRANSACTION;
SELECT * FROM editoriales WHERE id = id FOR SHARE;
SELECT * FROM autores WHERE id = id FOR SHARE;
INSERT INTO libros (isbn, titulo, autor_id, editorial_id, precio_coste, precio_venta, stock, stock_min, stock_max, fecha_edicion)
VALUES ('9789876543210', 'Libro 1', 2, 2, 15.00, 25.00, 15, 1, 20, '2024-04-01');
INSERT INTO libros (isbn, titulo, autor_id, editorial_id, precio_coste, precio_venta, stock, stock_min, stock_max, fecha_edicion)
VALUES ('9780123456789', 'Libro 2', 3, 3, 18.00, 28.00, 20, 1, 25, '2024-04-01');
COMMIT;

-- Usuario ubrique01
START TRANSACTION;
LOCK TABLES libros WRITE;
UPDATE libros SET precio_venta = precio_venta * 0.7; -- Decrementar el precio de los libros en un 30%
COMMIT;
