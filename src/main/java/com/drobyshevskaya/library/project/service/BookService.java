package com.drobyshevskaya.library.project.service;

import com.drobyshevskaya.library.project.entity.Book;
import com.drobyshevskaya.library.project.service.exception.ServiceException;

import java.util.List;

public interface BookService {

    public List<Book> showAllBooks() throws ServiceException;

    public Book getBookById(int bookId) throws ServiceException;

    public void saveBook(Book book) throws ServiceException;

    public void deleteBookById(int id) throws ServiceException;

}
