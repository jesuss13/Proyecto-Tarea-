/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fer
 */
public class Conexion {
    private static Connection connection;
    
    public final static Conexion instancia = new Conexion();
    
    public static PreparedStatement PreparedStatement(String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }
    
    public static void cerrar() throws SQLException {
        connection.close();
    }
    
    public static PreparedStatement PreparedStatement(String sql, boolean b) throws SQLException {
        return connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    }
    
    private Conexion() {
        String cadena = "jdbc:sqlite:tareas.db";
        try {
            connection = DriverManager.getConnection(cadena);
        } catch(SQLException ex){
            System.out.print("desde Conexion");
        }
    }
}
