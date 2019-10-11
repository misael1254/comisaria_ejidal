/*
 Navicat Premium Data Transfer

 Source Server         : Mariadb
 Source Server Type    : MariaDB
 Source Server Version : 100136
 Source Host           : localhost:3306
 Source Schema         : comisaria

 Target Server Type    : MariaDB
 Target Server Version : 100136
 File Encoding         : 65001

 Date: 01/10/2019 20:39:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bitacora
-- ----------------------------
DROP TABLE IF EXISTS `bitacora`;
CREATE TABLE `bitacora`  (
  `usuario` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ip` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `tabla` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `accion` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `datos_anteriores` varchar(300) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `datos_nuevos` varchar(300) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `hora_fecha` datetime(0) NOT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bitacora
-- ----------------------------
INSERT INTO `bitacora` VALUES ('misael/misael-urzua', '192.168.1.65', 'USUARIO', 'Inicio de sesión', '', '', '2019-10-01 15:31:59');
INSERT INTO `bitacora` VALUES ('misael/misael-urzua', '192.168.1.65', 'USUARIO', 'Inicio de sesión', '', '', '2019-10-01 20:38:41');
INSERT INTO `bitacora` VALUES ('misael/misael-urzua', '192.168.1.65', 'USUARIO', 'Inicio de sesión', '', '', '2019-10-01 20:38:56');

-- ----------------------------
-- Table structure for cedientes
-- ----------------------------
DROP TABLE IF EXISTS `cedientes`;
CREATE TABLE `cedientes`  (
  `id_cediente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_cede` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ap_pat_cede` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ap_mat_cede` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`id_cediente`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of cedientes
-- ----------------------------
INSERT INTO `cedientes` VALUES (1, 'adrian', 'urzua', 'benitez');

-- ----------------------------
-- Table structure for com_eji_autoriza
-- ----------------------------
DROP TABLE IF EXISTS `com_eji_autoriza`;
CREATE TABLE `com_eji_autoriza`  (
  `id_miembro_ejidal` int(11) NOT NULL,
  `no_folio` int(11) NOT NULL,
  INDEX `com_eji_autoriza_ibfk_1`(`id_miembro_ejidal`) USING BTREE,
  INDEX `com_eji_autoriza_ibfk_2`(`no_folio`) USING BTREE,
  CONSTRAINT `com_eji_autoriza_ibfk_1` FOREIGN KEY (`id_miembro_ejidal`) REFERENCES `miembros_comisariado_ejidal` (`id_miembro_ejidal`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `com_eji_autoriza_ibfk_2` FOREIGN KEY (`no_folio`) REFERENCES `constancias` (`no_folio`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of com_eji_autoriza
-- ----------------------------
INSERT INTO `com_eji_autoriza` VALUES (1, 1);
INSERT INTO `com_eji_autoriza` VALUES (2, 1);
INSERT INTO `com_eji_autoriza` VALUES (3, 1);

-- ----------------------------
-- Table structure for con_vig_autoriza
-- ----------------------------
DROP TABLE IF EXISTS `con_vig_autoriza`;
CREATE TABLE `con_vig_autoriza`  (
  `id_miembro_vigilancia` int(11) NOT NULL,
  `no_folio` int(11) NOT NULL,
  INDEX `con_vig_autoriza_ibfk_1`(`id_miembro_vigilancia`) USING BTREE,
  INDEX `con_vig_autoriza_ibfk_2`(`no_folio`) USING BTREE,
  CONSTRAINT `con_vig_autoriza_ibfk_1` FOREIGN KEY (`id_miembro_vigilancia`) REFERENCES `miembros_consejo_vigilancia` (`id_miembro_vigilancia`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `con_vig_autoriza_ibfk_2` FOREIGN KEY (`no_folio`) REFERENCES `constancias` (`no_folio`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of con_vig_autoriza
-- ----------------------------
INSERT INTO `con_vig_autoriza` VALUES (1, 1);
INSERT INTO `con_vig_autoriza` VALUES (2, 1);
INSERT INTO `con_vig_autoriza` VALUES (3, 1);

-- ----------------------------
-- Table structure for constancias
-- ----------------------------
DROP TABLE IF EXISTS `constancias`;
CREATE TABLE `constancias`  (
  `no_folio` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_expedicion` date NULL DEFAULT NULL,
  `id_terreno` int(11) NOT NULL,
  `id_cediente` int(11) NOT NULL,
  `nota` text CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `croquis` longblob NULL,
  PRIMARY KEY (`no_folio`) USING BTREE,
  INDEX `id_terreno`(`id_terreno`) USING BTREE,
  INDEX `id_cediente`(`id_cediente`) USING BTREE,
  CONSTRAINT `constancias_ibfk_1` FOREIGN KEY (`id_terreno`) REFERENCES `terrenos` (`id_terreno`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `constancias_ibfk_2` FOREIGN KEY (`id_cediente`) REFERENCES `cedientes` (`id_cediente`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of constancias
-- ----------------------------
INSERT INTO `constancias` VALUES (1, '2019-09-23', 1, 1, '', NULL);

-- ----------------------------
-- Table structure for constancias_propietario
-- ----------------------------
DROP TABLE IF EXISTS `constancias_propietario`;
CREATE TABLE `constancias_propietario`  (
  `id_propietario` int(11) NOT NULL,
  `no_folio` int(11) NOT NULL,
  INDEX `constancias_propietario_ibfk_1`(`no_folio`) USING BTREE,
  INDEX `constancias_propietario_ibfk_2`(`id_propietario`) USING BTREE,
  CONSTRAINT `constancias_propietario_ibfk_1` FOREIGN KEY (`no_folio`) REFERENCES `constancias` (`no_folio`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `constancias_propietario_ibfk_2` FOREIGN KEY (`id_propietario`) REFERENCES `propietarios` (`id_propietario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of constancias_propietario
-- ----------------------------
INSERT INTO `constancias_propietario` VALUES (1, 1);

-- ----------------------------
-- Table structure for miembros_comisariado_ejidal
-- ----------------------------
DROP TABLE IF EXISTS `miembros_comisariado_ejidal`;
CREATE TABLE `miembros_comisariado_ejidal`  (
  `id_miembro_ejidal` int(11) NOT NULL AUTO_INCREMENT,
  `cargo_miembro` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nombre_eji` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ap_pat_eji` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ap_mat_eji` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`id_miembro_ejidal`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of miembros_comisariado_ejidal
-- ----------------------------
INSERT INTO `miembros_comisariado_ejidal` VALUES (1, 'PRESIDENTE', 'javier', 'ejemplo1', 'ejemplo1');
INSERT INTO `miembros_comisariado_ejidal` VALUES (2, 'SECRETARIO', 'david', 'ejemplo2', 'ejemplo2');
INSERT INTO `miembros_comisariado_ejidal` VALUES (3, 'TESORERO', 'gabriel', 'ejemplo3', 'ejemplo3');

-- ----------------------------
-- Table structure for miembros_consejo_vigilancia
-- ----------------------------
DROP TABLE IF EXISTS `miembros_consejo_vigilancia`;
CREATE TABLE `miembros_consejo_vigilancia`  (
  `id_miembro_vigilancia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_vigi` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ap_pat_vigi` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ap_mat_vigi` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `cargo_miembro` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`id_miembro_vigilancia`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of miembros_consejo_vigilancia
-- ----------------------------
INSERT INTO `miembros_consejo_vigilancia` VALUES (1, 'rosa', 'ejemplo1', 'ejemplo1', 'presidente');
INSERT INTO `miembros_consejo_vigilancia` VALUES (2, 'juan', 'ejemplo2', 'ejemplo2', 'secretario');
INSERT INTO `miembros_consejo_vigilancia` VALUES (3, 'gabriel', 'ejemplo3', 'ejemplo3', 'secretario');

-- ----------------------------
-- Table structure for propietarios
-- ----------------------------
DROP TABLE IF EXISTS `propietarios`;
CREATE TABLE `propietarios`  (
  `id_propietario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_prop` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ape_pat_prop` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ape_mat_prop` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `tel_prop` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT 'S/N',
  PRIMARY KEY (`id_propietario`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of propietarios
-- ----------------------------
INSERT INTO `propietarios` VALUES (1, 'misael', 'urzua', 'ramos', '7445872793');

-- ----------------------------
-- Table structure for terrenos
-- ----------------------------
DROP TABLE IF EXISTS `terrenos`;
CREATE TABLE `terrenos`  (
  `id_terreno` int(11) NOT NULL AUTO_INCREMENT,
  `ubicacion` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `tipo_terreno` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `med_N` float(11, 3) NULL DEFAULT NULL,
  `med_S` float(11, 3) NULL DEFAULT NULL,
  `med_E` float(11, 3) NULL DEFAULT NULL,
  `med_O` float(11, 3) NULL DEFAULT NULL,
  `med_NE` float(11, 3) NULL DEFAULT NULL,
  `med_NO` float(11, 3) NULL DEFAULT NULL,
  `med_SE` float(11, 3) NULL DEFAULT NULL,
  `med_SO` float(11, 3) NULL DEFAULT NULL,
  `col_N` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `col_S` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `col_E` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `col_O` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `col_NE` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `col_NO` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `col_SE` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `col_SO` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id_terreno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of terrenos
-- ----------------------------
INSERT INTO `terrenos` VALUES (1, 'ejido viejo', 'lote', 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, '1', '1', '1', '1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for terrenos_de_propietario
-- ----------------------------
DROP TABLE IF EXISTS `terrenos_de_propietario`;
CREATE TABLE `terrenos_de_propietario`  (
  `id_propietario` int(11) NOT NULL,
  `id_terreno` int(11) NOT NULL,
  INDEX `terrenos_de_propietario_ibfk_1`(`id_propietario`) USING BTREE,
  INDEX `terrenos_de_propietario_ibfk_2`(`id_terreno`) USING BTREE,
  CONSTRAINT `terrenos_de_propietario_ibfk_1` FOREIGN KEY (`id_propietario`) REFERENCES `propietarios` (`id_propietario`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `terrenos_de_propietario_ibfk_2` FOREIGN KEY (`id_terreno`) REFERENCES `terrenos` (`id_terreno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of terrenos_de_propietario
-- ----------------------------
INSERT INTO `terrenos_de_propietario` VALUES (1, 1);

-- ----------------------------
-- Table structure for testigos
-- ----------------------------
DROP TABLE IF EXISTS `testigos`;
CREATE TABLE `testigos`  (
  `id_testigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_tes` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ap_pat_tes` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ap_mat_tes` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`id_testigo`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of testigos
-- ----------------------------
INSERT INTO `testigos` VALUES (1, 'larry edsel', 'urzua', 'ramos');
INSERT INTO `testigos` VALUES (2, 'teodora', 'ramos', 'solis');

-- ----------------------------
-- Table structure for testigos_participantes
-- ----------------------------
DROP TABLE IF EXISTS `testigos_participantes`;
CREATE TABLE `testigos_participantes`  (
  `id_testigo` int(11) NOT NULL,
  `no_folio` int(11) NOT NULL,
  INDEX `testigos_participantes_ibfk_1`(`id_testigo`) USING BTREE,
  INDEX `testigos_participantes_ibfk_2`(`no_folio`) USING BTREE,
  CONSTRAINT `testigos_participantes_ibfk_1` FOREIGN KEY (`id_testigo`) REFERENCES `testigos` (`id_testigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `testigos_participantes_ibfk_2` FOREIGN KEY (`no_folio`) REFERENCES `constancias` (`no_folio`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of testigos_participantes
-- ----------------------------
INSERT INTO `testigos_participantes` VALUES (1, 1);
INSERT INTO `testigos_participantes` VALUES (2, 1);

-- ----------------------------
-- Table structure for usuarios
-- ----------------------------
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios`  (
  `usuario` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `contraseña` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`usuario`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of usuarios
-- ----------------------------
INSERT INTO `usuarios` VALUES ('larry', '123');
INSERT INTO `usuarios` VALUES ('misael', '1111');

SET FOREIGN_KEY_CHECKS = 1;
