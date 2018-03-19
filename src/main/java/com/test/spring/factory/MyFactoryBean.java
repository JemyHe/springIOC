package com.test.spring.factory;

import com.test.spring.entity.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * Created by 何冠雄 on 2018/2/5.
 */
@Component
public class MyFactoryBean implements FactoryBean <User>{


    public User getObject() throws Exception {
        return new User();
    }

    public Class<?> getObjectType() {
        return User.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
