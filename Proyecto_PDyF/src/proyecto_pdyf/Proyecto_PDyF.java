package proyecto_pdyf;

/**
 * @author Evencio Hernández
 * @author Danny Caldeira
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Windows.LoginInterface;

public class Proyecto_PDyF {
    
    public Connection db_conexion = null;
    private User user = null;
    
    public static void main(String[] args) {
        try{
            Proyecto_PDyF mainClass = new Proyecto_PDyF();
            mainClass.start();
        } catch (Exception e){
            Proyecto_PDyF.print(null);
            e.printStackTrace();
        }
    }
    
    public static void print(String msg){
        msg = msg!=null? msg:"Lo siento a ocurrido un error, por favor intente de nuevo.";
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void printToConsole(String msg){
        System.out.println(msg);
    }
    
    public void conectToDB() {
        String database = "u887908225_pdyf";
        String hostname = "sql172.main-hosting.eu";
        String port = "3306";
        String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false&autoReconnect=true";
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
            Proyecto_PDyF.print("No se pudo conectar con la base datos.");
            Proyecto_PDyF.printToConsole("Exception: "+e);
        }
        db_conexion = conn;
    }
    
    public void start(){
        conectToDB();
        if (db_conexion == null) System.exit(0);
        //Mostramos loginInterface
        LoginInterface login = new LoginInterface(this);
        login.setVisible(true);
    }
    
    public void login(String ci, String password){
        user = new User(this);
        user.login(ci, password);
    }
}
