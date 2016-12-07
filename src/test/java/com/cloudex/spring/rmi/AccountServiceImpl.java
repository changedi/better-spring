package com.cloudex.spring.rmi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zunyuan.jy on 16/12/6.
 */
public class AccountServiceImpl implements AccountService {
    @Override
    public void insertAccount(Account account) {
        System.out.println("insert account " + account.getName());
    }

    @Override
    public List<Account> getAccounts(String name) {
        List<Account> list = new ArrayList<>();
        Account account = new Account();
        account.setName(name);
        list.add(account);
        return list;
    }
}
