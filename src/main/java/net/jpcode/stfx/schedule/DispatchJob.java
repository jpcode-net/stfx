/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.schedule;

import java.util.Map;

/**
 * @author: billy zhang
 */
public class DispatchJob {

	public void execute(Map<String, Object> jobData) {
		TaskScheduler scheduler = (TaskScheduler)jobData.get("scheduler");
		scheduler.dispatch();
	}

}
