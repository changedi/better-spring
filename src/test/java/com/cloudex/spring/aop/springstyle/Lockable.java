package com.cloudex.spring.aop.springstyle;

/**
 * Created by zunyuan.jy on 16/10/29.
 */
public interface Lockable {
    void lock();

    void unlock();

    boolean locked();
}
