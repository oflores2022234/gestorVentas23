<%-- 
    Document   : principal
    Created on : 14/07/2023, 05:26:50 PM
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Menú Principal</title>
    </head>
    <body> 
        <nav class="navbar navbar-expand-lg nvbar-light bg-info">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Home" target="myFrame">Home</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left:  10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Producto&accion=listar" target="myFrame">Producto</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Empleado&accion=listar" target="myFrame">Empleado</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Clientes&accion=listar" target="myFrame">Clientes</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=RegistrarVenta&accion=default" target="myFrame">Registrar Venta</a>
                    </li>
                    <li>
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Carrito" target="myFrame"><i>(<label style="color: darkorange">${contador}</label>)</i>Carrito</a>
                    </li>
                </ul>
            </div>
            
            <!-- Carrito Compras
            <div class="dropdown">
                <button  style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <img src="img/compras.png" alt="60" width="60"/><br>
                </button>
                <div class="dropdown-menu text-center" aria-labellebdy="dropdownMenuButton">
                    <a class="dropdown-item" href="Controlador?menu=Carrito" target="myFrame">Carrito de Compras</a>
                </div>
            </div> 
            -->
            
            <!--Login-->        
                    
            <div class="dropdown">
                <button  style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    ${usuario.getNombresEmpleado()}
                </button>
                <div class="dropdown-menu text-center" aria-labellebdy="dropdownMenuButton">
                    <a class="dropdown-item" href="#">
                        <img src="img/${usuario.getUsuario()}.png" alt="" width="50"/>
                    </a>
                    <a class="dropdown-item" href="#">${usuario.getUsuario()}</a>
                    <a class="dropdown-item" href="#">${usuario.getUsuario()}@kinal.edu.gt</a>
                    <div class="dropdown-divider"></div>
                    <form action="Validar" method="POST">
                        <button name="accion" name="Salir" class="dropdown-item" href="#">Salir</button>
                    </form>
                </div>
            </div>
                   
    
        </nav>          
        <div class="m-4" style="height: 646px">
            <iframe name="myFrame" style="height: 100%; width: 100%; border: none"></iframe>
        </div>


        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
