package org.openhouse.backendexercise.controller;

import org.openhouse.backendexercise.model.LogDTO;
import org.openhouse.backendexercise.model.User;
import org.openhouse.backendexercise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloSpring {

    @Autowired
    UserService userService;

    @GetMapping
    public String getData(){
        return "<h1>HELLO WORLD</h1>";
    }

    @PostMapping
    public String postData(@RequestBody @Validated LogDTO param){
        return param.toString();
    }

    @PostMapping("/add_user")
    public ResponseEntity<User> addUser(@RequestBody @Validated User user){
        return ResponseEntity.status(HttpStatus.OK).body((userService.addUser(user)));
    }

    @GetMapping("/get_all_users")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.status(HttpStatus.OK).body((userService.getAll()));
    }
}
