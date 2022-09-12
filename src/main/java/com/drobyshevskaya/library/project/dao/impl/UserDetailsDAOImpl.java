package com.drobyshevskaya.library.project.dao.impl;

import com.drobyshevskaya.library.project.dao.UserDetailsDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Author;
import com.drobyshevskaya.library.project.entity.User;
import com.drobyshevskaya.library.project.entity.UserDetails;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDetailsDAOImpl implements UserDetailsDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<UserDetails> getAllUserDetails() throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<UserDetails> query = session.createQuery("from UserDetails ORDER BY id DESC", UserDetails.class);
        return query.getResultList();
    }

    @Override
    public UserDetails getUserDetailsById(int id) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        return session.get(UserDetails.class, id);
    }

    @Override
    public void saveUserDetails(UserDetails userDetails) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(userDetails);
    }

    @Override
    public void deleteUserDetails(int id) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<UserDetails> query = session.createQuery("delete from UserDetails where id =:idUserDetails");
        query.setParameter("idUserDetails", id);
        query.executeUpdate();
    }
}
