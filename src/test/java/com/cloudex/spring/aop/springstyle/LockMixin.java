package com.cloudex.spring.aop.springstyle;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Created by zunyuan.jy on 16/10/29.
 */
public class LockMixin extends DelegatingIntroductionInterceptor implements Lockable {

    private boolean locked;

    public void lock() {
        this.locked = true;
        System.out.println(this + " calling lock().");
    }

    public void unlock() {
        this.locked = false;
    }

    public boolean locked() {
        return this.locked;
    }

    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Introduction: [Locked:" + locked() + ",Method:" + invocation.getMethod().getName() + "]");
//        if (!locked() && invocation.getMethod().getName().indexOf("get") == 0) {
//            throw new LockedException();
//        }
        return super.invoke(invocation);
    }

}
