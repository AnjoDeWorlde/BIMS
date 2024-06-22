-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2024 at 02:42 PM
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
(1, 1, '2024-06-14', 50, 30, 0, 'Available'),
(2, 2, '2024-06-14', 25, 9, 0, 'Available'),
(3, 3, '2024-06-14', 30, 9, 0, 'Available'),
(4, 4, '2024-06-16', 60, 28, 3, 'Available'),
(5, 7, '2024-06-18', 10, 3, 0, 'Available'),
(6, 5, '2024-06-18', 40, 10, 0, 'Available');

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
-- Table structure for table `tbl_orders`
--

CREATE TABLE `tbl_orders` (
  `o_id` int(20) NOT NULL,
  `p_id` int(20) NOT NULL,
  `i_id` int(20) NOT NULL,
  `u_id` int(20) NOT NULL,
  `o_date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `o_discount` decimal(20,0) NOT NULL,
  `o_totalamount` decimal(20,0) NOT NULL,
  `o_change` decimal(20,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
(1, 'Coke 8oz', 24.00, 180.00, 'Active', 'src/images/productphotos/8oz_coke.png'),
(2, 'Royal 8oz', 24.00, 180.00, 'Active', 'src/images/productphotos/8oz_royal.png'),
(3, 'Sprite 8oz', 24.00, 180.00, 'Active', 'src/images/productphotos/8oz_sprite.png'),
(4, 'Red Horse Litro', 6.00, 585.00, 'Active', 'src/images/productphotos/redhorse_litro.png'),
(5, 'Grande Pale Pilsen', 6.00, 560.00, 'Active', 'src/images/productphotos/pale_pilsen_SM.png'),
(6, 'Coke Mismo', 12.00, 290.00, 'Active', 'src/images/productphotos/coke_mismo.png'),
(7, 'Smirnoff', 24.00, 350.00, 'Active', 'src/images/productphotos/smirnoff_mule.png'),
(8, 'VitaMilk Banana', 24.00, 500.00, 'Active', 'src/images/productphotos/vitamilk_banana.png');

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
(1, 1, 1, 5400.00, 0.00, 5400.00, 'Available'),
(2, 2, 2, 1620.00, 0.00, 1620.00, 'Available'),
(3, 3, 3, 1620.00, 0.00, 1620.00, 'Available'),
(4, 4, 4, 16380.00, 1755.00, 14625.00, 'Available'),
(5, 7, 5, 1050.00, 0.00, 1050.00, 'Available'),
(6, 5, 6, 5600.00, 0.00, 5600.00, 'Available');

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
(1, 'Admin', 'Commander', 'admin.123@gmail.com', 9999999999, 'admin', 'QeVlP8euuJQCbWu3stt/ZZArRUlF+o/WWmMnBHtSd/s=', 'Admin', 'Active', 'src/images/userphotos/superB.png'),
(2, 'User', 'Peasant', 'user.peas@gmail.com', 1111111111, 'user', '14XWNRGmRaJIdaEJ4O8dplYN2U0Um2c0lJqWVWyzRJ8=', 'User', 'Active', 'src/images/userphotos/braindeadF.png'),
(3, 'Vince', 'Bacarisas', 'v_baca@gmail.com', 9874581299, 'vince', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'User', 'Inactive', 'src/images/userphotos/braindeadB.png'),
(4, 'Krystel', 'Abogada', 'k.ganda@gmail.com', 9488981654, '12346789', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'User', 'Inactive', 'src/images/userphotos/starF.png'),
(5, 'Steve', 'Jobs', 's.trabaho@gmail.com', 4049875878, 'sboj', '4VGDjm3qHD1cozGiMFuXW9I6O8m3ZEhZAiNQQ1q9YN8=', 'User', 'Active', 'src/images/userphotos/starB.png'),
(6, 'Jake', 'Peralta', 'titleofyoursextape@gmail.com', 9785187159, 'bestdad-n-detective', 'uSNUIfqmkrDMOMHPzaX9pzHt3dLcVB7QUlNzwNxVOQA=', 'User', 'Inactive', 'src/images/userphotos/starM.png'),
(7, 'Jafaith', 'Otlang', 'okslang.sana@gmail.com', 9158521582, 'anak-n-Moreno', 'QztOO475NNXeG/RFlOe/LF2uaGTK3WuK/cRRnkyLwVQ=', 'User', 'Active', 'src/images/userphotos/braindeadM.png'),
(8, 'Aiah', 'Arceta', 'bisayanibai@gmail.com', 9874598756, 'handangsaluhinkamuli', '274+oN29s51DsXfsZsWOCDFY1KAi2UhM8dWIhaFOwoQ=', 'User', 'Active', 'src/images/userphotos/superF.png'),
(9, 'James', 'Bond', 'doubleagent700@gmail.com', 7007009514, 'bangbangbang', '3X7BGNnG+vZD2fJUcdH7xuXH9yh7rmOkBmsVROCPOpM=', 'User', 'Active', 'src/images/userphotos/superM.png');

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
-- Indexes for table `tbl_orders`
--
ALTER TABLE `tbl_orders`
  ADD PRIMARY KEY (`o_id`),
  ADD KEY `i_id` (`i_id`),
  ADD KEY `p_id` (`p_id`),
  ADD KEY `u_id` (`u_id`);

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
  MODIFY `i_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_orders`
--
ALTER TABLE `tbl_orders`
  MODIFY `o_id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_products`
--
ALTER TABLE `tbl_products`
  MODIFY `p_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbl_sales`
--
ALTER TABLE `tbl_sales`
  MODIFY `s_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_inventory`
--
ALTER TABLE `tbl_inventory`
  ADD CONSTRAINT `tbl_inventory_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `tbl_products` (`p_id`);

--
-- Constraints for table `tbl_orders`
--
ALTER TABLE `tbl_orders`
  ADD CONSTRAINT `tbl_orders_ibfk_1` FOREIGN KEY (`i_id`) REFERENCES `tbl_inventory` (`i_id`),
  ADD CONSTRAINT `tbl_orders_ibfk_2` FOREIGN KEY (`p_id`) REFERENCES `tbl_products` (`p_id`),
  ADD CONSTRAINT `tbl_orders_ibfk_3` FOREIGN KEY (`u_id`) REFERENCES `tbl_user` (`u_id`);

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
