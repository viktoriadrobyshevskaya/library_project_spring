<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Книги</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
</head>

<body>

<jsp:include page="welcomeMenu.jsp"/>

<div class="album py-5 bg-light">
    <div class="container">

        <form action="???????????" method="POST" class="form-inline">
            <div class="form-group mx-sm-3 mb-2">
                <label> <input type="text" class="form-control" name="search" placeholder="Введите автора..."/> </label>
            </div>
            <button type="submit" class="btn btn-outline-primary mb-2" name="search" value="search">Поиск</button>
        </form>

        <form action="???????????????" method="POST">
            <div class="form-group mx-sm-3 mb-2">
                <button class="btn btn-outline-primary" name="addBook" value="addBook"><i class="bi bi-plus-circle"></i>
                    Добавить новую книгу
                </button>
            </div>
        </form>
        <h2>Список книг: </h2>
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">Название</th>
                <th scope="col">ID Автора</th>
                <th scope="col">Год публикации</th>
                <th scope="col">Число экземпляров</th>
                <th scope="col">Операции</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>${book.title}</td>
                    <td>${book.id_author}</td>
                    <td>${book.yearOfPublication}</td>
                    <td>${book.numberOfCopies}</td>
                    <td>
                        <button type="submit" class="btn btn-outline-primary" name="edit" value="edit">редактировать
                        </button>
                        <button type="submit" class="btn btn-outline-danger" name="remove" value="remove">удалить
                        </button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>