-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2024 at 04:53 PM
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
(1, 1, '2024-09-20', 50, 40, 0, 'Out-of-Stocks'),
(2, 1, '2024-09-30', 30, 30, 0, 'Out-of-Stocks'),
(3, 2, '2024-09-21', 20, 14, 1, 'Available'),
(4, 3, '2024-10-07', 15, 5, 10, 'Available'),
(5, 1, '2024-10-08', 30, 30, 5, 'Out-of-Stocks'),
(6, 10, '2024-11-28', 20, 17, 1, 'Inactive'),
(7, 12, '2024-11-29', 50, 30, 0, 'Inactive');

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
(1, '8oz Coke', 24.00, 200.00, 'Approve', 'src/images/productphotos/8oz_coke.png'),
(2, '8oz Royal Orange', 24.00, 200.00, 'Approve', 'src/images/productphotos/8oz_royalorange.png'),
(3, '8oz Sprite', 24.00, 200.00, 'Approve', 'src/images/productphotos/8oz_sprite.png'),
(4, '8oz Sparkle', 24.00, 200.00, 'Approve', 'src/images/productphotos/8oz_sparkle.png'),
(5, '300ml Wilkins', 15.00, 115.00, 'Approve', 'src/images/productphotos/300ml_wilkins.png'),
(6, '500ml Wilkins', 12.00, 120.00, 'Approve', 'src/images/productphotos/500ml_wilkins.png'),
(7, 'Cobra Yellow', 24.00, 320.00, 'Approve', 'src/images/productphotos/cobra_yellow.png'),
(8, 'Cobra Green', 24.00, 310.00, 'Approve', 'src/images/productphotos/cobra_green.png'),
(9, 'Litro Coke', 12.00, 390.00, 'Approve', 'src/images/productphotos/litro_coke.png'),
(10, 'Litro Royal Orange', 12.00, 390.00, 'Approve', 'src/images/productphotos/litro_royalorange.png'),
(11, 'Litro Sprite', 12.00, 390.00, 'Approve', 'src/images/productphotos/litro_sprite.png'),
(12, 'Swakto Coke', 12.00, 140.00, 'Approve', 'src/images/productphotos/swakto_coke.png'),
(13, 'Swakto Royal Orange', 12.00, 140.00, 'Approve', 'src/images/productphotos/swakto_royalorange.png'),
(14, 'Swakto Sprite', 12.00, 140.00, 'Approve', 'src/images/productphotos/swakto_sprite.png'),
(15, 'Vitamilk Banana', 24.00, 380.00, 'Approve', 'src/images/productphotos/vitamilk_banana.png'),
(16, 'Vitamilk Double Choco', 24.00, 380.00, 'Approve', 'src/images/productphotos/vitamilk_doushake.png'),
(17, 'Test', 0.00, 0.00, 'Approve', 'src/images/productphotos/test.png');

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
(1, 1, 1, 8000.00, 0.00, 8000.00, 'Out-of-Stocks'),
(2, 1, 2, 6000.00, 0.00, 6000.00, 'Out-of-Stocks'),
(3, 2, 3, 2800.00, 200.00, 2600.00, 'Available'),
(4, 3, 4, 1000.00, 2000.00, -1000.00, 'Available'),
(5, 1, 5, 6000.00, 1000.00, 5000.00, 'Out-of-Stocks'),
(6, 10, 6, 6630.00, 390.00, 6240.00, 'Inactive'),
(7, 12, 7, 4200.00, 0.00, 4200.00, 'Inactive');

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
(1, 'User', 'Example', 'user_example123@gmail.com', 1111111111, 'user12345', '14XWNRGmRaJIdaEJ4O8dplYN2U0Um2c0lJqWVWyzRJ8=', 'User', 'Active', 'src/images/userphotos/Black.png'),
(2, 'Admin', 'Testing', 'admin_testing098@gmail.com', 9999999999, 'admin09876', 'QeVlP8euuJQCbWu3stt/ZZArRUlF+o/WWmMnBHtSd/s=', 'Admin', 'Active', 'src/images/userphotos/Red.png');

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
  MODIFY `i_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tbl_products`
--
ALTER TABLE `tbl_products`
  MODIFY `p_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `tbl_sales`
--
ALTER TABLE `tbl_sales`
  MODIFY `s_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

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
