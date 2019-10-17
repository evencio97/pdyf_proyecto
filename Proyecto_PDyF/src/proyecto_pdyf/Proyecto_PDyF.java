package proyecto_pdyf;

/**
 * @author Evencio Hernández
 * @author Danny Caldeira
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Proyecto_PDyF {
    
    private Connection db_conexion;
    
    public static void main(String[] args) {
        try{
            Proyecto_PDyF mainClass = new Proyecto_PDyF();
            mainClass.start();
        } catch (Exception e){
            Proyecto_PDyF.print("Lo siento a ocurrido un error, por favor intente de nuevo.");
            e.printStackTrace();
        }
    }
    
    public static void print(String msg){
        JOptionPane.showMessageDialog(null,msg);
    }
    
    public static void printToConsole(String msg){
        System.out.println(msg);
    }
    
    public void conectToDB() {
        String database = "u887908225_pdyf";
        String hostname = "sql172.main-hosting.eu";
        String port = "3306";
        String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
        // Nombre de usuario
        String username = "u887908225_pdyf";
        // Clave de usuario
        String password = "pdyf2019";
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            Proyecto_PDyF.printToConsole("Conexion establecida con la base datos\n"
                    +"SMDB:"+conn.getMetaData().getDatabaseProductName()
                    +" version:"+conn.getMetaData().getDatabaseProductVersion());
        } catch (ClassNotFoundException | SQLException e) {
            Proyecto_PDyF.print("Error: no se pudo conectar con la base datos.");
            Proyecto_PDyF.printToConsole("Exception: "+e);
        }
        db_conexion = conn;
    }
    
    public void start(){
        conectToDB();
    }
}
