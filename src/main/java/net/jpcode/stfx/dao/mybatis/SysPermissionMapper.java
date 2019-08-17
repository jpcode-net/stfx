/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import net.jpcode.stfx.dao.SysPermissionDao;
import net.jpcode.stfx.entity.SysPermission;

import java.util.List;

/**
 * @author Billy Zhang
 */
@Mapper
public interface SysPermissionMapper extends SysPermissionDao {

    List<SysPermission> findListByRoleId(@Param("roleId") int roleId);

    List<SysPermission> findList();
}
