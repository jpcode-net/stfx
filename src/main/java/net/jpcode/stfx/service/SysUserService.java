/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.service;

import java.util.List;

import net.jpcode.stfx.PageList;
import net.jpcode.stfx.entity.SysPermission;
import net.jpcode.stfx.entity.SysRole;
import net.jpcode.stfx.entity.SysUser;

/**
 * 管理员服务接口
 * @author Billy Zhang
 */
public interface SysUserService {

	SysUser findById(int userId);
	
    SysUser findByUsername(String username);
    
    List<SysRole> findRoleListByUsername(String username);

    List<SysPermission> findPermissionListByRoleId(int roleId);

	PageList<SysUser> findList(String username, int pageNo, int pageSize);

    PageList<SysRole> findRoleList(int pageNo, int pageSize);

    SysRole findRoleById(int id);

    Integer updateRoleById(SysRole sysRole);

    Integer deleteRoleById(int id);

    List<SysPermission> findPermissionList();

	void saveUser(SysUser sysUser);

    void updateUser(SysUser sysUser);

    List<Integer> findPermissionListByRole(Integer id);

    List<SysRole> findAll();

    SysUser findByIdRole(Integer id);

    void updateUserStatus(SysUser sysUser);
}
