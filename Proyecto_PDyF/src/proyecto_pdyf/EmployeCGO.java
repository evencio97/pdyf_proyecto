package proyecto_pdyf;

/**
 * @author Evencio Hernández
 * @author Danny Caldeira
 */

public class EmployeCGO {
    private Employe employe = null;
    
    public EmployeCGO(){
        employe = new Employe();
    }

    public boolean login(String ci, String password){
        return employe.login(ci, password);
    }
    
    public String getFullName(){
        return employe.getFullName();
    }
    
    public String getType(){
        return employe.getType();
    }
}
