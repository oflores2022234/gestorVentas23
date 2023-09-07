/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import modelo.Carrito;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.Empleado;
import modelo.EmpleadoDAO;
import modelo.ProductoDAO;
import modelo.Producto;
import modelo.Venta;

/**
 *
 * @author informatica
 */
public class Controlador extends HttpServlet {

    Empleado empleado = new Empleado();
    Cliente cliente = new Cliente();

    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();

    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    ClienteDAO clienteDAO = new ClienteDAO();

    Venta venta = new Venta();
    List<Venta> lista = new ArrayList<>();
    
    
    List<Carrito> listaCarrito = new ArrayList<>();
    
    int it;
    double totalPagar= 0.0;
    int cantidad;
    
    int item = 0;
    int codPro, cantid;
    String descripcion;
    Double precio, subTotal;
    

    int codEmpleado;
    int codCliente;
    int codProducto;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        } else if (menu.equals("Empleado")) {
            switch (accion) {
                case "listar":
                    List listaEmpleado = empleadoDAO.listar();
                    request.setAttribute("empleados", listaEmpleado);
                    break;
                case "Agregar":
                    String DPI = request.getParameter("txtDPIEmpleado");
                    String nombres = request.getParameter("txtNombreEmpleado");
                    String telefono = request.getParameter("txtTelefonoEmpleado");
                    String est = request.getParameter("txtEstado");
                    String user = request.getParameter("txtUsuario");
                    empleado.setDPIEmpleado(DPI);
                    empleado.setNombresEmpleado(nombres);
                    empleado.setTelefonoEmpleado(telefono);
                    empleado.setEstado(est);
                    empleado.setUsuario(user);
                    empleadoDAO.agregar(empleado);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=listar").forward(request, response);
                    break;
                case "Eliminar":
                    int codigoEmp = Integer.parseInt(request.getParameter("codigoEmpleado"));
                    empleadoDAO.eliminar(codigoEmp);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=listar").forward(request, response);
                    break;
                case "Editar":
                    codEmpleado = Integer.parseInt(request.getParameter("codigoEmpleado"));
                    Empleado e = empleadoDAO.listarCodigoEmpleado(codEmpleado);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=listar").forward(request, response);
                    break;
                case "Actualizar":
                    String DPIActualizar = request.getParameter("txtDPIEmpleado");
                    String nombresActualizar = request.getParameter("txtNombreEmpleado");
                    String telefonoActualizar = request.getParameter("txtTelefonoEmpleado");
                    String estActualizar = request.getParameter("txtEstado");
                    String userActualizar = request.getParameter("txtUsuario");
                    empleado.setDPIEmpleado(DPIActualizar);
                    empleado.setNombresEmpleado(nombresActualizar);
                    empleado.setTelefonoEmpleado(telefonoActualizar);
                    empleado.setEstado(estActualizar);
                    empleado.setUsuario(userActualizar);

                    empleado.setCodigoEmpleado(codEmpleado);
                    empleadoDAO.actualizar(empleado);

                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=listar").forward(request, response);
                    break;

            }
            request.getRequestDispatcher("Empleado.jsp").forward(request, response);

        } else if (menu.equals("Producto")) {
            switch (accion) {

                case "listar":
                    List listaProducto = productoDAO.listar();
                    System.out.println("size " + listaProducto.size());
                    request.setAttribute("productos", listaProducto);
                    break;
                case "Agregar":
                    String nombre = request.getParameter("txtNombreProducto");
                    //registro.setCantidadPresupuesto(Double.parseDouble(txtCantidadPresupuesto.getText()));
                    String precio = request.getParameter("txtPrecio");
                    String stock = request.getParameter("txtStock");
                    String est = request.getParameter("txtEstado");
                    producto.setNombreProducto(nombre);
                    producto.setPrecio(Double.parseDouble(precio));
                    producto.setStock(Integer.parseInt(stock));
                    producto.setEstado(est);
                    productoDAO.agregar(producto);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=listar").forward(request, response);
                    break;
                case "Eliminar":
                    int codigoPro = Integer.parseInt(request.getParameter("codigoProducto"));
                    productoDAO.eliminar(codigoPro);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=listar").forward(request, response);
                    break;
                case "Editar":
                    codProducto = Integer.parseInt(request.getParameter("codigoProducto"));
                    Producto p = productoDAO.listarCodigoProducto(codProducto);
                    request.setAttribute("producto", p);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nombreProducto = request.getParameter("txtNombreProducto");
                    //registro.setCantidadPresupuesto(Double.parseDouble(txtCantidadPresupuesto.getText()));
                    String precioProducto = request.getParameter("txtPrecio");
                    String stockProducto = request.getParameter("txtStock");
                    String estProducto = request.getParameter("txtEstado");
                    producto.setNombreProducto(nombreProducto);
                    producto.setPrecio(Double.parseDouble(precioProducto));
                    producto.setStock(Integer.parseInt(stockProducto));
                    producto.setEstado(estProducto);
                    producto.setCodigoProducto(codProducto);
                    productoDAO.actualizar(producto);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=listar").forward(request, response);
                    break;
                case "AgregarCarrito":
                    codProducto = Integer.parseInt(request.getParameter("codigoProducto"));
                    producto = productoDAO.listarCodigoProducto(codProducto);
                    item = item+1;
                    Carrito car=new Carrito();
                    car.setItem(item);
                    car.setCodigoProducto(producto.getCodigoProducto());
                    car.setNombreProducto(producto.getNombreProducto());
                    car.setPrecio(producto.getPrecio());
                    car.setCantidad(cantidad);
                    car.setSubTotal(cantidad*producto.getPrecio());
                    listaCarrito.add(car);
                    request.setAttribute("contador", listaCarrito.size());
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("Producto.jsp").forward(request, response);

        } else if (menu.equals("Clientes")) {

            switch (accion) {
                case "listar":
                    List listaCliente = clienteDAO.listar();
                    request.setAttribute("clientes", listaCliente);
                    break;

                case "Agregar":
                    String DPI = request.getParameter("txtDPICliente");
                    String nombres = request.getParameter("txtNombresCliente");
                    String direccion = request.getParameter("txtDireccionCliente");
                    String est = request.getParameter("txtEstado");
                    cliente.setDPICliente(DPI);
                    cliente.setNombresCliente(nombres);
                    cliente.setDireccionCliente(direccion);
                    cliente.setEstado(est);
                    clienteDAO.agregar(cliente);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=listar").forward(request, response);
                    break;
                case "Eliminar":

                    int codigoClien = Integer.parseInt(request.getParameter("codigoCliente"));
                    clienteDAO.eliminar(codigoClien);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=listar").forward(request, response);
                    break;
                case "Editar":
                    codCliente = Integer.parseInt(request.getParameter("codigoCliente"));
                    Cliente c = clienteDAO.listarCodigoCliente(codCliente);
                    request.setAttribute("cliente", c);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=listar").forward(request, response);
                    break;
                case "Actualizar":
                    String DPICliente = request.getParameter("txtDPICliente");
                    String nombresCliente = request.getParameter("txtNombresCliente");
                    String direccionCliente = request.getParameter("txtDireccionCliente");
                    String estCliente = request.getParameter("txtEstado");
                    cliente.setDPICliente(DPICliente);
                    cliente.setNombresCliente(nombresCliente);
                    cliente.setDireccionCliente(direccionCliente);
                    cliente.setEstado(estCliente);
                    cliente.setCodigoCliente(codCliente);
                    clienteDAO.actualizar(cliente);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=listar").forward(request, response);
                    break;

            }

            request.getRequestDispatcher("Clientes.jsp").forward(request, response);

        } else if (menu.equals("RegistrarVenta")) {

            switch (accion) {
                case "BuscarCliente":
                    int id = Integer.parseInt(request.getParameter("txtCodigoCliente"));
                    cliente.setCodigoCliente(id);
                    cliente = clienteDAO.buscarCliente(id);
                    request.setAttribute("cliente", cliente);
                    break;
                case "BuscarProducto":
                    int codPro = Integer.parseInt(request.getParameter("txtCodigoProducto"));
                    producto.setCodigoProducto(codPro);
                    producto = productoDAO.buscarProducto(codPro);
                    request.setAttribute("producto", producto);
                    request.setAttribute("totalPagar", totalPagar);
                    request.setAttribute("cliente", cliente);
                    break;
                case "Agregar":
                    request.setAttribute("cliente", cliente);
                    totalPagar = 0.0;
                    item = item + 1;
                    codPro = producto.getCodigoProducto();
                    descripcion = request.getParameter("txtNombreProducto");
                    precio = Double.parseDouble(request.getParameter("txtPrecio"));
                    cantid = Integer.parseInt(request.getParameter("txtCantidad"));
                    subTotal = precio * cantid;
                    venta = new Venta();
                    venta.setItem(item);
                    venta.setCodigoVenta(codPro);
                    venta.setDescripcionProd(descripcion);
                    venta.setPrecio(precio);
                    venta.setCantidad(cantid);
                    venta.setSubTotal(subTotal);
                    lista.add(venta);
                    for (int i = 0; i < lista.size(); i++) {
                        totalPagar = totalPagar + lista.get(i).getSubTotal();
                    }
                    request.setAttribute("totalPagar", totalPagar);
                    request.setAttribute("lista", lista);
                    break;
            }

            request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
        } else if (menu.equals("Home")) {
            List<Empleado> listaEmpleados = empleadoDAO.listar();
            if (!listaEmpleados.isEmpty()) {
                Empleado empleado = listaEmpleados.get(1);
                HttpSession session = request.getSession();
                session.setAttribute("usuario", empleado);
            }
            request.getRequestDispatcher("Home.jsp").forward(request, response);
        }else if (menu.equals("Carrito")) {
            request.getRequestDispatcher("Carrito.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
