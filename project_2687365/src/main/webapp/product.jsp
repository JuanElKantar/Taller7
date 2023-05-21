<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <!-- METADATA-->
    <!-- charset para caracteres especiales-->
    <meta charset="utf-8">
    <!-- author-->
    <meta name="author" content="Juan El Kantar">
    <!--Description -->
    <meta name="description" content="Formulario del Producto">
    <!--Keywords-->
    <meta name="keywords" content="registro Usuario, formulario de registro, crear cuenta,registro en linea">
    <!-- minium responsive viewport-->
    <meta name="viewport" content="width=devide-width, initial-scale=1">
    <!-- TITLE-->
    <title>Formulario Producto</title>
    <!-- FAVICON-->
    <link rel="icon" type="image/x-icon" href="./img/logo.png">
    <!-- CSS-->
    <!-- bootstrap css / icons-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <!--custom css-->
    <link rel="stylesheet" href="./css/signing.css">
    <link rel="stylesheet" href="./css/styles.css">
    <style>
        body {
            background-image: url('./img/fondo.jpg');
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>
</head>
<body class="text-center">
<!-- login form -->
<main class="form-signing w-100 m-auto">
    <form action="registerProduct" method="post">
        <img class="mb-4" src="./img/logo.png" alt="MY APP" width=100>
        <h4 class="text-secondary">G12</h4>
        <h1 class="h5 mb-3 fw-normal" style="color:#376FA3">Producto</h1>
        <div class="form-floating">
            <input type="text" name="product_name" class="form-control" id="floatingName" placeholder="Ingrese el Nombre del Producto" required
                   pattern="[A-Za-z ]{2,40}">
            <label for="floatingName">Nombre:</label>
        </div>
        <div class="form-floating">
            <input type="number" name="product_value" class="form-control" id="floatingValue" placeholder="Ingrese el Valor del Producto" required
                   pattern="[0-9]{2,40}">
            <label for="floatingValue">Precio:</label>
        </div>
        <div class="form-floating">
            <input type="number" name="category_id" class="form-control" id="floatingId"
                   placeholder="Ingrese el Numero de la Categoria" required
                   pattern="[0-9]{60}">
            <label for="floatingId">Categoria:</label>
        </div>
        <button class="w-100 btn btn-lg btn-primary" type="submit">Enviar</button>
        <div id="register">
            <a href="form.jsp">Registrarse</a>
        </div>
    </form>

</main>
<!-- Bootstrap script-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJL+0I4"
        crossorigin="anonymous"></script>
</body>
</html>
