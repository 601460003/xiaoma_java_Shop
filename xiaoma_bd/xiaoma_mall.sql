/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : xiaoma_mall

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2020-12-08 16:56:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for good
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `remark` varchar(200) DEFAULT NULL COMMENT '商品描述',
  `price` decimal(8,2) DEFAULT NULL,
  `image` varchar(200) DEFAULT NULL COMMENT '图片',
  `name_type` int DEFAULT NULL COMMENT '商品类型',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` tinyint DEFAULT NULL COMMENT '状态0：正常 1：删除',
  `create_user` int DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='商品';

-- ----------------------------
-- Records of good
-- ----------------------------
INSERT INTO `good` VALUES ('1', '7号电池', null, '2.50', '0604130130.jpg', '0', null, '0', '0');
INSERT INTO `good` VALUES ('2', '8号电池', null, '2.50', '0604130130.jpg', '0', null, '0', '0');
INSERT INTO `good` VALUES ('3', '6号电池', null, null, '-120541d23223010efd2e3673f826d13a.jpg', '0', null, '0', '0');
INSERT INTO `good` VALUES ('7', '8号电池', null, '2.50', '0604130130.jpg', '0', null, '0', '0');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `sex` tinyint DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `mobile` char(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `status` tinyint DEFAULT NULL,
  `create_user` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('14', '张志伟', '0', '', '13148528214', '2020-12-08 07:19:21', '0', '1');
INSERT INTO `member` VALUES ('15', '', '0', '', '', '2020-12-08 08:30:39', '0', '1');

-- ----------------------------
-- Table structure for shopping_car
-- ----------------------------
DROP TABLE IF EXISTS `shopping_car`;
CREATE TABLE `shopping_car` (
  `id` int NOT NULL AUTO_INCREMENT,
  `good_id` int DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `member_id` int DEFAULT NULL,
  `status` tinyint DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of shopping_car
-- ----------------------------
INSERT INTO `shopping_car` VALUES ('19', '1', '1', '14', '0', '2020-12-08 07:44:45', '1');
INSERT INTO `shopping_car` VALUES ('20', '1', '1', '14', '0', '2020-12-08 07:44:49', '1');
INSERT INTO `shopping_car` VALUES ('21', '2', '1', '14', '0', '2020-12-08 07:45:06', '1');
INSERT INTO `shopping_car` VALUES ('22', '3', '1', '14', '0', '2020-12-08 07:45:08', '1');
INSERT INTO `shopping_car` VALUES ('23', '7', '1', '14', '0', '2020-12-08 07:45:09', '1');

-- ----------------------------
-- Table structure for wallet
-- ----------------------------
DROP TABLE IF EXISTS `wallet`;
CREATE TABLE `wallet` (
  `id` int NOT NULL AUTO_INCREMENT,
  `member_id` int DEFAULT NULL,
  `money` decimal(8,2) DEFAULT NULL,
  `status` tinyint DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of wallet
-- ----------------------------
INSERT INTO `wallet` VALUES ('10', '14', '0.00', '0', '2020-12-08 07:19:21', '1');
INSERT INTO `wallet` VALUES ('11', '15', '0.00', '0', '2020-12-08 08:30:39', '1');

-- ----------------------------
-- Table structure for warehouse
-- ----------------------------
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse` (
  `id` int NOT NULL AUTO_INCREMENT,
  `good_id` int DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `status` tinyint DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of warehouse
-- ----------------------------
INSERT INTO `warehouse` VALUES ('1', '1', '11', '1', null, null);
INSERT INTO `warehouse` VALUES ('2', '2', '2', '0', '2020-12-08 03:02:31', '1');
INSERT INTO `warehouse` VALUES ('3', '3', '2', '0', '2020-12-08 03:02:35', '1');
INSERT INTO `warehouse` VALUES ('4', '7', '2', '0', '2020-12-08 03:02:36', '1');
INSERT INTO `warehouse` VALUES ('5', '11', '2', '0', '2020-12-08 03:02:37', '1');
