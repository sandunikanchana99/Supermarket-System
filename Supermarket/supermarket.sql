-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2022 at 11:35 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `supermarket`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminl`
--

CREATE TABLE `adminl` (
  `Name` varchar(20) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `ContactNo` varchar(10) NOT NULL,
  `AworkID` varchar(20) NOT NULL,
  `Password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cashier`
--

CREATE TABLE `cashier` (
  `Name` varchar(20) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `ContactNo` int(10) NOT NULL,
  `CworkID` varchar(15) NOT NULL,
  `Cpassword` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cashier`
--

INSERT INTO `cashier` (`Name`, `NIC`, `ContactNo`, `CworkID`, `Cpassword`) VALUES
('roshana', '123455', 231213213, 'R001', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Name` varchar(20) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `ContactNo` varchar(10) NOT NULL,
  `CworkID` varchar(20) NOT NULL,
  `Password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `ProductName` varchar(15) NOT NULL,
  `Category` varchar(15) NOT NULL,
  `WholesalePrice` double NOT NULL,
  `RetailPrice` double NOT NULL,
  `ProductCode` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ProductName`, `Category`, `WholesalePrice`, `RetailPrice`, `ProductCode`) VALUES
('amba', 'Fruit', 15, 20, 'a1'),
('kehel', 'Fruit', 10, 20, 'K1'),
('pkaauya', 'Vegetables', 150, 200, 'kjb132132'),
('Tomato', 'Vegetables', 57, 80, 'Ve001'),
('wattakka', 'Vegetables', 150, 250, 'w1');

-- --------------------------------------------------------

--
-- Table structure for table `securityqs`
--

CREATE TABLE `securityqs` (
  `WorkID` varchar(15) NOT NULL,
  `SecurityQ01` varchar(15) NOT NULL,
  `SecurityQ02` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `SuplierName` varchar(20) NOT NULL,
  `SupplierID` varchar(10) NOT NULL,
  `ProductCatogory` varchar(15) NOT NULL,
  `SuplierContact` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`SuplierName`, `SupplierID`, `ProductCatogory`, `SuplierContact`) VALUES
('SDU', 'S001', 'Pharmaceuticals', '0754871234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminl`
--
ALTER TABLE `adminl`
  ADD PRIMARY KEY (`AworkID`);

--
-- Indexes for table `cashier`
--
ALTER TABLE `cashier`
  ADD PRIMARY KEY (`CworkID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`CworkID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ProductCode`);

--
-- Indexes for table `securityqs`
--
ALTER TABLE `securityqs`
  ADD PRIMARY KEY (`WorkID`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`SupplierID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
