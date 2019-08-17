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
import net.jpcode.stfx.dao.SysLogDao;
import net.jpcode.stfx.entity.SysLog;
import net.jpcode.stfx.service.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService {

	@Autowired
	private SysLogDao logDao;
	
	@Override
	public void insertSysLog(SysLog log) {
		logDao.insert(log);
	}

	@Override
	public PageList<SysLog> findList(int pageNo, int pageSize) {
		
		PageList<SysLog> plist = new PageList<>(pageNo, pageSize);
		plist.setTotal(logDao.findCount());
		if (plist.getTotal() > 0) {
			int offset = (pageNo - 1) * pageSize;
			plist.setList(logDao.findList(offset, pageSize));
		}
		return plist;
	}
}
