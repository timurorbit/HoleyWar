package com.timplant.repository;

import com.timplant.model.Message;

import java.util.HashMap;
import java.util.List;

public interface MessageRepositoryJDBC {

    List<Message> getByFilters(HashMap<String, Object> filters);

}
