/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

import net.jpcode.stfx.NavItemStyleTag;
import net.jpcode.stfx.NavSubItemStyleTag;
import net.jpcode.stfx.shiro.ShiroTagsEx;

import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class FreemarkerConfig {

	@Autowired
	private freemarker.template.Configuration configuration;
	
	@PostConstruct
	public void setSharedVariable(){
		configuration.setSharedVariable("shiro", new ShiroTagsEx());//标签名与标签类
		configuration.setSharedVariable("navItemStyle", new NavItemStyleTag());
		configuration.setSharedVariable("navSubItemStyle", new NavSubItemStyleTag());
		configuration.setNumberFormat("#");
		configuration.setDateTimeFormat("yyyy-MM-dd HH:mm:ss");  
		configuration.setDateFormat("yyyy-MM-dd");  
		configuration.setTimeFormat("HH:mm:ss");
	}
}
