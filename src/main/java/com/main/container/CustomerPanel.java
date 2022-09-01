/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.main.container;
import com.main.content.CustomersMain;
import com.logic.main.Design;
/**
 *
 * @author mrmango
 */
public class CustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminEmployeeMain
     */
    boolean admin;
    public CustomerPanel(boolean admin) {
        initComponents();
        this.admin = admin;
        Design.panelChange(pnlContent, new CustomersMain(admin));
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
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setPreferredSize(new java.awt.Dimension(940, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(236, 239, 244));
        pnlContent.setPreferredSize(new java.awt.Dimension(840, 500));
        pnlContent.setLayout(new javax.swing.BoxLayout(pnlContent, javax.swing.BoxLayout.LINE_AXIS));
        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 840, 500));

        lblTitle.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(46, 52, 64));
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer.png"))); // NOI18N
        lblTitle.setText("CLIENTES");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 120, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel lblTitle;
    private static javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}