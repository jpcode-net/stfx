/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.dao;

import java.util.List;

import net.jpcode.stfx.entity.SysLog;

public interface SysLogDao {

	void insert(SysLog log);

	int findCount();
	
	List<SysLog> findList(int offset, int limit);
}
