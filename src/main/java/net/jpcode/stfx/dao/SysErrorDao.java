/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.dao;

import java.util.List;

import net.jpcode.stfx.entity.SysError;

public interface SysErrorDao {

	int findCount();
	
	List<SysError> findList(int offset, int limit);
}
