-- MariaDB dump 10.19  Distrib 10.4.32-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: gescomercial
-- ------------------------------------------------------
-- Server version	10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `gescomercial`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `gescomercial` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `gescomercial`;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorias` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `categoria` varchar(30) DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Hardware','2024-04-12 09:05:08','2024-04-12 09:05:08'),(2,'Software','2024-04-12 09:05:08','2024-04-12 09:05:08'),(3,'Redes y Comunicaciones','2024-04-12 09:05:08','2024-04-12 09:05:08'),(4,'Accesorios y Periféricos','2024-04-12 09:05:08','2024-04-12 09:05:08'),(5,'Electrónica de Consumo','2024-04-12 09:05:08','2024-04-12 09:05:08'),(6,'Servicios','2024-04-12 09:05:08','2024-04-12 09:05:08');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `poblacion` varchar(50) DEFAULT NULL,
  `c_postal` char(5) DEFAULT NULL,
  `provincia` varchar(50) DEFAULT NULL,
  `nif` char(9) DEFAULT NULL,
  `telefono` char(9) DEFAULT NULL,
  `movil` char(9) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `nif` (`nif`),
  UNIQUE KEY `movil` (`movil`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Juan Pérez López','Calle Mayor, 12','Sevilla','41001','Sevilla','123456789','954321000','654321000','juan.perez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(2,'María García Jiménez','Calle Real, 50','Córdoba','14001','Córdoba','234567890','912345678','612345678','maria.garcia@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(3,'Pedro Sánchez González','Gran Vía, 3','Málaga','29001','Málaga','345678901','934567890','634567890','pedro.sanchez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(4,'Ana López Martínez','Plaza Mayor, 7','Granada','18001','Granada','456789012','998765432','698765432','ana.lopez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(5,'Isabel Ruiz Fernández','Calle del Sol, 15','Jaén','23001','Jaén','567890123','987654321','687654321','isabel.ruiz@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(6,'David Gómez Moreno','Paseo de la Castellana, 100','Madrid','28001','Madrid','678901234','976543210','676543210','david.gomez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(7,'Laura Martín Blanco','Calle de Atocha, 12','Barcelona','08001','Barcelona','789012345','965432109','665432109','laura.martin@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(8,'Marcos González López','Avenida del Rey Juan Carlos I, 5','Valencia','46001','Valencia','890123456','954321001','654321001','marcos.gonzalez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(9,'Sandra Ruiz Pérez','Calle de Gran Vía, 40','Bilbao','48001','Bilbao','901234567','943210009','643210009','sandra.ruiz@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(10,'Alberto Gutiérrez Moreno','Paseo de la Constitución, 25','Valladolid','47001','Valladolid','012345678','932100098','632100098','alberto.gutierrez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lineasventas`
--

