package com.gost.service;

import com.gost.dao.UserDAO;
import com.gost.dao.UserDAOImpl;
import com.gost.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void remove(Long id) {
        userDAO.remove(id);
    }

    @Override
    public User add(User user) {
        return userDAO.add(user);
    }

    @Override
    public User edit(User user) {
        return userDAO.edit(user);
    }
}
