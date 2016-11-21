package com.cloudex.spring.jdbc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/11/5.
 */
public class JdbcTest {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-jdbc.xml"});

        CorporateEventDao corporateEventDao = context.getBean("jdbcCorporateEventDao", JdbcCorporateEventDao.class);

        corporateEventDao.count();

        corporateEventDao.list();

        corporateEventDao.insert();

        corporateEventDao.update();

        corporateEventDao.delete();

        System.out.println("--------------");

        UserDao userDao = context.getBean("jdbcUserDao", JdbcUserDao.class);

        UserDO userDO = new UserDO();
        userDO.setId(7);
        userDO.setName("Jenifier");
        userDao.add(userDO);
        corporateEventDao.list();


    }
}
