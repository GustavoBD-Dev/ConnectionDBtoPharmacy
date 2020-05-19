
package farmacia;

public class Proveedor {
    int id;
    String nombre;
    String producto;
    String telefono;

    public Proveedor(int id, String nombre, String producto, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.producto = producto;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
