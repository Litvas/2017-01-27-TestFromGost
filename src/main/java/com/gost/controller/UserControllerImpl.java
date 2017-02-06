package com.gost.controller;

import com.gost.entity.User;
import com.gost.service.UserService;
import com.gost.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;

    @Override
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> getAll() {
        return userService.getAll();
    }

    @Override
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") Long id) {
        return userService.get(id);
    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void remove(@PathVariable("id") Long id) {
        userService.remove(id);
    }

    @Override
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public HttpStatus add(@RequestBody @Valid User user) {
        return checkStatus(userService.add(user));
    }

    public HttpStatus checkStatus(User user) {
        HttpStatus httpStatus = null;
        httpStatus = (user == null) ? HttpStatus.BAD_REQUEST : HttpStatus.OK;
        return httpStatus;
    }

    @Override
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    @ResponseBody
    public HttpStatus edit(@RequestBody @Valid User user) {
        return checkStatus(userService.edit(user));
    }
}
