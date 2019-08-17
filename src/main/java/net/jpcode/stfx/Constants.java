/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx;

public class Constants {

	public static final String USER_COOKIEID = "userid";
	
    public static final String USER_SESSIONID = "login_user";
	
	public static final String KEY = "Jpcode3@Jpcode2@";

	/**
	 * 操作日志切点
	 */
	public static final String LOG_POINTCUT = "execution (@net.jpcode.stfx.aop.OperateLog * *(..))";
}
