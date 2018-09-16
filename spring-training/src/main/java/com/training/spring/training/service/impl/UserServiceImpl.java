package com.training.spring.training.service.impl;

import com.training.spring.training.dto.UserDto;
import com.training.spring.training.model.User;
import com.training.spring.training.repository.UserRepository;
import com.training.spring.training.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void createUser(User user) {
    //TODO
  }

  @Override
  public UserDto getUser(String userId) {
    return new UserDto(1, "test", "test@gmail.com", "Cong Hoa Street");
  }

  @Override
  public List<UserDto> getUsers() {
   List<User> users = (List<User>) userRepository.findAll();
    return userDtos;
  }
}
