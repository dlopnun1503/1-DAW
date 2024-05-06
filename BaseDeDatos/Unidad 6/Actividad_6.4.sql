INSERT INTO geslibros.ventas SET
id = 11,
cliente_id = 6,
fecha= now(),
importe_bruto= 289.50,
importe_iva= 60.80,
importe_total= 350.30;

INSERT INTO geslibros.lineasventas SET
id = 38,
venta_id =  11,
numero_linea =  1,
libro_id =  11,
iva =  0.21,
cantidad = 5,
precio =  30.00,
importe =  150;

INSERT INTO geslibros.lineasventas SET
id= 39,
venta_id= 11,
numero_linea= 2,
libro_id= 12,
iva= 0.21,
cantidad= 10,
precio= 13.00,
importe= 130;

INSERT INTO geslibros.lineasventas SET
id= 40,
venta_id= 11,
numero_linea= 3,
libro_id= 15,
iva= 0.21,
cantidad= 1,
precio= 9.50,
importe= 9.50;


UPDATE geslibros.clientes SET direccion = 'Calle Jesus 5' WHERE nif= '23124234G';
UPDATE geslibros.autores SET premios = 'Nobel' WHERE id = 2;
UPDATE geslibros.libros SET precio_venta = precio_venta * 0.1;
UPDATE geslibros.libros SET precio_coste = precio_coste * 0.1 WHERE editoriales_id = 5 and 6 ;
UPDATE geslibros.libros SET precio_venta = precio_venta - 2.00 WHERE YEAR(fecha_edicion) < 2000;


DELETE FROM  geslibros.libros WHERE editorial_id = 5;
DELETE FROM  geslibros.editoriales WHERE nombre = 'Editorial';


SELECT * FROM geslibros.autores;
SELECT * FROM geslibros.clientes;
SELECT * FROM geslibros.editoriales;
SELECT * FROM geslibros.libros;
SELECT * FROM geslibros.libros_temas;
SELECT * FROM geslibros.provincias;
SELECT * FROM geslibros.temas;
SELECT * FROM geslibros.ventas;
SELECT * FROM geslibros.lineasventas;