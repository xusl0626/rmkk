/*
Navicat MySQL Data Transfer

Source Server         : localdb
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : rmkk

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2016-09-22 16:50:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `agency`
-- ----------------------------
DROP TABLE IF EXISTS `agency`;
CREATE TABLE `agency` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '机构名',
  `phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `supervisor_id` int(11) DEFAULT NULL COMMENT '上属机构ID',
  PRIMARY KEY (`id`),
  KEY `FKagency01` (`supervisor_id`),
  CONSTRAINT `FKagency01` FOREIGN KEY (`supervisor_id`) REFERENCES `agency` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of agency
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(50) NOT NULL COMMENT '角色',
  `func` varchar(50) NOT NULL COMMENT '功能',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '科员', '申请用印');
INSERT INTO `role` VALUES ('2', '科长', '初审');
INSERT INTO `role` VALUES ('3', '行长', '终审');
INSERT INTO `role` VALUES ('4', '用印管理员', '用印');
INSERT INTO `role` VALUES ('5', '系统管理员', '管理');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  `name` varchar(50) NOT NULL COMMENT '姓名',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `code` varchar(10) NOT NULL COMMENT '工号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `img` varchar(50) DEFAULT NULL COMMENT '头像',
  `cerate_date` date DEFAULT NULL COMMENT '创建日期',
  `department_id` int(11) DEFAULT NULL COMMENT '所属部门ID',
  PRIMARY KEY (`id`),
  KEY `FK_user_role` (`role_id`),
  KEY `fkuser02` (`department_id`),
  CONSTRAINT `fkuser02` FOREIGN KEY (`department_id`) REFERENCES `agency` (`id`),
  CONSTRAINT `FK_user_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', null, 'awei', '12', '', null, null, null, null, null);

-- ----------------------------
-- Table structure for `work`
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work` (
  `id` int(11) NOT NULL,
  `agency_id` int(11) NOT NULL COMMENT '所属机构',
  `create_userid` int(11) NOT NULL COMMENT '创建用户',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `over_time` datetime DEFAULT NULL COMMENT '完结时间',
  `init_file` varchar(50) DEFAULT NULL COMMENT '初始文件',
  `final_file` varchar(50) DEFAULT NULL COMMENT '完结文件',
  `status` int(11) DEFAULT NULL COMMENT '当前状态',
  `review_userid` int(11) DEFAULT NULL COMMENT '审核人ID',
  `opinion` text COMMENT '审核意见',
  `is_important` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否重要',
  PRIMARY KEY (`id`),
  KEY `fkwork01` (`create_userid`),
  KEY `fkwork02` (`agency_id`),
  KEY `fkwork03` (`status`),
  KEY `fkwork04` (`review_userid`),
  CONSTRAINT `fkwork01` FOREIGN KEY (`create_userid`) REFERENCES `user` (`id`),
  CONSTRAINT `fkwork02` FOREIGN KEY (`agency_id`) REFERENCES `agency` (`id`),
  CONSTRAINT `fkwork03` FOREIGN KEY (`status`) REFERENCES `workstatus` (`id`),
  CONSTRAINT `fkwork04` FOREIGN KEY (`review_userid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of work
-- ----------------------------

-- ----------------------------
-- Table structure for `workstatus`
-- ----------------------------
DROP TABLE IF EXISTS `workstatus`;
CREATE TABLE `workstatus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) NOT NULL COMMENT '状态描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of workstatus
-- ----------------------------
INSERT INTO `workstatus` VALUES ('1', '初审');
INSERT INTO `workstatus` VALUES ('2', '终审');
INSERT INTO `workstatus` VALUES ('3', '完结');
INSERT INTO `workstatus` VALUES ('4', '驳回');
