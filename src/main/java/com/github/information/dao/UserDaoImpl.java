package com.github.information.dao;

import com.github.information.common.HTTPRequest;
import com.github.information.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;

import com.google.gson.Gson;

import static com.github.information.common.APIConstant.USER_API;

/**
 * @author mingyux
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private HTTPRequest httpRequest;

    @Override
    public User findByName(String name) throws IOException {
        String githubUserAPI = USER_API + name;
        String jsonStr = httpRequest.httpURLFetching(githubUserAPI);
        return convertJsonToUser(jsonStr);
    }

    private User convertJsonToUser(String json) {
        return new Gson().fromJson(json, User.class);
    }
}
