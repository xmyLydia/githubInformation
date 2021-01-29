package com.github.information.rest;

import com.github.information.dao.RepositoryDao;
import com.github.information.dao.UserDao;
import com.github.information.entity.GitRepository;
import com.github.information.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.io.IOException;
/**
 * @author mingyux
 */
@RestController
public class UserRestController {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RepositoryDao repositoryDao;

    @GetMapping("/users/{name}")
    public User getUserByName(@PathVariable String name) throws IOException {
        return userDao.findByName(name);
    }
    @GetMapping("/users/{name}/repos")
    public GitRepository getRepositoriesByUserName(@PathVariable String name,
                                                   @RequestParam( "page" ) int page,
                                                   @RequestParam( "size" ) int size) throws IOException {
        return repositoryDao.findByUserNameWithPage(name, page, size);
    }

}
