package com.cloudex.spring.orm;

import java.util.Collection;

/**
 * Created by zunyuan.jy on 16/11/23.
 */
public interface UserDao {
    Collection selectById(Integer id);

    int addUser(String name);

    Collection listAll();
}
