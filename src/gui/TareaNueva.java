/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.TareaClass;
import java.util.Date;

/**
 *
 * @author Fer
 */
public class TareaNueva extends Tarea {

    public TareaNueva() {
        nombreText.setEnabled(true);
        nombreText.setText("");
        descripcionText.setEnabled(true);
        descripcionText.setText("");
        fechaSpinner.setEnabled(true);
        duracionSpinner.setEnabled(true);
        duracionSpinner.setValue(1);
        progresoSpinner.setEnabled(true);
        progresoSpinner.setValue(0);
        aceptarCambiosButton.setVisible(false);
        eliminarButton.setVisible(false);
        completarButton.setVisible(false);
        editarButton.setVisible(false);
    }
    
    TareaClass getTareaClass(){
        String nombre = nombreText.getText();
        String descripcion = descripcionText.getText();
        Date fecha = (Date) fechaSpinner.getValue();
        int duracion = (int) duracionSpinner.getValue();
        int progreso = (int) progresoSpinner.getValue();
        TareaClass tareaClass = new TareaClass(nombre, descripcion, fecha.getTime(), duracion, progreso);
        return tareaClass;
    }

    @Override
    void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void marcar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
