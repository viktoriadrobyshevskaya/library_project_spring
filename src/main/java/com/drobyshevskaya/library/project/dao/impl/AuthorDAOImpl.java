package com.drobyshevskaya.library.project.dao.impl;

import com.drobyshevskaya.library.project.dao.AuthorDAO;
import com.drobyshevskaya.library.project.dao.exception.DAOException;
import com.drobyshevskaya.library.project.entity.Author;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AuthorDAOImpl implements AuthorDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Author> getAllAuthors() throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<Author> query = session.createQuery("from Author ORDER BY id_author DESC", Author.class);
        return query.getResultList();
    }

    @Override
    public Author getAuthorById(int id) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Author.class, id);
    }


    @Override
    public void saveAuthor(Author author) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(author);
    }

    @Override
    public void removeAuthor(int id) throws DAOException {
        Session session = entityManager.unwrap(Session.class);
        Query<Author> query = session.createQuery("delete from Author where id_author =:idAuthor");
        query.setParameter("idAuthor", id);
        query.executeUpdate();
    }

}
