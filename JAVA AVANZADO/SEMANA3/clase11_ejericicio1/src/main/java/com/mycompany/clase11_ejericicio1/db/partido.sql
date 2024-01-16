-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-01-2024 a las 15:12:16
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
-- Estructura de tabla para la tabla `partido`
--

CREATE TABLE `partido` (
  `id` bigint(20) NOT NULL,
  `fecha` date DEFAULT NULL,
  `resultadoEquipoLocal` int(11) NOT NULL,
  `resultadoEquipoVisitante` int(11) NOT NULL,
  `equipoLocal_id` bigint(20) DEFAULT NULL,
  `equipoVisitante_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `partido`
--

INSERT INTO `partido` (`id`, `fecha`, `resultadoEquipoLocal`, `resultadoEquipoVisitante`, `equipoLocal_id`, `equipoVisitante_id`) VALUES
(1, '2024-10-10', 63, 63, 1, 7),
(2, '2024-05-05', 63, 86, 1, 7),
(3, '2024-02-02', 92, 89, 1, 2),
(4, '2024-02-15', 78, 72, 3, 4),
(5, '2024-02-22', 87, 80, 5, 6),
(6, '2024-03-05', 96, 88, 7, 8),
(7, '2024-03-15', 82, 79, 9, 10);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `partido`
--
ALTER TABLE `partido`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKggqpg1vqw5q00dncm8yvxmrpn` (`equipoLocal_id`),
  ADD KEY `FK949c7t9xaibl03gm43084725i` (`equipoVisitante_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `partido`
--
ALTER TABLE `partido`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `partido`
--
ALTER TABLE `partido`
  ADD CONSTRAINT `FK949c7t9xaibl03gm43084725i` FOREIGN KEY (`equipoVisitante_id`) REFERENCES `equipo` (`id`),
  ADD CONSTRAINT `FKggqpg1vqw5q00dncm8yvxmrpn` FOREIGN KEY (`equipoLocal_id`) REFERENCES `equipo` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
