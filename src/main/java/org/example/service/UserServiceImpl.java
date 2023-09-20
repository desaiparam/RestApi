package org.example.service;

import org.example.dto.UserLocationDTO;
import org.example.model.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());

    }


    private UserLocationDTO convertEntityToDto(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getUserId());
        userLocationDTO.setUserName(user.getUserName());
        userLocationDTO.setPlace(user.getLocation().getPlaceName());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        return userLocationDTO;
    }

    public UserServiceImpl(@Lazy UserService userService) {
        super();
        this.userService = userService;
    }

    @Override
    public User insertUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
