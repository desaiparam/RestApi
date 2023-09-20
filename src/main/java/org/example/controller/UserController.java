package org.example.controller;

import org.example.dto.UserLocationDTO;
import org.example.model.User;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @Autowired
    private UserService userService;

    public UserController(UserServiceImpl userServiceImpl, UserService userService) {
        this.userServiceImpl = userServiceImpl;
        this.userService = userService;
    }

    @GetMapping("/userlocation")
    public List<UserLocationDTO> getAllUsersLocation(){
        return userServiceImpl.getAllUsersLocation();

    }

    @PostMapping("/insertuser")
    public ResponseEntity<User> insertUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.insertUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/seeUsers")
    public List<User> viewUsers(){
        return userService.getUsers();
    }
}
