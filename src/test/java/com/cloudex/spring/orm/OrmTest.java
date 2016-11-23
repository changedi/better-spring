package com.cloudex.spring.orm;

import com.cloudex.spring.jdbc.UserDO;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by zunyuan.jy on 16/11/23.
 */
public class OrmTest {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-orm.xml"});

        UserDao userDao = context.getBean("userDao", UserDaoImpl.class);

        List<UserDO> list = (List<UserDO>) userDao.selectById(2);
        list.forEach(System.out::println);

        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser("BigBig");
        list = userService.listAll();
        list.forEach(System.out::println);
    }
}
