package com.test.spring.service;

import com.test.spring.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by 何冠雄 on 2018/2/5.
 */
public class UserServiceTest {

    private ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("test1.xml");


    @Test
    public void foo() throws Exception {
        UserService userService = spring.getBean("userService", UserService.class);
        userService.foo();
        /*User user = spring.getBean(User.class);
        System.out.println(user);*/
    }

}