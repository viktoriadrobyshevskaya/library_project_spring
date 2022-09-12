package com.drobyshevskaya.library.project.service.impl;

import com.drobyshevskaya.library.project.dao.OrderDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Order;
import com.drobyshevskaya.library.project.service.OrderService;
import com.drobyshevskaya.library.project.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDAO orderDAO;

    @Override
    @Transactional
    public List<Order> getAllOrders() throws ServiceException {
        try {
            return orderDAO.getAllOrders();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public Order getOrderById(int id) throws ServiceException {
        try {
            return orderDAO.getOrderById(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void saveOrder(Order order) throws ServiceException {
        try {
            orderDAO.saveOrder(order);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void removeOrder(int id) throws ServiceException {
        try {
            orderDAO.removeOrder(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
