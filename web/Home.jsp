<%-- 
    Document   : Home
    Created on : 24/08/2023, 09:13:22 PM
    Author     : A_flo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="container mt-6 ">
            <div class="row justify-content-center">
                <div class="col-lg-8">
                    <div class="card col-sm-10 bg-info" class="radius:500px">

                        <div class="form-group text-center">
                            <h3>Gestor Ventas</h3>
                            <img src="img/oFlores-2022234.png" alt="80" width="100"/><br>
                            <h5>Oscar Alejandro Flores Yllescas</h5>
                        </div>
                        <div class="form-group text-center">
                            <h5>Carné: 2022234</h5>
                        </div>
                        <div class="form-group text-center">
                            <h5>Sección Técnica: IN5VB</h5>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        
        <div class="container mt-4 col-lg-6">
            <div class="card col-sm-10">
                <div class="card-body">
                    <form class="form-sing" action="Validar" method="POST">
                        <div class="form-group text-center">
                            <h3>Sobre El Proyecto</h3>
                        </div>
                        <div class="form-group">
                            <p>Este es un proyecto gestor de ventas, en donde se tiene el objetivo de obtener
                            los conocimientos necesarios sobre el desarrollo web utilizando JavaEE y otros lenguajes de programación.
                            El proyecto tiene como objetivo ser una tienda en general, en la cual se lleve la información de los productos,
                            empleados, clientes.
                            </p>
                        </div>
                    </form>
                </div>
            </div>
        </div>




        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>   
    </body>
</html>
