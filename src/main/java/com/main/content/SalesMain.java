/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.content;

import com.logic.main.DB;
import com.logic.main.Functions;
import com.logic.model.Person;
import com.logic.views.OrderView;
import com.main.frame.AdminFrame;
import com.main.frame.EmployeeFrame;

import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class SalesMain extends javax.swing.JPanel {

    /**
     * Creates new form AdminSalesMain
     */
    OrderView odView = new OrderView();
    public SalesMain(boolean admin) {
        initComponents();
        if (admin) {
            odView.showQuery(tblSales);
        }else{
            //ps = ((EmployeeFrame) SwingUtilities.getWindowAncestor(pnlContent)).getPerson();
            odView.showQuery(tblSales);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSales = new javax.swing.JTable();
        pnlSearch = new javax.swing.JPanel();
        searchID = new javax.swing.JLabel();
        search_icon = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(236, 239, 244));
        setMinimumSize(new java.awt.Dimension(810, 490));
        setPreferredSize(new java.awt.Dimension(810, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(229, 233, 240));
        pnlContent.setMinimumSize(new java.awt.Dimension(454, 239));
        pnlContent.setPreferredSize(new java.awt.Dimension(454, 239));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSales.setBackground(new java.awt.Color(229, 233, 240));
        tblSales.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        tblSales.setForeground(new java.awt.Color(67, 76, 94));
        tblSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Empleado", "Cliente", "Fecha", "Hora", "Total Productos", "Venta Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSales.setFocusable(false);
        tblSales.setRowHeight(35);
        tblSales.setSelectionBackground(new java.awt.Color(235, 203, 139));
        tblSales.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblSales);
        if (tblSales.getColumnModel().getColumnCount() > 0) {
            tblSales.getColumnModel().getColumn(0).setMaxWidth(35);
            tblSales.getColumnModel().getColumn(1).setMinWidth(80);
            tblSales.getColumnModel().getColumn(1).setPreferredWidth(110);
            tblSales.getColumnModel().getColumn(1).setMaxWidth(200);
            tblSales.getColumnModel().getColumn(2).setMinWidth(80);
            tblSales.getColumnModel().getColumn(2).setPreferredWidth(110);
            tblSales.getColumnModel().getColumn(2).setMaxWidth(200);
            tblSales.getColumnModel().getColumn(3).setMinWidth(80);
            tblSales.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblSales.getColumnModel().getColumn(3).setMaxWidth(120);
            tblSales.getColumnModel().getColumn(4).setMinWidth(70);
            tblSales.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblSales.getColumnModel().getColumn(4).setMaxWidth(120);
            tblSales.getColumnModel().getColumn(5).setMinWidth(50);
            tblSales.getColumnModel().getColumn(5).setPreferredWidth(70);
            tblSales.getColumnModel().getColumn(5).setMaxWidth(90);
            tblSales.getColumnModel().getColumn(6).setMaxWidth(100);
        }
        tblSales.getTableHeader().setOpaque(false);
        tblSales.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));
        tblSales.getTableHeader().setForeground(new java.awt.Color(46,52,64));
        tblSales.getTableHeader().setFont(new java.awt.Font("Roboto", 1, 14));

        pnlContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 800, 420));
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.getVerticalScrollBar().setPreferredSize( new Dimension(0,0) );

        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 440));

        pnlSearch.setBackground(new java.awt.Color(136, 192, 208));
        pnlSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchID.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        searchID.setForeground(new java.awt.Color(59, 66, 82));
        searchID.setText("ID");
        pnlSearch.add(searchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 20, 20));

        search_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        pnlSearch.add(search_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 8, 30, 20));

        txtSearch.setBackground(new java.awt.Color(136, 192, 208));
        txtSearch.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(46, 52, 64));
        txtSearch.setBorder(null);
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        pnlSearch.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, 100, 20));

        add(pnlSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 462, 170, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String query = txtSearch.getText();
        Functions.tableSorter(tblSales, query);
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JLabel searchID;
    private javax.swing.JLabel search_icon;
    private javax.swing.JTable tblSales;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
