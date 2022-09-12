package com.drobyshevskaya.library.project.service.impl;


import com.drobyshevskaya.library.project.dao.RoleDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Role;
import com.drobyshevskaya.library.project.service.RoleService;
import com.drobyshevskaya.library.project.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDAO roleDAO;

    @Override
    @Transactional
    public List<Role> getAllRoles() throws ServiceException {
        try {
            return roleDAO.getAllRoles();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public Role getRoleById(int id) throws ServiceException {
        try {
            return roleDAO.getRoleById(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void saveRole(Role role) throws ServiceException {
        try {
            roleDAO.saveRole(role);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void deleteRole(int id) throws ServiceException {
        try {
            roleDAO.deleteRole(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
