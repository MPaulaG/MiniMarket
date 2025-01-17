/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.main.content;

import com.logic.dao.User;

import com.logic.model.Admin;
import com.logic.model.Person;
import com.main.frame.AdminFrame;
import com.main.frame.EmployeeFrame;


import javax.swing.*;

/**
 *
 * @author mrmango
 */

public class SettingsUser extends javax.swing.JPanel {

    User user = new User();
    Person person;
    
    public SettingsUser(Person person) {
        this.person = person;
        initComponents();
        user.modifyUser(pnlContent, person);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblNui = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtNui = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnAddEmployee = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(840, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(236, 239, 244));
        pnlContent.setForeground(new java.awt.Color(76, 86, 106));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(76, 86, 106));
        lblName.setText("Nombre:");
        pnlContent.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 30));

        lblLastName.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(76, 86, 106));
        lblLastName.setText("Apellido:");
        pnlContent.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        lblNui.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblNui.setForeground(new java.awt.Color(76, 86, 106));
        lblNui.setText("NUI:");
        pnlContent.add(lblNui, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, 30));

        lblAddress.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(76, 86, 106));
        lblAddress.setText("Direccion:");
        pnlContent.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 30));

        lblPhone.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(76, 86, 106));
        lblPhone.setText("Telefono:");
        pnlContent.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 30));

        lblEmail.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(76, 86, 106));
        lblEmail.setText("E-mail:");
        pnlContent.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 30));

        lblPassword.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(76, 86, 106));
        lblPassword.setText("Contraseña:");
        pnlContent.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, 30));

        txtName.setBackground(new java.awt.Color(229, 233, 240));
        txtName.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtName.setForeground(new java.awt.Color(130, 147, 181));
        txtName.setBorder(null);
        pnlContent.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 190, 30));
        txtName.setBorder(BorderFactory.createCompoundBorder(txtName.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtLastName.setBackground(new java.awt.Color(229, 233, 240));
        txtLastName.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(130, 147, 181));
        txtLastName.setBorder(null);
        pnlContent.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, 30));
        txtLastName.setBorder(BorderFactory.createCompoundBorder(txtLastName.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtNui.setBackground(new java.awt.Color(229, 233, 240));
        txtNui.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtNui.setForeground(new java.awt.Color(130, 147, 181));
        txtNui.setBorder(null);
        pnlContent.add(txtNui, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 190, 30));
        txtNui.setBorder(BorderFactory.createCompoundBorder(txtNui.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtAddress.setBackground(new java.awt.Color(229, 233, 240));
        txtAddress.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(130, 147, 181));
        txtAddress.setBorder(null);
        pnlContent.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, 30));
        txtAddress.setBorder(BorderFactory.createCompoundBorder(txtAddress.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtPhone.setBackground(new java.awt.Color(229, 233, 240));
        txtPhone.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(130, 147, 181));
        txtPhone.setBorder(null);
        pnlContent.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 190, 30));
        txtPhone.setBorder(BorderFactory.createCompoundBorder(txtPhone.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtEmail.setBackground(new java.awt.Color(229, 233, 240));
        txtEmail.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(130, 147, 181));
        txtEmail.setBorder(null);
        pnlContent.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 190, 30));
        txtEmail.setBorder(BorderFactory.createCompoundBorder(txtEmail.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtPassword.setBackground(new java.awt.Color(229, 233, 240));
        txtPassword.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(130, 147, 181));
        txtPassword.setBorder(null);
        pnlContent.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 190, 30));
        txtPassword.setBorder(BorderFactory.createCompoundBorder(txtPassword.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 470, 440));

        btnAddEmployee.setBackground(new java.awt.Color(163, 190, 140));
        btnAddEmployee.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnAddEmployee.setForeground(new java.awt.Color(76, 86, 106));
        btnAddEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddEmployee.setText("Actualizar");
        btnAddEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEmployee.setOpaque(true);
        btnAddEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddEmployeeMouseClicked(evt);
            }
        });
        add(btnAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEmployeeMouseClicked
        user.settings(pnlContent, person);
        if(person instanceof Admin){
            ((AdminFrame) SwingUtilities.getWindowAncestor(pnlContent)).setUserName(person);
        }else{
            ((EmployeeFrame) SwingUtilities.getWindowAncestor(pnlContent)).setUserName(person);
        }

    }//GEN-LAST:event_btnAddEmployeeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddEmployee;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNui;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNui;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
