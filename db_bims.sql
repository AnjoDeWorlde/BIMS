-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 08, 2024 at 10:06 AM
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
(1, 1, '2024-08-09', 20, 5, 0, 'Available'),
(2, 5, '2024-09-01', 15, 3, 2, 'Archive'),
(3, 2, '2024-07-28', 9, 0, 2, 'Available'),
(4, 4, '2024-08-12', 20, 15, 0, 'Available'),
(5, 6, '2024-10-14', 50, 50, 5, 'Out-of-Stocks'),
(6, 1, '2024-10-25', 4, 0, 9, 'Out-of-Stocks'),
(7, 1, '2024-07-08', 1, 0, 0, 'Available'),
(8, 6, '2024-10-25', 100, 85, 15, 'Out-of-Stocks');

--
-- Triggers `tbl_inventory`
--
DELIMITER $$
CREATE TRIGGER `after_inventory_insert` AFTER INSERT ON `tbl_inventory` FOR EACH ROW BEGIN
    DECLARE v_p_price DECIMAL(20, 2);
    DECLARE v_s_gross DECIMAL(20, 2);
    DECLARE v_s_deductions DECIMAL(20, 2);
    DECLARE v_s_net DECIMAL(20, 2);

    -- Get product price
    SELECT p_price INTO v_p_price
    FROM tbl_products
    WHERE p_id = NEW.p_id;

    -- Calculate gross, deductions, and net
    SET v_s_gross = NEW.i_soldstocks * v_p_price;
    SET v_s_deductions = NEW.i_lossstocks * v_p_price;
    SET v_s_net = v_s_gross - v_s_deductions;

    -- Insert into tbl_sales
    INSERT INTO tbl_sales (p_id, i_id, s_gross, s_deductions, s_net, s_status)
    VALUES (NEW.p_id, NEW.i_id, v_s_gross, v_s_deductions, v_s_net, NEW.i_status);
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `after_inventory_update` AFTER UPDATE ON `tbl_inventory` FOR EACH ROW BEGIN
    -- Update s_status in tbl_sales
    UPDATE tbl_sales
    SET s_status = NEW.i_status
    WHERE i_id = NEW.i_id;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_products`
--

CREATE TABLE `tbl_products` (
  `p_id` int(20) NOT NULL,
  `p_name` varchar(50) NOT NULL,
  `p_qty` decimal(20,2) NOT NULL,
  `p_price` decimal(20,2) NOT NULL,
  `p_status` varchar(15) NOT NULL,
  `p_picture` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_products`
--

INSERT INTO `tbl_products` (`p_id`, `p_name`, `p_qty`, `p_price`, `p_status`, `p_picture`) VALUES
(1, 'Coke Mismo', 12.00, 200.00, 'Approve', 'src/images/productphotos/coke_mismo.png'),
(2, 'Wilkins 300ml', 30.00, 226.00, 'Approve', 'src/images/productphotos/300ml_wilkins.png'),
(3, 'Wilkins 500ml', 24.00, 235.00, 'Approve', 'src/images/productphotos/500ml_wilkins.png'),
(4, 'Sprite 8oz', 24.00, 180.00, 'Approve', 'src/images/productphotos/8oz_sprite.png'),
(5, 'Royal 8oz', 24.00, 180.00, 'Approve', 'src/images/productphotos/8oz_royalorange.png'),
(6, 'Coke 8oz', 24.00, 190.00, 'Approve', 'src/images/productphotos/8oz_coke.png'),
(7, 'Lemon 8oz', 24.00, 180.00, 'Reject', 'src/images/productphotos/8oz_royallemon.png');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sales`
--

CREATE TABLE `tbl_sales` (
  `s_id` int(20) NOT NULL,
  `p_id` int(20) NOT NULL,
  `i_id` int(20) NOT NULL,
  `s_gross` decimal(20,2) NOT NULL,
  `s_deductions` decimal(20,2) NOT NULL,
  `s_net` decimal(20,2) NOT NULL,
  `s_status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_sales`
--

INSERT INTO `tbl_sales` (`s_id`, `p_id`, `i_id`, `s_gross`, `s_deductions`, `s_net`, `s_status`) VALUES
(1, 1, 1, 1000.00, 0.00, 1000.00, 'Available'),
(2, 5, 2, 540.00, 360.00, 180.00, 'Archive'),
(3, 2, 3, 0.00, 452.00, -452.00, 'Available'),
(4, 4, 4, 2700.00, 0.00, 2700.00, 'Available'),
(5, 6, 5, 9500.00, 950.00, 8550.00, 'Out-of-Stocks'),
(6, 1, 6, 0.00, 1800.00, -1800.00, 'Out-of-Stocks'),
(7, 1, 7, 0.00, 0.00, 0.00, 'Available'),
(8, 6, 8, 16150.00, 2850.00, 13300.00, 'Out-of-Stocks');

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
  `u_status` varchar(9) NOT NULL,
  `u_picture` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_contactnumber`, `u_username`, `u_password`, `u_type`, `u_status`, `u_picture`) VALUES
(1, 'System', 'Owner', 'systemowner_101@gmail.com', 9999999999, 'admin', 'QeVlP8euuJQCbWu3stt/ZZArRUlF+o/WWmMnBHtSd/s=', 'Admin', 'Active', 'src/images/userphotos/black.png'),
(2, 'Steve', 'Minecraft', 'axediamond12@outlook.com', 9484712459, 'steve', '14XWNRGmRaJIdaEJ4O8dplYN2U0Um2c0lJqWVWyzRJ8=', 'User', 'Inactive', 'src/images/userphotos/Minecraft.png');

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
-- Indexes for table `tbl_sales`
--
ALTER TABLE `tbl_sales`
  ADD PRIMARY KEY (`s_id`),
  ADD KEY `p_id` (`p_id`),
  ADD KEY `i_id` (`i_id`);

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
  MODIFY `i_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbl_products`
--
ALTER TABLE `tbl_products`
  MODIFY `p_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tbl_sales`
--
ALTER TABLE `tbl_sales`
  MODIFY `s_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_inventory`
--
ALTER TABLE `tbl_inventory`
  ADD CONSTRAINT `tbl_inventory_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `tbl_products` (`p_id`);

--
-- Constraints for table `tbl_sales`
--
ALTER TABLE `tbl_sales`
  ADD CONSTRAINT `tbl_sales_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `tbl_products` (`p_id`),
  ADD CONSTRAINT `tbl_sales_ibfk_2` FOREIGN KEY (`i_id`) REFERENCES `tbl_inventory` (`i_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
