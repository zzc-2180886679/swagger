package com.zed.demo.config;

import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
//webmvc 配置，添加一系列映射
public class WebMvcConfig implements WebMvcConfigurer {
        public void addResourceHandlers(ResourceHandlerRegistry registry){
            registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/");

            registry.addResourceHandler("/webjars/**")
                    .addResourceLocations("classpath:META-INF/resources/webjars/");


        }
}
