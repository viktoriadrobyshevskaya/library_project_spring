<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Авторы</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
</head>

<body>
<jsp:include page="welcomeMenu.jsp"/>
<div class="album py-5 bg-light">
    <div class="container">

        <form action="??????????" method="POST">
            <button class="btn btn-outline-primary" name="addAuthor" value="addAuthor"><i class="bi bi-plus-circle"></i> Добавить нового автора</button>
        </form>
        <br>
        <h2>Список авторов: </h2>
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">Имя</th>
                <th scope="col">Отчетсво</th>
                <th scope="col">Фамилия</th>
                <th scope="col">Год рождения</th>
                <th scope="col">Операции</th>
            </tr>
            </thead>
            <tbody>
            <c:if test="${not empty authors}">
                <c:forEach items="${authors}" var="author">
                    <tr>
                        <td>${author.name}</td>
                        <td>${author.middleName}</td>
                        <td>${author.surname}</td>
                        <td>${author.yearOfBirth}</td>
                        <td>
                            <button class="btn btn-outline-primary" name="edit" value="edit">редактировать</button>
                            <button class="btn btn-outline-danger" name="remove" value="remove">удалить</button>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
            <c:if test="${not empty author}">
                <tr>
                    <td>${author.name}</td>
                    <td>${author.middleName}</td>
                    <td>${author.surname}</td>
                    <td>${author.yearOfBirth}</td>
                    <td>
                        <button class="btn btn-outline-primary" name="edit" value="edit">редактировать</button>
                        <button class="btn btn-outline-danger" name="remove" value="remove">удалить</button>
                    </td>
                </tr>
            </c:if>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>