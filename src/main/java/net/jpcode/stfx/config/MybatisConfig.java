/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- stfx
 * 
 ********************************************************/

package net.jpcode.stfx.config;

import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("net.jpcode.stfx.dao.mybatis")
@Configuration
public class MybatisConfig {

}
