package com.drobyshevskaya.library.project.service;

import com.drobyshevskaya.library.project.entity.Author;
import com.drobyshevskaya.library.project.service.exception.ServiceException;

import java.util.List;

public interface AuthorService {

    public List<Author> getAllAuthors() throws ServiceException;

    public Author getAuthorById(int id) throws ServiceException;

    public void saveAuthor(Author author) throws ServiceException;

    public void removeAuthor(int id) throws ServiceException;

}
