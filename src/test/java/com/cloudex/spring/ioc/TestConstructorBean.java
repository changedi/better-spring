package com.cloudex.spring.ioc;

/**
 * Created by zunyuan.jy on 16/10/5.
 */
public class TestConstructorBean {
    // Number of years to calculate the Ultimate Answer
    private int years;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;

    public TestConstructorBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
        System.out.println("construct with parameters...");
    }

    public void sayHello() {
        System.out.println("years:" + years + ",ultimateAnswer:" + ultimateAnswer);
    }
}
