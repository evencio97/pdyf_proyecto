package proyecto_pdyf;

/**
 * @author Evencio Hernández
 * @author Danny Caldeira
 */
public class EmployeModel {
    private String name;
    private String lastname;
    private String id;
    private String ci;
    private int type;
    
    public EmployeModel(String name, String lastname, String id, String ci, int type){
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
