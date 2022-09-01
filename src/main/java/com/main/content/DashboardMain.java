/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.main.content;

import com.logic.views.SellView;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author mrmango
 */
public class DashboardMain extends javax.swing.JPanel {

    /**
     * Creates new form AdminDashboardMain
     */
    SellView sellView = new SellView();
    public DashboardMain() {
        initComponents();
        sellView.dashboardCustomers(tblCustomerResume);
        sellView.dashboardProducts(tblSalesResume);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSalesResume = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalesResume = new javax.swing.JTable();
        pnlCustomersResume = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomerResume = new javax.swing.JTable();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSalesResume.setBackground(new java.awt.Color(229, 233, 240));
        pnlSalesResume.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSalesResume.setAutoCreateRowSorter(true);
        tblSalesResume.setBackground(new java.awt.Color(229, 233, 240));
        tblSalesResume.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        tblSalesResume.setForeground(new java.awt.Color(67, 76, 94));
        tblSalesResume.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSalesResume.setFocusable(false);
        tblSalesResume.setGridColor(new java.awt.Color(229, 233, 240));
        tblSalesResume.setRowHeight(35);
        tblSalesResume.setSelectionBackground(new java.awt.Color(235, 203, 139));
        tblSalesResume.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSalesResume.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblSalesResume);
        tblSalesResume.getTableHeader().setOpaque(false);
        tblSalesResume.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));
        tblSalesResume.getTableHeader().setForeground(new java.awt.Color(46,52,64));
        tblSalesResume.getTableHeader().setFont(new java.awt.Font("Roboto", 1, 14));
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tblSalesResume.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        pnlSalesResume.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 410));
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));

        add(pnlSalesResume, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 430));

        pnlCustomersResume.setBackground(new java.awt.Color(229, 233, 240));
        pnlCustomersResume.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomerResume.setAutoCreateRowSorter(true);
        tblCustomerResume.setBackground(new java.awt.Color(229, 233, 240));
        tblCustomerResume.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        tblCustomerResume.setForeground(new java.awt.Color(67, 76, 94));
        tblCustomerResume.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ));
        tblCustomerResume.setFocusable(false);
        tblCustomerResume.setRowHeight(35);
        tblCustomerResume.setSelectionBackground(new java.awt.Color(235, 203, 139));
        tblCustomerResume.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCustomerResume.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblCustomerResume);
        tblCustomerResume.getTableHeader().setOpaque(false);
        tblCustomerResume.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));
        tblCustomerResume.getTableHeader().setForeground(new java.awt.Color(46,52,64));
        tblCustomerResume.getTableHeader().setFont(new java.awt.Font("Roboto", 1, 14));
        tblCustomerResume.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        pnlCustomersResume.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 410));
        jScrollPane2.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane2.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));

        add(pnlCustomersResume, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 400, 430));

        lblTitle1.setBackground(new java.awt.Color(76, 86, 106));
        lblTitle1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(46, 52, 64));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Ventas de Hoy");
        add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 150, 20));

        lblTitle2.setBackground(new java.awt.Color(76, 86, 106));
        lblTitle2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(46, 52, 64));
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("Clientes Habituales");
        add(lblTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 150, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JPanel pnlCustomersResume;
    private javax.swing.JPanel pnlSalesResume;
    private javax.swing.JTable tblCustomerResume;
    private javax.swing.JTable tblSalesResume;
    // End of variables declaration//GEN-END:variables
}
