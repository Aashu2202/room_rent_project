/*
SQLyog Community Edition- MySQL GUI v8.04 
MySQL - 5.0.37-community-nt : Database - rentservice
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`rentservice` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `rentservice`;

/*Table structure for table `landlord` */

DROP TABLE IF EXISTS `landlord`;

CREATE TABLE `landlord` (
  `count` int(11) NOT NULL auto_increment,
  `emailID` varchar(30) NOT NULL,
  `type` varchar(20) default NULL,
  `foodtype` varchar(20) default NULL,
  `price` varchar(11) NOT NULL,
  `size` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `pin` varchar(7) default NULL,
  `description` varchar(150) default NULL,
  `images` tinyblob,
  UNIQUE KEY `count` (`count`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `landlord` */

insert  into `landlord`(`count`,`emailID`,`type`,`foodtype`,`price`,`size`,`address`,`city`,`pin`,`description`,`images`) values (1,'ay024898@gmail.com','room','veg','2500','500 sq.ft','609-d prajapat nagar','indore','452009','light bill extra per unit 8 rupee',NULL),(2,'vanshikalaad518@gmail.com','shop','veg','3000','700 sq.ft.','624-E,suryadev nagar','indore','452009','room + kitchen',NULL),(3,'priyankafegde@gmail.com','apartment','non-veg','5000','1500 Sq.ft.','503-F, nanda nagar airport road','pune','452005','light  bill extra + water bill',NULL),(4,'aashishgurjar1010@gmail.com','flat','nonveg','25000','2000 sq.ft','3/1- sudama nagarq','bhopal','452005','all charges included',NULL),(5,'vershabagde518@gmail.com','room','veg','2000','150sq.ft.','617-E, prajapat nagar','indore','452009','size= 10*15 ,&light bill extra as per meter shown',NULL),(6,'mradul328@gmail.com','room','veg','2900','250 sq, ft','518-sector C sudama nagar','indore','452009','no charges include',NULL),(8,'vershabagde518@gmail.com','flat','non-veg','9000','750 sq. ft.','234-G, polo ground,','indore','458001','registration charges 500 rupee',NULL),(9,'ash1010@gmail.com','shop','veg','1000','500 sq.ft','525 surydev nagar','pune','452008','light bill extra',NULL),(10,'aayushi123@gmail.com','other','non-veg','3000','1200 sq.feet','123 d suryadev nagar','indore','452639','nothing',NULL);

/*Table structure for table `logindetails` */

DROP TABLE IF EXISTS `logindetails`;

CREATE TABLE `logindetails` (
  `userID` int(10) NOT NULL auto_increment,
  `username` varchar(25) default NULL,
  `email` varchar(30) default NULL,
  `password` varchar(20) default NULL,
  `contact` varchar(10) default NULL,
  UNIQUE KEY `userID` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `logindetails` */

insert  into `logindetails`(`userID`,`username`,`email`,`password`,`contact`) values (1,'aashish','ay024898@gmail.com','2202','7489838868'),(2,'priyanka','priyankafegde23@gmail.com','12345','8269121734');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
