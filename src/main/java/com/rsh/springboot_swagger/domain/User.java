package com.rsh.springboot_swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

/**
 * Created By Rsh
 *
 * @Description
 * @Date: 2018/3/2
 * @Time: 14:26
 */
@ApiModel(value = "User")
public class User {

    @ApiModelProperty(value = "用户ID，比如'123456'")
    private Long id;
    @ApiModelProperty(value = "用户姓名，比如'李四'", required = true)
    private String name;
    @ApiModelProperty(value = "用户年龄，比如'20'")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
