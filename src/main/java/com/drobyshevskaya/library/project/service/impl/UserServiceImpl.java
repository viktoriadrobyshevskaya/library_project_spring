package com.drobyshevskaya.library.project.service.impl;


import com.drobyshevskaya.library.project.dao.UserDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.User;
import com.drobyshevskaya.library.project.service.UserService;
import com.drobyshevskaya.library.project.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    @Transactional
    public List<User> getAllUsers() throws ServiceException {
        try {
            return userDAO.getAllUsers();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public User getUserById(int id) throws ServiceException {
        try {
            return userDAO.getUserById(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void saveUser(User user) throws ServiceException {
        try {
            userDAO.saveUser(user);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void deleteUser(int id) throws ServiceException {
        try {
            userDAO.deleteUser(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
