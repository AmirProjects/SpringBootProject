package org.openhouse.backendexercise.service;

import org.openhouse.backendexercise.model.User;
import org.openhouse.backendexercise.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }
}
