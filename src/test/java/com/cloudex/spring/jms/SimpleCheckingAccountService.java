package com.cloudex.spring.jms;

/**
 * Created by zunyuan.jy on 16/12/12.
 */
public class SimpleCheckingAccountService implements CheckingAccountService {
    @Override
    public void cancelAccount(Long accountId) {
        System.out.println("Cancelling account [" + accountId + "]");
    }
}
