package com.cloudex.spring.ioc;

/**
 * Created by zunyuan.jy on 16/10/5.
 */
public class TestCommand {

    private Object state;

    public void setState(Object state) {
        this.state = state;
    }

    public Object execute() {
        System.out.println(this + " command execute..." + state);
        return state;
    }
}
