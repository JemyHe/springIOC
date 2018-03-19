package com.test.spring.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by 何冠雄 on 2018/2/5.
 */
public class UserDaoTest {

    private ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("test1.xml");

    @Test
    public void save() throws Exception {
        UserDao bean = spring.getBean(UserDao.class);
        UserDao userDao = (UserDao)spring.getBean("userDao");
        UserDao userDao1 = spring.getBean("userDao", UserDao.class);
        System.out.println(bean);
        System.out.println(userDao);
        System.out.println(userDao1);
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void findById() throws Exception {
    }

    @Test
    public void findAll() throws Exception {
    }

}