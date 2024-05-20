-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2024 at 06:22 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_bims`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_inventory`
--

CREATE TABLE `tbl_inventory` (
  `i_id` int(20) NOT NULL,
  `p_id` int(20) NOT NULL,
  `i_date` date NOT NULL,
  `i_availablestocks` decimal(20,0) NOT NULL,
  `i_soldstocks` decimal(20,0) NOT NULL,
  `i_lossstocks` decimal(20,0) NOT NULL,
  `i_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_inventory`
--

INSERT INTO `tbl_inventory` (`i_id`, `p_id`, `i_date`, `i_availablestocks`, `i_soldstocks`, `i_lossstocks`, `i_status`) VALUES
(1, 1, '2024-05-20', 0, 45, 0, 'Out-of-Stocks'),
(2, 10, '2024-05-18', 55, 25, 0, 'Available'),
(3, 1, '2024-05-19', 2, 43, 0, 'Available'),
(4, 2, '2024-05-20', 1, 30, 0, 'Available'),
(5, 16, '2024-05-21', 3, 1, 0, 'Available'),
(6, 13, '2024-05-21', 3, 3, 0, 'Available'),
(7, 7, '2024-05-21', 0, 20, 5, 'Out-of-Stocks'),
(8, 9, '2024-05-21', 6, 29, 0, 'Available'),
(9, 17, '2024-05-21', 4, 1, 1, 'Limited Stock');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_products`
--

CREATE TABLE `tbl_products` (
  `p_id` int(20) NOT NULL,
  `p_name` varchar(50) NOT NULL,
  `p_qty` decimal(20,2) NOT NULL,
  `p_price` decimal(20,2) NOT NULL,
  `p_status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_products`
--

INSERT INTO `tbl_products` (`p_id`, `p_name`, `p_qty`, `p_price`, `p_status`) VALUES
(1, 'Coke8oz', 24.00, 180.00, 'Active'),
(2, 'CokeLitro', 12.00, 370.00, 'Active'),
(3, 'Royal8oz', 24.00, 180.00, 'Active'),
(4, 'RoyalLitro', 12.00, 370.00, 'Inactive'),
(5, 'Sprite8oz', 24.00, 180.00, 'Active'),
(6, 'SpriteLitro', 12.00, 370.00, 'Inactive'),
(7, 'Mountain Dew8oz', 24.00, 175.00, 'Active'),
(8, 'Vitamilk', 24.00, 655.00, 'Inactive'),
(9, 'SM Grande', 6.00, 560.00, 'Active'),
(10, 'RH Jumbo', 6.00, 585.00, 'Active'),
(11, 'RH 500', 12.00, 575.00, 'Active'),
(12, 'SM Light', 24.00, 990.00, 'Active'),
(13, 'SM Flavored Beer Apple', 24.00, 840.00, 'Active'),
(14, 'SM Flavored Beer Lemon', 24.00, 840.00, 'Inactive'),
(15, 'SM Pilsen Grande', 24.00, 840.00, 'Active'),
(16, 'SM Stallion', 24.00, 890.00, 'Active'),
(17, 'SM Light Jumbo', 6.00, 650.00, 'Active'),
(18, '1.5LChristmasPack', 3.00, 150.00, 'Archive'),
(19, 'Coke1.5L', 12.00, 500.00, 'Inactive');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(70) NOT NULL,
  `u_contactnumber` bigint(13) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(150) NOT NULL,
  `u_type` varchar(7) NOT NULL,
  `u_status` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_contactnumber`, `u_username`, `u_password`, `u_type`, `u_status`) VALUES
(1, 'Admin', 'Commander', 'admin.comm@gmail.com', 9999999999, 'admin', 'QeVlP8euuJQCbWu3stt/ZZArRUlF+o/WWmMnBHtSd/s=', 'Admin', 'Active'),
(2, 'User', 'Peasant', 'user.peas@yahoo.com', 1111111111, 'user', 'vEiDTau2j3Ba47mg6iWh1HdhnV9Y8J4v9lauh+MV8Y4=', 'User', 'Active'),
(3, 'Anjo', 'World', 'anjoW@outlook.com', 9365485486, 'Admin', 'xK4gTTp2SG0w5INs/c0YVmITrumLqkkAhUHolxmu3LU=', 'Admin', 'Active'),
(4, 'Michael', 'Baca', 'pAntsu@gmail.com', 9784652584, 'baca', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'User', 'Archive'),
(5, 'Temae', 'Ganda', 'te@yahoo.com', 9875483456, 'mae', 'eFsw9sf4b+wiiBQExYjvRQs7lDwmN08QC6bblIb42HM=', 'User', 'Inactive');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_inventory`
--
ALTER TABLE `tbl_inventory`
  ADD PRIMARY KEY (`i_id`),
  ADD KEY `p_id` (`p_id`);

--
-- Indexes for table `tbl_products`
--
ALTER TABLE `tbl_products`
  ADD PRIMARY KEY (`p_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_inventory`
--
ALTER TABLE `tbl_inventory`
  MODIFY `i_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tbl_products`
--
ALTER TABLE `tbl_products`
  MODIFY `p_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_inventory`
--
ALTER TABLE `tbl_inventory`
  ADD CONSTRAINT `tbl_inventory_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `tbl_products` (`p_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
