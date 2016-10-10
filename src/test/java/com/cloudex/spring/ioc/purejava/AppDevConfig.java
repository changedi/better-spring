package com.cloudex.spring.ioc.purejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by zunyuan.jy on 16/10/8.
 */
@Configuration
@ComponentScan(basePackages = "com.cloudex.spring.ioc.purejava")
@PropertySource("classpath:/config/config_dev.properties")
@Profile("dev")
public class AppDevConfig {

    @Autowired
    Environment env;

    @Bean

    public TestServiceBean serviceBean() {
        TestServiceBean testServiceBean = new TestServiceBean();
        testServiceBean.setName(env.getProperty("cloudex.spring.name"));
        return testServiceBean;
    }
}
