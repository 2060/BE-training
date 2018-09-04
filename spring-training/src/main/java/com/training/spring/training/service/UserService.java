package com.training.spring.training.service;

import com.training.spring.training.dto.UserDto;
import com.training.spring.training.model.User;
import java.util.List;

public interface UserService {

  void createUser(User user);

  UserDto getUser(final String userId);

  List<UserDto> getUsers();
}
