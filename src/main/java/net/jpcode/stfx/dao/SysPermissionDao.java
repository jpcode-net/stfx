/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.dao;

import org.springframework.stereotype.Component;

import net.jpcode.stfx.entity.SysPermission;

import java.util.List;

/**
 * @author Billy Zhang
 */
public interface SysPermissionDao {

    List<SysPermission> findListByRoleId(int roleId);

    List<SysPermission> findList();
}
