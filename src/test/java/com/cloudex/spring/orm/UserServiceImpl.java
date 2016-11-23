package com.cloudex.spring.orm;

import com.cloudex.spring.jdbc.UserDO;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;

/**
 * Created by zunyuan.jy on 16/11/23.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Transactional
    @Override
    public void addUser(String name) {
        userDao.addUser(name);
    }

    @Transactional
    @Override
    public List<UserDO> listAll() {
        return (List<UserDO>) userDao.listAll();
    }
}
