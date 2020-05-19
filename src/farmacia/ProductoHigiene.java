
package farmacia;

public class ProductoHigiene {
    int id_Producto;
    String nombre;
    String marca;
    String presentacion;
    String caducidad;
    int precio;
    int stock;

    public ProductoHigiene(int id_Producto, String nombre, String marca, String presentacion, String caducidad, int precio, int stock) {
        this.id_Producto = id_Producto;
        this.nombre = nombre;
        this.marca = marca;
        this.presentacion = presentacion;
        this.caducidad = caducidad;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
