-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.5.28 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 正在导出表  bon_base.sys_base 的数据：~1 rows (大约)
DELETE FROM `sys_base`;
/*!40000 ALTER TABLE `sys_base` DISABLE KEYS */;
INSERT INTO `sys_base` (`base_id`, `gmt_create`, `gmt_modified`, `table_name`, `table_remark`, `field_name`, `field_type`, `field_length`, `is_null`, `is_unique`, `is_unsigned`, `default_value`, `field_remark`, `is_id`, `modules`) VALUES
	(1, '2018-08-18 12:38:55', '2018-08-18 12:38:55', 'test', '123', 'test_id', 'BIGINT', 20, 0, 0, 0, 'ID', NULL, 1, 'app');
/*!40000 ALTER TABLE `sys_base` ENABLE KEYS */;

-- 正在导出表  bon_base.sys_menu 的数据：~5 rows (大约)
DELETE FROM `sys_menu`;
/*!40000 ALTER TABLE `sys_menu` DISABLE KEYS */;
INSERT INTO `sys_menu` (`menu_id`, `gmt_create`, `gmt_modified`, `name`, `path`, `component`, `redirect`, `title`, `icon`, `hidden`, `always_show`) VALUES
	(1, '2018-07-22 22:50:44', '2018-07-22 22:50:46', '系统管理', '/admin', '/layout/Layout', 'admin/user/list', '系统管理', 'fa fa-cogs', 0, 0),
	(2, '2018-07-22 22:50:44', '2018-07-22 22:50:44', '用户管理', 'user/list', '/admin/UserList', NULL, '用户管理', 'fa fa-users', 0, 0),
	(3, '2018-07-23 14:54:51', '2018-07-23 14:54:51', '角色管理', 'role/list', '/admin/RoleList', NULL, '角色管理', 'fa fa-user-circle-o', 0, 0),
	(4, '2018-07-24 14:18:16', '2018-07-24 14:18:16', '系统表管理', 'sysTable', '/admin/SysTable', NULL, '系统表', 'fa fa-table', 0, 0),
	(5, '2018-08-06 20:14:20', '2018-08-06 20:14:20', '权限管理', 'permission', '/admin/Permission', NULL, '权限管理', 'fa fa-unlock-alt', 0, 0);
/*!40000 ALTER TABLE `sys_menu` ENABLE KEYS */;