DROP TABLE IF EXISTS `lineasventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lineasventas` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `venta_id` int(10) unsigned NOT NULL,
  `numero_linea` smallint(5) unsigned NOT NULL,
  `producto_id` int(10) unsigned DEFAULT NULL,
  `iva` decimal(4,3) NOT NULL,
  `cantidad` mediumint(8) unsigned NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `importe` decimal(10,2) NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `venta_id` (`venta_id`,`numero_linea`),
  KEY `producto_id` (`producto_id`),
  CONSTRAINT `lineasventas_ibfk_1` FOREIGN KEY (`venta_id`) REFERENCES `ventas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `lineasventas_ibfk_2` FOREIGN KEY (`producto_id`) REFERENCES `productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lineasventas`
--

LOCK TABLES `lineasventas` WRITE;
/*!40000 ALTER TABLE `lineasventas` DISABLE KEYS */;
INSERT INTO `lineasventas` VALUES (1,1,1,1,0.210,1,38.32,38.00,'2024-04-12 09:05:08','2024-04-12 09:05:08'),(2,1,2,2,0.210,2,34.00,68.00,'2024-04-12 09:05:08','2024-04-12 09:05:08'),(3,1,3,3,0.210,2,25.00,50.00,'2024-04-12 09:05:08','2024-04-12 09:05:08'),(4,1,4,4,0.210,4,25.00,100.00,'2024-04-12 09:05:08','2024-04-12 09:05:08'),(5,1,5,5,0.210,5,30.00,150.00,'2024-04-12 09:05:08','2024-04-12 09:05:08'),(6,2,1,5,0.210,3,249.99,749.97,'2024-04-12 09:05:08','2024-04-12 09:05:08'),(7,2,2,7,0.210,2,79.99,239.97,'2024-04-12 09:05:08','2024-04-12 09:05:08'),(8,2,3,9,0.210,1,129.99,129.99,'2024-04-12 09:05:08','2024-04-12 09:05:08');
/*!40000 ALTER TABLE `lineasventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(80) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `ean_13` char(13) DEFAULT NULL,
  `categoria_id` int(10) unsigned DEFAULT NULL,
  `proveedor_id` int(10) unsigned DEFAULT NULL,
  `precio_coste` decimal(10,2) DEFAULT 0.00,
  `precio_venta` decimal(10,2) DEFAULT 0.00,
  `stock` int(10) unsigned DEFAULT 0,
  `stock_min` int(10) unsigned DEFAULT 0,
  `stock_max` int(10) unsigned DEFAULT 0,
  `estado` enum('Activo','En Reposición','Descontinuado','En Promoción','Bloqueado','En tránsito') DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  KEY `categoria_id` (`categoria_id`),
  KEY `proveedor_id` (`proveedor_id`),
  CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`categoria_id`) REFERENCES `categorias` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `productos_ibfk_2` FOREIGN KEY (`proveedor_id`) REFERENCES `proveedores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Portátil Gamer Nitro 5','Portátil gaming con procesador Intel Core i5-11400H, 16 GB de RAM, SSD de 512 GB y tarjeta gráfica NVIDIA GeForce RTX 3050','8415870017241',1,1,799.99,899.99,10,5,20,'Activo','2024-04-12 09:05:08','2024-04-12 09:05:08'),(2,'Smartphone Galaxy S23 Ultra','Smartphone Android con pantalla AMOLED de 6.8 pulgadas, procesador Snapdragon 8 Gen 2, 12 GB de RAM y cámara de 200 MP','8887310245789',2,2,1099.99,1199.99,15,8,25,'Activo','2024-04-12 09:05:08','2024-04-12 09:05:08'),(3,'Smart TV 55\" UHD 4K HDR','Smart TV con pantalla LED de 55 pulgadas, resolución 4K UHD HDR, sistema operativo Android TV y conectividad Wi-Fi y Bluetooth','8415870017242',3,3,499.99,549.99,20,10,30,'En Reposición','2024-04-12 09:05:08','2024-04-12 09:05:08'),(4,'Auriculares inalámbricos Bluetooth','Auriculares inalámbricos con tecnología Bluetooth 5.0, cancelación de ruido activa y hasta 8 horas de autonomía','8435670048375',4,4,59.99,69.99,30,15,40,'Activo','2024-04-12 09:05:08','2024-04-12 09:05:08'),(5,'Impresora multifunción láser','Impresora multifunción láser con impresión en blanco y negro y a color, escáner y fotocopiadora','8479650032148',5,5,199.99,249.99,12,5,20,'Activo','2024-04-12 09:05:08','2024-04-12 09:05:08'),(6,'Ratón inalámbrico ergonómico','Ratón inalámbrico ergonómico con diseño vertical, ideal para largas jornadas de trabajo','8435670048376',4,6,29.99,34.99,25,10,35,'Activo','2024-04-12 09:05:08','2024-04-12 09:05:08'),(7,'Teclado inalámbrico mecánico','Teclado inalámbrico mecánico con interruptores Cherry MX Blue, retroiluminación RGB y diseño compacto','8435670048377',4,6,69.99,79.99,15,8,25,'Activo','2024-04-12 09:05:08','2024-04-12 09:05:08'),(8,'Disco duro externo SSD','Disco duro externo SSD de 500 GB con interfaz USB 3.0 y alta velocidad de transferencia de datos','8479650032149',5,7,59.99,69.99,20,10,30,'En Promoción','2024-04-12 09:05:08','2024-04-12 09:05:08'),(9,'Router Wi-Fi 6 AX','Router Wi-Fi 6 AX con tecnología de doble banda, cobertura ampliada y mayor velocidad de conexión','8479650032150',3,8,99.99,129.99,15,8,25,'Activo','2024-04-12 09:05:08','2024-04-12 09:05:08'),(10,'Tableta gráfica digital','Tableta gráfica digital con lápiz sensible a la presión, ideal para dibujar, pintar y editar fotos','8435670048378',4,9,99.99,149.99,10,5,15,'En Reposición','2024-04-12 09:05:08','2024-04-12 09:05:08');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedores` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `poblacion` varchar(50) DEFAULT NULL,
  `c_postal` char(5) DEFAULT NULL,
  `provincia` varchar(50) DEFAULT NULL,
  `nif` char(9) DEFAULT NULL,
  `telefono` char(9) DEFAULT NULL,
  `movil` char(9) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `nif` (`nif`),
  UNIQUE KEY `movil` (`movil`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES (1,'Empresa Suministros S.A.','Calle Mayor, 10','Sevilla','41001','Sevilla','A12345678','954321000','654321000','empresa.suministros@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(2,'Comercial Pérez S.L.','Calle Real, 55','Córdoba','14001','Córdoba','B23456789','912345678','612345678','comercial.perez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(3,'Distribuciones González S.L.','Gran Vía, 2','Málaga','29001','Málaga','C34567890','934567890','634567890','distribuciones.gonzalez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(4,'Proveedor López S.C.P.','Plaza Mayor, 8','Granada','18001','Granada','D45678901','998765432','698765432','proveedor.lopez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(5,'Materiales Ruiz S.A.','Calle del Sol, 12','Jaén','23001','Jaén','E56789012','987654321','687654321','materiales.ruiz@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(6,'Ferretería Gómez S.L.','Paseo de la Castellana, 90','Madrid','28001','Madrid','F67890123','976543210','676543210','ferreteria.gomez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(7,'Electricidad Martín S.C.P.','Calle de Atocha, 15','Barcelona','08001','Barcelona','G78901234','965432109','665432109','electricidad.martin@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(8,'Construcción González S.L.','Avenida del Rey Juan Carlos I, 3','Valencia','46001','Valencia','H89012345','954321001','654321001','construccion.gonzalez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(9,'Suministros Ruiz S.A.','Calle de Gran Vía, 50','Bilbao','48001','Bilbao','I90123456','943210009','643210009','suministros.ruiz@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08'),(10,'Materiales Gutiérrez S.L.','Paseo de la Constitución, 20','Valladolid','47001','Valladolid','J01234567','932100098','632100098','materiales.gutierrez@email.com','2024-04-12 09:05:08','2024-04-12 09:05:08');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ventas` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cliente_id` int(10) unsigned DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `importe_bruto` decimal(10,2) NOT NULL,
  `importe_iva` decimal(10,2) NOT NULL,
  `importe_total` decimal(10,2) NOT NULL,
  `estado` enum('Realizado','Presupuesto','En Preparación','Enviado','Entregado','Facturado','Pagado','Cancelado','Devuelto','Cerrado') DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  KEY `cliente_id` (`cliente_id`),
  CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `clientes` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,3,'2024-04-01',406.00,85.26,491.26,'Realizado','2024-04-12 09:05:08','2024-04-12 09:05:08'),(2,2,'2024-03-01',119.93,235.19,1355.12,'Realizado','2024-04-12 09:05:08','2024-04-12 09:05:08');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
