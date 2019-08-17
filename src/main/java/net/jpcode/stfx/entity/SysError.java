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
public class SysError {

	private int id;
	private Date time;
	private String message;
	private String content;
	private String cause;
	
}
