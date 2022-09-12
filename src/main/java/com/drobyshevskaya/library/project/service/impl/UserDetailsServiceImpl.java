package com.drobyshevskaya.library.project.service.impl;

import com.drobyshevskaya.library.project.dao.UserDetailsDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.UserDetails;
import com.drobyshevskaya.library.project.service.UserDetailsService;
import com.drobyshevskaya.library.project.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserDetailsDAO userDetailsDAO;

    @Override
    @Transactional
    public List<UserDetails> getAllUserDetails() throws ServiceException {
        try {
            return userDetailsDAO.getAllUserDetails();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public UserDetails getUserDetailsById(int id) throws ServiceException {
        try {
            return userDetailsDAO.getUserDetailsById(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void saveUserDetails(UserDetails userDetails) throws ServiceException {
        try {
            userDetailsDAO.saveUserDetails(userDetails);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void deleteUserDetails(int id) throws ServiceException {
        try {
            userDetailsDAO.deleteUserDetails(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
