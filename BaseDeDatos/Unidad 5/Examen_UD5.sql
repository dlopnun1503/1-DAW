-- EXAMEN UD 5
-- DAVID LÓPEZ NÚÑEZ 
    
    droP DATABASE IF EXISTS GESCoint;
    creATE DATABASE IF NOT EXISTS GESCoint
    chaRACTER SET UTF8MB4 COLLATE UTF8MB4_GENERAL_CI;
    
    use GESCoint;
    
    droP TAbLE IF EXiSTS CAtegorias;
    creATE TAbLE IF NOt EXiSTS CAtegorias(
       id int UNsIGNED AUtO_INCREMENT PRiMARY KEy,
       categoria varCHAR(30) NOt NUlL,
       descripcion texT NOt NUlL,
       imagen varCHAR(60)
    );
    
    droP TAbLE IF EXiSTS PRoveedores;
    CREATE TABLE IF NOT EXISTS PRoveedores (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    proveedor VARCHAR(30) NOT NULL,
    contacto VARCHAR(60),
    direccion VARCHAR(50) NOT NULL,
    ciudad VARCHAR(25) NOT NULL,
    provincia VARCHAR(25) NOT NULL,
    region VARCHAR(25),
    c_postal CHAR(5) NOT NULL,
    pais VARCHAR(25) NOT NULL,
    telefono CHAR(13) NOT NULL,
    web VARCHAR(80),
    email VARCHAR(50) UNIQUE NOT NULL CHECK (EMAil LIKE '%@%'),
    cif CHAR(9) UNIQUE NOT NULL
);

droP TAbLE IF EXiSTS clientes;
CREATE TABLE IF NOT EXISTS clientes (
   id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    cliente VARCHAR(30) NOT NULL,
    contacto VARCHAR(60),
    direccion VARCHAR(50) NOT NULL,
    ciudad VARCHAR(25) NOT NULL,
    region VARCHAR(25),
    c_postal CHAR(5) NOT NULL,
    pais VARCHAR(25) NOT NULL,
    telefono CHAR(13) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL CHECK (EMAil LIKE '%@%'),
    cif CHAR(9) UNIQUE NOT NULL,
    web VARCHAR(80)
);    
    
    
droP TAbLE IF EXiSTS empleados;
CREATE TABLE IF NOT EXISTS empleados (
   id int unsigned auto_increment primary key,
   nombre varchar(20) not null,
   apellidos varchar(40) not null,
   categoria varchar(30),
   f_nacimiento date not null,
   edad tinyint unsigned not null,
   f_contrato date not null,
   direccion VARCHAR(50) NOT NULL,
   ciudad VARCHAR(25) NOT NULL,
   region VARCHAR(25),
   c_postal CHAR(5) NOT NULL,
   pais VARCHAR(25) NOT NULL,
   foto varchar(60),
   observaciones text,
   email VARCHAR(50) UNIQUE NOT NULL CHECK (EMAil LIKE '%@%'),
   nif CHAR(9) UNIQUE NOT NULL
);

droP TAbLE IF EXiSTS empleadosTelefonos;
CREATE TABLE IF NOT EXISTS empleadosTelefonos (
   id_empleado int unsigned,
   telefono char(13),
   foreign key (id_empleado) references empleados(id)
   on delete cascade on update cascade,
   primary key (id_empleado, telefono)
);
    
droP TAbLE IF EXiSTS productos;
CREATE TABLE IF NOT EXISTS productos (
   id int unsigned auto_increment primary key,
   descripcion text not null, 
   unidades_en_stock smallint,
   unidades_vendidas smallint unsigned,
   stock_max smallint,
   stock_min smallint,
   activo boolean not null default true,
   codigo char(10) unique not null,
   codigo_ean_13 char(13) unique not null,
   precio_costo decimal(10,2) not null,
   precio_venta decimal(10,2) not null,
   iva decimal(3,2) not null,
   id_categoria int unsigned,
   foreign key (id_categoria) references categorias(id)
   on delete restrict on update cascade,
   id_proveedor int unsigned not null,
   foreign key (id_proveedor) references proveedores(id)
   on delete restrict on update cascade
);
    
droP TAbLE IF EXiSTS pedidos;
CREATE TABLE IF NOT EXISTS pedidos (
   id int unsigned auto_increment primary key,
   fecha_hora_pedido datetime not null default current_timestamp, 
   fecha_hora_envio datetime,
   forma_envio varchar(25),
   fecha_entrega date,
   dir_envio varchar(50),
   ciudad_envio varchar(25),
   region_envio varchar(25),
   cod_postal_envio char(5),
   pais_envio varchar(25) default 'España',
   importe decimal(10,2) not null default '0.00',
   importe_iva decimal(10,2) not null default '0.00',
   importe_desc decimal(10,2) not null default '0.00',
   importe_total decimal(10,2) not null default '0.00',
   id_empleado int unsigned not null,
   foreign key (id_empleado) references empleados(id)
   on delete restrict on update cascade,
   id_cliente int unsigned not null,
   foreign key (id_cliente) references clientes(id)
   on delete restrict on update cascade
);
    
droP TAbLE IF EXiSTS detallesPedidos;
CREATE TABLE IF NOT EXISTS detallesPedidos (
   id int unsigned auto_increment primary key,
   id_pedido int unsigned not null,
   linea_pedido int unsigned not null,
   precio decimal(10,2) not null,
   cantidad smallint unsigned not null,
   descuento decimal(3,2),
   iva decimal(3,2) not null,
   importe_desc decimal(10,2) not null default '0.00',
   importe_iva decimal(10,2) not null default '0.00',
   importe_linea decimal(10,2) not null default '0.00',
   foreign key (id_pedido) references pedidos(id)
   on delete cascade on update cascade,
   unique(id_pedido, linea_pedido)
);
    
alter table categorias
add column nombre_corto char(3) not null;

alter table categorias 
add constraint un_nombre_corto unique(nombre_corto);

alter table proveedores
add column observaciones text,
change column pais nacionalidad varchar(25) not null;

alter table clientes
add column importe_ventas_acumulado decimal(10,2) default '0.00',
add column importe_ventas_anual decimal(10,2) default '0.00',
add column valoracion tinyint unsigned check(valoracion between 1 and 5);

alter table empleados
add column empleado varchar(50),
add constraint ch_categoria check(categoria in ('desarrollador', 'ingeniero', 'sistema', 'especialistas', 'gerente', 'comercial', 'programador')),
alter column pais set default 'España';

alter table productos
add constraint ch_stock_max check(stock_max > 10),
add constraint ch_stock_min check(stock_min > 0),
modify column stock_max smallint not null,
modify column stock_min smallint not null,
add constraint ch_precio_costo check(precio_costo < precio_venta);

drop table if exists imagenes;
create table if not exists imagenes(
   id int unsigned auto_increment primary key,
   id_producto int unsigned not null,
   imagen varchar(60) not null,
   foreign key (id_producto) references productos(id)
   on delete cascade on update cascade
);

create index in_empleadosApeNom on empleados(nombre, apellidos);
create index in_productosDesc on productos(descripcion);
create index in_proveedoresTel on proveedores(telefono);

-- 19
-- No creo que sea necesario ya que podriamos realizar la busqueda por el id que seria más fácil ya que incrementa automáticamente, aunque si que se podría crear un índice
    
    
    
    
    
    
    
    





























