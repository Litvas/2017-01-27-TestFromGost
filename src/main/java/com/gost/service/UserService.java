package com.gost.service;

import com.gost.entity.TypeResponse;
import com.gost.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;

@Service
public interface UserService {

    List<User> getAll();

    User get(Long id);

    void remove(Long id);

    User add(User user);

    User edit(User user);

    TypeResponse checkStatus(BindingResult bindingResult);

}
