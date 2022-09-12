package com.drobyshevskaya.library.project.dao;


import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Order;

import java.util.List;

public interface OrderDAO {

    public List<Order> getAllOrders() throws DAOException;

    public Order getOrderById(int id) throws DAOException;

    public void saveOrder(Order order) throws DAOException;

    public void removeOrder(int id) throws DAOException;
}
