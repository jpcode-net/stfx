/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.service;

import java.util.List;

import net.jpcode.stfx.entity.TaskInfo;

/**
 * 任务服务接口
 * @author: billy zhang
 */
public interface TaskService {

	List<TaskInfo> findList();

	int updateExecute(int taskId);
}
