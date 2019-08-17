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

import net.jpcode.stfx.dao.SysLogDao;
import net.jpcode.stfx.entity.SysLog;

/**
 * @author Billy Zhang
 */
@Mapper
public interface SysLogMapper extends SysLogDao {

	@Override
	void insert(SysLog log);

	@Override
	int findCount();

	@Override
	List<SysLog> findList(
			@Param("offset")int offset, 
			@Param("limit")int limit);
}
