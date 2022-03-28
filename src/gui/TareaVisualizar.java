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
public class TareaVisualizar extends Tarea {

        final clases.TareaClass tareaClass;

    public TareaVisualizar(TareaClass tareaClass) {
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
        eliminarButton.setVisible(true);
        completarButton.setVisible(true);
        editarButton.setVisible(true);
    }

    @Override
    void eliminar() {
            try {
                TareaAcciones.eliminarTarea(tareaClass);
                tareas.Tareas.principal.eliminarTarea(this);
            } catch (SQLException ex) {
                Logger.getLogger(TareaVisualizar.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    void marcar() {
            try {
                TareaAcciones.finalizarTarea(tareaClass);
                tareas.Tareas.principal.eliminarTarea(this);
            } catch (SQLException ex) {
                Logger.getLogger(TareaVisualizar.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    void editar() {
        nombreText.setEditable(true);
        descripcionText.setEditable(true);
        fechaSpinner.setEnabled(true);
        duracionSpinner.setEnabled(true);
        progresoSpinner.setEnabled(true);
        eliminarButton.setVisible(true);
        completarButton.setVisible(true);
        editarButton.setVisible(false);
        aceptarCambiosButton.setVisible(true);
    }

    @Override
    void aceptarCambios() {
            try {
                nombreText.setText(nombreText.getText());
                nombreText.setEditable(false);
                descripcionText.setText(descripcionText.getText());
                descripcionText.setEditable(false);
                fechaSpinner.setValue(fechaSpinner.getValue());
                fechaSpinner.setEnabled(false);
                duracionSpinner.setValue(duracionSpinner.getValue());
                duracionSpinner.setEnabled(false);
                progresoSpinner.setValue(duracionSpinner.getValue());
                progresoSpinner.setEnabled(false);
                eliminarButton.setVisible(true);
                completarButton.setVisible(true);
                editarButton.setVisible(true);
                aceptarCambiosButton.setVisible(false);
                TareaAcciones.editarTarea(tareaClass);
            } catch (SQLException ex) {
                Logger.getLogger(TareaVisualizar.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    
}
