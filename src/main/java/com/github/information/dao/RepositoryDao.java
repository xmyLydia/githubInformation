package com.github.information.dao;

import com.github.information.entity.GitRepository;

import java.awt.print.Pageable;
import java.io.IOException;
import java.util.List;

/**
 * @author mingyux
 */
public interface RepositoryDao {
    List<GitRepository> findByUserName(String userName) throws IOException;
    GitRepository findByUserNameWithPage(String userName, int page, int size) throws IOException;
}
