package com.drobyshevskaya.library.project.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usersDetails")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "id_user")
    private int idUser;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    public UserDetails() {
    }

    public UserDetails(int id, int idUser, String name, String surname, String phone, String address) {
        this.id = id;
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetails that = (UserDetails) o;
        return id == that.id && idUser == that.idUser && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(phone, that.phone) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idUser, name, surname, phone, address);
    }

    @Override
    public String toString() {
        return "UserDetails{" + "id=" + id + ", idUser=" + idUser + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", phone='" + phone + '\'' + ", address='" + address + '\'' + '}';
    }
}
