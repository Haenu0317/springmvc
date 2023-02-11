package com.dlnu.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author haenu
 * @version 1.0
 * @date 2023/02/12 0:37
 */
//定义一个servlet容器启动的配置类
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    //加载springMvc配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }
    //设置哪些请求交给springMvc处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    //加载spring配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
