-- MySQL dump 10.13  Distrib 5.7.25, for macos10.14 (x86_64)
--
-- Host: localhost    Database: treasurehunt
-- ------------------------------------------------------
-- Server version	5.7.25

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
-- Dumping data for table `configurationKeyValues`
--

LOCK TABLES `configurationKeyValues` WRITE;
/*!40000 ALTER TABLE `configurationKeyValues` DISABLE KEYS */;
INSERT INTO `configurationKeyValues` VALUES ('Aaryavarta-day','1'),('Aaryavarta-stage','1'),('Akhandadweepa-day','1'),('Akhandadweepa-stage','1'),('COINS_REQUIRED_UNLOCK_CLUE','16'),('day','1'),('DevaBhumi-day','1'),('DevaBhumi-stage','1'),('Karusha-day','1'),('Karusha-stage','1'),('key1','23'),('key2','46'),('key3','90'),('Mahishaka-day','1'),('Mahishaka-stage','1'),('MAX_ATTEMPTS_PUZZLE','5'),('Nishada-day','1'),('Nishada-stage','1'),('PUZZLES_REQ_UNLOCK_CLUE','8'),('Shalwa-day','1'),('Shalwa-stage','1');
/*!40000 ALTER TABLE `configurationKeyValues` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `has_answered_puzzle`
--

LOCK TABLES `has_answered_puzzle` WRITE;
/*!40000 ALTER TABLE `has_answered_puzzle` DISABLE KEYS */;
INSERT INTO `has_answered_puzzle` VALUES (1,1,'',5,0),(1,2,'cat',1,0),(2,1,'east',2,1);
/*!40000 ALTER TABLE `has_answered_puzzle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `has_answered_question`
--

LOCK TABLES `has_answered_question` WRITE;
/*!40000 ALTER TABLE `has_answered_question` DISABLE KEYS */;
INSERT INTO `has_answered_question` VALUES (1,1,'aqua',0),(1,2,'trump',1),(2,1,'jesus',0);
/*!40000 ALTER TABLE `has_answered_question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `puzzle`
--

LOCK TABLES `puzzle` WRITE;
/*!40000 ALTER TABLE `puzzle` DISABLE KEYS */;
INSERT INTO `puzzle` VALUES (1,'TEXT','sun rises from?','1.jpg',2,'east'),(2,'TEXT','Where is antartica','2.jpg',2,'south pole');
/*!40000 ALTER TABLE `puzzle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'where is lanka','indian ocean','india'),(2,'us president?','trump','billionaire');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES (1,'Admin Team',14,0),(2,'Akhandadweepa',0,0),(3,'Nishadha',0,0),(4,'Aaryavarta',0,0),(5,'Shalwa',0,0),(6,'Mahishaka',0,0),(7,'DevaBhumi',0,0),(8,'Karusha',0,0);
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `team_members`
--

LOCK TABLES `team_members` WRITE;
/*!40000 ALTER TABLE `team_members` DISABLE KEYS */;
INSERT INTO `team_members` VALUES (2,'Anant'),(2,'Ananya'),(2,'Girish'),(2,'Mallikarjuna'),(2,'Manoj Reddy'),(2,'Supreetha'),(3,'Akshath'),(3,'Hariprasad'),(3,'Harshith'),(3,'Mithun'),(3,'Shivaraju'),(3,'Subbareddy'),(4,'Abhishek'),(4,'Gayatri'),(4,'Jagadish Dande'),(4,'Sanjay'),(4,'Srikant T'),(4,'Supreeth'),(5,'Jagadeesha K'),(5,'Kushal'),(5,'Prabhu'),(5,'Sabyasachi'),(5,'Vinay Ramakrishna'),(5,'Vivek'),(6,'Anoop'),(6,'Nikhil'),(6,'Shrikanth AK'),(6,'Sowjanya'),(6,'Subham'),(6,'Vinayraj'),(7,'Bikash'),(7,'Chethan'),(7,'Guruprasad'),(7,'Jatinder'),(7,'Karthik'),(7,'Shwetha'),(8,'Bharatesh'),(8,'Jagadish Chinta'),(8,'Madhuri'),(8,'Manoj Dighe'),(8,'Saurabh Garg'),(8,'Thomas');
/*!40000 ALTER TABLE `team_members` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','$2a$10$YkEmZvBWnFRjuvf2QDq.QeKArgg8MCuL3gpXyRfZ1x0LuZTdV0Byi',1,'ADMIN','','2020-04-25 04:43:58.525'),(2,'Akhandadweepa','$2a$10$bCrkzd4or1D02LcbhGjrluVQj267qqnv5prnIWm8ynf0tWU6POoyu',2,'TEAM',NULL,NULL),(3,'Nishada','$2a$10$pBnLExit/7mtCzMD5HeJCupXheymL2y24YUdM8kY9H2YlMUnD6Ml.',3,'TEAM',NULL,NULL),(4,'Aaryavarta','$2a$10$hA7PtjxY68HL4sxETT955ufAaK/sVXXAe/dDRyZNI1rgtAfWLNFeK',4,'TEAM',NULL,NULL),(5,'Shalwa','$2a$10$XpZeBRvXk7EydYUaiX0e0OPejiPJ9gsP.xwG6bYbTM6qnH/0L3l6y',5,'TEAM',NULL,NULL),(6,'Mahishaka','$2a$10$NTaRk5rcRwgW.li2MMJA.OVqXUV11NhbqZ5Y5FPYtHhCpRv9EaLxO',6,'TEAM',NULL,NULL),(7,'DevaBhumi','$2a$10$pzkwQRfpCTwrFTV5F4GSfebs/pWYI14Dm08gs5N3e/rGGjc3pca4O',7,'TEAM',NULL,NULL),(8,'Karusha','$2a$10$tsAAhC.7TPPoxK62O5K/0.gdMfwVeT8X6iVsnHcb68fpXZWx/ALF2',8,'TEAM',NULL,NULL);
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

-- Dump completed on 2020-04-25  3:06:42
