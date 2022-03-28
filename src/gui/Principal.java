/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import acciones.TareaAcciones;
import clases.TareaClass;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fer
 */
public class Principal extends javax.swing.JFrame {
    ArrayList<TareaVisualizar> tareasList = new ArrayList<>();
    /**
     * Creates new form principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        crearTareaButton = new javax.swing.JButton();
        historialButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tareasPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de Tareas");
        setBackground(new java.awt.Color(255, 255, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tareas Pendientes");

        crearTareaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_plus_+_32px_1.png"))); // NOI18N
        crearTareaButton.setText("Crear Tarea");
        crearTareaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTareaButtonActionPerformed(evt);
            }
        });

        historialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_calendar_32px_1.png"))); // NOI18N
        historialButton.setText("Historial de Tareas");
        historialButton.setToolTipText("");
        historialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialButtonActionPerformed(evt);
            }
        });

        tareasPanel.setLayout(new javax.swing.BoxLayout(tareasPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(tareasPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crearTareaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearTareaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(historialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 347, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearTareaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTareaButtonActionPerformed
        CrearTarea.mostrar();
    }//GEN-LAST:event_crearTareaButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTareas();
    }//GEN-LAST:event_formWindowOpened

    private void historialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialButtonActionPerformed
        Historial.obtenerInstancia().mostrar();
    }//GEN-LAST:event_historialButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearTareaButton;
    private javax.swing.JButton historialButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tareasPanel;
    // End of variables declaration//GEN-END:variables

    void agregarTarea(TareaClass tareaClass){
        TareaVisualizar tareaVisualizar = new TareaVisualizar(tareaClass);
        tareasList.add(tareaVisualizar);
        tareasPanel.add(tareaVisualizar);
        validate();
        requestFocus();
    }

    private void cargarTareas() {
        try {
            ArrayList<TareaClass> tareas = TareaAcciones.obtenerTareas();
            tareasList.clear();
            tareasPanel.removeAll();
            for(TareaClass tarea : tareas){
                TareaVisualizar tareaVisualizar = new TareaVisualizar(tarea);
                tareasList.add(tareaVisualizar);
                tareasPanel.add(tareaVisualizar);
            }
            validate();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void eliminarTarea(TareaVisualizar tarea) {
        validate();
        tareasList.remove(tarea);
        tareasPanel.remove(tarea);
        validate();
    }
}
