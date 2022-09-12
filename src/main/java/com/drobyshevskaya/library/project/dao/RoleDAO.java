package com.drobyshevskaya.library.project.dao;

import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Role;

import java.util.List;

public interface RoleDAO {

    public List<Role> getAllRoles() throws DAOException;

    public Role getRoleById(int id) throws DAOException;

    public void saveRole(Role role) throws DAOException;

    public void deleteRole(int id) throws DAOException;
}
