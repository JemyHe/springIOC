package com.test.spring.dao;

import com.test.spring.entity.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by 何冠雄 on 2018/2/5.
 */
@Repository
public class UserDao implements UserDaoInterface{

    @PostConstruct
    public void init(){
        System.out.println("进入init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("进入destroy");
    }

    public void save(User user){}

    public void update(User user){}

    public void delete(int id){}

    public User findById(int id){
        return null;
    }

    public List<User> findAll(){
        return null;
    }
}
