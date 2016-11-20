package com.cloudex.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by zunyuan.jy on 16/11/20.
 */
@Repository
public class JdbcCorporateEventDao implements CorporateEventDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void count() {
        int rowCount = this.jdbcTemplate.queryForObject("select count(*) from jdbc_test", Integer.class);
        System.out.println("count record " + rowCount);
    }

}
