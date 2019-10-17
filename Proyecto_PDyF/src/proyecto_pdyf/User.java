package proyecto_pdyf;

/**
 * @author Evencio Hernández
 * @author Danny Caldeira
 */
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class User {
    private String name;
    private String lastname;
    private String id;
    private String ci;
    private int type;
    private Proyecto_PDyF mainClass;
    
    public User(Proyecto_PDyF mainClass){
        this.mainClass = mainClass;
    }

    public void login(String ci, String password){
        try {
            Statement stmt = mainClass.db_conexion.createStatement();
            String query = "SELECT * FROM employees WHERE emp_ci="+ci;
            if (!stmt.execute(query)){
                Proyecto_PDyF.print(null);
                return;
            }
            ResultSet result = stmt.getResultSet();
            if (!result.first()){
                Proyecto_PDyF.print("La cedula de identidad es incorrecta.");
                return;
            }
            if (!password.equals(result.getString("emp_password"))){
                Proyecto_PDyF.print("La contraseña es incorrecta.");
                return;
            }
            name = result.getString("emp_name"); lastname = result.getString("emp_lastname");
            id = result.getString("emp_id"); this.ci = result.getString("emp_ci");
            type =  Integer.parseInt(result.getString("emp_type"));
            // Success
            Proyecto_PDyF.print("Bienvenido "+(type == 1? "Administrador":"Investigador")+" "+name+" "+lastname);
        }
        catch (Exception ex){
            Proyecto_PDyF.print(null);
            Proyecto_PDyF.printToConsole("Exception: " + ex);
        }
    }
}
