package com.example.demo11.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@PropertySource("classpath:boss.properties")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BossMan {

  @Value("${boss.bossname}")
  private String bossname;
  @Value("${boss.bosswife}")
  private String bosswife;
  @Value("${boss.bossdietime}")
  private Date bossdietime;

  //要想使用@Value 用${}占位符注入属性，这个bean是必须的，这个就是占位bean,另一种方式是不用value直接用Envirment变量直接getProperty('key')
//  @Bean
//  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//    return new PropertySourcesPlaceholderConfigurer();
//  }


}
