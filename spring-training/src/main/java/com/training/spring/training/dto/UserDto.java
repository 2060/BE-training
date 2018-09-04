package com.training.spring.training.dto;

import lombok.Data;

@Data
public class UserDto {

  public UserDto(Integer id, String name, String email, String address) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.address = address;
  }

  private Integer id;
  private String name;
  private String email;
  private String address;
}
