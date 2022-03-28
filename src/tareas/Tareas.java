/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareas;
import gui.*;

/**
 *
 * @author Fer
 */
public class Tareas {
    
   public static Principal principal;

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        principal = new Principal();
        principal.setVisible(true);
        principal.requestFocus();
    }
    
}
