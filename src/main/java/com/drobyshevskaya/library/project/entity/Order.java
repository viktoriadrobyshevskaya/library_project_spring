package com.drobyshevskaya.library.project.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "id_user")
    private int idUser;

    @Column(name = "id_book")
    private int idBook;

    @Column(name = "status")
    private String status;

    public Order() {
    }

    public Order(int id, int idUser, int idBook, String status) {
        this.id = id;
        this.idUser = idUser;
        this.idBook = idBook;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && idUser == order.idUser && idBook == order.idBook && Objects.equals(status, order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idUser, idBook, status);
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", idUser=" + idUser + ", idBook=" + idBook + ", status='" + status + '\'' + '}';
    }
}
