package com.gost.dao;

import com.gost.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {

    List<User> getAll();

    User get(Long id);

    void remove(Long id);

    User add(User user);

    User edit(User user);
}
