package com.timplant.repository.implementation;

import com.timplant.model.Message;
import com.timplant.repository.MessageRepositoryJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class MessageRepositoryImpl implements MessageRepositoryJDBC {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public MessageRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Message> getByFilters(HashMap<String, Object> filters) {
        return null;
    }
}
