-- MariaDB dump 10.19  Distrib 10.4.32-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: maratoon
-- ------------------------------------------------------
-- Server version	10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `carreras`
--

LOCK TABLES `carreras` WRITE;
/*!40000 ALTER TABLE `carreras` DISABLE KEYS */;
INSERT INTO `carreras` VALUES (1,'Nutrias Pantaneras','Ubrique',11000,10),(2,'Media Martoon Sevilla','Sevilla',22000,6),(3,'Media Martoon Jerez','Jerez',22000,5),(4,'Salida Sanluqueña','Sanlucar de Bda.',11500,3);
/*!40000 ALTER TABLE `carreras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'INF','Infantil','Menores de 12 años'),(2,'JUN','Junior','Menores de 15 años'),(3,'JUV','Juvenil','Menores de 18 años'),(4,'SNA','Senior A','Menores de 30 años'),(5,'SNB','Senior B','Menores de 40 años'),(6,'VTA','Veteranos A','Menores de 50 años'),(7,'VTB','Veteranos B','Menores de 60 años'),(8,'VTC','Veteranos C','A partir de 60 años');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `clas_femenina`
--

LOCK TABLES `clas_femenina` WRITE;
/*!40000 ALTER TABLE `clas_femenina` DISABLE KEYS */;
INSERT INTO `clas_femenina` VALUES (7,'Fernández Pérez, Macarena',43,'Villamartín','M','CAV','VTA','00:30:30.009412'),(4,'Rios Pérez, Josefa',33,'Villamartín','M','CAV','SNB','00:36:20.001546'),(3,'Rubiales Alva, Eva',43,'Ubrique','M','NUT','VTA','00:37:10.001480'),(10,'Pérez Moreno, María',48,'Ubrique','M','NUT','VTA','00:39:10.000003'),(11,'Romero Alva, Almudena',37,'Arcos','M','ADJ','SNB','00:55:10.001483'),(14,'García Almeida, Cristina',46,'Villamartín','M','CAV','VTA','01:00:00.000000'),(15,'Jiménez Pérez, Romira',39,'Arcos','M','ADJ','SNB','01:10:30.009068');
/*!40000 ALTER TABLE `clas_femenina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `clubs`
--

LOCK TABLES `clubs` WRITE;
/*!40000 ALTER TABLE `clubs` DISABLE KEYS */;
INSERT INTO `clubs` VALUES (1,'NUT','Nutrias Pantaneras','Ubrique','1980-04-11',150),(2,'CAV','Club Atletismo Villamartín','Villamartín','1985-04-11',200),(3,'ACG','Atletismo Campo de Gibraltar','La Línea','1987-04-11',150),(4,'ADJ','Asociación Deportiva de Arcos','Arcos de la Fra.','1970-04-11',300),(5,'CAF','Club Atletismo Fronter','Jerez de la Fra.','1975-04-11',220);
/*!40000 ALTER TABLE `clubs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `corredores`
--

LOCK TABLES `corredores` WRITE;
/*!40000 ALTER TABLE `corredores` DISABLE KEYS */;
INSERT INTO `corredores` VALUES (1,'Juan','García Pérez','Ubrique','1965-07-31','H',58,7,1),(2,'Juan José','Pérez Morales','Ubrique','1945-08-30','H',78,8,1),(3,'Eva','Rubiales Alva','Ubrique','1980-08-25','M',43,6,1),(4,'Josefa','Rios Pérez','Villamartín','1990-10-15','M',33,5,2),(5,'Pedro','Ortega Ríos','Villamartín','1994-05-14','H',29,4,2),(6,'Francisco','Morales Almeida','Villamartín','1970-02-01','H',54,7,2),(7,'Macarena','Fernández Pérez','Villamartín','1980-05-03','M',43,6,2),(8,'Jesús','Romero Reguera','Villamartín','1970-06-05','H',53,7,2),(9,'Pedro','García Ramírez','Ubrique','1967-07-31','H',56,7,1),(10,'María','Pérez Moreno','Ubrique','1975-08-30','M',48,6,1),(11,'Almudena','Romero Alva','Arcos','1986-08-25','M',37,5,4),(12,'Francisco','Pérez Amor','Arcos','1992-10-15','H',31,5,4),(13,'Juan','Rodríguez Ríos','Ubrique','1978-05-14','H',45,6,1),(14,'Cristina','García Almeida','Villamartín','1978-02-01','M',46,6,2),(15,'Romira','Jiménez Pérez','Arcos','1984-05-03','M',39,5,4),(16,'José','Rincón Pérez','Villamartín','1960-06-05','H',63,8,2),(17,'David','Lopez','Ubrique','2004-03-15','H',20,4,NULL),(18,'Laura','López Martínez','Jerez de la Fra.','1995-03-15','M',29,4,5),(19,'David','Gómez Ruiz','Jerez de la Fra.','1990-08-20','H',33,5,5),(20,'Ana','Díaz Sánchez','Jerez de la Fra.','1988-11-10','M',35,5,5),(21,'Laura','López Martínez','Jerez de la Fra.','1995-03-15','M',29,4,5),(22,'David','Gómez Ruiz','Jerez de la Fra.','1990-08-20','H',33,5,5),(23,'Ana','Díaz Sánchez','Jerez de la Fra.','1988-11-10','M',35,5,5),(24,'Laura','López Martínez','Jerez de la Fra.','1995-03-15','M',29,4,5),(25,'David','Gómez Ruiz','Jerez de la Fra.','1990-08-20','H',33,5,5),(26,'Ana','Díaz Sánchez','Jerez de la Fra.','1988-11-10','M',35,5,5),(27,'Rafel','Mendoza Pérez','Ubrique','1965-07-31','H',58,NULL,1),(28,'María José','Moreno Morales','Ubrique','1945-08-30','M',78,NULL,1),(29,'Pedro','Rodríguez Alva','Ubrique','1986-08-25','H',37,NULL,1),(30,'Juani','Ríos Pérez','Villamartín','1995-10-15','M',28,NULL,2),(31,'Esther','Pérez Ríos','Villamartín','1970-05-14','M',53,NULL,2),(32,'Rafel','Mendoza Pérez','Ubrique','1965-07-31','H',58,NULL,1),(33,'María José','Moreno Morales','Ubrique','1945-08-30','M',78,NULL,1),(34,'Pedro','Rodríguez Alva','Ubrique','1986-08-25','H',37,NULL,1),(35,'Juani','Ríos Pérez','Villamartín','1995-10-15','M',28,NULL,2),(36,'Esther','Pérez Ríos','Villamartín','1970-05-14','M',53,NULL,2),(37,'Rafel','Mendoza Pérez','Ubrique','1965-07-31','H',58,NULL,1),(38,'María José','Moreno Morales','Ubrique','1945-08-30','M',78,NULL,1),(39,'Pedro','Rodríguez Alva','Ubrique','1986-08-25','H',37,NULL,1),(40,'Juani','Ríos Pérez','Villamartín','1995-10-15','M',28,NULL,2),(41,'Esther','Pérez Ríos','Villamartín','1970-05-14','M',53,NULL,2),(42,'Rafel','Mendoza Pérez','Ubrique','1965-07-31','H',58,NULL,1),(43,'María José','Moreno Morales','Ubrique','1945-08-30','M',78,NULL,1),(44,'Pedro','Rodríguez Alva','Ubrique','1986-08-25','H',37,NULL,1),(45,'Juani','Ríos Pérez','Villamartín','1995-10-15','M',28,NULL,2),(46,'Esther','Pérez Ríos','Villamartín','1970-05-14','M',53,NULL,2),(47,'Rafel','Mendoza Pérez','Ubrique','1965-07-31','H',58,NULL,1),(48,'María José','Moreno Morales','Ubrique','1945-08-30','M',78,NULL,1),(49,'Pedro','Rodríguez Alva','Ubrique','1986-08-25','H',37,NULL,1),(50,'Juani','Ríos Pérez','Villamartín','1995-10-15','M',28,NULL,2),(51,'Esther','Pérez Ríos','Villamartín','1970-05-14','M',53,NULL,2),(52,'Rafel','Mendoza Pérez','Ubrique','1965-07-31','H',58,NULL,1),(53,'María José','Moreno Morales','Ubrique','1945-08-30','M',78,NULL,1),(54,'Pedro','Rodríguez Alva','Ubrique','1986-08-25','H',37,NULL,1),(55,'Juani','Ríos Pérez','Villamartín','1995-10-15','M',28,NULL,2),(56,'Esther','Pérez Ríos','Villamartín','1970-05-14','M',53,NULL,2),(57,'Rafel','Mendoza Pérez','Ubrique','1965-07-31','H',NULL,NULL,1),(58,'María José','Moreno Morales','Ubrique','1945-08-30','M',NULL,NULL,1),(59,'Pedro','Rodríguez Alva','Ubrique','1986-08-25','H',NULL,NULL,1),(60,'Juani','Ríos Pérez','Villamartín','1995-10-15','M',NULL,NULL,2),(61,'Esther','Pérez Ríos','Villamartín','1970-05-14','M',NULL,NULL,2),(62,'Rafel','Mendoza Pérez','Ubrique','1965-07-31','H',NULL,NULL,1),(63,'María José','Moreno Morales','Ubrique','1945-08-30','M',NULL,NULL,1),(64,'Pedro','Rodríguez Alva','Ubrique','1986-08-25','H',NULL,NULL,1),(65,'Juani','Ríos Pérez','Villamartín','1995-10-15','M',NULL,NULL,2),(66,'Esther','Pérez Ríos','Villamartín','1970-05-14','M',NULL,NULL,2);
/*!40000 ALTER TABLE `corredores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `registros`
--

LOCK TABLES `registros` WRITE;
/*!40000 ALTER TABLE `registros` DISABLE KEYS */;
INSERT INTO `registros` VALUES (1,1,1,'2024-02-02 10:21:29.717793','2012-04-11 10:45:10.000012','00:45:10.000012'),(2,1,2,'2024-02-02 10:21:29.717793','2012-04-11 10:35:10.000670','00:35:10.000670'),(3,1,3,'2024-02-02 10:21:29.717793','2012-04-11 10:37:10.001480','00:37:10.001480'),(4,1,4,'2024-02-02 10:21:29.717793','2012-04-11 10:36:20.001546','00:36:20.001546'),(5,1,5,'2024-02-02 10:21:29.717793','2012-04-11 10:35:40.000333','00:35:40.000333'),(6,1,6,'2024-02-02 10:21:29.717793','2012-04-11 10:40:01.000164','00:40:01.000164'),(7,1,7,'2024-02-02 10:21:29.717793','2012-04-11 10:30:30.009412','00:30:30.009412'),(8,1,8,'2024-02-02 10:21:29.717793','2012-04-11 10:38:10.000754','00:38:10.000754'),(9,1,9,'2024-02-02 10:21:29.717793','2012-04-11 10:48:10.000002','00:48:10.000002'),(10,1,10,'2024-02-02 10:21:29.717793','2012-04-11 10:39:10.000003','00:39:10.000003'),(11,1,11,'2024-02-02 10:21:29.717793','2012-04-11 10:55:10.001483','00:55:10.001483'),(12,1,12,'2024-02-02 10:21:29.717793','2012-04-11 10:50:20.000004','00:50:20.000004'),(13,1,13,'2024-02-02 10:21:29.717793','2012-04-11 10:58:40.000005','00:58:40.000005'),(14,1,14,'2024-02-02 10:21:29.717793','2012-04-11 11:00:00.000000','01:00:00.000000'),(15,1,15,'2024-02-02 10:21:29.717793','2012-04-11 11:10:30.009068','01:10:30.009068'),(16,1,16,'2024-02-02 10:21:29.717793','2012-04-11 11:09:10.000500','01:09:10.000500'),(17,2,2,'2024-04-01 07:41:05.871366','2019-12-02 11:05:00.000000','02:05:00.000000'),(18,2,3,'2024-04-01 07:41:05.871366','2019-12-02 11:15:00.000000','02:15:00.000000'),(19,2,4,'2024-04-01 07:41:05.871366','2019-12-02 11:25:00.000000','02:25:00.000000'),(20,2,5,'2024-04-01 07:41:05.871366','2019-12-02 11:30:00.000000','02:30:00.000000');
/*!40000 ALTER TABLE `registros` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-11 11:19:21
