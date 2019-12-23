/*
Navicat MySQL Data Transfer

Source Server         : Local
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : tensquare_qa

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-12-23 09:41:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_pl
-- ----------------------------
DROP TABLE IF EXISTS `tb_pl`;
CREATE TABLE `tb_pl` (
  `problemid` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `labelid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`problemid`,`labelid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of tb_pl
-- ----------------------------
INSERT INTO `tb_pl` VALUES ('1', '1');
INSERT INTO `tb_pl` VALUES ('2', '1');
INSERT INTO `tb_pl` VALUES ('3', '1');
INSERT INTO `tb_pl` VALUES ('4', '1');

-- ----------------------------
-- Table structure for tb_problem
-- ----------------------------
DROP TABLE IF EXISTS `tb_problem`;
CREATE TABLE `tb_problem` (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `content` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  `userid` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nickname` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `visits` int(11) DEFAULT NULL,
  `thumbup` int(11) DEFAULT NULL,
  `reply` int(11) DEFAULT NULL,
  `solve` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `replyname` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `replytime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of tb_problem
-- ----------------------------
INSERT INTO `tb_problem` VALUES ('1', null, null, null, null, null, null, null, null, '6', null, null, '2019-12-16 10:08:44');
INSERT INTO `tb_problem` VALUES ('1207246505975615488', 'JAVA', 'JAVA很好哦', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_problem` VALUES ('2', null, null, null, null, null, null, null, null, '11', null, null, '2019-12-15 10:09:03');
INSERT INTO `tb_problem` VALUES ('3', null, null, '2019-12-16 10:13:37', null, null, null, null, null, '0', null, null, null);
INSERT INTO `tb_problem` VALUES ('4', null, null, '2019-12-09 10:13:40', null, null, null, null, null, '0', null, null, null);

-- ----------------------------
-- Table structure for tb_reply
-- ----------------------------
DROP TABLE IF EXISTS `tb_reply`;
CREATE TABLE `tb_reply` (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `problemid` varchar(11) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `content` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  `userid` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nickname` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of tb_reply
-- ----------------------------
