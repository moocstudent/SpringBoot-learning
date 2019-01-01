package com.example.demo11;

import com.example.demo11.bean.BossMan;
import com.example.demo11.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo11ApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    private ApplicationContext ioc; //ioc容器
    private boolean b;

    @Test
    public void testHelloService() {
        //看ioc容器是否包含bean - > helloService 返回boolean
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);

    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Autowired
    private BossMan bossMan;

    @Test
    public void testMan(){
      System.out.println(bossMan);
    }


}
