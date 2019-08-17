/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.shiro;

import com.jagregory.shiro.freemarker.ShiroTags;

public class ShiroTagsEx extends ShiroTags {

	public ShiroTagsEx() {
		super();
		put("hasAnyPermissions", new HasAnyPermissionsTag());
		
	}

}
