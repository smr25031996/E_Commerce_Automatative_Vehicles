package com.bej.authenticationservice.controller;

import com.bej.authenticationservice.domain.User;
import com.bej.authenticationservice.exception.UserNotFoundException;
import com.bej.authenticationservice.service.SecurityTokenGenerator;
import com.bej.authenticationservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class UserController {

  private ResponseEntity responseEntity;
  private UserService userService;
  private SecurityTokenGenerator securityTokenGenerator;


  @Autowired
  public UserController(UserService userService, SecurityTokenGenerator securityTokenGenerator) {
    this.userService = userService;
    this.securityTokenGenerator = securityTokenGenerator;
  }


  //Should only give username and password
  @PostMapping("/login")
  public ResponseEntity loginUser(@RequestBody User user) throws UserNotFoundException {

      Map<String, Object> map = null;
    try {
      User userObj = userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
      if (userObj.getUsername().equals(user.getUsername())) {
        map = securityTokenGenerator.generateToken(user);
      }
      responseEntity = new ResponseEntity(map, HttpStatus.OK);
    } catch (UserNotFoundException e) {
      throw new UserNotFoundException();
    } catch (Exception e) {
      responseEntity = new ResponseEntity("Try after sometime!!!", HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return responseEntity;
  }

  // first step - register the user
  @PostMapping("/register")
  public ResponseEntity saveUser(@RequestBody User user) {
    User createdUser = userService.saveUser(user);
    return responseEntity = new ResponseEntity("User Created", HttpStatus.CREATED);
  }

  @GetMapping("/userservice/users")
  public ResponseEntity getAllUsers() throws UserNotFoundException {

    List<User> list = userService.getAllUsers();
    responseEntity = new ResponseEntity(list, HttpStatus.OK);
    return responseEntity;

  }

}
