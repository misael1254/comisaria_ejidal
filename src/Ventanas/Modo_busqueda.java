/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author MISAEL
 */
public class Modo_busqueda extends javax.swing.JFrame {

    /**
     * Creates new form Modo_busqueda
     */
    public Modo_busqueda() {
        initComponents();
        grupo_radbut.add(rd_fecha);
        grupo_radbut.add(rd_nombre);
        Date date = new Date();
        try {
            jd_ini.setDateFormatString("dd-MM-yyyy");
            jd_fin.setDateFormatString("dd-MM-yyyy");
            jd_ini.setDate(date);
            jd_fin.setDate(date);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        lb_apmat.setVisible(false);
        lb_nom.setVisible(false);
        lb_appat.setVisible(false);
        tb_apmat.setVisible(false);
        tb_nom.setVisible(false);
        tb_appat.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_radbut = new javax.swing.ButtonGroup();
        rd_fecha = new javax.swing.JRadioButton();
        rd_nombre = new javax.swing.JRadioButton();
        jd_ini = new com.toedter.calendar.JDateChooser();
        jd_fin = new com.toedter.calendar.JDateChooser();
        lb_ini = new javax.swing.JLabel();
        lb_fin = new javax.swing.JLabel();
        tb_nom = new javax.swing.JTextField();
        tb_appat = new javax.swing.JTextField();
        tb_apmat = new javax.swing.JTextField();
        lb_nom = new javax.swing.JLabel();
        lb_appat = new javax.swing.JLabel();
        lb_apmat = new javax.swing.JLabel();
        bt_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rd_fecha.setSelected(true);
        rd_fecha.setText("Buscar por fecha");
        rd_fecha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rd_fechaItemStateChanged(evt);
            }
        });
        getContentPane().add(rd_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 38));

        rd_nombre.setText("Buscar por nombre");
        rd_nombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rd_nombreItemStateChanged(evt);
            }
        });
        getContentPane().add(rd_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 39));
        getContentPane().add(jd_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 151, -1));
        getContentPane().add(jd_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 151, -1));

        lb_ini.setText("Fecha inicial");
        getContentPane().add(lb_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        lb_fin.setText("Fecha final");
        getContentPane().add(lb_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        tb_nom.setMaximumSize(new java.awt.Dimension(194, 24));
        tb_nom.setMinimumSize(new java.awt.Dimension(194, 24));
        tb_nom.setPreferredSize(new java.awt.Dimension(194, 24));
        getContentPane().add(tb_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 194, 24));

        tb_appat.setMaximumSize(new java.awt.Dimension(194, 24));
        tb_appat.setMinimumSize(new java.awt.Dimension(194, 24));
        tb_appat.setPreferredSize(new java.awt.Dimension(194, 24));
        getContentPane().add(tb_appat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        tb_apmat.setMaximumSize(new java.awt.Dimension(194, 24));
        tb_apmat.setMinimumSize(new java.awt.Dimension(194, 24));
        tb_apmat.setPreferredSize(new java.awt.Dimension(194, 24));
        getContentPane().add(tb_apmat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        lb_nom.setText("Nombre(s)");
        lb_nom.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lb_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        lb_appat.setText("Apellido paterno");
        getContentPane().add(lb_appat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        lb_apmat.setText("Apellido materno");
        getContentPane().add(lb_apmat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        bt_buscar.setText("ACEPTAR");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rd_fechaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rd_fechaItemStateChanged
        // TODO add your handling code here:
        if(rd_fecha.isSelected()){
            lb_fin.setVisible(true);
            lb_ini.setVisible(true);
            jd_ini.setVisible(true);
            jd_fin.setVisible(true);
            lb_apmat.setVisible(false);
            lb_nom.setVisible(false);
            lb_appat.setVisible(false);
            tb_apmat.setVisible(false);
            tb_nom.setVisible(false);
            tb_appat.setVisible(false);
        }
        
    }//GEN-LAST:event_rd_fechaItemStateChanged

    private void rd_nombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rd_nombreItemStateChanged
        // TODO add your handling code here:
        if(rd_nombre.isSelected()){
            lb_fin.setVisible(false);
            lb_ini.setVisible(false);
            jd_ini.setVisible(false);
            jd_fin.setVisible(false);
            lb_apmat.setVisible(true);
            lb_nom.setVisible(true);
            lb_appat.setVisible(true);
            tb_apmat.setVisible(true);
            tb_nom.setVisible(true);
            tb_appat.setVisible(true);
        }
    }//GEN-LAST:event_rd_nombreItemStateChanged

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        // TODO add your handling code here:
        Consultas_constancias_existentes ventana = new Consultas_constancias_existentes();
        
       if(rd_fecha.isSelected()){
             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
             ventana.setFecha_ini(formatter.format(jd_ini.getDate()));
             ventana.setFecha_fin(formatter.format(jd_fin.getDate()));
             ventana.setOpcion_busqueda(1);
        }else{
             ventana.setNombre(tb_nom.getText().toUpperCase());
             ventana.setAppat(tb_appat.getText().toUpperCase());
             ventana.setApmat(tb_apmat.getText().toUpperCase());
             ventana.setOpcion_busqueda(2);
        }
       this.dispose();
    }//GEN-LAST:event_bt_buscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modo_busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modo_busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modo_busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modo_busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modo_busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_buscar;
    private javax.swing.ButtonGroup grupo_radbut;
    private com.toedter.calendar.JDateChooser jd_fin;
    private com.toedter.calendar.JDateChooser jd_ini;
    private javax.swing.JLabel lb_apmat;
    private javax.swing.JLabel lb_appat;
    private javax.swing.JLabel lb_fin;
    private javax.swing.JLabel lb_ini;
    private javax.swing.JLabel lb_nom;
    private javax.swing.JRadioButton rd_fecha;
    private javax.swing.JRadioButton rd_nombre;
    private javax.swing.JTextField tb_apmat;
    private javax.swing.JTextField tb_appat;
    private javax.swing.JTextField tb_nom;
    // End of variables declaration//GEN-END:variables
}