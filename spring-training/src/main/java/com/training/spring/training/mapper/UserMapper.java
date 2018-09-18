package com.training.spring.training.mapper;

import com.training.spring.training.dto.UserDto;
import com.training.spring.training.model.User;
import java.util.List;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

  UserDto userDto(User user);

  default List<UserDto> userToDtos(List<User> users){
    return users.stream().map(this::userDto).collect(Collectors.toList());
  }
}
