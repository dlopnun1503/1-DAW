-- Asignar todos los privilegios a nivel global al usuario juan
GRANT ALL PRIVILEGES ON *.* TO juan@localhost WITH GRANT OPTION;

-- Asignar privilegio de SELECT en todas las bases de datos al usuario pedro
GRANT SELECT ON *.* TO pedro@localhost;

-- Asignar privilegios a maria para gestlibros y maratoon sólo para ejecutar los comandos ALTER, CREATE, UPDATE Y SELECT.
GRANT ALTER, CREATE, UPDATE, SELECT ON gestlibros.* TO maria@localhost;
GRANT ALTER, CREATE, UPDATE, SELECT ON maratoon.* TO maria@localhost;

-- Asignar privilegios de super administrador a roberto
GRANT ALL PRIVILEGES ON *.* TO roberto@localhost IDENTIFIED BY 'roberto_67' WITH GRANT OPTION;

-- Asignar todos los privilegios sobre la base de datos geslibros a rocio
GRANT ALL PRIVILEGES ON geslibros.* TO rocio@localhost IDENTIFIED BY 'rocio_69' WITH GRANT OPTION;

-- Asignar privilegios sobre las tablas libros, editoriales y clientes de la base de datos geslibros a carlos
create user carlos@localhost identified by password '*183FCBA8D467B44FC730C7E855D1E449173B7953';
GRANT SELECT, UPDATE ON geslibros.libros TO carlos@localhost;
GRANT SELECT, UPDATE ON geslibros.editoriales TO carlos@localhost;
GRANT SELECT, UPDATE ON geslibros.clientes TO carlos@localhost;

-- Asignar privilegios específicos a anamari sobre la tabla libros
create user anamari@localhost identified by password '*0F1CAA38ACA63FC76B441DDD3C92DF6238817833';
GRANT SELECT (titulo, ean, isbn, precio_venta) ON geslibros.libros TO anamari@localhost;

-- Asignar privilegios específicos a anamari sobre la tabla clientes
GRANT SELECT (nombre, telefono, email), UPDATE (nombre, telefono, email) ON geslibros.clientes TO anamari@localhost;