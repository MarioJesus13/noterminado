<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <title>STI</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="/css/tooltip.css" type="text/css">
        <link rel="stylesheet" href="/css/horizontal-menu/materialize.css" type="text/css">
        <link rel="stylesheet" href="/css/jquery.dataTables.min.css" type="text/css">
        <link rel="stylesheet" href="/css/jquery.dataTables_themeroller.css" type="text/css">
        <link rel="stylesheet" href="/css/style.css" type="text/css">
        <link rel="stylesheet" href="/css/sweetalert.css" type="text/css">
        <script type="text/javascript" src="js/sweetalert.min.js"></script>
        <script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
        <script type="text/javascript" src="js/alertas.js"></script>
    </head>
    <body>
    <script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="/js/materialize.js"></script>
    <script type="text/javascript" src="/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="/js/scrollspy.js"></script>
    <script>
    function Eliminar_Ejercicio(id) {
        var mensaje = confirm(String.fromCharCode(191)+"Desea Eliminar Este Ejercicio?");
        if (mensaje){
            window.location="Eliminar_Ejercicio.jsp?idejercicio="+id;
        }
    }
    </script>
    <jsp:include page="menu.jsp"></jsp:include>