package org.example.service;

import org.example.model.User;

import java.util.List;

public interface UserService {
    User insertUser(User user);

    List<User> getUsers();
}
