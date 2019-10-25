/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import java.sql.*;
import Tablas.Cedente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Tablas.Constancia;
import comisaria_db.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import com.mysql.jdbc.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MISAEL
 */
public class Consultas_constancias_existentes extends javax.swing.JFrame {

    public Consultas_constancias_existentes() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Tabla_prueba.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_prueba = new rojerusan.RSTableMetro();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bt_consulta_constancias = new javax.swing.JButton();
        bt_modificar = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        bt_pdfConstanciasExistentes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 725));
        setSize(new java.awt.Dimension(1366, 725));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_prueba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla_prueba.setAltoHead(30);
        Tabla_prueba.setColorBackgoundHead(new java.awt.Color(153, 153, 153));
        Tabla_prueba.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(Tabla_prueba);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 1307, 531));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.setPreferredSize(new java.awt.Dimension(110, 48));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, -1, 37));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("<html> <head> </head> <body> <div align=\"center\"><p>CONSULTAR</p><p> INFORMACIÓN</p></div> </body> </html>  ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, -1, -1));

        bt_consulta_constancias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_consulta_constancias.setText("<html> <head> </head> <body> <div align=\"center\"><p>MOSTRAR</p><p>CONSTANCIAS</p></div> </body> </html>  ");
        bt_consulta_constancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consulta_constanciasActionPerformed(evt);
            }
        });
        getContentPane().add(bt_consulta_constancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 660, 110, -1));

        bt_modificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_modificar.setText("MODIFICAR");
        bt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 660, 120, 40));

        bt_eliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_eliminar.setText("ELIMINAR");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 660, 120, 40));

        bt_pdfConstanciasExistentes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_pdfConstanciasExistentes.setText("GENERAR PDF");
        bt_pdfConstanciasExistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pdfConstanciasExistentesActionPerformed(evt);
            }
        });
        getContentPane().add(bt_pdfConstanciasExistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 660, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/C.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            Menu_principal obj = new Menu_principal();
            obj.setVisible(true);
            this.dispose();
        
        /*ResultSet rs;
        Cedente cedente = new Cedente();
        rs = cedente.Buscar(1);
        try {
            DefaultTableModel tabconsul = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            tabconsul.setColumnIdentifiers(new Object[]{"id","Nombre","Apellido_pat","Apellido_mat"});
            
            while(rs.next()){
                tabconsul.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }
            Tabla_prueba.setModel(tabconsul);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"nafi papi");
        }*/
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          /*Consulta_constancia_especifica consulta_especifica = new Consulta_constancia_especifica();
          consulta_especifica.setVisible(true);*/
          
          if(Tabla_prueba.getSelectedRow()==-1){
              JOptionPane.showMessageDialog(null,"NO SE HA SELECCIONADO NINGUN ELEMENTO");
          }else{
              DefaultTableModel tabconsul;
              tabconsul = (DefaultTableModel)Tabla_prueba.getModel();
              String aux = (String) tabconsul.getValueAt(Tabla_prueba.getSelectedRow(), 0);
              int no_constancia = Integer.parseInt(aux);
              Consulta_constancia_especifica consulta_especifica = new Consulta_constancia_especifica();
              consulta_especifica.setNo_constancia(no_constancia);
              consulta_especifica.Rellenar_campos();
              consulta_especifica.setVisible(true);
          }
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bt_consulta_constanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consulta_constanciasActionPerformed
        // TODO add your handling code here:
        Tabla_prueba.setVisible(true);
        try {
            DefaultTableModel tabconsul = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
           /* tabconsul.setColumnIdentifiers(new Object[]{"No folio","Fecha expedicion","Id(ced)","Nombre(ced)",
            "apellido pat(ced)","apellido mat(ced)","id(prop)","Nombre(prop)","apellido pat(prop)","apellido materno(prop)",
            "Id(ter)","Ubicación","Tipo terreno","N","colN","S","colS","E","colE","O","colO","NE","colNE","NO","colNO","SE","colSE","colSO","Testigo 1"
            ,"Testigo 2","Presidente(CE)","Secretario(CE)","Tesorero(CE)","Presidente(CV)","Secretario 1(CV)","Secretario 2(CV)"});*/
            Object[] cabeceras = new Object[4];
            cabeceras[0] ="NO. FOLIO";
            cabeceras[1] ="FECHA CREACIÓN";
            cabeceras[2] ="PROPIETARIO";
            cabeceras[3] ="UBICACIÓN";
            tabconsul.setColumnIdentifiers(cabeceras);
            
            ArrayList<String[]> Lista_constancias;
            ArrayList<String[]> Lista_testigos;
            ArrayList<String[]> Lista_con_vig;
            ArrayList<String[]> Lista_com_eji;
            
            Constancia constancia = new Constancia();
            Lista_constancias = constancia.Buscar_todo(1,0);
            Lista_testigos = constancia.Buscar_testigos(1,0);
            Lista_con_vig = constancia.Buscar_con_vig(1,0);
            Lista_com_eji = constancia.Buscar_com_ejidal(1,0);
            for (int i = 0; i < Lista_constancias.size(); i++) {
                Object[] datos_constancia = new Object[4];
                datos_constancia[0] = Lista_constancias.get(i)[0];
                datos_constancia[1] = Lista_constancias.get(i)[1];
                datos_constancia[2] = Lista_constancias.get(i)[7]+" "+Lista_constancias.get(i)[8]+" "+Lista_constancias.get(i)[9];
                datos_constancia[3] = Lista_constancias.get(i)[11];
                tabconsul.addRow(datos_constancia);
               /* Object[] datos = new Object[37];
                datos[0] = Lista_constancias.get(i)[0];datos[1] = Lista_constancias.get(i)[1];datos[2] = Lista_constancias.get(i)[2];
                datos[3] = Lista_constancias.get(i)[3];datos[4] = Lista_constancias.get(i)[4];datos[5] = Lista_constancias.get(i)[5];
                datos[6] = Lista_constancias.get(i)[6];datos[7] = Lista_constancias.get(i)[7];datos[8] = Lista_constancias.get(i)[8];
                datos[9] = Lista_constancias.get(i)[9];datos[10] = Lista_constancias.get(i)[10];datos[11] = Lista_constancias.get(i)[11];
                datos[12] = Lista_constancias.get(i)[12];datos[13] = Lista_constancias.get(i)[13];datos[14] = Lista_constancias.get(i)[14];
                datos[15] = Lista_constancias.get(i)[15];datos[16] = Lista_constancias.get(i)[16];datos[17] = Lista_constancias.get(i)[17];
                datos[18] = Lista_constancias.get(i)[18];datos[19] = Lista_constancias.get(i)[19];datos[20] = Lista_constancias.get(i)[20];
                datos[21] = Lista_constancias.get(i)[21];datos[22] = Lista_constancias.get(i)[22];datos[23] = Lista_constancias.get(i)[23];
                datos[24] = Lista_constancias.get(i)[24];datos[25] = Lista_constancias.get(i)[25];datos[26] = Lista_constancias.get(i)[26];
                datos[27] = Lista_constancias.get(i)[27];datos[28] = Lista_constancias.get(i)[28];
                
                datos[29] = Lista_testigos.get(i*2)[1]+" "+Lista_testigos.get(i*2)[2]+" "+Lista_testigos.get(i*2)[3];
                datos[30] = Lista_testigos.get((i*2)+1)[1]+" "+Lista_testigos.get((i*2)+1)[2]+" "+Lista_testigos.get((i*2)+1)[3];
                
                datos[31] = Lista_com_eji.get(i*3)[1]+" "+Lista_com_eji.get(i*3)[2]+" "+Lista_com_eji.get(i*3)[1];
                datos[32] = Lista_com_eji.get((i*3)+1)[1]+" "+Lista_com_eji.get((i*3)+1)[2]+" "+Lista_com_eji.get((i*3)+1)[1];
                datos[33] = Lista_com_eji.get((i*3)+2)[1]+" "+Lista_com_eji.get((i*3)+2)[2]+" "+Lista_com_eji.get((i*3)+2)[1];
                
                datos[34] = Lista_con_vig.get(i*3)[1]+" "+Lista_con_vig.get(i*3)[2]+" "+Lista_con_vig.get(i*3)[1];
                datos[35] = Lista_con_vig.get((i*3)+1)[1]+" "+Lista_con_vig.get((i*3)+1)[2]+" "+Lista_con_vig.get((i*3)+1)[1];
                datos[36] = Lista_con_vig.get((i*3)+2)[1]+" "+Lista_con_vig.get((i*3)+2)[2]+" "+Lista_con_vig.get((i*3)+2)[1];
                
                tabconsul.addRow(datos);*/
            }
            /*while(rs.next()){
                tabconsul.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }*/
            Tabla_prueba.setModel(tabconsul);
            Tabla_prueba.setAutoResizeMode(Tabla_prueba.AUTO_RESIZE_ALL_COLUMNS);
            Tabla_prueba.getTableHeader().setReorderingAllowed(false);
            Tabla_prueba.doLayout();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR AL MOSTRAR LOS DATOS");
        }
    }//GEN-LAST:event_bt_consulta_constanciasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Menu_principal obj = new Menu_principal();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void bt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarActionPerformed
        // TODO add your handling code here:
        if(Tabla_prueba.getSelectedRow()==-1){
              JOptionPane.showMessageDialog(null,"NO SE HA SELECCIONADO NINGUN ELEMENTO");
          }else{
              DefaultTableModel tabconsul;
              tabconsul = (DefaultTableModel)Tabla_prueba.getModel();
              String aux = (String) tabconsul.getValueAt(Tabla_prueba.getSelectedRow(), 0);
              int no_constancia = Integer.parseInt(aux);
              Modificar_constancia modificar_constancia = new Modificar_constancia();
              modificar_constancia.setNo_constancia(no_constancia);
              modificar_constancia.Establecer_info();
              modificar_constancia.setVisible(true);
              dispose();
          }
    }//GEN-LAST:event_bt_modificarActionPerformed

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        // TODO add your handling code here:
        if(Tabla_prueba.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null,"NO SE HA SELECCIONADO NINGUN ELEMENTO");
        }else
        {
            int op = JOptionPane.showConfirmDialog(null,"¿DESEA ELIMINAR LA CONSTACIA?", "Alerta!",JOptionPane.YES_NO_OPTION);
            if(op==JOptionPane.YES_OPTION)
            {
                DefaultTableModel tabconsul;
                tabconsul = (DefaultTableModel)Tabla_prueba.getModel();
                String aux = (String) tabconsul.getValueAt(Tabla_prueba.getSelectedRow(), 0);
                int no_folio=Integer.parseInt(aux);
                Constancia folio= new Constancia();
            }
        }
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void bt_pdfConstanciasExistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pdfConstanciasExistentesActionPerformed
        // TODO add your handling code here:
        Conexion con = new Conexion();
        con.conectar();
        
        JasperReport reporte =null;
        
        try {
            /*
            //String path="src\\ConstanciasExistentes_reporte\\ConstanciasExistentes_Reporte.jasper"; //se va a encontar el archivo del reporte 
            String ruta_jasper = System.getProperty("user.dir") + "/src/ConstanciasExistentes_reporte/ConstanciasExistentes_Reporte.jasper";
            reporte=(JasperReport) JRLoader.loadObjectFromFile(ruta_jasper);
            //Map<String, Object> Conexion = null;
            JasperPrint jprint= JasperFillManager.fillReport(reporte,null,con.conectar());
            */
             
            reporte =null;
            String ruta_jasper = System.getProperty("user.dir") + "/src/ConstanciasExistentes_reporte/ConstanciasExistentes_Reporte.jasper";
            reporte=(JasperReport) JRLoader.loadObjectFromFile(ruta_jasper);
            Map parametro = new HashMap();
            JasperPrint jprint= JasperFillManager.fillReport(reporte,parametro,con.conectar());
            JasperViewer  view = new JasperViewer(jprint, false);
            
            
            //view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
            
            
            
        } catch (JRException ex) {
            Logger.getLogger(Consultas_constancias_existentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_pdfConstanciasExistentesActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas_constancias_existentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas_constancias_existentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas_constancias_existentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas_constancias_existentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas_constancias_existentes().setVisible(true);
                new Consultas_constancias_existentes().setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro Tabla_prueba;
    private javax.swing.JButton bt_consulta_constancias;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_pdfConstanciasExistentes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
