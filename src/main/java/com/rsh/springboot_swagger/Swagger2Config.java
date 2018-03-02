package com.rsh.springboot_swagger;

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
 * Created By Rsh
 *
 * @Description
 * @Date: 2018/3/2
 * @Time: 14:21
 */
@Configuration
@EnableSwagger2 // 注解来启用Swagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rsh.springboot_swagger")) //api扫描路径
                .paths(PathSelectors.any()) ////路径判断
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs") //标题
                .description("更多Spring Boot相关文章请关注：http://blog.didispace.com/") //描述
                .termsOfServiceUrl("http://blog.didispace.com/") //（不可见）条款地址
                .contact(new Contact("rsh", "", "154763003@qq.com")) //作者
                .version("1.0") //版本号
                .build();
    }

}
