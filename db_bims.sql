-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 26, 2024 at 07:29 AM
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
(1, 1, '2024-05-25', 23, 35, 0, 'Inactive'),
(2, 7, '2024-05-17', 49, 51, 11, 'Available'),
(3, 3, '2024-05-25', 15, 18, 2, 'Available'),
(4, 8, '2024-05-26', 9, 12, 0, 'Limited Stock');

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
(1, '8oz Coke', 24.00, 180.00, 'Active', 'src/images/productphotos/8oz_coke.png'),
(2, '8oz Royal', 24.00, 180.00, 'Inactive', 'src/images/productphotos/8oz_royal.png'),
(3, '8oz Sprite', 24.00, 180.00, 'Active', 'src/images/productphotos/8oz_sprite.png'),
(4, 'Cobra Citrus', 24.00, 310.00, 'Inactive', 'src/images/productphotos/cobra_citrus.png'),
(5, 'Cobra Original', 24.00, 310.00, 'Active', 'src/images/productphotos/cobra_orig.png'),
(6, '1.5L Coke', 12.00, 710.00, 'Inactive', 'src/images/productphotos/coke_1.5L.png'),
(7, 'Mismo Coke', 12.00, 200.00, 'Active', 'src/images/productphotos/coke_mismo.png'),
(8, '750mL Emperador Light', 12.00, 1640.00, 'Active', 'src/images/productphotos/emperador_light.png'),
(9, '350 mL Kulafu', 24.00, 1010.00, 'Inactive', 'src/images/productphotos/kulafu_smol.png'),
(10, 'Starara', 1.00, 100000.00, 'Archive', 'src/images/productphotos/starF.png');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sales`
--

CREATE TABLE `tbl_sales` (
  `s_id` int(20) NOT NULL,
  `p_id` int(20) NOT NULL,
  `i_id` int(20) NOT NULL,
  `s_gross` decimal(20,0) NOT NULL,
  `s_deductions` decimal(20,0) NOT NULL,
  `s_net` decimal(20,0) NOT NULL,
  `s_status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_sales`
--

INSERT INTO `tbl_sales` (`s_id`, `p_id`, `i_id`, `s_gross`, `s_deductions`, `s_net`, `s_status`) VALUES
(1, 1, 1, 6300, 0, 6300, 'Inactive'),
(2, 7, 2, 10200, 2200, 8000, 'Available'),
(3, 3, 3, 3240, 360, 2880, 'Available'),
(4, 8, 4, 19680, 0, 19680, 'Limited Stock');

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
(1, 'Admin', 'Commander', 'admin.comm@gmail.com', 9999999999, 'admin', 'QeVlP8euuJQCbWu3stt/ZZArRUlF+o/WWmMnBHtSd/s=', 'Admin', 'Active', 'src/images/userphotos/superM.png'),
(2, 'User', 'Peasant', 'user.peas@yahoo.com', 1111111111, 'user', 'vEiDTau2j3Ba47mg6iWh1HdhnV9Y8J4v9lauh+MV8Y4=', 'User', 'Inactive', 'src/images/userphotos/braindeadM.png');

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
  MODIFY `i_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_products`
--
ALTER TABLE `tbl_products`
  MODIFY `p_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tbl_sales`
--
ALTER TABLE `tbl_sales`
  MODIFY `s_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

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
