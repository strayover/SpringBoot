/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : mysql_demo

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-12-31 09:49:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `age` varchar(4) NOT NULL,
  `like` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '18', '编程IT');
INSERT INTO `user` VALUES ('6', '赵六', '26', '打台球');
INSERT INTO `user` VALUES ('4', '王五', '20', '敲代码');
INSERT INTO `user` VALUES ('9', '孙七', '23', '打乒乓球');
INSERT INTO `user` VALUES ('8', '孙七', '23', '打乒乓球');
