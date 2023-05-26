<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 5/15/2023
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Registeration Successfull</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<style >
    .container{
        margin-left: 300px;
        margin-top: 100px;
    }
    .buttons{
        margin-top: 100px;
        margin-left: 750px;
        width: 373px;
    }
    a{
        padding-right: 200px;
    }
</style>
</head>
<body>
<div class="container">
<div class="card">
    <div class="card-body">
        <h1 align="center"> SucessFully Added ! ${ book.name} </h1>
    </div>

</div>

</div>
<div class="container-fluid buttons">
<a class="btn btn-primary" href="getbooklist">  Show Book List </a>
<a class="btn btn-primary" href="home">  Home </a>


</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>