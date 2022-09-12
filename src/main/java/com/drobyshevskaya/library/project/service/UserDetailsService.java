package com.drobyshevskaya.library.project.service;

import com.drobyshevskaya.library.project.entity.UserDetails;
import com.drobyshevskaya.library.project.service.exception.ServiceException;

import java.util.List;

public interface UserDetailsService {

    public List<UserDetails> getAllUserDetails() throws ServiceException;

    public UserDetails getUserDetailsById(int id) throws ServiceException;

    public void saveUserDetails(UserDetails userDetails) throws ServiceException;

    public void deleteUserDetails(int id) throws ServiceException;
}
