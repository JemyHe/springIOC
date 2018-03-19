package com.test.spring.service;

import com.test.spring.dao.UserDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by 何冠雄 on 2018/2/5.
 */
@Service
@Lazy
public class UserService {

    @Autowired
    private UserDaoInterface userDao;

    /*public void setUserDao(UserDaoInterface userDao){
        this.userDao = userDao;
    }*/

    public void foo(){
        this.userDao.save(null);
        this.userDao.update(null);
    }

    @PostConstruct
    public void init(){
        System.out.println("进入init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("进入destroy");
    }
}
