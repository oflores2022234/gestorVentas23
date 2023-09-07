package modelo;

public class Carrito {
    
    int item;
    int codigoProducto;
    String nombreProducto;
    double precio;
    int cantidad;
    double subTotal;

    public Carrito() {
    }

    public Carrito(int item, int codigoProducto, String nombreProducto, double precio, int cantidad, double subTotal) {
        this.item = item;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    
    
}
