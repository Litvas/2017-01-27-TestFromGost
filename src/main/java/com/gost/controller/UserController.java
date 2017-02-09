package com.gost.controller;

import com.gost.entity.TypeResponse;
import com.gost.entity.User;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface UserController {

    List<User> getAll();

    User get(Long id);

    void remove(Long id);

    TypeResponse add(User user, BindingResult bindingResult);

    TypeResponse edit(User user, BindingResult bindingResult);

}
