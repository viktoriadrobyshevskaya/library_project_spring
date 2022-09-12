package com.drobyshevskaya.library.project.service;

import com.drobyshevskaya.library.project.entity.Order;
import com.drobyshevskaya.library.project.service.exception.ServiceException;

import java.util.List;

public interface OrderService {

    public List<Order> getAllOrders() throws ServiceException;

    public Order getOrderById(int id) throws ServiceException;

    public void saveOrder(Order order) throws ServiceException;

    public void removeOrder(int id) throws ServiceException;

}
