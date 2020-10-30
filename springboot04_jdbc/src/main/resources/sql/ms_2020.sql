/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : ms_2020

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 30/10/2020 10:44:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for m_user
-- ----------------------------
DROP TABLE IF EXISTS `m_user`;
CREATE TABLE `m_user`
(
    `id`   int                                                         NOT NULL AUTO_INCREMENT,
    `name` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
    `sex`  varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
    `age`  int                                                         NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 12
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_user
-- ----------------------------
INSERT INTO `m_user`
VALUES (1, '赵一', '男', 23);
INSERT INTO `m_user`
VALUES (2, '钱二', '女', 22);
INSERT INTO `m_user`
VALUES (3, '孙三', '男', 24);
INSERT INTO `m_user`
VALUES (4, '李四', '女', 21);
INSERT INTO `m_user`
VALUES (5, '周五', '男', 25);
INSERT INTO `m_user`
VALUES (6, '武六', '女', 16);
INSERT INTO `m_user`
VALUES (7, '郑七', '男', 27);
INSERT INTO `m_user`
VALUES (8, '王全', '女', 59);
INSERT INTO `m_user`
VALUES (9, '黄久', '男', 66);

SET FOREIGN_KEY_CHECKS = 1;
