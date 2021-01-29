package com.github.information.dao;

import com.github.information.entity.User;

import java.io.IOException;

/**
 * @author mingyux
 */

public interface UserDao {
    /**
     * get all the users
     * @return list of users
     */

    User findByName(String name) throws IOException;
}