-- 正在导出表  bon_base.sys_permission 的数据：~33 rows (大约)
DELETE FROM `sys_permission`;
/*!40000 ALTER TABLE `sys_permission` DISABLE KEYS */;
INSERT INTO `sys_permission` (`permission_id`, `gmt_create`, `gmt_modified`, `permission_flag`, `permission_name`, `type`, `object_id`, `parent_id`, `data_path`, `sort`) VALUES
	(1, '2018-06-06 11:19:08', '2018-07-24 12:00:47', 'menu:admin:main', '【菜单】系统管理', '00', 1, 0, '1', 1),
	(2, '2018-06-06 11:19:55', '2018-07-24 12:01:24', 'menu:admin:user', '【菜单】用户管理', '00', 2, 1, '1/2', 2),
	(3, '2018-06-06 14:11:05', '2018-07-24 12:01:30', 'menu:admin:role', '【菜单】角色管理', '00', 3, 1, '1/3', 3),
	(4, '2018-07-24 14:18:16', '2018-07-25 11:33:29', 'menu:admin:sysBase', '【菜单】系统表管理', '00', 4, 1, '1/4', 1),
	(5, '2018-08-06 20:14:20', '2018-08-06 20:14:20', 'menu:admin:permission', '【菜单】权限管理', '00', 5, 1, '1/5', 4),
	(6, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '权限管理模块', '【接口】权限管理模块', '01', 1, 0, '6', NULL),
	(7, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:getPermission', '【接口】获取权限', '01', 2, 6, '6/7', NULL),
	(8, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:savePermission', '【接口】新增权限', '01', 3, 6, '6/8', NULL),
	(9, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:getAllPermission', '【接口】获取所有权限(列表)', '01', 4, 6, '6/9', NULL),
	(10, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:updatePermission', '【接口】修改权限', '01', 5, 6, '6/10', NULL),
	(11, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:deletePermission', '【接口】删除权限', '01', 6, 6, '6/11', NULL),
	(12, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:getAllPermissionTree', '【接口】获取所有权限(树形)', '01', 7, 6, '6/12', NULL),
	(13, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '角色管理模块', '【接口】角色管理模块', '01', 8, 0, '13', NULL),
	(14, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:getRole', '【接口】获取角色', '01', 9, 13, '13/14', NULL),
	(15, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:saveRole', '【接口】新增角色', '01', 10, 13, '13/15', NULL),
	(16, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:deleteRole', '【接口】删除角色', '01', 11, 13, '13/16', NULL),
	(17, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:getAllRole', '【接口】获取所有角色', '01', 12, 13, '13/17', NULL),
	(18, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:updateRole', '【接口】修改角色', '01', 13, 13, '13/18', NULL),
	(19, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:listRole', '【接口】获取角色列表', '01', 14, 13, '13/19', NULL),
	(20, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '系统表管理模块', '【接口】系统表管理模块', '01', 15, 0, '20', NULL),
	(21, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:sys:deleteField', '【接口】删除表字段', '01', 16, 20, '20/21', NULL),
	(22, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:sys:listByTableName', '【接口】获取所有表结构', '01', 17, 20, '20/22', NULL),
	(23, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:sys:saveTable', '【接口】保存表结构', '01', 18, 20, '20/23', NULL),
	(24, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:sys:dropTable', '【接口】销毁表', '01', 19, 20, '20/24', NULL),
	(25, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:sys:generateTable', '【接口】创建表', '01', 20, 20, '20/25', NULL),
	(26, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:sys:deleteTable', '【接口】删除表', '01', 21, 20, '20/26', NULL),
	(27, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:sys:listTables', '【接口】获取所有表名信息', '01', 22, 20, '20/27', NULL),
	(28, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '用户管理模块', '【接口】用户管理模块', '01', 23, 0, '28', NULL),
	(29, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:getUser', '【接口】获取用户', '01', 24, 28, '28/29', NULL),
	(30, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 'url:user:deleteUser', '【接口】删除用户', '01', 25, 28, '28/30', NULL),
	(31, '2018-08-24 12:43:46', '2018-08-24 12:43:46', 'url:user:saveUser', '【接口】新增用户', '01', 26, 28, '28/31', NULL),
	(32, '2018-08-24 12:43:46', '2018-08-24 12:43:46', 'url:user:updateUser', '【接口】修改用户', '01', 27, 28, '28/32', NULL),
	(33, '2018-08-24 12:43:46', '2018-08-24 12:43:46', 'url:user:listUser', '【接口】获取用户列表', '01', 28, 28, '28/33', NULL);
/*!40000 ALTER TABLE `sys_permission` ENABLE KEYS */;

-- 正在导出表  bon_base.sys_role 的数据：~2 rows (大约)
DELETE FROM `sys_role`;
/*!40000 ALTER TABLE `sys_role` DISABLE KEYS */;
INSERT INTO `sys_role` (`role_id`, `gmt_create`, `gmt_modified`, `role_name`, `role_flag`) VALUES
	(1, '2018-06-06 11:16:44', '2018-08-08 21:19:51', '系统管理员', 'admin'),
	(2, '2018-06-12 17:37:45', '2018-07-25 15:49:08', '角色1', 'js1');
/*!40000 ALTER TABLE `sys_role` ENABLE KEYS */;

-- 正在导出表  bon_base.sys_role_permission 的数据：~37 rows (大约)
DELETE FROM `sys_role_permission`;
/*!40000 ALTER TABLE `sys_role_permission` DISABLE KEYS */;
INSERT INTO `sys_role_permission` (`role_permission_id`, `gmt_create`, `gmt_modified`, `permission_id`, `role_id`) VALUES
	(1, '2018-07-25 15:49:08', '2018-07-25 15:49:08', 1, 2),
	(2, '2018-07-25 15:49:08', '2018-07-25 15:49:08', 2, 2),
	(3, '2018-07-25 15:49:08', '2018-07-25 15:49:08', 3, 2),
	(4, '2018-07-25 15:49:08', '2018-07-25 15:49:08', 4, 2),
	(5, '2018-08-08 21:19:51', '2018-08-08 21:19:51', 1, 1),
	(6, '2018-08-08 21:19:51', '2018-08-08 21:19:51', 2, 1),
	(7, '2018-08-08 21:19:51', '2018-08-08 21:19:51', 3, 1),
	(8, '2018-08-08 21:19:51', '2018-08-08 21:19:51', 4, 1),
	(9, '2018-08-08 21:19:51', '2018-08-08 21:19:51', 5, 1),
	(10, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 6, 1),
	(11, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 7, 1),
	(12, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 8, 1),
	(13, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 9, 1),
	(14, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 10, 1),
	(15, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 11, 1),
	(16, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 12, 1),
	(17, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 13, 1),
	(18, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 14, 1),
	(19, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 15, 1),
	(20, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 16, 1),
	(21, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 17, 1),
	(22, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 18, 1),
	(23, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 19, 1),
	(24, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 20, 1),
	(25, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 21, 1),
	(26, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 22, 1),
	(27, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 23, 1),
	(28, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 24, 1),
	(29, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 25, 1),
	(30, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 26, 1),
	(31, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 27, 1),
	(32, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 28, 1),
	(33, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 29, 1),
	(34, '2018-08-24 12:43:45', '2018-08-24 12:43:45', 30, 1),
	(35, '2018-08-24 12:43:46', '2018-08-24 12:43:46', 31, 1),
	(36, '2018-08-24 12:43:46', '2018-08-24 12:43:46', 32, 1),
	(37, '2018-08-24 12:43:46', '2018-08-24 12:43:46', 33, 1);
/*!40000 ALTER TABLE `sys_role_permission` ENABLE KEYS */;

-- 正在导出表  bon_base.sys_url 的数据：~28 rows (大约)
DELETE FROM `sys_url`;
/*!40000 ALTER TABLE `sys_url` DISABLE KEYS */;
INSERT INTO `sys_url` (`url_id`, `gmt_create`, `gmt_modified`, `url_name`, `url_path`, `url_remark`) VALUES
	(1, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '权限管理模块', '/permission', '权限管理模块'),
	(2, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '获取权限', '/permission/getPermission', '根据权限类型和id查询相应信息'),
	(3, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '新增权限', '/permission/savePermission', ''),
	(4, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '获取所有权限(列表)', '/permission/getAllPermission', '获取所有权限，返回结果是普通视图列表树形结构'),
	(5, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '修改权限', '/permission/updatePermission', ''),
	(6, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '删除权限', '/permission/deletePermission', ''),
	(7, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '获取所有权限(树形)', '/permission/getAllPermissionTree', '获取所有权限，返回结果是树形结构'),
	(8, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '角色管理模块', '/role', '角色管理模块'),
	(9, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '获取角色', '/role/getRole', ''),
	(10, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '新增角色', '/role/saveRole', ''),
	(11, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '删除角色', '/role/deleteRole', ''),
	(12, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '获取所有角色', '/role/getAllRole', ''),
	(13, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '修改角色', '/role/updateRole', ''),
	(14, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '获取角色列表', '/role/listRole', '根据条件获取角色列表'),
	(15, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '系统表管理模块', '/sys', '系统表管理模块'),
	(16, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '删除表字段', '/sys/deleteField', '根据id删除表某一个字段数据'),
	(17, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '获取所有表结构', '/sys/listByTableName', '根据表名获取表结构信息'),
	(18, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '保存表结构', '/sys/saveTable', '在系统基础表中保存表结构信息'),
	(19, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '销毁表', '/sys/dropTable', '根据表名销毁表，会删除数据库中该表数据，但不会删除系统基础表中该表的表结构'),
	(20, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '创建表', '/sys/generateTable', '根据表信息创建表'),
	(21, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '删除表', '/sys/deleteTable', '会删除系统基础表中该表的表结构数据，并且会销毁该表在数据库中的数据'),
	(22, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '获取所有表名信息', '/sys/listTables', ''),
	(23, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '用户管理模块', '/user', '用户管理模块'),
	(24, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '获取用户', '/user/getUser', '根据id获取用户信息'),
	(25, '2018-08-24 12:43:45', '2018-08-24 12:43:45', '删除用户', '/user/deleteUser', ''),
	(26, '2018-08-24 12:43:46', '2018-08-24 12:43:46', '新增用户', '/user/saveUser', ''),
	(27, '2018-08-24 12:43:46', '2018-08-24 12:43:46', '修改用户', '/user/updateUser', ''),
	(28, '2018-08-24 12:43:46', '2018-08-24 12:43:46', '获取用户列表', '/user/listUser', '根据条件获取用户列表');
/*!40000 ALTER TABLE `sys_url` ENABLE KEYS */;

-- 正在导出表  bon_base.sys_user 的数据：~2 rows (大约)
DELETE FROM `sys_user`;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;
INSERT INTO `sys_user` (`user_id`, `gmt_create`, `gmt_modified`, `name`, `phone`, `email`, `telephone`, `address`, `username`, `password`, `remark`, `wx_openid`, `app_id`, `secret_key`, `salt`, `is_admin`) VALUES
	(1, '2018-06-06 11:02:58', '2018-08-17 12:01:43', 'Albert', '13211112222', 'string', 'string', '天空之城', 'bon', '589b33c3fc225c1ead2038dd1e54b76b', 'string', 'string', 'string', 'string', '51a9179e10b148b7a01a67a55586ac65', 1),
	(2, '2018-06-12 17:07:27', '2018-08-17 13:00:46', 'bon1', '', NULL, NULL, NULL, 'bon1', '589b33c3fc225c1ead2038dd1e54b76b', NULL, NULL, NULL, NULL, '51a9179e10b148b7a01a67a55586ac65', 0);
/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;

-- 正在导出表  bon_base.sys_user_role 的数据：~3 rows (大约)
DELETE FROM `sys_user_role`;
/*!40000 ALTER TABLE `sys_user_role` DISABLE KEYS */;
INSERT INTO `sys_user_role` (`user_role_id`, `gmt_create`, `gmt_modified`, `user_id`, `role_id`) VALUES
	(1, '2018-08-17 12:01:43', '2018-08-17 12:01:43', 1, 1),
	(2, '2018-08-17 12:01:43', '2018-08-17 12:01:43', 1, 2),
	(3, '2018-08-17 13:00:46', '2018-08-17 13:00:46', 2, 2);
/*!40000 ALTER TABLE `sys_user_role` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
