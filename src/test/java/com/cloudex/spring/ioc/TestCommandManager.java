package com.cloudex.spring.ioc;

/**
 * Created by zunyuan.jy on 16/10/5.
 */
public abstract class TestCommandManager {

    public Object process(Object commandState) {
        // grab a new instance of the appropriate Command interface
        TestCommand command = createCommand();
        // set the state on the (hopefully brand new) Command instance
        command.setState(commandState);
        return command.execute();
    }

    // okay... but where is the implementation of this method?
    protected abstract TestCommand createCommand();
}
