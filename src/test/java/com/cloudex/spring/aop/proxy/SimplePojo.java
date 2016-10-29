package com.cloudex.spring.aop.proxy;

/**
 * Created by zunyuan.jy on 16/10/26.
 */
public class SimplePojo implements Pojo {
    @Override
    public void foo() {
//        ((Pojo) AopContext.currentProxy()).bar();
        bar();
    }

    public void bar() {
        System.out.println(this + " bar.");
    }
}
