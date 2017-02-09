package com.gost.controller;

import com.gost.entity.TypeResponse;
import com.gost.entity.User;
import com.gost.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public TypeResponse add(@RequestBody @Valid User user, BindingResult bindingResult) {
        return userService.checkStatus(bindingResult);
    }

    @Override
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    @ResponseBody
    public TypeResponse edit(@RequestBody @Valid User user, BindingResult bindingResult) {
        return userService.checkStatus(bindingResult);
    }
}
