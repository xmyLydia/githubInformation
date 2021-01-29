package com.github.information.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.information.common.HTTPRequest;
import com.github.information.entity.GitRepository;
import com.github.information.entity.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.io.IOException;
import java.util.List;

import static com.github.information.common.APIConstant.REPO_API;
import static com.github.information.common.APIConstant.USER_API;

/**
 * @author mingyux
 */
@Repository
public class RepositoryDaoImpl implements RepositoryDao{
    @Autowired
    HTTPRequest httpRequest;

    @Override
    public List<GitRepository> findByUserName(String userName) throws IOException {
        String repoAPI = USER_API + userName + REPO_API;
        String jsonStr = httpRequest.httpRepositoryFetching(repoAPI);
        //process json
        ObjectMapper objectMapper = new ObjectMapper();
        List<GitRepository> list = objectMapper.readValue(jsonStr, new TypeReference<List<GitRepository>>(){});
        return convertJsonToRepos(jsonStr);
    }

    @Override
    public GitRepository findByUserNameWithPage(String userName, int page, int size) throws IOException {
        //size should be 1 in this case
        //page should be which page
        List<GitRepository> findByUserName = findByUserName(userName);
        GitRepository gitRepository = new GitRepository();
        return gitRepository;
    }
    private List<GitRepository> convertJsonToRepos(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<GitRepository>>(){}.getType());
    }
}
