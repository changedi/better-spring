package com.cloudex.spring.jmx;

/**
 * Created by zunyuan.jy on 16/12/15.
 */
public class JmxTestBean implements IJmxTestBean {

    private String name;
    private int age;
    private boolean isSuperman;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSuperman() {
        return isSuperman;
    }

    public void setSuperman(boolean superman) {
        isSuperman = superman;
    }

    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public long myOperation() {
        return 0;
    }
}
