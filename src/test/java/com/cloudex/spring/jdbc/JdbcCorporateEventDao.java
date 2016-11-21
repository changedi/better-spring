package com.cloudex.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    @Override
    public void list() {
        List<UserDO> list = this.jdbcTemplate.query("select * from jdbc_test", new RowMapper<UserDO>() {

            @Override
            public UserDO mapRow(ResultSet rs, int rowNum) throws SQLException {
                UserDO userDO = new UserDO();
                userDO.setId(rs.getInt("id"));
                userDO.setName(rs.getString("name"));
                return userDO;
            }
        });
        list.forEach(System.out::println);
    }

    @Override
    public void insert() {
        this.jdbcTemplate.update("insert into jdbc_test (id, name) values (?, ?)",
                7, "Bernard");
        this.list();
    }

    @Override
    public void update() {
        this.jdbcTemplate.update("update jdbc_test set name=? where id=?", "Terresa", 7);
        this.list();
    }

    @Override
    public void delete() {
        this.jdbcTemplate.update("delete from jdbc_test where id=?", 7);
        this.list();
    }
}
