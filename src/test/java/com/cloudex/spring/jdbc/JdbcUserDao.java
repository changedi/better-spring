package com.cloudex.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

/**
 * Created by zunyuan.jy on 16/11/20.
 */
@Repository
public class JdbcUserDao implements UserDao {

    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcInsert simpleJdbcInsert;

    @Autowired
    public JdbcUserDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("jdbc_test");
    }

    @Override
    public void add(UserDO userDO) {
        Map<String, Object> parameters = new HashMap<String, Object>(3);
        parameters.put("id", userDO.getId());
        parameters.put("name", userDO.getName());
        this.simpleJdbcInsert.execute(parameters);
    }


}
