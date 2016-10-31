package com.cloudex.spring.aop.springstyle;

import org.springframework.aop.support.DefaultIntroductionAdvisor;

/**
 * Created by zunyuan.jy on 16/10/29.
 */
public class LockMixinAdvisor extends DefaultIntroductionAdvisor {

    public LockMixinAdvisor() {
        super(new LockMixin(), Lockable.class);
    }
}
