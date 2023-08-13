<%-- 
    Document   : RegistrarVenta
    Created on : 20/07/2023, 01:56:18 PM
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Ventas</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="Controlador?menu=Empleado" method="POST">
                        <div class="form-group">
                            <label>Número de Serie</label>
                            <input type="text" value="${venta.getNumeroSerie()}" name="txtNumeroSerie" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Fecha</label>
                            <input type="text" value="${empleado.getFechaVenta()}" name="txtFechaVenta" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Monto</label>
                            <input type="text" value="${empleado.getMonto()}" name="txtMonto" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Estado</label>
                            <input type="text" value="${empleado.getEstado()}" name="txtEstado" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Código Cliente</label>
                            <input type="text" value="${empleado.getCodigoCliente()}" name="txtCódigoCliente" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Código Cliente</label>
                            <input type="text" value="${empleado.getCodigoEmpleado()}" name="getCódigoEmpleado" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Agregar" class="btn btn-info" href="Controlador?menu=RegistrarVenta&accion=Agregar">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success" href="">
                    </form>
                </div>
            </div>
            <div class="col-sm-8">
                <table class="table table-hober">
                    <thead>
                        <tr>
                            <td>Código Venta</td>
                            <td>Número de Serie</td>
                            <td>Fecha</td>
                            <td>Monto</td>
                            <td>Estado</td>
                            <td>Código Cliente</td>
                            <td>Código Empleado</td>
                            <td>Acciones</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="venta" items="${ventas}">
                        <tr>
                            <td>${venta.getCodigoVenta()}</td>
                            <td>${venta.getNumeroSerie()}</td>
                            <td>${venta.getFechaVenta()}</td>
                            <td>${venta.getMonto()}</td>
                            <td>${venta.getEstado()}</td>
                            <td>${venta.getCodigoCliente()}</td>
                            <td>${venta.getCodigoEmpleado()}</td>
                            
                            <td>
                                <a class="btn btn-warning" href="Controlador?menu=RegistrarVenta&accion=Editar&codigoVenta=${venta.getCodigoVenta()}">Editar</a>
                                <a class="btn btn-danger" href="Eliminar">Eliminar</a>
                            </td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>            
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
