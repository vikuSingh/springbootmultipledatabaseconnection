package com.vikas.springbootmultipledatabaseconnection.service;

import com.vikas.springbootmultipledatabaseconnection.dto.UserRequestDto;
import com.vikas.springbootmultipledatabaseconnection.model.user.Users;
import com.vikas.springbootmultipledatabaseconnection.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users saveUser(UserRequestDto userRequestDto) {
        Users users = new Users();
        users.setUname(userRequestDto.getUname());
        users.setAddress(userRequestDto.getAddress());
        return userRepository.save(users);
    }

    public List<Users> findAllUsers() {
        return userRepository.findAll();
    }
}
