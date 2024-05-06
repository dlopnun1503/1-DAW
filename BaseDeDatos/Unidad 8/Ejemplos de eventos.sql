-- Activación del programador de eventos
SET GLOBAL event_scheduler=ON;
SHOW variables like 'event_scheduler';
show variables;


-- Ejemplo de Evento
DELIMITER $$
DROP EVENT IF EXISTS bancos.ObtenerClientes $$
CREATE EVENT IF NOT EXISTS bancos.ObtenerClientes ON SCHEDULE EVERY 1 DAY STARTS '2024-05-04
11:25:00' ENABLE
DO
BEGIN
SELECT
*
FROM
bancos.clientes INTO OUTFILE 'c://users//dlopnun1503//desktop//clientes.csv' FIELDS TERMINATED BY ';'
OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n';
END$$
-- Para mostrar los eventos
DELIMITER ;
SHOW EVENTS IN bancos;
SELECT * FROM INFORMATION_SCHEMA.EVENTS;




