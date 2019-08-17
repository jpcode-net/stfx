/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.schedule;

/**
 * @author: billy zhang
 */
public interface TaskScheduler {

	void start() throws Exception;
	
	void stop();
	
	void dispatch();
}
