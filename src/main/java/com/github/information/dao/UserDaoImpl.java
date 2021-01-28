package com.github.information.dao;

import com.github.information.common.ParameterStringBuilder;
import com.github.information.entity.User;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import org.apache.commons.logging.Log;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;

/**
 * @author mingyux
 */
@Repository
public class UserDaoImpl implements UserDao {
    private final static String userAPI = "https://api.github.com/users/";
    private final static String repositoryAPISuffix="/repos";
    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        return users;
    }

    @Override
    public User findByName(String name) throws IOException {
        //String githubUserAPI = "https://api.github.com/users/" + name;
        String githubUserAPI = userAPI + name;
        String jsonStr = httpURLFetching(githubUserAPI);
        return convertJsonToUser(jsonStr);
    }

    private User convertJsonToUser(String json) {
        return new Gson().fromJson(json, User.class);
    }
    private String httpURLFetching(String fetchingUrl) throws IOException {
        URL url = new URL(fetchingUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        con.setRequestProperty("Content-Type", "application/json");
        //step4
        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);
        //step5
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            if (inputLine.contains("\"")) {
                String removeQuote = inputLine.replaceFirst("\"", "");
                if (removeQuote.contains("\"")) {
                    removeQuote = removeQuote.replaceFirst("\"", "");
                    content.append(removeQuote);
                } else {
                    content.append(inputLine);
                }
            } else {
                content.append(inputLine);
            }
        }
        in.close();
        con.disconnect();
        return content.toString();
    }
}
