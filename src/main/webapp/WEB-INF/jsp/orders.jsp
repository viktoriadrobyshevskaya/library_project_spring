<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Orders</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
</head>

<body>

<jsp:include page="welcomeMenu.jsp"/>

<div class="album py-5 bg-light">
    <div class="container">
        <h2>Список заказов: </h2>
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">Пользователь</th>
                <th scope="col">Книга</th>
                <th scope="col">Статус заказа</th>
                <th scope="col">Операции</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach items="${orders}" var="order">
                <tr>
                    <td>${order.idUser}</td>
                    <td>${order.idBook}</td>
                    <td>${order.status}</td>
                    <td>
                        <button class="btn btn-outline-danger" name="cancel" value="cancel">
                            отклонить
                        </button>
                        <button class="btn btn-outline-success" name="approve" value="approve">
                            одобрить
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