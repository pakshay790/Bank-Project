-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2018 at 08:37 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `account_no` int(11) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `mobile_no` varchar(12) NOT NULL,
  `address` text NOT NULL,
  `adhar_no` varchar(12) NOT NULL,
  `pan_card_no` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `account_type` varchar(20) NOT NULL,
  `user_image_url` text NOT NULL,
  `user_sign_image_url` text NOT NULL,
  `balance` decimal(11,2) NOT NULL DEFAULT '0.00',
  `value` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`account_no`, `full_name`, `mobile_no`, `address`, `adhar_no`, `pan_card_no`, `gender`, `account_type`, `user_image_url`, `user_sign_image_url`, `balance`, `value`) VALUES
(33, 'rohan shinge', '9586586625', 'Vitthalvadi', '112233445566', 'GJDJV12345', 'Male', 'Saving', './storedImages/acc_no-1-image-1520581256299.jpeg', './storedImages/acc_no-1-image-1520581256703.jpeg', '0.00', 1),
(34, 'Rop Ali Munshi', '9896855945', 'Ulhasnagar-420113	', '225645565552', 'FNDVD12345', 'Male', 'Current', './storedImages/acc_no-34-image-1520581388962.jpeg', './storedImages/acc_no-34-image-1520581389338.jpeg', '1000.00', 0),
(36, 'Suhas Dayare', '9896455525', 'Neral	', '556644556655', 'JDHFH12345', 'Male', 'Current', './storedImages/acc_no-35-image-1520581515171.jpeg', './storedImages/acc_no-35-image-1520581515411.jpeg', '2000.00', 0),
(37, 'jyoti patil', '9096012588', 'ulhasnagar	', '556644778899', 'SDGFD1234F', 'Female', 'Saving', './storedImages/acc_no-37-image-1522488090154.jpeg', './storedImages/acc_no-37-image-1522488090724.jpeg', '2000.00', 0),
(38, 'Arman Sidhique', '8989998564', 'Ulhasnagar-4	', '897898741236', 'DJJFV1334M', 'Male', 'Saving', './storedImages/acc_no-38-image-1523336586623.jpeg', './storedImages/acc_no-38-image-1523336637320.jpeg', '0.00', 1);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `designation` varchar(255) NOT NULL,
  `mobile_no` varchar(200) NOT NULL,
  `email` varchar(255) NOT NULL,
  `salary` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `name`, `surname`, `designation`, `mobile_no`, `email`, `salary`) VALUES
(3, 'Rohan', 'Shinge', 'Database Administrator', '8547598625', 'rohanshinge98@gmail.com', '25000'),
(4, 'Suhas', 'Dayre', 'IT Manager', '8877986544', 'suhasdayare@gmail.com', '80000');

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `id` int(11) NOT NULL,
  `account_no` int(11) NOT NULL,
  `type` varchar(255) NOT NULL,
  `amount` varchar(255) NOT NULL,
  `date_time` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`id`, `account_no`, `type`, `amount`, `date_time`) VALUES
(26, 33, 'Deposite', '2000', 'Fri Mar 09 13:10:57 IST 2018'),
(27, 34, 'Deposite', '2000', 'Fri Mar 09 13:13:09 IST 2018'),
(28, 33, 'deposit', '150', 'Fri Mar 09 13:13:35 IST 2018'),
(29, 34, 'Withdraw', '1000.0', 'Fri Mar 09 13:13:45 IST 2018'),
(30, 35, 'Deposite', '2000', 'Fri Mar 09 13:15:05 IST 2018'),
(31, 35, 'Deposite', '2000', 'Fri Mar 09 13:15:15 IST 2018'),
(32, 37, 'Deposite', '2000', 'Sat Mar 31 14:51:31 IST 2018'),
(33, 38, 'Deposite', '1000', 'Tue Apr 10 10:33:07 IST 2018');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` text NOT NULL,
  `access_level` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `full_name`, `username`, `password`, `access_level`) VALUES
(1, 'admin', 'admin', '$31$16$ZfLdqFVxyMYLvaK1-JB-2uIQOsg87q-45zy62NUK12I', 'admin'),
(5, '12345', '12345', '$31$16$Dj45cKyhnIW_fj3YdSdRVxZAcpdik15KLikzP-6jC5A', 'user'),
(11, 'akshay patil', 'pakshay', '$31$16$-uMeJdTbJEwLWcRbKtJ-pxoln2hfnzOmVIy01-Ubyhc', 'user'),
(18, 'ad', 'da', '$31$16$cdVxWKzRPasFdDK1h2GuAxTx8zSAUchnm74obLEZYho', 'user'),
(19, 'shlok', 'shlok1234', '$31$16$elQ5QWzSOp1-wROQW01Tqk10kBcC0RM-o0pmshT_D9s', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`account_no`),
  ADD UNIQUE KEY `mobile_no` (`mobile_no`),
  ADD UNIQUE KEY `adhar_no` (`adhar_no`),
  ADD UNIQUE KEY `pan_card_no` (`pan_card_no`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `accounts`
--
ALTER TABLE `accounts`
  MODIFY `account_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
