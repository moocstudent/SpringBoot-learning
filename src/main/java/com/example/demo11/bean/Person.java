package com.example.demo11.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值,映射到这个组件中
 * @ConfigurationProperties 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定;
 *    prefix = "person"; 配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件,才能使用容器提供的@ConfigurationProperties功能;
 */




@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "person")
@Validated  //配合ConfigurationProperties注解进行JSR303数据校验
@Component
public class Person {

    /**
     * <bean class="Person">
     *      <property name="lastName" value="字面量/${key}从环境变量,配置文件中获取值/#{SpEL}"></property>
     * </bean>
     */

    //必须为邮箱格式,该校验必须在@ConfigurationProperties与@Validated在的情况下使用
//    @Email
    private String email;
    @Value("${person.lastame}")
    private String lastame;
    @NotNull
    @Size(min = 11,max = 11) //验证手机号长度,在11与11之间
    private String mobile;
//    @Value("#{11*2}")
    private Integer age;
//    @Value("true")
    private boolean boss;
//    @Value("${person.birth}")
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
