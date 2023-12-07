<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/7/2023
  Time: 3:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Blog
    </title>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<center><h1>Danh sach</h1></center>
<div class="container">
    <table class="table table-dark" border="1">
        <thead>
        <tr>
            <th >ID</th>
            <th >Content</th>
            <th >Title</th>
            <th scope="col3" >Time</th>
            <th >Liké</th>
            <th >Category</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items='${List}' var="lists">
            <tr>
                <td>${lists.id}</td>
                <td>${lists.content}</td>
                <td>${lists.title}</td>
                <td>${lists.time}</td>
                <td>${lists.likes}</td>
                <td>${lists.category}</td>
                <td><a href="/blog?action=delete&id=${lists.id}">Xóa </a></td>
                <td><a href="/blog?action=edit&id=${lists.id}">Sửa </a></td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>