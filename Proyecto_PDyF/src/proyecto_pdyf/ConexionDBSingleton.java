/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pdyf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static proyecto_pdyf.Proyecto_PDyF.print;
import static proyecto_pdyf.Proyecto_PDyF.printToConsole;

/**
 *
 * @author Evencio
 */
public class ConexionDBSingleton {
    private static Connection db_conexion = null;
    
    private ConexionDBSingleton(){}
    
    public static Connection getConexion() {
        if (db_conexion == null){
            String database = "u887908225_pdyf";
            String hostname = "sql172.main-hosting.eu";
            String port = "3306";
            String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false&autoReconnect=true";
            // Nombre de usuario
            String username = "u887908225_pdyf";
            // Clave de usuario
            String password = "pdyf2019";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                db_conexion = DriverManager.getConnection(url, username, password);
                printToConsole("Conexion establecida con la base datos\n"
                        +"SMDB:"+db_conexion.getMetaData().getDatabaseProductName()
                        +" version:"+db_conexion.getMetaData().getDatabaseProductVersion());
            } catch (ClassNotFoundException | SQLException e) {
                print("No se pudo conectar con la base datos.");
                printToConsole("Exception: "+e);
                db_conexion = null;
            }
        }
        return db_conexion;
    }
}
