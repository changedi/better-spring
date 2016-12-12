package com.cloudex.spring.rmi;

import java.util.List;

import javax.jws.WebService;

/**
 * Created by zunyuan.jy on 16/12/6.
 */
@WebService  //only for jaxws
public interface AccountService {

    void insertAccount(Account account);

    List<Account> getAccounts(String name);
}
