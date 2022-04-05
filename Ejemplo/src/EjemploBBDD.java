
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EjemploBBDD {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String cadenaConexion = "jdbc:oracle:thin:@localhost:1521/XE";
            Connection conexion = DriverManager.getConnection(cadenaConexion, "ejemplo", "ejemplo");
            Statement stmt = conexion.createStatement();
            String query = "INSERT INTO personas (id, nombre, apellido, edad) VALUES (789416123, 'Alejandro','Perez', 22)";
            ResultSet rs = stmt.executeQuery(query);
            stmt.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
