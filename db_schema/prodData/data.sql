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
INSERT INTO `puzzle` VALUES (1,'TEXT',NULL,'icecreamText_1.png',2,NULL),(2,'IMAGE',NULL,'toysImg_2.png',2,'game of thrones,got'),(3,'TEXT',NULL,'fiftysixText_3.png',2,NULL),(4,'TEXT',NULL,'numbersText_4.png',2,'280'),(5,'IMAGE',NULL,'boxesImg_5.png',2,'9'),(6,'TEXT',NULL,'deviceText_6.png',2,'ipod,i-pod'),(7,'IMAGE',NULL,'companyImg_7.png',2,'delhivery'),(8,'IMAGE',NULL,'playerImg_8.png',2,'royal challengers bangalore,rcb,royal challengers bengaluru'),(9,'TEXT',NULL,'famousSongText_9.png',2,'why this kolaveri di,kolaveri,why this kolaveri kolaveri di?,why this kolaveri kolaveri di,why this kolaveri di?'),(10,'IMAGE','These pictures are related..any guesses?','timeImg_10.png',2,'1989'),(11,'TEXT',NULL,'sequencetText_11.png',2,'21'),(12,'IMAGE',NULL,'mensaImg_12.png',2,'6'),(13,'TEXT','ITSY YWZXY GWZYZX','caesarText_13.png',2,'dont trust brutus'),(14,'TEXT',NULL,'spartaText_14.png',2,'300'),(15,'TEXT',NULL,'trophyausText_15.png',2,'women\'s  big bash league,wbbl,,women big bash league,women\'s big bash,women big bash'),(16,'TEXT',NULL,'scofieldImg_16.png',2,'purdue hill alabama'),(17,'IMAGE','How are these images related?..We as ComputerScience engineers can surely give a try!','engineImg_17.png',2,'javascript engines,,js engines,ecmascript engines'),(18,'IMAGE','What does the gif say?\n','gif_18.gif',2,NULL),(19,'TEXT',NULL,'googlecollideText_19.png',2,'Why are the galaxies in a spiral shape?, why are galaxies in spiral shape?,Why are the galaxies in a spiral shape?, why are galaxies in a spiral shape?,'),(20,'TEXT',NULL,'dayQText_20.png',2,'wednesday'),(21,'TEXT',NULL,'illuminate45Text_21.png',2,NULL),(22,'TEXT','','spiritualText_22.png',2,NULL),(23,'VOICE','Name the music instrument used!','music_23.mp3',2,'accordion'),(24,'TEXT','Name the famous cricket shot!','cricketshotImg_24.png',2,'dil scoop'),(25,'VOICE','Guess the speaker...','dream_25.mp3',2,'martin luther king,martin luther king junior,martin luther king jr,martin luther '),(26,'IMAGE','Moments where opponents regret Sledging...who was the bowler?','revengeImg_26.png',2,'venkatesh prasad,venkatesh'),(27,'VOICE','Guess the famous speaker...','fearlessVoice_27.mp3',2,'lal bahadur shastri'),(28,'TEXT',NULL,'shadowImg_28.png',2,'jimmy anderson,anderson,james anderson'),(29,'TEXT',NULL,'murderbookText_29.png',2,'angels and demons'),(30,'TEXT',NULL,'gamegoText_30.png',2,'pokemon go'),(31,'TEXT',NULL,'harryImg_31.png',2,'diary ring cup,diary cup ring,ring diary cup,ring cup diary,cup ring diary,cup diary ring'),(32,'TEXT','Based on what are the countries grouped?','colours_32.png',2,'passports, passport colours,passport, passport books,passport book,passports of countries');
/*!40000 ALTER TABLE `puzzle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,_binary 'PK\0\0\�H�P\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/numbering.xml\�Wˎ\�0��!�ͣ\�CѤ�`4�\����X\�l\'�~v�\�\�����H(-�����8���D��a\�)�\�D��s8�#��\�\�\�\�\�lm O \�\��5�߾�;D<g;�l�c!���Af��\\W�3�\�Bbn�{�4�Q�.�\�9�3$���\�%\�\���\r��A�x\�@\�AJh�7eK$�{�ps�j\�ܺ\�A��an���\�\�\� �Έ\�-\Z�\�&�����Ѷ\� �LK<\�{f�t*�J ���>\�\�\��\\`	\�uY\�tf�	��w0�:΀�\�s;���\n�\'\�߅�C�S\�NAu�{x\�}�\�d��\�l�\�U\'\�k P�i\�5T�g��������t��ϐSY/R}\�7\�{gr��A�{���\�\�)�\�^\�\�5h�~���2��\�Z�;mD\�SΜ����5Ӫ�Ԧ�=b\�Uk�\�\�XiY\�nk3}d]p�S�M���O��K�����@m�\�}S.?�� <��2�u`M�e����/V^Y\�vŪ>��[�o*��[M;\'\�߂̷K\��a8\n�\�l~���M\�Fa��Dh�f3\n�p�\�\�Ga��Di\�bXM���7��\'Q\�r=�l&Q\�*���\'�\�fo��\�߯\'/\��nUٞ��\�PK%,7K\0\0�\0\0PK\0\0\�H�P\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/settings.xml��\�n\�0ǟ`\�\���I6uzX��\�=\0#ɶ}A�\�\�\�\'ǖդ@\�f�H�?\�M?>�|q�\�2%K��R��+\�d]�?�?�\�\�\�:����Dgj\�\�\�\�cWX\���O���D�s�H�*����\�+e85u\"�[�\�Jhp\��8s\�$O\�-\Z1�D��ňX\n����r}H���a:��3\'\��p+�t����\�נ�m���&\�yc ��\�$x�\���l\�@\�-���S�h�0�֫σq\"f\���)bN	\�9C%��0�p܀�\�+�{l\�$�\��9��\�\�`��\�Ww��m�f����\�\\k����0.\0�=��\� O0\r3�g��\r�0�\r�8��S�l�ތ˾M#��?\�O�Z\�}}\�\��m>\�`\�W ��ܽ\�a\�^t\�	�\�S��\�a\�\�\�~ؘ�/\� � ��s�_���5l~q}\�\�*\'7�>���\�C\�C�����qY\�w�F�B�\\u>\��-l�`\����Q˃�\�\�!hQ[m�M\�6Q\�m\�k\�YSÙ<�6�c�W�s\�Q�+\�\�Ic?\�Wj�PK��ä\0\0\�\0\0PK\0\0\�H�P\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/fontTable.xml��\�N\�0��`\���}�-h��h�.�\�L\'��=\�\�i\�\�\�\��@A(d��x|�3�\��\�\�h��\�ڜ��)g\�\n,��r�\��\�\�g>�-@��9\�Kϯ\�?.۬D<�r\�3#r^�\�$�����X\"�\�\0=5n!\�8j��\n�\�,M/x���7d��0Jz,\�A�aY*!�G��)�G\�\r�\�H^�:��\�\�\���f\�\�b�\�!���3�\�׺)nA\�\�\�Q�T8B!���7\�\�@\\�x@�)-��\�;1�\�9$\�4x/�w7�W\�x�q^Oi\�X�S[\�\�f\��ީI)>!DUhh\����B\�s\Zœ,��\�`sQM��	�PP�1��[7�JOⲩ�ɑV�햰qc\�Ρ��W\�\����u��cmf�\���&�\'\����=Ȗ�E��\�-\��g��C=\�~�\�PK^x@�\0\0�\0\0PK\0\0\�H�P\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/styles.xmlՖ\�n\�0��`���MHCQiU�\�6�ꦵ���c�UǶlʮ~\�7$�J�\0��\�~�:\�\�\�[LGk,\�ln�/k�\�!a���\�\�\�bf��\�ϭ-V\�\����M���b52�L1�[�\�\"�m�\"��\�3ӹ\�2m�re\� _q�x,@��Dom\�q�V!\�\�V\"YPH\\\�I��R�)_.	\�\�O�!�\�\�S\�9Jb\�tVі��9p�\"\"T�U3�Q)�~o똖\�6�O�P\�\�lFL�B.C!9\�J�\�}\�Y)��\0S�*�\��k�3���J&�FC��}ij\�2�z!5E�L$\�z$	r۞๛/H/7L�Nde\�!(�K:D�r�\�;`k�\��zٹ�XI�k��\�\�\�i\�\�9�k�\�qj\�$ODmw�\�\�	O>&\��\�\�rt���P�Ҧ�%�f\�\�~8\�j�	@!B\�֭$`\�o�v\Z��UvB\�-S\�x;�RMx\r核n�S\��*c��1���ݜ�h�2M�d���\��:��\�\0$����\��[\\�{\�H\�0\�d\�/��Y׏pn=�~\�\�\�\�*\�3�q��\�kg�my\r���_\�H/�l\�\�G�\�E|ǐ^�m\�(\���-Z�\�\�OV�\�M~\�]�bs^1O;C\n�4�h6H5\��^\�RcsS�]\'����o�\�;\��{[ٸ��ﴽ�\�v|6�{��ɰyӾ\���\�<\�^\�\�cGb�b�΍q�O\�Jq\�e\�=/������\'\�\�x��x�υם�Ż�s�}Z8���	pN\�|2��)q���\�9=�s��\�$\r\�\�}!ڼU�\��虹N��~�>�t��\�9Y\�N^UǙ�y\� f\'|��L\�u�u�\�\�x\���w��\��?PK�\�E\0\0\�\0\0PK\0\0\�H�P\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/document.xml\�\\\�n\�8�}���\�.�\�N�v{ƦE�l[\�^�\�Zܧ-�-�)R ){���w�\�\��In��\�8	\n\�\�d�D�b��\�я3��(����L���F���AP\�&�zz\��\��\�\�\�=p^\�D(��W�\�|�\�O�ab\�\"C\�$h7\�\�\�^\�}>\��]�b&\\dr\�T916�.�	;+�\�\�d��r,��e0x֫Ř\�^a����\�\�\Zg&��\�d\"c���v�q�.\'�\�aľEE:\�R��FZ��4�L!�Mb���\�\"\�d�ĊݎLU-�Mrkbt�JO�ʥĽ�d\����>f�I&�^�ap\\�;��k�Q���l\�\�&�TU\�\�\�\n[^\�Blaϋ�s��/I�^��K@n#\"N���\0��e\�&\�B\�\�\�\�t#8_��H1�\"[�\�\�\�\�\�\r.�\�,9��M���7\��\n\�\�H����\�L�~#\����IJ�\�a1$�����W���Z�\�j\�\�	ND��55\�Z\�\��0V��e\�^P&�`�\�\�_����DKy\�;�:x�85�\�,<v\��p�\�Iqmez�\�5\��<���\Z\�\�w��)9v\�e�Z��J߯\�\Z�����3&żj�m��\�9t��\�y\�\�9�^|JQCi\n�\�-�\�\\\�;\�S�ҁ\0e<�	B3\�ADf�r4�\�h�!��M|*��a\�\�\�\����\��\\��Q\�Y*�pDN�M\�ZpA\n�<\n]y3m�H\�L�qI\n5�0�Nzn\�\�1��\�-Iʤ��N\��Dn0Ò\�4�\�Cc�A��rHe��|e�\n--Xg�\�:�\n�[u��t���3\�\�%��\�\��1�5ޥr*��i�˸�ݥ˄R0vJl��\�\�Cl{g�b)?�D��hTFa��ZB�G\�R]�)\�\�;1�C�H\�]v\�29/��K��L\�]�ה�s\�\�\��o{�s&2����T8J؍B�ʨt)\"\�sn�&�ё-E��V���ݺhX�2\�>1\�\�1W�{\�F\�=\�\�\��I\n1�cV<��b�\n2Jy�\�\�\��D\�\�\�SN\�\��(QX\�\�\�\�$��U����|.\�=K�\nrr쐚\\RJƕck��윊iJ\�Ƚ*��Q�*\�wد�\�\'�s\�\�HkOιi�0QLS\Z\�Pǐ\�\�ژ��*�J�\n\�51B�|�)l\�\�Iլ�\�D\�t�;:��8��	<��6��7-Ƭg\�dJc�\�*c\�BU�\07	i!q��|�\���*V6\n�,VE�\�\"P�4\�\�T�\�3Do�I\�]Ͼ|�_��]\����B\�9�2����ѝ�ع���<>\�nU{g��\�\'_]«\��\�7��\"\�t�U?���O4ԍ��l�����\�:�����\���\�Qޓg��\�T���~{�k�\�\�t��8X��]Y\�\�d2&^��r\�\�\�J\�\�JW�j�����\�V\�YL�ꬵ���(dC@\"$\�b\�\�3%\�|$�\�1g��\�\�\�7�5�\�Jx\�E\�{y^[�\�\��\��E\�)\�|_\�F<3�O�\�n����\�ݐ\�\��?{\�\�.��v\��!�\r�pw�\�?:\������>¤E� tȁ�@�\�\�|I�R)�pp��nJ\�\�Eos�z\�%p\�?�E.�P\�t\�B\�g�f��7\��!\�H�\�\�uK+VH�\�[�D�Uǥ\�-\�ֹ4;\�\�3�\�\�L\�B\�\�u$g{��i\�v$gC���5�c\�\�\�ȻZ�H�w\�3\�\�,��\�.7\�.��؇D[n�\"�B��WXKvK0�q	b\�v�ړ�(g\��\�A\�9&\�\�W�{̰E\�K��(�:��1n\�}\�n)R:�p3�Po~<:�-w=X\�Gg�\�jg};\�\�B���yHv��\r��\��p�O�ϧ�O�\�?\\\\��_u\0���	\'L\�KR�\�f\�K �`!A�D���\']\�\��\�\�\�\\̪�p&�\�\�\�a\�\�C����_K?x\��6��6\rd\��s�@d�J>Ş�\�݀_�H71|\�\ZZ\�z\�Ρ�w\�[���ɫ\�m��f\�\��_w�k\0ݙ%81�蓐�� ?0\"�}{�}_�ɭ�U��u���\�a\����\�]J,\�\�� A���\�#��\"X���\�dTuP��&_]TyJse\�4�p�R��v�\�L��\�e=\��\";/\�דb^X�J�\Z=�\�\��W���\��PKh��\�\0\0�K\0\0PK\0\0\�H�P\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/_rels/document.xml.rels��Mj\�0�O\�;�\�ײ\�J��Md[\�(���Z#!MJ}���$Ӆ�\�y�֛͌;�o�w��\�rH\�\�=�\n>�\�\��Țj=8B#Fؔ\�4��\��>�BQA\�\�ߥ��C�c\�<Rzi\\�����\�|\�\�*\�_e�f@y�)�����\�\��?ٮiz�[g��ﴐ�j1\�\�\"+8\�?�\�R\���%\"2�\�\�+\�ٙCxZ�qĕ>�U\\�9�\�%!\�h\�\�W��5�\�1xpz��>��7���PK�\0�\��\0\0\0,\0\0PK\0\0\�H�P\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0_rels/.rels�\�;\�0\�p�\�;Mˀj\�!uE\�\0Q\�\�CIx��d`\0\��h��g�\�v&7�\�xǠ�j \�W\�i\�\�\�IY8%f\���	:�jO8�\\v\�dB\"q���s\�S�\�V�\�te2�hE.e\�4y\Z馮�4��?L\�+�W\r�a	��\�\�\�H<xy�\��_�\"��13����z��\�\�-�x�?PK-h\�\"�\0\0\0*\0\0PK\0\0\�H�P\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/theme/theme1.xml\�YKo\�6�\�w toe\�V\�u�رۭM$n�i��\�P�@\�I|\�\�úa�\�m�a[�إ�4\�:lЯ���)�ΣM��6I��\�I��È�}\"$\�q\�r.\�,Db��4\�\�\�A�B\�BR\�\�ǌǤmM������e��B��\\\�m+T*Y�m\��2�yBbx6\�\"\�\n�\"�}��o\�\�z��bG�\��qlo�F\�#h���֧\�{�b%\���]/��SdX\�I\�Dv�@���-�\��9TbX*xжj\�ǲ\�/\�%SKh5�~�)\�\n��щ`X:�\�\�͒=翈\��zݞS�\�\0\���Rg\�췜Δ�ʇ���5�֬\�5���j�\�qW+�\�\�\\��j+͍zߜ\�\�E�;\�\�J\�\��+���Օf��BF\�t\Z\�22%d\�\�5#��\�4f([ˮ�>V\�r-\���\� .V4Fj���\0\�ŌM\�5��\'��\'�RYHz�&�m}�`��\�\�_>{��\�?=��\�уG�6P]\�q�S�����}��z�݋�_��R\���\�g�����t\�������o>�����C>��\�&9@;<\�\�P��bb�Slā\�1Ni\�\n+\�̰\�!U\�\�L��\�{�wC1V\�\0�F\�\�ÅѦ\�,\�\�80c���Ivw.��q�LM,�!���\� \�8 1Q(}\��1�ݥ�\�\�-\�	.�H��u05�d@�\�Lt�F��IA�w\�7[wP�3�M�_EBU`fbIXōW�X\�Ȩ1�����UhRrw\"��å�H�q\��&�[bRQ�:�sط\�$�\"��{&\�\r̹�\�\�{\�G�Qg\Z�:�#�)�\�6WF%x�B\�9\�\�K\�}�u�ھM�М 铱0�\�\�z��&q\�\�+�:��q�;���ϻqC�|�\��Q\�\�\0\'�jf�Q/\�ͷ\�.>}���&\�\�\n\�}s~ߜ\�\�漬�Ͽ%Ϻ���36\�\�S��2��&�ܐY��`�߇\�l����$�a!��\�\�Hp�	U\�n�\�dY�$J������wv?�`s�\�N/��\�j���rC�l�l�Y uA���i�5.��0\'�R�㚥�\�J�5oB\� ��JpV\�hH̈��=g0\r\��S\�bb��5��\��{&%\�\�ɵ\'ۋ\�\�\�\���U�\�Z\�\�I\�\Z�i	�Q�d\�i0\�\�\���kq\�\�UsV95w����j\�0�\�M_�\�3�\�n3�\��`h&�Ӣ\�r�C-\��Вшxj\�\�lZ<\�cE\�n\��!�z7�\��N_�N\�v�H�j\��1�ʦ�̒\�\�\�b�óq�C6\�Գ�\����4\�\��\�5%\�\\8�6�\�\����(\�ѶŅ\n9t�$�^_���\���E�b\�\�TW�?\�[9��\��ڡ:�\n!۪��fN]\����>S�+��wH�	�ջ�\�o�p\�M\nGd���٦\�\Z���\�\�|��g&�y�ͯ�5}m+X}=N�k\�\�f�\�\�ҝg~�M\���\�/h\�Txlv<��>*�y�x�U�_�8�[�q)�\�\�Z\��<;j\�n,q��\�^\�ٮ�\�\��K\�\�\�!\�l\�(>��7\�z3f��L`��Ef���b\�d\�rGL[:�w\�Q�p\Z\�9������N. ��$l�LX\�g�HI\\?����\��J\�\�gb�f�s|\�E��b�\�\�ʛ]f\�\�Ӻ\��z��\�\�]Vx\�6%9Tw�]A�ڳ�]�PK!Z��,\0\0\�\0\0PK\0\0\�H�P\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0[Content_Types].xml��Mn\�0�O\�;D\�V\�\�EUU�Y�]\�\���O��\�\�;	�����e�ͼ�y$O\�;\�-f�1TjR�U��\�چU�>��UC��ŀ�\�#��\�f�\�\'�B�Uj͜�&�FTƄA�&f,Ǽ\�	\��Pߍ\��\�\��xĭ��M����\�\�\�p\�ZW\nRr\�\0�3U�\�D<`�g���m�\�`FG�2�\�jhmݞ�Jm»L&\�\Z��\�\Z��\�xi)�c�S��d�ޕ�̲;�~@\�7�b�\�J}R\�\�#�A\�\�k\0�6h|#^X:�L\�˃B��_b��e�^�W<\�p�/�G��ze��tX\'�H\���\�PK3��,\0\0-\0\0PK\0\0\0\�H�P%,7K\0\0�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/numbering.xmlPK\0\0\0\�H�P��ä\0\0\�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\0\0word/settings.xmlPK\0\0\0\�H�P^x@�\0\0�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\�\0\0word/fontTable.xmlPK\0\0\0\�H�P�\�E\0\0\�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\0\0word/styles.xmlPK\0\0\0\�H�Ph��\�\0\0�K\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�	\0\0word/document.xmlPK\0\0\0\�H�P�\0�\��\0\0\0,\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/_rels/document.xml.relsPK\0\0\0\�H�P-h\�\"�\0\0\0*\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0L\0\0_rels/.relsPK\0\0\0\�H�P!Z��,\0\0\�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\06\0\0word/theme/theme1.xmlPK\0\0\0\�H�P3��,\0\0-\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\Z\0\0[Content_Types].xmlPK\0\0\0\0	\0	\0B\0\0\0\0\0\0','taiga,TAIGA','the paths mentioned before reaching Samvisha\'s location covers South-East Asia,Oceania and Europe',1);
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

-- Dump completed on 2020-04-26 22:23:03
