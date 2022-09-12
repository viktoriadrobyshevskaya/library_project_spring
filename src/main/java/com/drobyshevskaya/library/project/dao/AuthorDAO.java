package com.drobyshevskaya.library.project.dao;

import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Author;

import java.util.List;

public interface AuthorDAO {

    public List<Author> getAllAuthors() throws DAOException;

    public Author getAuthorById(int id) throws DAOException;

    public void saveAuthor(Author author) throws DAOException;

    public void removeAuthor(int id) throws DAOException;

}
