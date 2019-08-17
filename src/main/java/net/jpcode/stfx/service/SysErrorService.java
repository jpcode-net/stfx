/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.service;

import net.jpcode.stfx.PageList;
import net.jpcode.stfx.entity.SysError;

public interface SysErrorService {

	PageList<SysError> findList(int pageNo, int pageSize);
}
