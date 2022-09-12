package com.drobyshevskaya.library.project.dao;

import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Book;

import java.util.List;

public interface BookDAO {

    public List<Book> showAllBooks() throws DAOException;

    public Book getBookById(int bookId) throws DAOException;

    public void saveBook(Book book) throws DAOException;

    public void deleteBookById(int id) throws DAOException;

}
