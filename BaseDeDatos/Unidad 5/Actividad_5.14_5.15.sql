DROP DATABASE IF EXISTS empleados_taller;
CREATE DATABASE IF NOT EXISTS empleados_taller
CHARACTER SET UTF8MB4 COLLATE UTF8MB4_GENERAL_CI;



USE empleados_taller;
DROP TABLE IF EXISTS clientes;
CREATE TABLE IF NOT EXISTS clientes(
   id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   nombre VARCHAR(20) NOT NULL,
   nif CHAR(9) UNIQUE NOT NULL
);

USE empleados_taller;
DROP TABLE IF EXISTS telefonosEmpleados;
CREATE TABLE IF NOT EXISTS telefonosEmpleados(
	id_empleado INT UNSIGNED,
    telefono CHAR(13),
    PRIMARY KEY (id_empleado, telefono)
);


USE empleados_taller;
DROP TABLE IF EXISTS telefonosClientes;
CREATE TABLE IF NOT EXISTS telefonosClientes(
    id_cliente INT UNSIGNED,
    telefono CHAR(13),
    FOREIGN KEY (id_cliente) REFERENCES clientes(id)
    ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY (id_cliente, telefono)
);

USE empleados_taller;
DROP TABLE IF EXISTS proyectos;
CREATE TABLE IF NOT EXISTS proyectos(
   id int unsigned auto_increment primary key,
   proyecto varchar(50) not null,
   descripcion text not null,
   id_empleado_jefe int unsigned,
   id_cliente int unsigned,
   foreign key (id_cliente) references clientes(id)
   ON DELETE restrict ON UPDATE CASCADE
);


USE empleados_taller;
DROP TABLE IF EXISTS proyectoEmpleados;
CREATE TABLE IF NOT EXISTS proyectoEmpleados(
    id_empleado INT UNSIGNED,
    id_proyecto int unsigned,
    horas tinyint unsigned not null,
    f_inicio date not null,
    f_fin date not null,
    valoracion float(4,2) UNSIGNEd CHECK(valoracion between 0 AND 10),
    FOREIGN KEY (id_proyecto) REFERENCES proyectos(id)
    ON DELETE restrict ON UPDATE CASCADE,
	PRIMARY KEY (id_empleado, id_proyecto)
);

USE empleados_taller;
DROP TABLE IF EXISTS beneficiarios;
CREATE TABLE IF NOT EXISTS beneficiarios(
   id int unsigned auto_increment primary key,
   nombre varchar(20) not null,
   fecha_nac date not null,
   id_empleado int unsigned
);

USE empleados_taller;
DROP TABLE IF EXISTS empleados;
CREATE TABLE IF NOT EXISTS empleados(
   id int unsigned auto_increment primary key,
   dni char(9) unique not null,
   nombre varchar(20) not null,
   id_proyecto int unsigned,
   id_empleado_sup int unsigned,
   foreign key (id_proyecto) references proyectos(id)
   ON DELETE restrict ON UPDATE CASCADE,
   foreign key (id_empleado_sup) references empleados(id)
   ON DELETE restrict ON UPDATE CASCADE
);

alter table telefonosEmpleados
add constraint foreign key (id_empleado) references empleados(id)
on delete cascade on update cascade;

alter table proyectos
add constraint foreign key (id_empleado_jefe) references empleados(id)
ON DELETE restrict ON UPDATE CASCADE;

alter table proyectoEmpleados
add constraint FOREIGN KEY (id_empleado) REFERENCES empleados(id)
ON DELETE restrict ON UPDATE CASCADE;

alter table beneficiarios
add constraint foreign key (id_empleado) references empleados(id)
ON DELETE CASCADE ON UPDATE CASCADE;


alter table clientes
add column apellidos varchar(50) not null,
add column poblacion varchar(25) not null,
add column nacionalidad varchar(25) not null,
add column email varchar(50) not null,
add column direccion varchar(50) not null,
add column cod_cliente char(7) unique not null,
add column tipo_cliente tinyint UNSIGNEd CHECK(tipo_cliente between 0 AND 10),
modify column nombre varchar(25) not null,
modify column apellidos varchar(45) not null,
alter column nacionalidad set default 'España',
modify column direccion varchar(100);

ALTER TABLE clientes
change column email correo_electronico varchar(50) UNIQUE;

ALTER TABLE clientes
add constraint ch_clientes_correo_electronico CHECK (correo_electronico LIKE '%@%');

create index InClientesApeNom on clientes(apellidos, nombre);
show index from clientes;