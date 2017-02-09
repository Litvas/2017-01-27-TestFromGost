package com.gost.service;

import com.gost.dao.UserDAO;
import com.gost.entity.TypeResponse;
import com.gost.entity.TypeResponseWithErrors;
import com.gost.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDAO userDAO;

    @Override

    public List<User> getAll() {
        return userDAO.getAll();
    }

    @Override
    public User get(Long id) {
        return userDAO.get(id);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        userDAO.remove(id);
    }

    @Override
    @Transactional
    public User add(User user) {
        return userDAO.add(user);
    }

    @Override
    @Transactional
    public User edit(User user) {
        return userDAO.edit(user);
    }

    public TypeResponse checkStatus(BindingResult bindingResult) {
        TypeResponse typeResponse = new TypeResponse();
        TypeResponseWithErrors typeResponseWithErrors = new TypeResponseWithErrors();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        List<String> errors = new ArrayList<String>(fieldErrors.size());
        if (bindingResult.hasErrors()) {
            for (FieldError fieldError : fieldErrors) {
                errors.add(fieldError.getDefaultMessage());
            }
            typeResponseWithErrors.setSuccess(false);
            typeResponseWithErrors.setErrors(errors);
            return typeResponseWithErrors;
        } else {
            typeResponse.setSuccess(true);
            return typeResponse;
        }
    }
}
