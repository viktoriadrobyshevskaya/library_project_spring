package com.drobyshevskaya.library.project.dao;


import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers() throws DAOException;

    public User getUserById(int id) throws DAOException;

    public void saveUser(User user) throws DAOException;

    public void deleteUser(int id) throws DAOException;

}
