package com.github.information.dao;

import com.github.information.entity.GitRepository;

import java.io.IOException;
import java.util.List;

/**
 * @author mingyux
 */
public interface RepositoryDao {
    List<GitRepository> findByUserNameWithPage(String userName, int page, int size) throws IOException;
}
