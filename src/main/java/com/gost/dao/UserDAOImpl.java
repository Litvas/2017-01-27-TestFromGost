package com.gost.dao;

import com.gost.entity.User;
import com.gost.service.UserService;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private HibernateSessionFactory hibernateSessionFactory = new HibernateSessionFactory();
    private Session session = null;

    @Override
    @Transactional
    public List<User> getAll() {
        session = hibernateSessionFactory.getSession();
        List<User> listUser = (List<User>) session
                .createCriteria(User.class)
                .list();
        hibernateSessionFactory.getSession().close();
        return listUser;
    }

    @Override
    public User get(Long id) {
        session = hibernateSessionFactory.getSession();
        User userResult = (User) session.get(User.class, id);
        hibernateSessionFactory.getSession().close();
        return userResult;
    }

    @Override
    public void remove(Long id) {
        session = hibernateSessionFactory.getSession();
        session.beginTransaction();
        User user = (User) session.load(User.class, id);
        session.delete(user);
        session.getTransaction().commit();
        hibernateSessionFactory.getSession().close();
    }

    @Override
    public User add(User user) {
        session = hibernateSessionFactory.getSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        hibernateSessionFactory.getSession().close();
        return user;
    }

    @Override
    public User edit(User user) {
        session = hibernateSessionFactory.getSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
        hibernateSessionFactory.getSession().close();
        return user;
    }
}
