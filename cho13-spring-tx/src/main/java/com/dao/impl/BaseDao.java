package com.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao {

    protected JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
