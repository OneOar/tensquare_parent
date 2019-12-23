/*
Navicat MySQL Data Transfer

Source Server         : Local
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : tensquare_recruit

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-12-23 09:42:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_enterprise
-- ----------------------------
DROP TABLE IF EXISTS `tb_enterprise`;
CREATE TABLE `tb_enterprise` (
  `id` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `summary` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `address` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `labels` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `coordinate` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `ishot` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `logo` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `jobcount` int(11) DEFAULT NULL,
  `url` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of tb_enterprise
-- ----------------------------
INSERT INTO `tb_enterprise` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `tb_enterprise` VALUES ('2', '2', '2', '2', '2', '2', '0', '2', '2', '2');

-- ----------------------------
-- Table structure for tb_recruit
-- ----------------------------
DROP TABLE IF EXISTS `tb_recruit`;
CREATE TABLE `tb_recruit` (
  `id` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `jobname` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `salary` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `condition` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `education` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `type` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `address` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `eid` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `state` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `url` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `label` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `content1` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `content2` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of tb_recruit
-- ----------------------------
INSERT INTO `tb_recruit` VALUES ('1', '1', '1', '1', null, null, null, null, '2019-12-16 09:03:22', '1', null, null, null, null);
INSERT INTO `tb_recruit` VALUES ('2', '2', null, null, null, null, null, null, '2019-12-04 09:03:34', '1', null, null, null, null);
INSERT INTO `tb_recruit` VALUES ('3', '3', null, null, null, null, null, null, '2019-12-27 09:03:44', '2', null, null, null, null);
INSERT INTO `tb_recruit` VALUES ('4', '4', null, null, null, null, null, null, '2019-12-29 09:03:58', '0', null, null, null, null);
INSERT INTO `tb_recruit` VALUES ('5', '5', null, null, null, null, null, null, '2019-12-08 09:04:09', '0', null, null, null, null);
INSERT INTO `tb_recruit` VALUES ('6', '6', null, null, null, null, null, null, '2019-11-25 09:04:21', '1', null, null, null, null);
INSERT INTO `tb_recruit` VALUES ('7', '7', null, null, null, null, null, null, '2019-12-28 09:04:34', '1', null, null, null, null);
