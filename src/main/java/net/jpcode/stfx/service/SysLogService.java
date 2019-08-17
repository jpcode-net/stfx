/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.service;

import net.jpcode.stfx.PageList;
import net.jpcode.stfx.entity.SysLog;

public interface SysLogService {

	void insertSysLog(SysLog log);
	
	PageList<SysLog> findList(int pageNo, int pageSize);
}
