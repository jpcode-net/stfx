/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import net.jpcode.stfx.dao.SysErrorDao;
import net.jpcode.stfx.entity.SysError;

/**
 * @author Billy Zhang
 */
@Mapper
public interface SysErrorMapper extends SysErrorDao {

	@Override
	int findCount();

	@Override
	List<SysError> findList(
			@Param("offset")int offset, 
			@Param("limit")int limit);
}
