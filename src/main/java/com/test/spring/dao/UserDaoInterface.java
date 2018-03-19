package com.test.spring.dao;

import com.test.spring.entity.User;

import java.util.List;

/**
 * Created by 何冠雄 on 2018/2/5.
 */
public interface UserDaoInterface {
    void save(User user);

    void update(User user);

    void delete(int id);

    User findById(int id);

    List<User> findAll();
}
