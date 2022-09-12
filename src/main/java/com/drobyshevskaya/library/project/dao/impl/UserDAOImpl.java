package com.drobyshevskaya.library.project.dao.impl;

import com.drobyshevskaya.library.project.dao.UserDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Author;
import com.drobyshevskaya.library.project.entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<User> query = session.createQuery("from User ORDER BY id DESC", User.class);
        return query.getResultList();
    }

    @Override
    public User getUserById(int id) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        return session.get(User.class, id);
    }

    @Override
    public void saveUser(User user) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    public void deleteUser(int id) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<User> query = session.createQuery("delete from User where id =:idUser");
        query.setParameter("idUser", id);
        query.executeUpdate();
    }
}
