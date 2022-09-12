package com.drobyshevskaya.library.project.service;

import com.drobyshevskaya.library.project.entity.User;
import com.drobyshevskaya.library.project.service.exception.ServiceException;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers() throws ServiceException;

    public User getUserById(int id) throws ServiceException;

    public void saveUser(User user) throws ServiceException;

    public void deleteUser(int id) throws ServiceException;
}
