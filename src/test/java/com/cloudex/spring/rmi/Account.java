package com.cloudex.spring.rmi;

import java.io.Serializable;

/**
 * Created by zunyuan.jy on 16/12/6.
 */
public class Account implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "[" + name + "]";
    }
}
