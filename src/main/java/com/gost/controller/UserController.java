package com.gost.controller;

import com.gost.entity.User;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface UserController {

    List<User> getAll();

    User get(Long id);

    void remove(Long id);

    HttpStatus add(User user);

    HttpStatus edit(User user);

}
