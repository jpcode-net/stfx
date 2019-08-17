/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.dao;

import java.util.List;

import net.jpcode.stfx.entity.TaskInfo;

/**
 * @author: billy zhang
 */
public interface TaskDao {

	List<TaskInfo> findList();

	int updateExecute(int taskId);
}
