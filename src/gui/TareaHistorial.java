/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import acciones.TareaAcciones;
import clases.TareaClass;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Fer
 */
public class TareaHistorial extends Tarea {
    
    final clases.TareaClass tareaClass;
    
    public TareaHistorial(TareaClass tareaClass) {
        this.tareaClass = tareaClass;
        nombreText.setEditable(false);
        nombreText.setText(tareaClass.nombreTarea);
        descripcionText.setEditable(false);
        descripcionText.setText(tareaClass.descripcion);
        fechaSpinner.setEnabled(false);
        fechaSpinner.setValue(new Date(tareaClass.fechaEntrega));
        duracionSpinner.setEnabled(false);
        duracionSpinner.setValue(tareaClass.duracion);
        progresoSpinner.setEnabled(false);
        progresoSpinner.setValue(tareaClass.avance);
        aceptarCambiosButton.setVisible(false);
        eliminarButton.setVisible(false);
        completarButton.setVisible(true);
        completarButton.setText("Reactivar");
        editarButton.setVisible(false);
    }

    @Override
    void eliminar() {
        //Eliminar de la base de datos?
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void marcar() {
        try {
                TareaAcciones.reactivarTarea(tareaClass);
                Historial.obtenerInstancia().eliminarTarea(this);
                tareas.Tareas.principal.agregarTarea(tareaClass);
            } catch (SQLException ex) {
                Logger.getLogger(TareaHistorial.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    void editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void aceptarCambios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
