package com.zed.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.w3c.dom.DocumentType;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration//必须存在
@EnableSwagger2//必须有
@EnableWebMvc//也必须
//必须存在  扫描API  Controller包
@ComponentScan(basePackages = {"com.zed.demo.controller"})
 public class SwagerConfig {
    @Bean
    //传入API信息
    public Docket customDocket(){return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiinfo());}

    //获取API信息，获取swagger作者信息
    private ApiInfo apiinfo(){
        Contact contact = new Contact("ZED","http://www.ly058.cn/","2132435345@qq.com");
      // Contact contact = new Contact( "ZED","http://www.ly058.cn/","2132435345@qq.com");
        return  new ApiInfoBuilder()
                .title("Swager项目API接口")
                .description("API接口")
                .contact(contact)
                .version("1.1.0")
                .build();
    }
}
