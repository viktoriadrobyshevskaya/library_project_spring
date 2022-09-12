package com.drobyshevskaya.library.project.service.impl;

import com.drobyshevskaya.library.project.dao.AuthorDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Author;
import com.drobyshevskaya.library.project.service.AuthorService;
import com.drobyshevskaya.library.project.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDAO authorDAO;

    @Override
    @Transactional
    public List<Author> getAllAuthors() throws ServiceException {
        try {
            return authorDAO.getAllAuthors();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public Author getAuthorById(int id) throws ServiceException {
        try {
            return authorDAO.getAuthorById(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void saveAuthor(Author author) throws ServiceException {
        try {
            authorDAO.saveAuthor(author);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void removeAuthor(int id) throws ServiceException {
        try {
            authorDAO.removeAuthor(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
