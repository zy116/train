/*
 Navicat Premium Data Transfer

 Source Server         : zy116
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : springcloud_rbac

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 29/07/2020 10:44:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission`  (
  `pid` int(20) NOT NULL COMMENT '主键',
  `pname` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源名称',
  `purl` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '访问url地址',
  `pavailable` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  `pcreate_time` datetime(4) NULL DEFAULT NULL,
  `pupdate_time` datetime(4) NULL DEFAULT NULL,
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES (1, '商品新增', '/item/add.action', '1', '2020-07-28 10:49:44.0000', '2020-07-28 10:49:47.0000');
INSERT INTO `sys_permission` VALUES (2, '商品修改', '/item/editItem.action', '1', '2020-07-28 10:49:49.0000', '2020-07-28 10:49:52.0000');
INSERT INTO `sys_permission` VALUES (3, '商品删除', '', '1', '2020-07-28 10:50:05.0000', '2020-07-28 10:50:07.0000');
INSERT INTO `sys_permission` VALUES (4, '商品查询', '/item/queryItem.action', '1', '2020-07-28 10:50:09.0000', '2020-07-28 10:50:11.0000');
INSERT INTO `sys_permission` VALUES (5, '用户查询', '/user/query.action', '1', '2020-07-28 10:50:13.0000', '2020-07-28 10:50:16.0000');
INSERT INTO `sys_permission` VALUES (6, '用户新增', '', '1', '2020-07-28 10:50:18.0000', '2020-07-28 10:50:20.0000');
INSERT INTO `sys_permission` VALUES (7, '用户修改', '', '1', '2020-07-28 10:50:22.0000', '2020-07-28 10:50:24.0000');
INSERT INTO `sys_permission` VALUES (8, '用户删除', '', '1', '2020-07-28 10:50:26.0000', '2020-07-28 10:50:28.0000');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `rid` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `rname` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ravailable` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  `rcreate_time` datetime(4) NULL DEFAULT NULL,
  `rupdate_time` datetime(4) NULL DEFAULT NULL,
  PRIMARY KEY (`rid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('ebc8a441-c6f9-11e4-b137-0adc305c3f28', '商品管理员', '1', '2020-07-28 10:17:21.0000', '2020-07-28 10:17:26.0000');
INSERT INTO `sys_role` VALUES ('ebc9d647-c6f9-11e4-b137-0adc305c3f28', '用户管理员', '1', '2020-07-28 10:17:28.0000', '2020-07-28 10:17:31.0000');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission`  (
  `srpid` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `srp_role_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色id',
  `srp_permission_id` int(20) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`srpid`) USING BTREE,
  INDEX `role_fk`(`srp_role_id`) USING BTREE,
  INDEX `permission_fk`(`srp_permission_id`) USING BTREE,
  CONSTRAINT `permission_fk` FOREIGN KEY (`srp_permission_id`) REFERENCES `sys_permission` (`pid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `role_fk` FOREIGN KEY (`srp_role_id`) REFERENCES `sys_role` (`rid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('1', 'ebc8a441-c6f9-11e4-b137-0adc305c3f28', 1);
INSERT INTO `sys_role_permission` VALUES ('10', 'ebc9d647-c6f9-11e4-b137-0adc305c3f28', 2);
INSERT INTO `sys_role_permission` VALUES ('11', 'ebc9d647-c6f9-11e4-b137-0adc305c3f28', 3);
INSERT INTO `sys_role_permission` VALUES ('12', 'ebc9d647-c6f9-11e4-b137-0adc305c3f28', 4);
INSERT INTO `sys_role_permission` VALUES ('2', 'ebc8a441-c6f9-11e4-b137-0adc305c3f28', 2);
INSERT INTO `sys_role_permission` VALUES ('3', 'ebc8a441-c6f9-11e4-b137-0adc305c3f28', 3);
INSERT INTO `sys_role_permission` VALUES ('4', 'ebc8a441-c6f9-11e4-b137-0adc305c3f28', 4);
INSERT INTO `sys_role_permission` VALUES ('5', 'ebc9d647-c6f9-11e4-b137-0adc305c3f28', 5);
INSERT INTO `sys_role_permission` VALUES ('6', 'ebc9d647-c6f9-11e4-b137-0adc305c3f28', 6);
INSERT INTO `sys_role_permission` VALUES ('7', 'ebc9d647-c6f9-11e4-b137-0adc305c3f28', 7);
INSERT INTO `sys_role_permission` VALUES ('8', 'ebc9d647-c6f9-11e4-b137-0adc305c3f28', 8);
INSERT INTO `sys_role_permission` VALUES ('9', 'ebc9d647-c6f9-11e4-b137-0adc305c3f28', 1);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `uid` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `usercode` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账号',
  `username` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `locked` int(1) NULL DEFAULT NULL COMMENT '账号是否锁定，1：锁定，0未锁定',
  `ucreate_time` datetime(4) NULL DEFAULT NULL,
  `uupdate_time` datetime(4) NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('lisi', 'zouyou', '李四', '123456', 0, '2020-07-28 10:18:00.0000', '2020-07-28 10:18:02.0000');
INSERT INTO `sys_user` VALUES ('zhangsan', 'xiaozheng', '张三', '123456', 0, '2020-07-28 10:18:06.0000', '2020-07-28 10:18:07.0000');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`  (
  `urid` int(4) NOT NULL,
  `ur_user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ur_role_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`urid`) USING BTREE,
  INDEX `user_fk`(`ur_user_id`) USING BTREE,
  INDEX `user_role_fk`(`ur_role_id`) USING BTREE,
  CONSTRAINT `user_fk` FOREIGN KEY (`ur_user_id`) REFERENCES `sys_user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `user_role_fk` FOREIGN KEY (`ur_role_id`) REFERENCES `sys_role` (`rid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES (1, 'zhangsan', 'ebc8a441-c6f9-11e4-b137-0adc305c3f28');
INSERT INTO `sys_user_role` VALUES (2, 'lisi', 'ebc9d647-c6f9-11e4-b137-0adc305c3f28');

SET FOREIGN_KEY_CHECKS = 1;
