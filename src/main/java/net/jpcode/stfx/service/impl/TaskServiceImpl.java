/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.jpcode.stfx.dao.TaskDao;
import net.jpcode.stfx.entity.TaskInfo;
import net.jpcode.stfx.service.TaskService;

/**
 * @author: billy zhang
 */
@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDao taskDao;

	@Override
	public List<TaskInfo> findList() {
		return taskDao.findList();
	}

	@Override
	public int updateExecute(int taskId) {
		return taskDao.updateExecute(taskId);
	}

}
