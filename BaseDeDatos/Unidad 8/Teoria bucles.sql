-- Teoria bucles
-- Ejemplo: LOOP con condición de salida mediatne LEAVE
DELIMITER $$
DROP PROCEDURE IF EXISTS test.simpleloop $$
CREATE PROCEDURE test.simpleloop()
BEGIN
	DECLARE cont INT default 0;
    bucle: LOOP
     select cont;
     SET cont=cont+1;
     IF cont>= 5 THEN
          LEAVE bucle;
     END IF;
  END LOOP;
END $$


-- Ejmplo15: Repeat Until
DELIMITER $$
DROP PROCEDURE IF EXISTS test.untilloop $$
CREATE PROCEDURE test.untilloop()
BEGIN
    DECLARE i INT;
    SET i=0;
    loop1: REPEAT
        SET i=i+1;
        select i;
	UNTIL i>= 10
	END REPEAT;
    END $$
-- Muestra los números del 0 al 10
DELIMITER ;


-- Ejmplo16: While
DELIMITER $$
DROP PROCEDURE IF EXISTS test.whileloop $$
CREATE PROCEDURE test.whileloop()
BEGIN
   DECLARE i INT;
   SET i=1;
   WHILE i<=10 DO
      select i;
      SET i=i+1;
   END WHILE;
END$$
-- Muestra los números del 0 al 10
DELIMITER ;

