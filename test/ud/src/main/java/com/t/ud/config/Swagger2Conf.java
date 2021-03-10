package com.t.ud.config;

import com.t.ud.utils.FileControl;
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

import java.util.Arrays;

@Configuration
@EnableSwagger2
public class Swagger2Conf {
    @Bean
    public Docket getUserDocket(){
        Contact contact = new Contact("h","","");
        ApiInfo apiInfo=new ApiInfoBuilder()
                .title("上传下载")//api标题
                .description("上传下载相关接口描述" +
                        "/n 上传下载最大大小为100MB" +
                        "/n 限定格式为"+ Arrays.toString(FileControl.MEDIA_EXTENSION))//api描述
                .version("1.0.0")//版本号
                .contact(contact)//本API负责人的联系信息
                .build();
        return new Docket(DocumentationType.SWAGGER_2)//文档类型（swagger2）
                .apiInfo(apiInfo)//设置包含在json ResourceListing响应中的api元信息
                .select()//启动用于api选择的构建器
                .apis(RequestHandlerSelectors.basePackage("com.t.ud.controller"))//扫描接口的包
                .paths(PathSelectors.any())//路径过滤器（扫描所有路径）
                .build();
    }
}