package com.cloudex.spring.rmi;

import java.util.List;

/**
 * Created by zunyuan.jy on 16/12/7.
 */
public class SimpleClient {

    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public List<Account> getAccount(String name) {
        return accountService.getAccounts(name);
    }
}
