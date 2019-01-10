-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 10, 2019 lúc 04:36 AM
-- Phiên bản máy phục vụ: 10.1.37-MariaDB
-- Phiên bản PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `nhanvien`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manv` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `hotendem` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ten` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ngaysinh` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `noisinh` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`manv`, `hotendem`, `ten`, `ngaysinh`, `noisinh`) VALUES
('1', 'dsa', 'sdsdsdfff', '27/11/1997', 'dssdsf'),
('12', 'dsds', 'dsa', 'null', 'dsada'),
('1212', 'khanh', 'sdasd', 'null', 'sdasd das'),
('12123', 'q?sa', 'dsad', 'null', 'dsdw'),
('122', 'sd', 'dsds', 'null', 'dsda'),
('12213123', '?âs', 'sdasd', 'null', 'sd'),
('8888', 'dcs', 'sdas', 'null', 'sdasd'),
('999', 'dsad', 'dasd', 'null', 'dasdasdsd');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`manv`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
