/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Cliente {
    
    private int codigoCliente;
    private String DPICliente;
    private String nombresCliente;
    private String direccionCliente;
    private String estado;

    public Cliente() {
    }

    public Cliente(int codigoCliente, String DPICliente, String nombresCliente, String direccionCliente, String estado) {
        this.codigoCliente = codigoCliente;
        this.DPICliente = DPICliente;
        this.nombresCliente = nombresCliente;
        this.direccionCliente = direccionCliente;
        this.estado = estado;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDPICliente() {
        return DPICliente;
    }

    public void setDPICliente(String DPICliente) {
        this.DPICliente = DPICliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "codigoCliente=" + codigoCliente + ", DPICliente=" + DPICliente + ", nombresCliente=" + nombresCliente + ", direccionCliente=" + direccionCliente + ", estado=" + estado + '}';
    }
    
}