package com.test.spring.process;

import com.test.spring.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by 何冠雄 on 2018/2/6.
 */
@Component
public class BeanProcessor implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("处理前"+o+"["+s+"]");
        if(o instanceof UserService){
            final UserService service = (UserService)o;
            UserService proxy = new UserService(){
                @Override
                public void foo() {
                    System.out.println("额外逻辑开始");
                    service.foo();
                    System.out.println("额外逻辑结束");
                }
            };
            return proxy;
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("处理后"+o+"["+s+"]");
        return o;
    }
}
