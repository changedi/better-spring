package com.cloudex.spring.ioc;

/**
 * Created by zunyuan.jy on 16/10/5.
 */
public class TestPropertyBean {

    private Integer id;


    public void sayHello() {
        System.out.println("id:" + id);
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
