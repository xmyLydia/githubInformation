package com.github.information.rest;

import com.github.information.dao.UserDao;
import com.github.information.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author mingyux
 */
@RestController
public class UserRestController {
    @Autowired
    private UserDao userDao;


    @GetMapping("/users")
    public List<User> getAll() {
        return userDao.findAll();
    }
    @GetMapping("/users/{name}")
    public User getUserByName(@PathVariable String name) throws IOException {
        return userDao.findByName(name);
    }
}
