package com.cloudex.spring.rmi;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by zunyuan.jy on 16/12/8.
 */
@WebService(serviceName = "AccountService")
public class AccountServiceEndpoint implements AccountService {

    @Autowired
    private AccountService accountService;

    @WebMethod
    public void insertAccount(Account acc) {
        accountService.insertAccount(acc);
    }

    @WebMethod
    public List<Account> getAccounts(String name) {
        return accountService.getAccounts(name);
    }

}
