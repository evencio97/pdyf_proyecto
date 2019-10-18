package proyecto_pdyf;

/**
 * @author Evencio Hernández
 * @author Danny Caldeira
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Windows.*;

public class Proyecto_PDyF {
    
    // CoarseGrainedObject
    private EmployeCGO employeCGO = null;
    // Interfaces
    private LoginInterface login = null;
    private DashboardInterface dashboard = null;
    
    public static void main(String[] args) {
        try{
            Proyecto_PDyF mainClass = new Proyecto_PDyF();
            mainClass.start();
        } catch (Exception e){
            print(null);
            printToConsole("Exception: "+e);
        }
    }
    
    public static void print(String msg){
        msg = msg!=null? msg:"Lo siento a ocurrido un error, por favor intente de nuevo.";
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void printToConsole(String msg){
        System.out.println(msg);
    }
    
    public void start(){
        //Mostramos loginInterface
        login = new LoginInterface(this);
        login.setVisible(true);
    }
    
    public void exit(){
        System.exit(0);
    }
    
    public void login(String ci, String password){
        employeCGO = new EmployeCGO();
        if (employeCGO.login(ci, password)){
            login.setVisible(false);login.dispose();
            dashboard = new DashboardInterface(this);
            dashboard.setVisible(true);
        }
    }
    
    public String getFullName(){
        return employeCGO.getFullName();
    }
    
    public String getType(){
        return employeCGO.getType();
    }
}
