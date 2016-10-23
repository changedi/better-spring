package com.cloudex.spring.aop;

/**
 * Created by zunyuan.jy on 16/10/22.
 */
public class TestInterfaceImpl implements TestInterface {
    @Override
    public void doPrint(String s) {
        System.out.println("\t\t\tThis is " + s);
    }
}
