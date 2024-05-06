use test;
create table ventas (
   id int unsigned auto_increment primary key,
   fechaVenta TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   importeBruto decimal(10, 2 ) DEFAULT 0.0,
   importeIva decimal(10, 2 ) DEFAULT 0.0,
   importeTotal decimal(10, 2 ) DEFAULT 0.0
   );
   
   insert into ventas(fechaVenta, importeBruto, importeIva, importeTotal) values
   (
   default,
   1000.00,
   210.00,
   1210.00
   ),
   (
   '2024/01/26',
   2000.00,
   importeBruto*0.21,
   importeBruto*importeIva
   );