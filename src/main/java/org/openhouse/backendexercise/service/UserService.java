package org.openhouse.backendexercise.service;

import org.openhouse.backendexercise.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User addUser(User user);
}
