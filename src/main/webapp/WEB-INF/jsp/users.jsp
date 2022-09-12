<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Пользователи</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
</head>

<body>
<jsp:include page="welcomeMenu.jsp"/>
<div class="album py-5 bg-light">
    <div class="container">

        <form action="??????????" method="POST">
            <button class="btn btn-outline-primary" name="addUser" value="addUser"><i class="bi bi-plus-circle"></i> Добавить нового пользователя</button>
        </form>
        <br>
        <h2>Список авторов: </h2>
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">Логин</th>
                <%--<th scope="col">Пароль</th>--%>
                <th scope="col">Роль</th>
                <th scope="col">Операции</th>
            </tr>
            </thead>
            <tbody>
            <c:if test="${not empty users}">
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>${user.login}</td>
                        <%--<td>${user.password}</td>--%>
                        <td>${user.roleId}</td>
                        <td>
                            <button class="btn btn-outline-primary" name="edit" value="edit">редактировать</button>
                            <button class="btn btn-outline-danger" name="remove" value="remove">удалить</button>
                            <button class="btn btn-outline-info" name="showDetails" value="showDetails">доп.информация
                            </button>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
            <c:if test="${not empty user}">
                <tr>
                    <td>${user.login}</td>
                    <%--<td>${user.password}</td>--%>
                    <td>${user.roleId}</td>
                    <td>
                        <button class="btn btn-outline-primary" name="edit" value="edit">редактировать</button>
                        <button class="btn btn-outline-danger" name="remove" value="remove">удалить</button>
                        <button class="btn btn-outline-info" name="showDetails" value="showDetails">доп.информация
                        </button>
                    </td>
                </tr>
            </c:if>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>