-- David Lopez
-- Examen UD7

-- 1.Crear usuarios

-- Usuario1
SELECT PASSWORD('tienelatararaunvestido');
CREATE USER brahimarroqui@localhost IDENTIFIED BY '*BFA8596674341F4E1C5A7E368FE57A096D356EF0';

-- Usuario2
SELECT PASSWORD('ubriquedelaspetacas');
CREATE USER marcoasensio@localhost IDENTIFIED BY '*173F9E453B2D5C5C7DFF2B93D269A8A78397ECE9';

-- Usuario3
SELECT PASSWORD('malabaresensemaforo');
CREATE USER laminyamal@localhost IDENTIFIED BY '*722EC5EE08AC80F70FA44D70A760FC28B49BC664';


-- 2.Asignación de privilegios

-- 2.1
gRANT aLL pRIVILEGES oN *.* tO marcoasensio@Localhost;

-- 2.2
 gRANT aLL pRIVILEGES oN *.* tO laminyamal@Localhost wITH gRANT oPTION;
 
-- 2.3
gRANT aLL pRIVILEGES oN gescomercial.* tO brahimarroqui@Localhost;
gRANT aLL pRIVILEGES oN maratoon.* tO brahimarroqui@Localhost;

-- 2.4
gRANT aLL pRIVILEGES oN gescomercial.* tO marcoasensio@Localhost;
gRANT aLL pRIVILEGES oN maratoon.* tO marcoasensio@Localhost;
gRANT aLL pRIVILEGES oN gesbank.* tO marcoasensio@Localhost;

-- 2.5
grant select, update on gescomercial.* to laminyamal@localhost;

-- 2.6 
gRANT select oN gescomercial.* tO marcoasensio@Localhost;
gRANT select oN maratoon.* tO marcoasensio@Localhost;

-- 2.7
grant select(id, nombre, apellidos, ciudad, fechaNacimiento, edad) on maratoon.corredores to laminyamal@localhost;

-- 2.8
grant select(id, nombre, descripcion, precio_coste, precio_venta, stock) on gescomercial.productos to pedrorodriguez@localhost identified by '1234567'; 

-- 2.9
-- 2.9.1
grant select(id, nombre, descripcion, precio_venta) on gescomercial.productos to laminyamal@localhost;

-- 2.9.2
grant update(nombre, poblacion,provincia) on gescomercial.clientes to laminyamal@localhost;

-- 2.9.3
grant insert on gescomercial.ventas to laminyamal@localhost;

-- 2.9.4
grant insert on gescomercial.lineasventas to laminyamal@localhost;


-- 3. Revocación de privilegios

-- 3.1 
revoke all privileges on *.* from laminyamal@localhost;

-- 3.2
revoke all privileges on *.* from marcoasensio@localhost with grant option;

-- 3.3
revoke all privileges on gescomercial.* from pedrorodriguez@localhost;
revoke all privileges on maratoon.* from pedrorodriguez@localhost;
revoke all privileges on empresa.* from pedrorodriguez@localhost;

-- 3.4 
revoke select, update on maratoon.corredores from marcoasensio@localhost;

-- 3.5
revoke select(id, nombre, apellidos, ciudad) on maratoon.corredores from brahimarroqui@localhost;


-- 4. Cambiar password
set password for pedrorodriguez@localhost = password ('7654321');

-- 5.Bloqueo de tablas
use gescomercial;

-- 5.1 
lock tables productos read, clientes read;
-- ¿Puede otro usuario añadir un nuevo producto?      NO
-- ¿Puedo yo consultar la tabla ventas de la base de datos gescomercial?    SI
-- ¿Puede otro usuario consultar la tabla productos?     NO
-- ¿Puede otro usuario bloquear a modo lectura la tabla productos?    NO

-- 5.2 
LOCK TABLES ventas write, lineasventas write;
-- ¿Puede otro usuario bloquear a modo escritura la tabla ventas?      NO
-- ¿Puedo yo (usuario que ha bloqueado) consultar la tabla productos?     SI
-- ¿Puede otro usuario consultar la tabla ventas?    NO
-- ¿Puede otro usuario añadir nueva venta?   NO

-- 5.3 
UNLOCK TABLES;


-- 6.Bloqueo y Transacción
start transaction;
select  * from productos where categoria_id = 1;
set precio_venta = precio_venta * 0.8;
commit;


-- 7.Funciones mysql

--  7.1 
select timestampdiff(year , '1983/02/15', now());

-- 7.2 
select SUBSTRING('Coto Mulera, 25; 11600; Ubrique; Cádiz; Andalucía', 18, 5);

-- 7.3
select SUBSTRING('Coto Mulera, 25; 11600; Ubrique; Cádiz; Andalucía', '24', 8);

-- 7.4
select floor(rand() * 7);


-- 8.Importación y Exportación

-- 8.2
use geslibros;
load data infile 'c:/users/dlopnun1503/desktop/BaseDeDatos/ExamenUD7/autores.csv' into table autores fields terminated by ';' optionally enclosed by '\"' lines terminated by '\n';


-- 9.Copias de seguridad

-- 9.1
-- mysqldump -h localhost -u root -p --xml gescomercial>c:/users/dlopnun1503/desktop/BaseDeDatos/ExamenUD7/gescomercial.xml

-- 9.2
-- mysqldump -h localhost -u root -p --databases gescomercial productos>c:/users/dlopnun1503/desktop/BaseDeDatos/ExamenUD7/gescomercial_productos.sql
-- mysqldump -h localhost -u root -p --databases gescomercial ventas>c:/users/dlopnun1503/desktop/BaseDeDatos/ExamenUD7/gescomercial_ventas.sql
-- mysqldump -h localhost -u root -p --databases gescomercial clientes>c:/users/dlopnun1503/desktop/BaseDeDatos/ExamenUD7/gescomercial_clientes.sql
-- mysqldump -h localhost -u root -p --databases gescomercial lineasventas>c:/users/dlopnun1503/desktop/BaseDeDatos/ExamenUD7/gescomercial_lineas_ventas.sql

-- 9.3
-- mysqldump -h localhost -u root -p --all-databases>c:/users/dlopnun1503/desktop/BaseDeDatos/ExamenUD7/basesdedatos.sql
