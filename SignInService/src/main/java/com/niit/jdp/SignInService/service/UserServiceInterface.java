package com.niit.jdp.SignInService.service;

import com.niit.jdp.SignInService.domain.User;

import java.util.List;

public interface UserServiceInterface {
    User saveUser(User user);

    List<User> getAllUsers();

    User updateUser(User user, String email);

    boolean deleteUserByEmail(String email);

    List<User> getUserByLastName(String lastName);

}
