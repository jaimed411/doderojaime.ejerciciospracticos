-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-01-2024 a las 16:53:34
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
-- Base de datos: `votosjsp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `voto`
--

CREATE TABLE `voto` (
  `ID` bigint(20) NOT NULL,
  `CANTIDAD_VOTOS` int(11) DEFAULT NULL,
  `NOMBRE_PARTIDO` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `voto`
--

INSERT INTO `voto` (`ID`, `CANTIDAD_VOTOS`, `NOMBRE_PARTIDO`) VALUES
(68, 0, 'Partido A'),
(69, 0, 'Partido A'),
(70, 0, 'Partido B'),
(71, 0, 'Partido C'),
(72, 0, 'Partido C'),
(73, 0, 'Partido C'),
(74, 0, 'Partido C'),
(75, 0, 'Partido C'),
(76, 0, 'Partido C'),
(77, 0, 'Partido C'),
(78, 0, 'Partido A'),
(79, 0, 'Partido B'),
(80, 0, 'Partido B'),
(81, 0, 'Partido A'),
(82, 0, 'Partido C'),
(83, 0, 'Partido B'),
(84, 0, 'Partido B'),
(85, 0, 'Partido B'),
(86, 0, 'Partido B'),
(87, 0, 'Partido B'),
(88, 0, 'Partido B'),
(89, 0, 'Partido B'),
(90, 0, 'Partido C'),
(91, 0, 'Partido A'),
(92, 0, 'Partido A'),
(93, 0, 'Partido A'),
(94, 0, 'Partido C'),
(95, 0, 'Partido C'),
(96, 0, 'Partido C'),
(97, 0, 'Partido C'),
(98, 0, 'Partido C'),
(99, 0, 'Partido C'),
(100, 0, 'Partido C');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `voto`
--
ALTER TABLE `voto`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `voto`
--
ALTER TABLE `voto`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
