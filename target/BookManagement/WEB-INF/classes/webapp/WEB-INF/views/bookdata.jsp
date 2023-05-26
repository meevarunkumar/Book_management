<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 5/15/2023
  Time: 6:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page  contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>

    <title>Book Detail </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <style>
        table{
            margin-top: 200px;
            border-collapse: collapse;
            margin-left: 732px ;
        }
        th , td{
            border: 2px solid;
            padding: 5px;
            text-align: center;
        }
        a{
            text-decoration: none;
            color: white;
        }
        .container {
            margin-left: 900px;
            margin-top: 100px;
        }
        button {
            border-radius: 5px;
            cursor: pointer;
            background-color: #0d6efd;
            color: white;
        }
        button:hover{
            background-color: black;
            color: white;
        }

    </style>
</head>
<body>

<table>

    <tr>
        <th> Book ID </th>
        <th> Book Name</th>
        <th> Book Pages</th>
        <th> Book Price</th>
        <th colspan="2" > Action</th>
    </tr>

    <tr>
        <td> ${book.id} </td>
        <td>${book.name}</td>
        <td>${book.pages}</td>
        <td>${book.price}</td>
        <td> <button> <a href="bookdata/?id=${book.id}"> Update </a> </button> </td>
        <td> <button> <a href="delete/?id=${book.id}"> Delete </a></button></td>
    </tr>

</table>
<div class="container">
    <a class="btn btn-primary" href="form">  Home </a>
    <a class="btn btn-primary" href="getBookList">  Back  </a>
</div>

</body>
</html>
