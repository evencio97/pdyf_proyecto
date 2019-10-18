package proyecto_pdyf;

/**
 * @author Evencio Hernández
 * @author Danny Caldeira
 */
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class EmployeController {
    private Proyecto_PDyF mainClass;
    
    public EmployeController(Proyecto_PDyF mainClass){
        this.mainClass = mainClass;
    }

    public EmployeModel login(String ci, String password){
        EmployeModel employe = null;
        try {
            Statement stmt = mainClass.db_conexion.createStatement();
            String query = "SELECT * FROM employees WHERE emp_ci="+ci;
            if (!stmt.execute(query)){
                Proyecto_PDyF.print(null); return null;
            }
            ResultSet result = stmt.getResultSet();
            if (!result.first()){
                Proyecto_PDyF.print("La cedula de identidad es incorrecta."); return null;
            }
            if (!password.equals(result.getString("emp_password"))){
                Proyecto_PDyF.print("La contraseña es incorrecta."); return null;
            }
            employe = new EmployeModel(result.getString("emp_name"), result.getString("emp_lastname"), 
                                        result.getString("emp_id"), result.getString("emp_ci"), 
                                        Integer.parseInt(result.getString("emp_type")));
        } catch (Exception ex){
            Proyecto_PDyF.print(null);
            Proyecto_PDyF.printToConsole("Exception: " + ex);
        }
        return employe;
    }
}
