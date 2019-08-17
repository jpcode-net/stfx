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
 * @author Billy Zhang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysLog {

	private int id;
	
	private String category;
	
	private String opName;  // 操作名称
	
	private String username;
	
	private int duration;
	
	private String result;
	
	private Date logTime;
	
	private String logIp;
			
}
