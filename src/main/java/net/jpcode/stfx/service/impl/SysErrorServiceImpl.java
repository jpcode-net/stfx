/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.jpcode.stfx.PageList;
import net.jpcode.stfx.dao.SysErrorDao;
import net.jpcode.stfx.entity.SysError;
import net.jpcode.stfx.service.SysErrorService;

@Service
public class SysErrorServiceImpl implements SysErrorService {

	@Autowired
	private SysErrorDao errDao;
	
	@Override
	public PageList<SysError> findList(int pageNo, int pageSize) {
		
		PageList<SysError> plist = new PageList<>(pageNo, pageSize);
		plist.setTotal(errDao.findCount());
		if (plist.getTotal() > 0) {
			int offset = (pageNo - 1) * pageSize;
			plist.setList(errDao.findList(offset, pageSize));
		}
		return plist;
	}
}
