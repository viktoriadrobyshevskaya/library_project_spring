package com.drobyshevskaya.library.project.service;

import com.drobyshevskaya.library.project.entity.Role;
import com.drobyshevskaya.library.project.service.exception.ServiceException;

import java.util.List;

public interface RoleService {

    public List<Role> getAllRoles() throws ServiceException;

    public Role getRoleById(int id) throws ServiceException;

    public void saveRole(Role role) throws ServiceException;

    public void deleteRole(int id) throws ServiceException;
}
