/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.jpcode.stfx.PageList;
import net.jpcode.stfx.entity.SysUser;

/**
 * @author Billy Zhang
 */
public interface SysUserDao {

    SysUser findByUsername(String username);

	int findCount(String username);

	List<SysUser> findList(String username, int offset, int limit);

	int findCountUser(SysUser sysUser);

	SysUser findById(int id);

	int saveUser(SysUser sysUser);

	void updateUser(SysUser sysUser);

	//增加用户和角色关联
	void saveUserRole(Integer userId, Integer roleId);

	//修改用户和角色关联
	void updateUserRole(Integer userId, Integer roleId);

	//查询用户信息包括角色
	SysUser findByIdRole(Integer id);
}
