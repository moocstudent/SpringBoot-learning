package com.example.demo11.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

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
@Component
public class Person {

    private String lastame;
    private Integer age;
    private boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
