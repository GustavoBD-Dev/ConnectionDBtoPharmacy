package farmacia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLBD {

    private Connection conexion;

    public Connection getConnection() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public MySQLBD conectar(String host, String bd, String user, String pass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String cadenaConexion = "jdbc:mysql://" + host + "/" + bd + "?user=" + user + "&password=" + pass;
            conexion = DriverManager.getConnection(cadenaConexion);
            if (conexion != null) {
                System.out.println("Conexion exitosa");
            } else {
                System.out.println("Conexion no exitosa");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public ResultSet consultar(PreparedStatement ps) {
        ResultSet resultado;
        try {
            resultado = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return resultado;
    }

    public boolean ejecutar(PreparedStatement ps) {
        try {
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}