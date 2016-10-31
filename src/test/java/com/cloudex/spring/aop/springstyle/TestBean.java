package com.cloudex.spring.aop.springstyle;

/**
 * Created by zunyuan.jy on 16/10/29.
 */
public class TestBean {

    public void sayHello() {
        System.out.println(this + " say Hello.");
    }

    public void sayBye() {
        System.out.println(this + " say Bye.");
    }

    public void getBugs() {
        System.out.println(this + " get some bugs.");
    }
}
