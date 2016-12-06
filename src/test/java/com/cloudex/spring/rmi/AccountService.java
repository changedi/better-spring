package com.cloudex.spring.rmi;

import java.util.List;

/**
 * Created by zunyuan.jy on 16/12/6.
 */
public interface AccountService {

    void insertAccount(Account account);

    List<Account> getAccounts(String name);
}
