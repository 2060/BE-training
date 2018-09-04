package com.training.spring.training.service.impl;

import com.training.spring.training.dto.UserDto;
import com.training.spring.training.model.User;
import com.training.spring.training.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


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
    List<UserDto> userDtos = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      UserDto user = new UserDto(i + 1, "test" + i, "test" + i + "@gmail.com", "Cong Hoa Street");
      userDtos.add(user);
    }
    return userDtos;
  }
}
