-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 08, 2020 at 01:33 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `infinitycom`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `cat_id` int(5) NOT NULL AUTO_INCREMENT,
  `cat_name` varchar(255) NOT NULL,
  PRIMARY KEY (`cat_id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`cat_id`, `cat_name`) VALUES
(1, 'Video CD'),
(2, 'Video DVD'),
(3, 'Audio CD'),
(4, 'Audio DVD'),
(5, 'Game CD'),
(6, 'Game DVD'),
(7, 'Software CD'),
(8, 'Software DVD');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
CREATE TABLE IF NOT EXISTS `inventory` (
  `stock_id` int(10) NOT NULL,
  `product_category` int(5) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `quantity` int(10) NOT NULL,
  `purchasing_price` float(9,2) NOT NULL,
  `selling_price` float(9,2) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`stock_id`),
  KEY `inventory` (`product_category`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`stock_id`, `product_category`, `product_name`, `quantity`, `purchasing_price`, `selling_price`, `date`) VALUES
(1001, 2, 'Hindi movie collection', 0, 40.00, 50.00, '2020-02-06'),
(1002, 3, 'Milton Mallawaarachi-song album', 8, 30.00, 50.00, '2020-02-11'),
(1003, 2, 'English Movies', 48, 35.00, 50.00, '2020-02-11'),
(1004, 2, 'Tamil movie collection', 8, 40.00, 50.00, '2020-03-31'),
(1005, 6, 'IGI 1 remaster', 28, 50.00, 60.00, '2020-04-02'),
(1006, 8, 'Adobe lightroom cs6', 0, 100.00, 130.00, '2020-04-03'),
(1007, 6, 'COD Blackops 3', 12, 120.00, 140.00, '2020-05-23');

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

DROP TABLE IF EXISTS `notification`;
CREATE TABLE IF NOT EXISTS `notification` (
  `notifi_id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(500) NOT NULL,
  `state` tinyint(4) NOT NULL,
  PRIMARY KEY (`notifi_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
CREATE TABLE IF NOT EXISTS `purchase` (
  `invoice_id` int(10) NOT NULL,
  `purchase_date` date NOT NULL,
  `purchase_time` time NOT NULL,
  `product_id` int(10) NOT NULL,
  `purchase_quantity` int(10) NOT NULL,
  `discount` float(3,2) NOT NULL,
  `net_amount` float(10,2) NOT NULL,
  KEY `product_id` (`product_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`invoice_id`, `purchase_date`, `purchase_time`, `product_id`, `purchase_quantity`, `discount`, `net_amount`) VALUES
(100001, '2020-03-24', '18:35:09', 1003, 1, 0.00, 50.00),
(100001, '2020-03-24', '18:35:09', 1002, 1, 0.00, 50.00),
(100001, '2020-03-24', '18:35:09', 1001, 2, 5.00, 95.00),
(100002, '2020-03-24', '18:43:18', 1001, 1, 0.00, 50.00),
(100003, '2020-04-01', '09:44:22', 1002, 1, 0.00, 50.00),
(100004, '2020-04-02', '16:28:03', 1003, 2, 0.00, 100.00),
(100004, '2020-04-02', '16:28:03', 1001, 1, 0.00, 50.00),
(100005, '2020-04-02', '21:07:39', 1005, 2, 2.00, 117.60),
(100006, '2020-04-03', '12:41:45', 1006, 1, 0.00, 130.00),
(100006, '2020-04-03', '12:41:45', 1001, 1, 0.00, 50.00),
(100006, '2020-04-03', '12:41:45', 1002, 1, 0.00, 50.00),
(100006, '2020-04-03', '12:41:45', 1003, 1, 0.00, 50.00),
(100007, '2020-04-05', '17:57:52', 1001, 2, 0.00, 100.00),
(100008, '2020-04-05', '18:03:41', 1001, 3, 0.00, 150.00),
(100008, '2020-04-05', '18:03:41', 1002, 1, 0.00, 50.00),
(100009, '2020-04-05', '18:05:27', 1001, 1, 0.00, 50.00),
(100009, '2020-04-05', '18:05:27', 1003, 2, 0.00, 100.00),
(100010, '2020-04-05', '18:07:52', 1005, 2, 0.00, 120.00),
(100010, '2020-04-05', '18:07:52', 1001, 1, 0.00, 50.00),
(100011, '2020-04-05', '18:32:09', 1002, 5, 0.00, 250.00),
(100012, '2020-04-05', '18:32:39', 1002, 8, 0.00, 400.00),
(100013, '2020-04-05', '18:47:59', 1001, 14, 0.00, 700.00),
(100014, '2020-04-05', '19:50:42', 1006, 7, 0.00, 910.00),
(100015, '2020-04-05', '19:54:39', 1003, 2, 0.00, 100.00),
(100016, '2020-04-05', '19:55:18', 1006, 1, 0.00, 130.00),
(100017, '2020-04-05', '20:42:10', 1002, 2, 0.00, 100.00);

-- --------------------------------------------------------

--
-- Table structure for table `returns`
--

DROP TABLE IF EXISTS `returns`;
CREATE TABLE IF NOT EXISTS `returns` (
  `invoice_id` int(10) NOT NULL,
  `product_id` int(10) NOT NULL,
  `return_date` date NOT NULL,
  `quantity` int(10) NOT NULL,
  `loss_amount` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `returns`
--

INSERT INTO `returns` (`invoice_id`, `product_id`, `return_date`, `quantity`, `loss_amount`) VALUES
(100001, 1001, '2020-03-29', 1, 47.5),
(100006, 1002, '2020-04-03', 1, 50),
(100001, 1001, '2020-04-22', 1, 47.5),
(100001, 1001, '2020-04-22', 1, 47.5);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int(5) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `user_email` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `role` varchar(25) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `user_name`, `user_email`, `user_password`, `role`) VALUES
(1, 'ruvindu', 'ruvindumadushanka@gmail.com', '3c9909afec25354d551dae21590bb26e38d53f2173b8d3dc3eee4c047e7ab1c1eb8b85103e3be7ba613b31bb5c9c36214dc9f14a42fd7a2fdb84856bca5c44c2', 'Admin'),
(6, 'kumara', 'rmemail95@gmail.com', '3c9909afec25354d551dae21590bb26e38d53f2173b8d3dc3eee4c047e7ab1c1eb8b85103e3be7ba613b31bb5c9c36214dc9f14a42fd7a2fdb84856bca5c44c2', 'Cashier'),
(9, 'alan', 'alanknox97@zohomail.com', '46b47302887227967eda98affa6b7a0582eed38a6233c5820961b41d9f7ff713c7f572cce7533e7d9dc3ff5f1b77dd507362c1c0d15405cac7985f3f340bc51b', 'Admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
