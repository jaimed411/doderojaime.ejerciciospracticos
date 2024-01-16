-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-01-2024 a las 15:11:52
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `torneo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `id` bigint(20) NOT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `entrenador` varchar(255) DEFAULT NULL,
  `NOMBRE_EQUIPO` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`id`, `ciudad`, `entrenador`, `NOMBRE_EQUIPO`) VALUES
(1, 'madrid', 'Pablo Laso', 'Real Madrid'),
(2, 'Barcelona', 'Sarunas Jasikevicius', 'FC Barcelona'),
(3, 'Vitoria-Gasteiz', 'Dusko Ivanovic', 'Kirolbet Baskonia'),
(4, 'Valencia', 'Jaume Ponsarnau', 'Valencia Basket'),
(5, 'Malaga', 'Fotis Katsikaris', 'Unicaja Malaga'),
(6, 'Las Palmas de Gran Canaria', 'Porfirio Fisac', 'Herbalife Gran Canaria'),
(7, 'Badalona', 'Carles Duran', 'Joventut Badalona'),
(8, 'Murcia', 'Sito Alonso', 'UCAM Murcia'),
(9, 'Santa Cruz de Tenerife', 'Txus Vidorreta', 'Iberostar Tenerife'),
(10, 'Burgos', 'Joan PeÃ±arroya', 'San Pablo Burgos');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
