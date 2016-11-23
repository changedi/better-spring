package com.cloudex.spring.orm;

import com.cloudex.spring.jdbc.UserDO;

import java.util.List;

/**
 * Created by zunyuan.jy on 16/11/23.
 */
public interface UserService {

    void addUser(String name);

    List<UserDO> listAll();
}
