package org.service;

import org.dao.UserDAO;
import org.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    public List<User> findAllUsers() {
        return userDAO.getAllUsers();
    }

}
