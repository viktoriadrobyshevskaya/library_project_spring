package com.drobyshevskaya.library.project.dao.impl;

import com.drobyshevskaya.library.project.dao.BookDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Author;
import com.drobyshevskaya.library.project.entity.Book;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Book> showAllBooks() throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<Book> query = session.createQuery("from Book ORDER BY id_book DESC", Book.class);
        List<Book> books = query.getResultList();
        return books;
    }

    @Override
    public Book getBookById(int bookId) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Book.class, bookId);
    }

    @Override
    public void saveBook(Book book) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(book);
    }

    @Override
    public void deleteBookById(int id) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<Book> query = session.createQuery("delete from Book where id =:idBook");
        query.setParameter("idBook", id);
        query.executeUpdate();
    }

}
