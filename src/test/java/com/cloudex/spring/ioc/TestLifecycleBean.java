package com.cloudex.spring.ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by zunyuan.jy on 16/10/6.
 */
public class TestLifecycleBean implements InitializingBean, DisposableBean {
    /**
     * DisposableBean.
     * equal to @PreDestroy.
     */
    public void destroy() throws Exception {
        System.out.println(this.getClass() + " destroy...");
    }

    /**
     * InitializingBean.
     * equal to @PostConstruct.
     */
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass() + " initialize...");
    }

    public void sayHello() {
        System.out.println(this.getClass() + " say hello...");
    }
}
