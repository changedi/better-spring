package com.cloudex.spring.rmi;

import java.util.List;

/**
 * Created by zunyuan.jy on 16/12/8.
 */
public class AccountClientImpl {

    private AccountService service;

    public void setService(AccountService service) {
        this.service = service;
    }

    public List<Account> getAccounts(String name) {
        return service.getAccounts(name);
    }
}
