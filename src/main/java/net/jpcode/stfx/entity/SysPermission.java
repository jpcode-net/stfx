/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Billy Zhang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysPermission implements Serializable {
    int id;//主键.
    
    String name;//名称.
    
    String url;//资源路径.
    
    String permission; //权限字符串
}
