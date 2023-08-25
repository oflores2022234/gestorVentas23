<%-- 
    Document   : Carrito
    Created on : 24/08/2023, 11:41:28 PM
    Author     : A_flo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>CÓDIGO</th>
                                    <th>NOMBRE</th>
                                    <th>PRECIO</th>
                                    <th>STOCK</th>
                                    <th>ESTADO</th>
                                    <th>SUB-TOTAL</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td class="d-flex">
                                        <input type="text" size="40" style="width:50px">
                                    </td>

                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <div class="card-footer d-flex">
                        <div class="col-sm-4 ml-auto">
                            <span>TOTAL</span>
                            <input type="text" name="txtTotal" value="" class="form-control">
                        </div>
                    </div>

                </div>
            </div>
    </body>
</html>
