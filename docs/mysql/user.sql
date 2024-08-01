/*
 Navicat Premium Data Transfer

 Source Server         : mysql8-13306
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:13306
 Source Schema         : frame-demo

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 01/08/2024 16:44:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                        `user_id` varchar(9) DEFAULT NULL COMMENT '用户ID',
                        `user_nickname` varchar(32) DEFAULT NULL COMMENT '用户昵称',
                        `user_head` varchar(16) DEFAULT NULL COMMENT '用户头像',
                        `user_password` varchar(64) DEFAULT NULL COMMENT '用户密码',
                        `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                        `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`id`, `user_id`, `user_nickname`, `user_head`, `user_password`, `create_time`, `update_time`) VALUES (7, 'khi92', 'Kojima Hina', 'SvbtwcUpOY', 'ARSm0acASG', '2013-09-06 00:10:07', '2004-03-22 12:49:01');
INSERT INTO `user` (`id`, `user_id`, `user_nickname`, `user_head`, `user_password`, `create_time`, `update_time`) VALUES (8, 'takuyka', 'Kaneko Takuya', 'e7Mx49X2nn', 'EMMzsfTRPR', '2015-10-26 21:38:01', '2016-08-07 21:45:21');
INSERT INTO `user` (`id`, `user_id`, `user_nickname`, `user_head`, `user_password`, `create_time`, `update_time`) VALUES (9, 'sitfat', 'Sit Fat', 'X3XVTZFDci', 'g3PB9qdnnw', '2005-06-02 12:06:55', '2024-04-24 03:56:44');
INSERT INTO `user` (`id`, `user_id`, `user_nickname`, `user_head`, `user_password`, `create_time`, `update_time`) VALUES (10, 'syamato2', 'Sugiyama Yamato', 'AmJF7wvsKz', 'Y2UeFtA6e2', '2000-02-05 23:05:22', '2024-04-04 23:20:21');
INSERT INTO `user` (`id`, `user_id`, `user_nickname`, `user_head`, `user_password`, `create_time`, `update_time`) VALUES (11, 'chingwan1', 'Tang Ching Wan', '009wFgVBFR', 'ZKb95hytDG', '2004-04-21 12:42:10', '2001-06-29 19:36:43');
INSERT INTO `user` (`id`, `user_id`, `user_nickname`, `user_head`, `user_password`, `create_time`, `update_time`) VALUES (12, 'mursei', 'Murata Seiko', 'Tn3bKUfgce', 'Zz6T396Qc5', '2021-01-22 15:48:52', '2017-05-29 12:58:16');
INSERT INTO `user` (`id`, `user_id`, `user_nickname`, `user_head`, `user_password`, `create_time`, `update_time`) VALUES (13, 'emills', 'Edwin Mills', 'wpFTzxsO2M', 'fEb0BbkZqN', '2022-06-21 19:20:17', '2009-02-15 15:16:35');
INSERT INTO `user` (`id`, `user_id`, `user_nickname`, `user_head`, `user_password`, `create_time`, `update_time`) VALUES (14, 'torresja', 'Jacob Torres', '9EVyOzoM0F', 'd6mLDbts0N', '2023-05-20 09:49:39', '2022-02-26 07:05:25');
INSERT INTO `user` (`id`, `user_id`, `user_nickname`, `user_head`, `user_password`, `create_time`, `update_time`) VALUES (15, 'omiu324', 'Ono Miu', 'gH3fHpYui2', 'lpeXsya5Oj', '2010-06-14 18:45:01', '2002-07-19 21:40:27');
INSERT INTO `user` (`id`, `user_id`, `user_nickname`, `user_head`, `user_password`, `create_time`, `update_time`) VALUES (16, 'eved', 'Evelyn Daniels', 'kVNPkZLskB', 'M2orxRzjqa', '2015-09-07 02:22:24', '2014-03-14 21:27:05');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
