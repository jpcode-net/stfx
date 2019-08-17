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

import net.jpcode.stfx.dao.TaskDao;
import net.jpcode.stfx.entity.TaskInfo;

/**
 * @author: billy zhang
 */
@Mapper
public interface TaskMapper extends TaskDao {

	List<TaskInfo> findList();

	int updateExecute(@Param("taskId")int taskId);
}
