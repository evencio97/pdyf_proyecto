package proyecto_pdyf;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Evencio Hernández
 * @author Danny Caldeira
 */
public class Employe {
    private String name;
    private String lastname;
    private String id;
    private String ci;
    private int type;
    
    public boolean login(String ci, String password){
        try {
            Connection db_conexion = ConexionDBSingleton.getConexion();
            if (db_conexion == null) return false;
            Statement stmt = db_conexion.createStatement();
            String query = "SELECT * FROM employees WHERE emp_ci="+ci;
            if (!stmt.execute(query)){
                Proyecto_PDyF.print(null); return false;
            }
            ResultSet result = stmt.getResultSet();
            if (!result.first()){
                Proyecto_PDyF.print("La cedula de identidad es incorrecta."); return false;
            }
            if (!password.equals(result.getString("emp_password"))){
                Proyecto_PDyF.print("La contraseña es incorrecta."); return false;
            }
            setData(result.getString("emp_name"), result.getString("emp_lastname"), 
                    result.getString("emp_id"), result.getString("emp_ci"), 
                    Integer.parseInt(result.getString("emp_type")));
            return true;
        } catch (Exception ex){
            Proyecto_PDyF.print(null);
            Proyecto_PDyF.printToConsole("Exception: " + ex);
            return false;
        }
    }
    
    public void setData(String name, String lastname, String id, String ci, int type){
        this.name = name; this.lastname = lastname;
        this.id = id; this.ci = ci;
        this.type = type;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLastName(){
        return lastname;
    }
    
    public String getFullName(){
        return name +" "+ lastname;
    }
    
    public String getCI(){
        return ci;
    }
    
    public String getID(){
        return ci;
    }
    
    public boolean isAdmin(){
        return type==1;
    }
    
    public String getType(){
        return type==1?"Administrador":"Investigador";
    }
}
