-- MySQL dump 10.13  Distrib 5.7.29, for macos10.14 (x86_64)
--
-- Host: localhost    Database: treasurehunt
-- ------------------------------------------------------
-- Server version	5.7.29-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `has_answered_puzzle`
--

LOCK TABLES `has_answered_puzzle` WRITE;
/*!40000 ALTER TABLE `has_answered_puzzle` DISABLE KEYS */;
/*!40000 ALTER TABLE `has_answered_puzzle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `has_answered_question`
--

LOCK TABLES `has_answered_question` WRITE;
/*!40000 ALTER TABLE `has_answered_question` DISABLE KEYS */;
/*!40000 ALTER TABLE `has_answered_question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `puzzle`
--

LOCK TABLES `puzzle` WRITE;
/*!40000 ALTER TABLE `puzzle` DISABLE KEYS */;
/*!40000 ALTER TABLE `puzzle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES (1,'Admin Team',0),(2,'Team A',0),(3,'Team B',0),(4,'Team C',0),(5,'Team D',0),(6,'Team E',0);
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `team_members`
--

LOCK TABLES `team_members` WRITE;
/*!40000 ALTER TABLE `team_members` DISABLE KEYS */;
/*!40000 ALTER TABLE `team_members` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','$2a$10$YkEmZvBWnFRjuvf2QDq.QeKArgg8MCuL3gpXyRfZ1x0LuZTdV0Byi','ADMIN',1,'eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iXSwiaWF0IjoxNTg3NTQzODQxLCJleHAiOjE1ODc1NzI2NDF9.VWFOwzZTByek204NNSJvTtg7qOhPSyetDVlwTpHgV731NISxS2Srk12lK--WfsCjtyCQFBcvYf4NG-6_Sc4pWA','2020-04-22 21:54:02'),(2,'Team A','$2a$10$NqevR3YToY.734N.hjafPOIes7lRlUBqSAWVn/Tn0VRlLnbiQ6ope','TEAM',2,NULL,NULL),(3,'Team B','$2a$10$ukI7GudQtceZmQGs7ELhm.RvLYwSxoG47UvEWssCYzv0B6NAXduIO','TEAM',3,NULL,NULL),(4,'Team C','$2a$10$sBFEMXG7bx0A31BBWKcPkuE/nNGE7lQS/6O2U.MJqDtDYmW8dDA0u','TEAM',4,NULL,NULL),(5,'Team D','$2a$10$fsacBznh5PnMTw4hXsfsk.DUnjEp7W7KuPdN2rKUvupxzKYgtkUlC','TEAM',5,NULL,NULL),(6,'Team E','$2a$10$doIQOlAnnLIRSYbg7rzcbe8oXXn3DkNtXQVdm.XcDLRXFuJRt1P7e','TEAM',6,NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-22 13:58:26
