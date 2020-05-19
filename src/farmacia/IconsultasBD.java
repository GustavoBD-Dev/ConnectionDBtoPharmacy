/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public interface IconsultasBD {
    
    void insertarPersonal(int id_personal, String nombre, String domicilio, int edad);
    void modificarPersonal(int id_personal, String nombre, String domicilio, int edad);
    ArrayList<Personal> consultarPersonal();
    void borrarPersonal(int id);
    Personal buscarPersonalPorID(int id);
    
    void insertarMedicamento(int id_producto, String nombreComercial, String nombreGenerico, 
            String presentacion, String formaFarmaceutica, String condicionVenta, 
            String caducidad, String fabricante, int stock, int precio);
    void modificarMedicamento(int id_producto, String nombreComercial, String nombreGenerico, 
            String presentacion, String formaFarmaceutica, String condicionVenta, 
            String caducidad, String fabricante, int stock, int precio);
    ArrayList<Medicamento> consultarMedicamentos();
    void borrarMedicamento(int id_producto);
    Medicamento buscarMedicamentoPorID(int id_producto);
    
    void nuevaVenta(int id_venta, int id_personal, String fecha, String hora, int total, int id_cliente);
    ArrayList<Venta> consultarVentas(int id_personal);
    void insertarVentaDetalle(int id_venta, int id_producto, int cantidad, int precioUnitario, int total);
    void actualizarStock(int id_producto, int cantidad);
    
    void insertarProductoHigiene(int id_prod, String nombre, String marca, 
            String presentacion, String caducidad, int precio, int stock);
    void modificarProductoHigiene(int id_prod, String nombre, String marca, 
            String presentacion, String caducidad, int precio, int stock);
    ArrayList<ProductoHigiene> consultarProductosHigiene();
    void borrarProductoHigiene(int id_producto);
    ProductoHigiene buscarProductoHigienePorID(int id_producto);
    
   
}
