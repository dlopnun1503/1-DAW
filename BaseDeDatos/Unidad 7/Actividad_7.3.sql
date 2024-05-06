-- Revocar todos los privilegios a nivel global al usuario juan
REVOKE ALL PRIVILEGES ON *.* FROM juan@localhost;

-- Revocar privilegio de SELECT en la base de datos geslibros al usuario pedro
REVOKE SELECT ON geslibros.* FROM pedro@localhost;

-- Revocar privilegios de ALTER, CREATE, UPDATE en las bases de datos geslibros y maratoon al usuario maria
REVOKE ALTER, CREATE, UPDATE ON geslibros.* FROM maria@localhost;
REVOKE ALTER, CREATE, UPDATE ON maratoon.* FROM maria@localhost;

-- Revocar privilegios de GRANT OPTION al usuario roberto
REVOKE GRANT OPTION ON *.* FROM roberto@localhost;

-- Revocar privilegio INSERT sobre la base de datos geslibros al usuario rocio
REVOKE INSERT ON geslibros.* FROM rocio@localhost;

-- Revocar privilegios sobre las tablas editoriales y clientes, y UPDATE de la base de datos geslibros al usuario carlos
REVOKE ALL PRIVILEGES ON geslibros.editoriales FROM carlos@localhost;
REVOKE ALL PRIVILEGES ON geslibros.clientes FROM carlos@localhost;
REVOKE UPDATE ON geslibros.* FROM carlos@localhost;

-- Revocar privilegios específicos de anamari sobre la tabla libros
REVOKE SELECT (titulo, ean, isbn, precio_venta) ON geslibros.libros FROM anamari@localhost;

-- Revocar privilegios específicos de anamari sobre la tabla clientes
REVOKE SELECT (nombre, telefono, email) ON geslibros.clientes FROM anamari@localhost;