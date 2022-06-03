package com.paul.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @Project: spring-AnnotationDriver
 * @Desc: // describe the class information
 * @Date: 2022-06-03 15:23
 * @Author: Paul
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void insert(){
        String sql = "INSERT INTO `tbl_user`(username,age) VALUES(?,?)";
        String username = UUID.randomUUID().toString().substring(0, 5);
        jdbcTemplate.update(sql, username,19);

    }

}
