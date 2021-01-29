package com.github.information.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.information.common.HTTPRequest;
import com.github.information.entity.GitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

import static com.github.information.common.APIConstant.REPO_API;
import static com.github.information.common.APIConstant.USER_API;

/**
 * @author mingyux
 */
@Repository
public class RepositoryDaoImpl implements RepositoryDao {
    @Autowired
    HTTPRequest httpRequest;

    @Override
    public List<GitRepository> findByUserNameWithPage(String userName, int page, int size) throws IOException {
        String repoAPI = USER_API + userName + REPO_API;
        String jsonStr = httpRequest.httpRepositoryFetching(repoAPI, page, size);
        ObjectMapper objectMapper = new ObjectMapper();
        List<GitRepository> list = objectMapper.readValue(jsonStr, new TypeReference<List<GitRepository>>() {
        });
        return list;
    }
}
