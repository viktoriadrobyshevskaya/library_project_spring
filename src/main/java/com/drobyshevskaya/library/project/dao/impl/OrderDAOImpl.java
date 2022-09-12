package com.drobyshevskaya.library.project.dao.impl;


import com.drobyshevskaya.library.project.dao.OrderDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Author;
import com.drobyshevskaya.library.project.entity.Order;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Order> getAllOrders() throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<Order> query = session.createQuery("from Order ORDER BY id DESC", Order.class);
        return query.getResultList();
    }

    @Override
    public Order getOrderById(int id) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Order.class, id);
    }

    @Override
    public void saveOrder(Order order) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(order);
    }

    @Override
    public void removeOrder(int id) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<Order> query = session.createQuery("delete from Order where id =:idOrder");
        query.setParameter("idOrder", id);
        query.executeUpdate();
    }
}
