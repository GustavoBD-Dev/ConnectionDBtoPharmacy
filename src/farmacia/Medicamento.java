
package farmacia;

public class Medicamento {
    private int id_Medicamento;
    private String nombreComercial;
    private String nombreGenerico;
    private String presentacion;
    private String formaFarmaceutica;
    private String condicionVenta;
    private String caducidad;
    private String fabricante;
    private int stock;
    private int precio;
    
    public Medicamento(int id_Medicamento, String nombreComercial, 
            String nombreGenerico, String presentacion, 
            String formaFarmaceutica, String condicionVenta, 
            String caducidad, String fabricante, int stock, int precio) {
        this.id_Medicamento = id_Medicamento;
        this.nombreComercial = nombreComercial;
        this.nombreGenerico = nombreGenerico;
        this.presentacion = presentacion;
        this.formaFarmaceutica = formaFarmaceutica;
        this.condicionVenta = condicionVenta;
        this.caducidad = caducidad;
        this.fabricante = fabricante;
        this.stock = stock;
        this.precio = precio;
    }

    public int getId_Medicamento() {
        return id_Medicamento;
    }

    public void setId_Medicamento(int id_Medicamento) {
        this.id_Medicamento = id_Medicamento;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String marcaComercial) {
        this.nombreComercial = marcaComercial;
    }

    public String getNombreGenerico() {
        return nombreGenerico;
    }

    public void setNombreGenerico(String nombreGenerico) {
        this.nombreGenerico = nombreGenerico;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getCondicionVenta() {
        return condicionVenta;
    }

    public void setCondicionVenta(String condicionVenta) {
        this.condicionVenta = condicionVenta;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
   
    
}
