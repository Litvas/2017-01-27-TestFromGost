package com.gost.dao;

import com.gost.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private HibernateAdd hibernateAdd;

    @Override
        public List<User> getAll() {
        return (List<User>) hibernateAdd.session
                .createCriteria(User.class)
                .list();
    }

    @Override
    public User get(Long id) {
        return (User) hibernateAdd.session.get(User.class, id);
    }

    @Override
    public void remove(Long id) {
        User user = (User) hibernateAdd.session.load(User.class, id);
    }

    @Override
    public User add(User user) {
        hibernateAdd.session.save(user);
        return user;
    }

    @Override
    public User edit(User user) {
        hibernateAdd.session.update(user);
        return user;
    }
}
