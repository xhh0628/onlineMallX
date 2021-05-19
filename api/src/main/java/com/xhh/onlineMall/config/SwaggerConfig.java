package com.xhh.onlineMall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2 java配置类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * docket封装接口文档信息
     * @return
     */
    @Bean
    public Docket getDocket(){

        //工厂模式,创建封面信息对象
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        //添加参数,支持链式编码
        apiInfoBuilder.title("商城后端接口文档")
                .description("此文档说明了商城项目后端接口的文档接口规范")
                .version("v 2.0.0")
                .contact(new Contact("胥昊含","http://39.106.59.220:8081/","1947817805@qq.com"));

        //apiInfo接口
        ApiInfo apiInfo = apiInfoBuilder.build();


        //指定生成策略
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)//指定生成文档中的封面信息：文档标题，版本，作者等，使用apiInfo方法
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xhh.onlineMall.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
