package com.cloudex.spring.orm;

import com.cloudex.spring.jdbc.UserDO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by zunyuan.jy on 16/11/23.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Collection selectById(Integer id) {
        return this.sessionFactory.openSession()
                .createQuery("from UserDO jt where jt.id=?")
                .setParameter(0, id)
                .list();
    }

    @Override
    public int addUser(String name) {
        UserDO userDO = new UserDO();
        userDO.setId(7);
        userDO.setName(name);
        Integer id = (Integer) this.sessionFactory.getCurrentSession().save(userDO);
        System.out.println(id);
        return 0;
    }

    @Override
    public Collection listAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from UserDO jt").list();
    }
}
