/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author Gustavo
 */
public class VentaDetalle {
    int id_Venta;
    int id_Producto;
    int cantidad;
    int precioUnitario;
    int total;

    public VentaDetalle(int id_Venta, int id_Producto, int cantidad, int precioUnitario, int total) {
        this.id_Venta = id_Venta;
        this.id_Producto = id_Producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total = total;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    @Override
    public String toString() {
        return "VentaDetalle{" + "id_Venta=" + id_Venta + ", id_Producto=" + id_Producto + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", total=" + total + '}';
    }
}
