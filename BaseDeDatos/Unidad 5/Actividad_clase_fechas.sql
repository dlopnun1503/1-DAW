use test;

drop table if exists tipo_fecha;
create table if not exists tipo_fecha(
    id int unsigned auto_increment primary key,
    fecha_nac date,
    fecha_hora_llegada datetime,
    fecha_hora_salida timestamp(3),
    tiempo time,
    crono time (6),
    create_up timestamp default  current_timestamp,
	update_up timestamp default  current_timestamp
);

insert into tipo_fecha values(
null,
'2004/03/15',
now(),
'2024/02/20 21:45:45.456',
'21:56:10',
'21:56:10.123456',
default,
default
);

-- ********SOLO SE PUEDE UTILIZAR EL TIMESTAMP UNA VEZ POR TABLA********