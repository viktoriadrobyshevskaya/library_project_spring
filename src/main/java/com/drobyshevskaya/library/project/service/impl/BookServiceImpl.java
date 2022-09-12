package com.drobyshevskaya.library.project.service.impl;

import com.drobyshevskaya.library.project.dao.BookDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Book;
import com.drobyshevskaya.library.project.service.BookService;
import com.drobyshevskaya.library.project.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    @Transactional
    public List<Book> showAllBooks() throws ServiceException {
        try {
            return bookDAO.showAllBooks();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public Book getBookById(int bookId) throws ServiceException {
        try {
            return bookDAO.getBookById(bookId);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void saveBook(Book book) throws ServiceException {
        try {
            bookDAO.saveBook(book);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    @Transactional
    public void deleteBookById(int id) throws ServiceException {
        try {
            bookDAO.deleteBookById(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
