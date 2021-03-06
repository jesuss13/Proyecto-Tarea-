/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import acciones.TareaAcciones;

/**
 *
 * @author Fer
 */
public abstract class Tarea extends javax.swing.JPanel {
    TareaAcciones tareaAcciones;
    /**
     * Creates new form tarea
     */
    public Tarea() {
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

        jLabel2 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        fechaSpinner = new javax.swing.JSpinner();
        duracionSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eliminarButton = new javax.swing.JButton();
        completarButton = new javax.swing.JButton();
        progresoSpinner = new javax.swing.JSpinner();
        editarButton = new javax.swing.JButton();
        aceptarCambiosButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nombre:");

        nombreText.setText("jTextField1");

        jLabel3.setText("Descripcion:");

        descripcionText.setColumns(20);
        descripcionText.setRows(5);
        jScrollPane1.setViewportView(descripcionText);

        jLabel1.setText("Fecha:");

        fechaSpinner.setModel(new javax.swing.SpinnerDateModel());
        fechaSpinner.setEnabled(false);

        duracionSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 365, 1));
        duracionSpinner.setEnabled(false);

        jLabel4.setText("Duraci??n:");

        jLabel5.setText("Progreso:");

        eliminarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Remove_32px.png"))); // NOI18N
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        completarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_ok_32px_1.png"))); // NOI18N
        completarButton.setText("Completar");
        completarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completarButtonActionPerformed(evt);
            }
        });

        progresoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        progresoSpinner.setEnabled(false);

        editarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_edit_32px.png"))); // NOI18N
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        aceptarCambiosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_ok_32px_1.png"))); // NOI18N
        aceptarCambiosButton.setText("Aceptar Cambios");
        aceptarCambiosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarCambiosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(eliminarButton)
                        .addGap(18, 18, 18)
                        .addComponent(editarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(aceptarCambiosButton)
                        .addGap(18, 18, 18)
                        .addComponent(completarButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreText)
                            .addComponent(jScrollPane1)
                            .addComponent(fechaSpinner)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(duracionSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(progresoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duracionSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(progresoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarCambiosButton)
                    .addComponent(completarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void completarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarButtonActionPerformed
        marcar();
    }//GEN-LAST:event_completarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        eliminar();
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        editar();
    }//GEN-LAST:event_editarButtonActionPerformed

    private void aceptarCambiosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCambiosButtonActionPerformed
        aceptarCambios();
    }//GEN-LAST:event_aceptarCambiosButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton aceptarCambiosButton;
    protected javax.swing.JButton completarButton;
    protected javax.swing.JTextArea descripcionText;
    protected javax.swing.JSpinner duracionSpinner;
    protected javax.swing.JButton editarButton;
    protected javax.swing.JButton eliminarButton;
    protected javax.swing.JSpinner fechaSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextField nombreText;
    protected javax.swing.JSpinner progresoSpinner;
    // End of variables declaration//GEN-END:variables

    abstract void eliminar();

    abstract void marcar();
    
    abstract void editar();
    
    abstract void aceptarCambios();
}
