package com.github.information.dao;

import com.github.information.entity.User;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;

/**
 * @author mingyux
 */

public interface UserDao {
    /**
     * get all the users
     * @return list of users
     */
    public List<User> findAll();

    public User findByName(String name) throws IOException;
}
