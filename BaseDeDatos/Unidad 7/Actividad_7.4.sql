USE geslibros;


-- Iniciar una transacción
START TRANSACTION;

-- Actualizar precios de los libros de tema Novela y de la editorial Anaya según lo requerido
UPDATE libros
SET precio_venta = precio_venta * 0.90
WHERE id IN (SELECT LT.libro_id FROM libros_temas LT JOIN temas T ON LT.tema_id = T.id WHERE T.tema = 'Novela');

UPDATE libros
SET precio_venta = precio_venta * 1.06
WHERE editorial_id = (SELECT id FROM editoriales WHERE nombre = 'Anaya');

UPDATE libros
SET precio_venta = precio_venta * 0.955
WHERE editorial_id != (SELECT id FROM editoriales WHERE nombre = 'Anaya');

-- Confirmar los cambios realizados hasta el momento
COMMIT;

-- Iniciar una nueva transacción
START TRANSACTION;

-- Añadir dos nuevos libros
INSERT INTO libros (isbn, titulo, autor_id, editorial_id, precio_venta, stock, stock_min, stock_max, fecha_edicion)
VALUES ('9788497325530', 'El amor en los tiempos del cólera', 1, 1, 25.00, 50, 10, 100, '1985-07-01'),
       ('9788408038756', 'El principito', 2, 2, 15.00, 30, 5, 50, '1943-04-06');

-- Añadir una venta y 3 líneas de detalle sobre esa venta
INSERT INTO ventas (cliente_id, fecha, importe_bruto, importe_iva, importe_total)
VALUES (1, '2024-03-18', 150.00, 31.50, 181.50);

INSERT INTO lineasventas (venta_id, numero_linea, libro_id, iva, cantidad, precio, importe)
VALUES (LAST_INSERT_ID(), 1, 20, 0.21, 2, 25.00, 50.00),
       (LAST_INSERT_ID(), 2, 21, 0.21, 3, 15.00, 45.00),
       (LAST_INSERT_ID(), 3, 22, 0.21, 1, 15.00, 15.00);

-- Confirmar los cambios realizados hasta el momento
COMMIT;

-- Iniciar una nueva transacción
START TRANSACTION;

-- Insertar dos libros
INSERT INTO libros (isbn, titulo, autor_id, editorial_id, precio_venta, stock, stock_min, stock_max, fecha_edicion)
VALUES ('9788497325547', 'Cien años de soledad', 1, 3, 20.00, 100, 20, 200, '1967-05-30'),
       ('9788408188690', 'Harry Potter y la piedra filosofal', 3, 4, 18.00, 80, 15, 150, '1997-06-26');

-- Insertar dos clientes
INSERT INTO clientes (nombre, direccion, poblacion, c_postal, provincia_id, nif, telefono, movil, email)
VALUES ('María García', 'C/ Mayor 10', 'Madrid', '28001', 28, '12345678A', '912345678', '612345678', 'maria@gmail.com'),
       ('Juan López', 'Avd. Libertad 5', 'Barcelona', '08002', 8, '87654321B', '932109876', '632109876', 'juan@gmail.com');

-- Crear SAVEPOINT a
SAVEPOINT a;

-- Actualizar los precios de todos los libros en un 10% de incremento
UPDATE libros
SET precio_venta = precio_venta * 1.10;

-- Crear SAVEPOINT b
SAVEPOINT b;

-- Eliminar los libros no vendidos
DELETE FROM libros
WHERE id NOT IN (SELECT DISTINCT libro_id FROM lineasventas);

-- Deshacer a partir del SAVEPOINT a
ROLLBACK TO SAVEPOINT a;

-- Comprobar que los libros no se eliminaron
SELECT * FROM libros;

-- Finalizar la transacción
COMMIT;




