package com.gost.service;

import com.gost.dao.UserDAO;
import com.gost.dao.UserDAOImpl;
import com.gost.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

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
}
