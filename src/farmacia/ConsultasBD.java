package farmacia;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultasBD implements IconsultasBD {

    // Aqui se crea una instancia del conector 
    MySQLBD baseDatos = new MySQLBD().conectar("localhost", "farmacia", "root", "");
    // aqui se implementan los metodos 

    @Override
    public void insertarPersonal(int id_personal, String nombre, String domicilio, int edad) {
        //String sql = "INSERT INTO `personal` (`id_personal`, `nombre`, `domicilio`, `edad`) VALUES (?,?,?,?)";
        String sql = "INSERT INTO personal VALUES (?,?,?,?)";
        try {
            PreparedStatement psInsertar = baseDatos.getConnection().prepareStatement(sql);
            psInsertar.setInt(1, id_personal);
            psInsertar.setString(2, nombre);
            psInsertar.setString(3, domicilio);
            psInsertar.setInt(4, edad);
            if (baseDatos.ejecutar(psInsertar)) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al insertar!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un problema!!");
        }
    }

    @Override
    public void modificarPersonal(int id_personal, String nombre, String domicilio, int edad) {
        String sql = "UPDATE personal SET id_personal = ?, nombre = ?,"
                + "domicilio = ?, edad = ? WHERE id_personal = ?";
        try {
            PreparedStatement psModificar = baseDatos.getConnection().prepareStatement(sql);
            psModificar.setInt(1, id_personal);
            psModificar.setString(2, nombre);
            psModificar.setString(3, domicilio);
            psModificar.setInt(4, edad);
            psModificar.setInt(5, id_personal);
            if (baseDatos.ejecutar(psModificar)) {
                JOptionPane.showMessageDialog(null, "Cambio exitoso!!");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema!!");
        }
    }

    // Metodo que devuelve ArrayList de tipo 
    @Override
    public ArrayList<Personal> consultarPersonal() {
        // incializamos el array donde se lamacenaran los datos
        ArrayList<Personal> listaPersonal = new ArrayList<>();
        PreparedStatement psBuscar = null;
        String sql = "SELECT * FROM `personal`";
        try {
            psBuscar = baseDatos.getConnection().prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        Personal personal = null;
        ResultSet rs = baseDatos.consultar(psBuscar);
        if (rs != null) {
            try {
                while (rs.next()) {
                    personal = new Personal(
                            rs.getInt("id_personal"),
                            rs.getString("nombre"),
                            rs.getString("domicilio"),
                            rs.getInt("edad"));
                    listaPersonal.add(personal);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listaPersonal;
    }

    @Override
    public void borrarPersonal(int id) {
        String sql = "DELETE FROM personal WHERE id_personal = ?";
        try {
            PreparedStatement psBorrar
                    = baseDatos.getConnection().prepareStatement(sql);
            psBorrar.setInt(1, id);
            if (baseDatos.ejecutar(psBorrar)) {
                JOptionPane.showMessageDialog(null, "Borrado exitoso");
            } else {
                System.out.println("Ocurrio un problema al borrar");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public Personal buscarPersonalPorID(int id) {
        PreparedStatement psBuscar = null;
        String sql = "SELECT * FROM personal WHERE id_personal = ?";
        // Genera la consulta 
        try {
            psBuscar = baseDatos.getConnection().prepareStatement(sql);
            psBuscar.setInt(1, id);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        Personal personal = null;
        ResultSet rs = baseDatos.consultar(psBuscar);
        if (rs != null) {
            try {
                while (rs.next()) {
                    personal = new Personal(
                            rs.getInt("id_personal"),
                            rs.getString("nombre"),
                            rs.getString("domicilio"),
                            rs.getInt("edad"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return personal;
    }

    @Override
    public void insertarMedicamento(int id_producto, String nombreComercial,
            String nombreGenerico, String presentacion, String formaFarmaceutica,
            String condicionVenta, String caducidad, String fabricante,
            int stock, int precio) {
        String sql = "INSERT INTO `medicamento` VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement psInsertar = baseDatos.getConnection().prepareStatement(sql);
            psInsertar.setInt(1, id_producto);
            psInsertar.setString(2, nombreComercial);
            psInsertar.setString(3, nombreGenerico);
            psInsertar.setString(4, presentacion);
            psInsertar.setString(5, formaFarmaceutica);
            psInsertar.setString(6, condicionVenta);
            psInsertar.setString(7, caducidad);
            psInsertar.setString(8, fabricante);
            psInsertar.setInt(9, stock);
            psInsertar.setInt(10, precio);

            if (baseDatos.ejecutar(psInsertar)) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al insertar !!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un problema!!");
        }
    }

    @Override
    public void modificarMedicamento(int id_producto, String nombreComercial,
            String nombreGenerico, String presentacion, String formaFarmaceutica,
            String condicionVenta, String caducidad, String fabricante,
            int stock, int precio) {
        String sql = "UPDATE medicamento SET id_producto = ?, nombreComercial = ?,"
                + "nombreGenerico = ?, presentacion = ?, formaFarmaceutica = ?, "
                + "condicionVenta = ?, caducidad = ?, fabricante = ?, "
                + "stock = ?, precio = ? WHERE id_producto = ?";
        try {
            PreparedStatement psModificar = baseDatos.getConnection().prepareStatement(sql);
            psModificar.setInt(1, id_producto);
            psModificar.setString(2, nombreComercial);
            psModificar.setString(3, nombreGenerico);
            psModificar.setString(4, presentacion);
            psModificar.setString(5, formaFarmaceutica);
            psModificar.setString(6, condicionVenta);
            psModificar.setString(7, caducidad);
            psModificar.setString(8, fabricante);
            psModificar.setInt(9, stock);
            psModificar.setInt(10, precio);
            psModificar.setInt(11, id_producto);
            if (baseDatos.ejecutar(psModificar)) {
                JOptionPane.showMessageDialog(null, "Cambio exitoso!!");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema!!");
        }

    }

    // metodo que deviuelve un Array del tipo Medicamento 
    @Override
    public ArrayList<Medicamento> consultarMedicamentos() {
        // incializamos el Array del tipo Medicamento
        ArrayList<Medicamento> listaMedicamento = new ArrayList<>();
        PreparedStatement psBuscar = null;
        // preparamos la sentencia 
        String sql = "SELECT * FROM `medicamento`";
        // realizamos la consulta 
        try {
            psBuscar = baseDatos.getConnection().prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // creamosnuna instancia del tipo Medicamento 
        Medicamento medicamento = null;
        // realizamos la consulta 
        ResultSet rs = baseDatos.consultar(psBuscar);
        // si la tabla no esta vacia 
        if (rs != null) {
            try {
                while (rs.next()) {
                    // creamos nuestro objeto de tipo medicamento 
                    //  con los dtos de cada columna
                    medicamento = new Medicamento(
                            rs.getInt("id_producto"),
                            rs.getString("nombreComercial"),
                            rs.getString("nombreGenerico"),
                            rs.getString("presentacion"),
                            rs.getString("formaFarmaceutica"),
                            rs.getString("condicionVenta"),
                            rs.getString("caducidad"),
                            rs.getString("fabricante"),
                            rs.getInt("stock"),
                            rs.getInt("precio"));
                    // agregamos el objeto al Array
                    listaMedicamento.add(medicamento);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // devolvemos el array con los objetos
        return listaMedicamento;
    }

    @Override
    public void borrarMedicamento(int id_producto) {
        String sql = "DELETE FROM `medicamento` WHERE id_producto = ?";
        // Preparar la consulta para borrar
        try {
            PreparedStatement psBorrar
                    = baseDatos.getConnection().prepareStatement(sql);
            psBorrar.setInt(1, id_producto);
            if (baseDatos.ejecutar(psBorrar)) {
                JOptionPane.showMessageDialog(null, "Borrado exitoso");
            } else {
                System.out.println("Ocurrio un problema al borrar");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public Medicamento buscarMedicamentoPorID(int id_producto) {
        PreparedStatement psBuscar = null;
        String sql = "SELECT * FROM medicamento WHERE id_producto = ?";
        // Genera la consulta 
        try {
            psBuscar = baseDatos.getConnection().prepareStatement(sql);
            psBuscar.setInt(1, id_producto);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        Medicamento medicamento = null;
        ResultSet rs = baseDatos.consultar(psBuscar);
        if (rs != null) {
            try {
                while (rs.next()) {
                    medicamento = new Medicamento(
                            rs.getInt("id_producto"),
                            rs.getString("nombreComercial"),
                            rs.getString("nombreGenerico"),
                            rs.getString("presentacion"),
                            rs.getString("formaFarmaceutica"),
                            rs.getString("condicionVenta"),
                            rs.getString("caducidad"),
                            rs.getString("fabricante"),
                            rs.getInt("stock"),
                            rs.getInt("precio"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return medicamento;
    }

    @Override
    public void nuevaVenta(int id_venta, int id_personal, String fecha,
            String hora, int total, int id_cliente) {
        String sql = "INSERT INTO ventas VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement psInsertar
                    = baseDatos.getConnection().prepareStatement(sql);
            psInsertar.setInt(1, id_venta);
            psInsertar.setInt(2, id_personal);
            psInsertar.setString(3, fecha);
            psInsertar.setString(4, hora);
            psInsertar.setInt(5, total);
            psInsertar.setInt(6, id_cliente);

            if (baseDatos.ejecutar(psInsertar)) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al insertar en ventas!!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un problema!!");
        }
    }

    @Override
    public ArrayList<Venta> consultarVentas(int id_personal) {
        ArrayList<Venta> listaVentas = new ArrayList<>();
        PreparedStatement psBuscar = null;
        String sql = "SELECT * FROM `ventas` WHERE id_personal = ?";
        try {
            psBuscar = baseDatos.getConnection().prepareStatement(sql);
            psBuscar.setInt(1, id_personal);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        Venta venta = null;
        ResultSet rs = baseDatos.consultar(psBuscar);
        if (rs != null) {
            try {
                while (rs.next()) {
                    venta = new Venta(
                            rs.getInt("id_venta"),
                            rs.getInt("id_personal"),
                            rs.getString("fecha"),
                            rs.getString("hora"),
                            rs.getInt("total"),
                            rs.getInt("id_cliente"));
                    listaVentas.add(venta);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listaVentas;
    }

    @Override
    public void insertarVentaDetalle(int id_venta, int id_producto,
            int cantidad, int precioUnitario, int total) {
        String sql = "INSERT INTO venta_detalle VALUES (?,?,?,?,?)";
        try {
            PreparedStatement psInsertar
                    = baseDatos.getConnection().prepareStatement(sql);
            psInsertar.setInt(1, id_venta);
            psInsertar.setInt(2, id_producto);
            psInsertar.setInt(3, cantidad);
            psInsertar.setInt(4, precioUnitario);
            psInsertar.setInt(5, total);

            if (baseDatos.ejecutar(psInsertar)) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al insertar en detalle_venta!!");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un problema!!");
        }
    }

    @Override
    public void insertarProductoHigiene(int id_prod, String nombre, String marca,
            String presentacion, String caducidad, int precio, int stock) {
        String sql = "INSERT INTO productohigiene VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement psInsertar = baseDatos.getConnection().prepareStatement(sql);
            psInsertar.setInt(1, id_prod);
            psInsertar.setString(2, nombre);
            psInsertar.setString(3, marca);
            psInsertar.setString(4, presentacion);
            psInsertar.setString(5, caducidad);
            psInsertar.setInt(6, precio);
            psInsertar.setInt(7, stock);
            if (baseDatos.ejecutar(psInsertar)) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al insertar!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un problema!!");
        }
    }

    @Override
    public ArrayList<ProductoHigiene> consultarProductosHigiene() {
        ArrayList<ProductoHigiene> listaProductosHigiene = new ArrayList<>();
        PreparedStatement psBuscar = null;
        String sql = "SELECT * FROM `productohigiene`";
        try {
            psBuscar = baseDatos.getConnection().prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        ProductoHigiene productoHigiene = null;
        ResultSet rs = baseDatos.consultar(psBuscar);
        if (rs != null) {
            try {
                while (rs.next()) {
                    productoHigiene = new ProductoHigiene(
                            rs.getInt("id_producto"),
                            rs.getString("nombre"),
                            rs.getString("marca"),
                            rs.getString("presentacion"),
                            rs.getString("caducidad"),
                            rs.getInt("precio"),
                            rs.getInt("stock"));
                    listaProductosHigiene.add(productoHigiene);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listaProductosHigiene;
    }

    @Override
    public void borrarProductoHigiene(int id_producto) {
        String sql = "DELETE FROM productohigiene WHERE id_producto = ?";
        try {
            PreparedStatement psBorrar
                    = baseDatos.getConnection().prepareStatement(sql);
            psBorrar.setInt(1, id_producto);
            if (baseDatos.ejecutar(psBorrar)) {
                JOptionPane.showMessageDialog(null, "Borrado exitoso");
            } else {
                System.out.println("Ocurrio un problema al borrar");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public ProductoHigiene buscarProductoHigienePorID(int id_producto) {
        PreparedStatement psBuscar = null;
        String sql = "SELECT * FROM productohigiene WHERE id_producto = ?";
        // Genera la consulta 
        try {
            psBuscar = baseDatos.getConnection().prepareStatement(sql);
            psBuscar.setInt(1, id_producto);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        ProductoHigiene productoHigiene = null;
        ResultSet rs = baseDatos.consultar(psBuscar);
        if (rs != null) {
            try {
                while (rs.next()) {
                    productoHigiene = new ProductoHigiene(
                            rs.getInt("id_producto"),
                            rs.getString("nombre"),
                            rs.getString("marca"),
                            rs.getString("presentacion"),
                            rs.getString("caducidad"),
                            rs.getInt("precio"),
                            rs.getInt("stock"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return productoHigiene;
    }

    @Override
    public void modificarProductoHigiene(int id_prod, String nombre, String marca,
            String presentacion, String caducidad, int precio, int stock) {
        String sql = "UPDATE productohigiene SET id_producto = ?, nombre = ?,"
                + "marca = ?, presentacion = ?, caducidad = ?, precio = ?, stock = ?"
                + " WHERE id_producto = ?";
        try {
            PreparedStatement psModificar = baseDatos.getConnection().prepareStatement(sql);
            psModificar.setInt(1, id_prod);
            psModificar.setString(2, nombre);
            psModificar.setString(3, marca);
            psModificar.setString(4, presentacion);
            psModificar.setString(5, caducidad);
            psModificar.setInt(6, precio);
            psModificar.setInt(7, stock);
            psModificar.setInt(8, id_prod);
            if (baseDatos.ejecutar(psModificar)) {
                JOptionPane.showMessageDialog(null, "Cambio exitoso!!");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema!!");
        }
    }

    /*
        SELECT * FROM medicamento m JOIN productohigiene p 
        ON m.id_producto = p.id_producto WHERE m.id_producto = ?
     */
    @Override
    public void actualizarStock(int id_producto, int cantidad) {
        PreparedStatement psBuscar = null;
        int stockActual = 0;
        String sqlMedicamento = "SELECT `stock` FROM `medicamento` WHERE `id_producto` = ?";
        // Genera la consulta 
        try {
            psBuscar = baseDatos.getConnection().prepareStatement(sqlMedicamento);
            psBuscar.setInt(1, id_producto);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        ResultSet rs = baseDatos.consultar(psBuscar);
        if (rs != null) {
            try {
                rs.getInt("stock");
                int nuevoStock = rs.getInt("stock");
                stockActual = nuevoStock;
            } catch (SQLException e) {
            }
        }
        // obtiene el valor de stock de tabla productosHigiene  
        psBuscar = null;
        String sqlProducto = "SELECT `stock` FROM `productohigiene` WHERE `id_producto` = ?";
        // Genera la consulta 
        try {
            psBuscar = baseDatos.getConnection().prepareStatement(sqlProducto);
            psBuscar.setInt(1, id_producto);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        rs = baseDatos.consultar(psBuscar);
        if (rs != null) {
            try {
                while (rs.next()) {
                    rs.getInt("stock");
                    int nuevoStock = rs.getInt("stock");
                    stockActual = nuevoStock;
                    System.out.println("stock producto higiene = " + nuevoStock);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se obtvo valor stock");
            }
        }
        for (int i = 0; i < cantidad; i++) {
            stockActual--;
        }
        String newsql = "UPDATE `medicamento` SET `stock`= ? WHERE id_producto = ?";
        try {
            PreparedStatement psModificar = baseDatos.getConnection().prepareStatement(newsql);
            psModificar.setInt(1, stockActual);
            psModificar.setInt(2, id_producto);
            if (baseDatos.ejecutar(psModificar)) {
                JOptionPane.showMessageDialog(null, "Cambio exitoso!!");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar!!");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema!!");
        }
        newsql = "UPDATE `productohigiene` SET `stock`= ? WHERE id_producto = ?";
        try {
            PreparedStatement psModificar = baseDatos.getConnection().prepareStatement(newsql);
            psModificar.setInt(1, stockActual);
            psModificar.setInt(2, id_producto);
            if (baseDatos.ejecutar(psModificar)) {
                JOptionPane.showMessageDialog(null, "Cambio exitoso!!");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar!!");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema!!");
        }
    }

}
