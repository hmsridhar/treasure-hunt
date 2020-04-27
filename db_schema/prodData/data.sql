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
INSERT INTO `configurationKeyValues` VALUES ('Aaryavarta-day','1'),('Aaryavarta-hint',''),('Aaryavarta-img1',''),('Aaryavarta-img2',''),('Aaryavarta-img3',''),('Aaryavarta-img4',''),('Aaryavarta-stage','1'),('Akhandadweepa-day','1'),('Akhandadweepa-hint',''),('Akhandadweepa-img1',''),('Akhandadweepa-img2',''),('Akhandadweepa-img3',''),('Akhandadweepa-img4',''),('Akhandadweepa-stage','1'),('COINS_REQUIRED_UNLOCK_CLUE','16'),('day','1'),('DevaBhumi-day','1'),('DevaBhumi-hint',''),('DevaBhumi-img1',''),('DevaBhumi-img2',''),('DevaBhumi-img3',''),('DevaBhumi-img4',''),('DevaBhumi-stage','1'),('Karusha-day','1'),('Karusha-hint',''),('Karusha-img1',''),('Karusha-img2',''),('Karusha-img3',''),('Karusha-img4',''),('Karusha-stage','1'),('key1','32'),('key2','46'),('key3','90'),('Mahishaka-day','1'),('Mahishaka-hint',''),('Mahishaka-img1',''),('Mahishaka-img2',''),('Mahishaka-img3',''),('Mahishaka-img4',''),('Mahishaka-stage','1'),('MAX_ATTEMPTS_PUZZLE','5'),('Nishadha-day','1'),('Nishadha-hint',''),('Nishadha-img1',''),('Nishadha-img2',''),('Nishadha-img3',''),('Nishadha-img4',''),('Nishadha-stage','1'),('passkey-1','32'),('passkey-2','46'),('passkey-3','90'),('passkey-4','239094306'),('Shalwa-day','1'),('Shalwa-hint',''),('Shalwa-img1',''),('Shalwa-img2',''),('Shalwa-img3',''),('Shalwa-img4',''),('Shalwa-stage','1');
/*!40000 ALTER TABLE `configurationKeyValues` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `puzzle` VALUES (1,'TEXT',NULL,'icecreamText_1.png',2,'baskin robbins'),(2,'IMAGE',NULL,'toysImg_2.png',2,'game of thrones,got'),(3,'TEXT',NULL,'fiftysixText_3.png',2,'zuleykya rivera'),(4,'TEXT',NULL,'numbersText_4.png',2,'280'),(5,'IMAGE',NULL,'boxesImg_5.png',2,'9'),(6,'TEXT',NULL,'deviceText_6.png',2,'ipod,i-pod'),(7,'IMAGE',NULL,'companyImg_7.png',2,'delhivery'),(8,'IMAGE',NULL,'playerImg_8.png',2,'royal challengers bangalore,rcb,royal challengers bengaluru'),(9,'TEXT',NULL,'famousSongText_9.png',2,'why this kolaveri di,kolaveri,why this kolaveri kolaveri di?,why this kolaveri kolaveri di,why this kolaveri di?'),(10,'IMAGE','These pictures are related..any guesses?','timeImg_10.png',2,'1989'),(11,'TEXT',NULL,'sequencetText_11.png',2,'21'),(12,'IMAGE',NULL,'mensaImg_12.png',2,'6'),(13,'TEXT','ITSY YWZXY GWZYZX','caesarText_13.png',2,'dont trust brutus'),(14,'TEXT',NULL,'spartaText_14.png',2,'300'),(15,'TEXT',NULL,'trophyausText_15.png',2,'women\'s  big bash league,wbbl,,women big bash league,women\'s big bash,women big bash'),(16,'TEXT',NULL,'scofieldImg_16.png',2,'purdue hill alabama'),(17,'IMAGE','How are these images related?..We as ComputerScience engineers can surely give a try!','engineImg_17.png',2,'javascript engines,,js engines,ecmascript engines'),(18,'IMAGE','What does the gif say?\n','gif_18.gif',2,'tanzanite'),(19,'TEXT',NULL,'googlecollideText_19.png',2,'Why are the galaxies in a spiral shape?, why are galaxies in spiral shape?,Why are the galaxies in a spiral shape?, why are galaxies in a spiral shape?,'),(20,'TEXT',NULL,'dayQText_20.png',2,'wednesday'),(21,'TEXT',NULL,'illuminate45Text_21.png',2,'turkmenistan'),(22,'TEXT','','spiritualText_22.png',2,'existential vacuum'),(23,'VOICE','Name the music instrument used!','music_23.mp3',2,'accordion'),(24,'TEXT','Name the famous cricket shot!','cricketshotImg_24.png',2,'dil scoop'),(25,'VOICE','Guess the speaker...','dream_25.mp3',2,'martin luther king,martin luther king junior,martin luther king jr,martin luther '),(26,'IMAGE','Moments where opponents regret Sledging...who was the bowler?','revengeImg_26.png',2,'venkatesh prasad,venkatesh'),(27,'VOICE','Guess the famous speaker...','fearlessVoice_27.mp3',2,'lal bahadur shastri'),(28,'TEXT',NULL,'shadowImg_28.png',2,'jimmy anderson,anderson,james anderson'),(29,'TEXT',NULL,'murderbookText_29.png',2,'angels and demons'),(30,'TEXT',NULL,'gamegoText_30.png',2,'pokemon go'),(31,'TEXT',NULL,'harryImg_31.png',2,'diary ring cup,diary cup ring,ring diary cup,ring cup diary,cup ring diary,cup diary ring'),(32,'TEXT','Based on what are the countries grouped?','colours_32.png',2,'passports, passport colours,passport, passport books,passport book,passports of countries');
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
INSERT INTO `team` VALUES (1,'Amaravathi',0,0),(2,'Akhandadweepa',0,0),(3,'Nishadha',0,0),(4,'Aaryavarta',0,0),(5,'Shalwa',0,0),(6,'Mahishaka',0,0),(7,'DevaBhumi',0,0),(8,'Karusha',0,0);
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
INSERT INTO `user` VALUES (1,'admin','$2a$10$YkEmZvBWnFRjuvf2QDq.QeKArgg8MCuL3gpXyRfZ1x0LuZTdV0Byi',1,'ADMIN','Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iXSwiaWF0IjoxNTg3ODM3NTkwLCJleHAiOjE1ODc4NjYzOTB9.IxQc15xFbwrALGKDlDvFPucrDpeE71eTZRD_O9Rn226FlJmMcHE1Sfm1qkqCCIbhd8oKCZ8BGe5whEK3zENtrw','2020-04-26 01:59:50.595'),(2,'Akhandadweepa','$2a$10$EETLPFfcQXK3/kAOJwzuGuQlCWkBXozGxGVOCGdTtarXYgQZ7FqyK',2,'TEAM','Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBa2hhbmRhZHdlZXBhIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9URUFNIl0sImlhdCI6MTU4NzgzNzc0MywiZXhwIjoxNTg3ODY2NTQzfQ.02R76OqsZKVl8LGL7o2B1mbMtUSZmE5sMTe7KQdb2GuqFxdesga6WBy7wTZBHsKHJKBv6GM6eJY6FA1Xgxgo4Q','2020-04-26 02:02:23.373'),(3,'Nishadha','$2a$10$eiOQKl7kox4sx8wTr8.4leXSUKLe4TnK5v6rQiNcNhcZpvIq/WnQa',3,'TEAM',NULL,NULL),(4,'Aaryavarta','$2a$10$UYMTHR1RFwR3yKz0aoLlGuQiK01ScevV5mTz11H9Rc5A/G7ZufwtS',4,'TEAM',NULL,NULL),(5,'Shalwa','$2a$10$NgH8k.fZ1wJvySI02eKfKeYocTMJvQBK/4pFFy3WxDYR.C9POX.jy',5,'TEAM',NULL,NULL),(6,'Mahishaka','$2a$10$elcW.o1vwNnA456NICxvWuA0EJxX2yqTXn4lN7xDdElkDjUleh2bq',6,'TEAM',NULL,NULL),(7,'DevaBhumi','$2a$10$Omj4VWglxB8/kTeZoO2/kuKaW2VP4Zql5JpUnfoKDo91x0yWBTZZa',7,'TEAM',NULL,NULL),(8,'Karusha','$2a$10$X97kerru9tPclJao9lrDqu5/kFmQqpqe12EcjodBY1.85RArz1MhC',8,'TEAM','Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJLYXJ1c2hhIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9URUFNIl0sImlhdCI6MTU4NzgzNzgxMywiZXhwIjoxNTg3ODY2NjEzfQ.DkLwIRSzBAzBQv4QpD5GbD2f3LjQByasLsn1bDpW6npeA2vUh4Bot866fMYMI0inq9HAs8oKtfbrd8nSYIiuzQ','2020-04-26 02:03:33.337');
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

-- Dump completed on 2020-04-27 10:12:44
