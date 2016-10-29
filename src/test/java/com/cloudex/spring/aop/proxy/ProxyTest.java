package com.cloudex.spring.aop.proxy;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by zunyuan.jy on 16/10/26.
 */
public class ProxyTest {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new SimplePojo());
        factory.addInterface(Pojo.class);
//        factory.addAdvice(new RetryAdvice());
        factory.setExposeProxy(true);

        Pojo pojo = (Pojo) factory.getProxy();

        // this is a method call on the proxy!
        pojo.foo();
    }
}
