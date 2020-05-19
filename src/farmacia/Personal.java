package farmacia;

/**
 *
 * @author Gustavo
 */
public class Personal {
    int id_personal;
    String nombre;
    String domicilio;
    int edad;

    public Personal(int id_personal, String nombre, String domicilio, int edad) {
        this.id_personal = id_personal;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.edad = edad;
    }

    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
