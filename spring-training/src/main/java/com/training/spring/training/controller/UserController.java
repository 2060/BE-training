package com.training.spring.training.controller;

import com.training.spring.training.dto.UserDto;
import com.training.spring.training.model.User;
import com.training.spring.training.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/v1.0/users")
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping
  public void createUser(@RequestBody User user) {
    userService.createUser(user);
  }

  @GetMapping
  public ResponseEntity<List<UserDto>> getUsers() {
    return ResponseEntity.ok(userService.getUsers());
  }

  @GetMapping(value = "/{userId}")
  public ResponseEntity<UserDto> getUser(@PathVariable String userId) {
    return ResponseEntity.ok(userService.getUser(userId));
  }

}
