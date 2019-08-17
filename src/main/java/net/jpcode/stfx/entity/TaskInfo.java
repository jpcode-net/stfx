/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: billy zhang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskInfo {

	private int id;
	
	private String name;
	
	private String jobClazz;
	
	private String jobData;
	
	private String cronExp;
	
	private Date modified;
	
	private int del;
	
	private int executeCount;
	
	private Date lastExecute;
	
}
