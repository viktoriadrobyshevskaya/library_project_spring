package com.drobyshevskaya.library.project.dao;

import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.UserDetails;

import java.util.List;

public interface UserDetailsDAO {

    public List<UserDetails> getAllUserDetails() throws DAOException;

    public UserDetails getUserDetailsById(int id) throws DAOException;

    public void saveUserDetails(UserDetails userDetails) throws DAOException;

    public void deleteUserDetails(int id) throws DAOException;

}
