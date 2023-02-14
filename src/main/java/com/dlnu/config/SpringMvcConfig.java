package com.dlnu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author haenu
 * @version 1.0
 * @date 2023/02/12 0:34
 */
@Configuration
@ComponentScan("com.dlnu.controller")
@EnableWebMvc
public class SpringMvcConfig {

}
