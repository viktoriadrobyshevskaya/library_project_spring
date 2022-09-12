package com.drobyshevskaya.library.project.dao.impl;

import com.drobyshevskaya.library.project.dao.RoleDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Author;
import com.drobyshevskaya.library.project.entity.Role;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RoleDAOImpl implements RoleDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<Role> query = session.createQuery("from Role ORDER BY id DESC", Role.class);
        return query.getResultList();
    }

    @Override
    public Role getRoleById(int id) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Role.class, id);
    }

    @Override
    public void saveRole(Role role) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(role);
    }

    @Override
    public void deleteRole(int id) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<Role> query = session.createQuery("delete from Role where id =:idRole");
        query.setParameter("idRole", id);
        query.executeUpdate();
    }
}
