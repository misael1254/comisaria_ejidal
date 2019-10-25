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

    private static String fecha_ini,fecha_fin,nombre,appat,apmat;
    private static int opcion_busqueda=0;

    public static void setFecha_ini(String fecha_ini) {
        Consultas_constancias_existentes.fecha_ini = fecha_ini;
    }

    public static void setFecha_fin(String fecha_fin) {
        Consultas_constancias_existentes.fecha_fin = fecha_fin;
    }

    public static void setNombre(String nombre) {
        Consultas_constancias_existentes.nombre = nombre;
    }

    public static void setAppat(String appat) {
        Consultas_constancias_existentes.appat = appat;
    }

    public static void setApmat(String apmat) {
        Consultas_constancias_existentes.apmat = apmat;
    }

    public static void setOpcion_busqueda(int opcion_busqueda) {
        Consultas_constancias_existentes.opcion_busqueda = opcion_busqueda;
    }
    
    
    
    public Consultas_constancias_existentes() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Tabla_prueba.setVisible(false);
        bt_consutar_info.setVisible(false);
        bt_modificar.setVisible(false);
        bt_buscar.setVisible(false);
        bt_sel_modo.setVisible(false);
        bt_buscar_aceptar.setVisible(false);
        bt_cancelar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_prueba = new rojerusan.RSTableMetro();
        bt_regresar = new javax.swing.JButton();
        bt_consutar_info = new javax.swing.JButton();
        bt_consulta_constancias = new javax.swing.JButton();
        bt_modificar = new javax.swing.JButton();
<<<<<<< HEAD
        bt_eliminar = new javax.swing.JButton();
        bt_pdfConstanciasExistentes = new javax.swing.JButton();
=======
        bt_buscar = new javax.swing.JButton();
        bt_cancelar = new javax.swing.JButton();
        bt_sel_modo = new javax.swing.JButton();
        bt_buscar_aceptar = new javax.swing.JButton();
>>>>>>> 0dbfb8eb1131c998dfb5e7f074b55ef99aa093fe
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

        bt_regresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_regresar.setText("REGRESAR");
        bt_regresar.setPreferredSize(new java.awt.Dimension(110, 48));
        bt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_regresarActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, -1, 37));
=======
        getContentPane().add(bt_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 660, -1, 40));
>>>>>>> 0dbfb8eb1131c998dfb5e7f074b55ef99aa093fe

        bt_consutar_info.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_consutar_info.setText("<html> <head> </head> <body> <div align=\"center\"><p>CONSULTAR</p><p> INFORMACIÓN</p></div> </body> </html>  ");
        bt_consutar_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consutar_infoActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, -1, -1));
=======
        getContentPane().add(bt_consutar_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 660, -1, -1));
>>>>>>> 0dbfb8eb1131c998dfb5e7f074b55ef99aa093fe

        bt_consulta_constancias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_consulta_constancias.setText("<html> <head> </head> <body> <div align=\"center\"><p>MOSTRAR</p><p>CONSTANCIAS</p></div> </body> </html>  ");
        bt_consulta_constancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consulta_constanciasActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        getContentPane().add(bt_consulta_constancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 660, 110, -1));
=======
        getContentPane().add(bt_consulta_constancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 660, 110, -1));
>>>>>>> 0dbfb8eb1131c998dfb5e7f074b55ef99aa093fe

        bt_modificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_modificar.setText("MODIFICAR");
        bt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarActionPerformed(evt);
            }
        });
<<<<<<< HEAD
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
=======
        getContentPane().add(bt_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, 110, 44));

        bt_buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_buscar.setText("BUSCAR");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 660, 110, 44));

        bt_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_cancelar.setText("CANCELAR");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 660, 110, 40));

        bt_sel_modo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_sel_modo.setText("<html><body><div align=\"center\"><p>SELECCIONAR</p><p>MODO</p></div></body></html>");
        bt_sel_modo.setPreferredSize(new java.awt.Dimension(109, 44));
        bt_sel_modo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sel_modoActionPerformed(evt);
            }
        });
        getContentPane().add(bt_sel_modo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 660, -1, -1));

        bt_buscar_aceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_buscar_aceptar.setText("BUSCAR");
        bt_buscar_aceptar.setEnabled(false);
        bt_buscar_aceptar.setPreferredSize(new java.awt.Dimension(109, 44));
        bt_buscar_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscar_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_buscar_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, -1, 40));
>>>>>>> 0dbfb8eb1131c998dfb5e7f074b55ef99aa093fe

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/C.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_regresarActionPerformed
        // TODO add your handling code here:
            Menu_principal obj = new Menu_principal();
            obj.setVisible(true);
            this.dispose();
        
        
    }//GEN-LAST:event_bt_regresarActionPerformed

    private void bt_consutar_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consutar_infoActionPerformed
         
          
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
          
    }//GEN-LAST:event_bt_consutar_infoActionPerformed

    private void bt_consulta_constanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consulta_constanciasActionPerformed
        
        Tabla_prueba.setVisible(true);
        try {
            bt_consulta_constancias.setVisible(false);
            bt_consutar_info.setVisible(true);
            bt_modificar.setVisible(true);
            bt_buscar.setVisible(true);
            DefaultTableModel tabconsul = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            Object[] cabeceras = new Object[5];
            cabeceras[0] ="NO. FOLIO";
            cabeceras[1] ="FECHA EXPEDICIÓN";
            cabeceras[2] ="PROPIETARIO";
            cabeceras[3] ="UBICACIÓN";
            cabeceras[4] ="MOTIVO";
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
                Object[] datos_constancia = new Object[5];
                datos_constancia[0] = Lista_constancias.get(i)[0];
                datos_constancia[1] = Lista_constancias.get(i)[1];
                datos_constancia[2] = Lista_constancias.get(i)[7]+" "+Lista_constancias.get(i)[8]+" "+Lista_constancias.get(i)[9];
                datos_constancia[3] = Lista_constancias.get(i)[11];
                datos_constancia[4] = Lista_constancias.get(i)[30];
                tabconsul.addRow(datos_constancia);
               
            }
            Tabla_prueba.setModel(tabconsul);
            Tabla_prueba.setAutoResizeMode(Tabla_prueba.AUTO_RESIZE_ALL_COLUMNS);
            Tabla_prueba.getTableHeader().setReorderingAllowed(false);
            Tabla_prueba.doLayout();
            //JOptionPane.showMessageDialog(null,"");
            //Actualizar_tabla_fecha("2019-10-24", "2019-10-24");
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

<<<<<<< HEAD
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

=======
    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        // TODO add your handling code here:
        bt_buscar.setVisible(false);
        bt_consutar_info.setVisible(false);
        bt_modificar.setVisible(false);
        bt_sel_modo.setVisible(true);
        bt_cancelar.setVisible(true);
        bt_buscar_aceptar.setVisible(true);
        
    }//GEN-LAST:event_bt_buscarActionPerformed

    private void bt_sel_modoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sel_modoActionPerformed
        // TODO add your handling code here:
        Modo_busqueda ventana = new Modo_busqueda();
        ventana.setAlwaysOnTop(true);
        ventana.setVisible(true);
        bt_buscar_aceptar.setEnabled(true);
    }//GEN-LAST:event_bt_sel_modoActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        // TODO add your handling code here:
        bt_consulta_constancias.setVisible(true);
        bt_consutar_info.setVisible(false);
        bt_modificar.setVisible(false);
        bt_buscar.setVisible(false);
        bt_sel_modo.setVisible(false);
        bt_buscar_aceptar.setVisible(false);
        bt_buscar_aceptar.setEnabled(false);
        bt_cancelar.setVisible(false);
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void bt_buscar_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscar_aceptarActionPerformed
        // TODO add your handling code here:
        if(opcion_busqueda == 1){
            Actualizar_tabla_fecha();
        }
        else{
            if(opcion_busqueda == 2){
                Actualizar_tabla_nombre();
            }
        }
    }//GEN-LAST:event_bt_buscar_aceptarActionPerformed

    public void Actualizar_tabla_fecha(){
    
        try {
            DefaultTableModel tabconsul = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            Object[] cabeceras = new Object[5];
            cabeceras[0] ="NO. FOLIO";
            cabeceras[1] ="FECHA EXPEDICIÓN";
            cabeceras[2] ="PROPIETARIO";
            cabeceras[3] ="UBICACIÓN";
            cabeceras[4] ="MOTIVO";
            tabconsul.setColumnIdentifiers(cabeceras);
            
            ArrayList<String[]> Lista_constancias;
            
            Constancia constancia = new Constancia();
            Lista_constancias = constancia.Buscar_por_fecha(this.fecha_ini, this.fecha_fin);
            for (int i = 0; i < Lista_constancias.size(); i++) {
                Object[] datos_constancia = new Object[5];
                datos_constancia[0] = Lista_constancias.get(i)[0];
                datos_constancia[1] = Lista_constancias.get(i)[1];
                datos_constancia[2] = Lista_constancias.get(i)[2]+" "+Lista_constancias.get(i)[3]+" "+Lista_constancias.get(i)[4];
                datos_constancia[3] = Lista_constancias.get(i)[5];
                datos_constancia[4] = Lista_constancias.get(i)[6];
                tabconsul.addRow(datos_constancia);
            }
            Tabla_prueba.setModel(tabconsul);
            Tabla_prueba.setAutoResizeMode(Tabla_prueba.AUTO_RESIZE_ALL_COLUMNS);
            Tabla_prueba.getTableHeader().setReorderingAllowed(false);
            Tabla_prueba.doLayout();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR AL MOSTRAR LOS DATOS" + e);
        }
    
    }
    
    public void Actualizar_tabla_nombre(){
    
        try {
            DefaultTableModel tabconsul = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            Object[] cabeceras = new Object[5];
            cabeceras[0] ="NO. FOLIO";
            cabeceras[1] ="FECHA EXPEDICIÓN";
            cabeceras[2] ="PROPIETARIO";
            cabeceras[3] ="UBICACIÓN";
            cabeceras[4] ="MOTIVO";
            tabconsul.setColumnIdentifiers(cabeceras);
            
            ArrayList<String[]> Lista_constancias;
            
            Constancia constancia = new Constancia();
            Lista_constancias = constancia.Buscar_por_nombre(this.nombre, this.appat, this.apmat);
            for (int i = 0; i < Lista_constancias.size(); i++) {
                Object[] datos_constancia = new Object[5];
                datos_constancia[0] = Lista_constancias.get(i)[0];
                datos_constancia[1] = Lista_constancias.get(i)[1];
                datos_constancia[2] = Lista_constancias.get(i)[2]+" "+Lista_constancias.get(i)[3]+" "+Lista_constancias.get(i)[4];
                datos_constancia[3] = Lista_constancias.get(i)[5];
                datos_constancia[4] = Lista_constancias.get(i)[6];
                tabconsul.addRow(datos_constancia);
            }
            Tabla_prueba.setModel(tabconsul);
            Tabla_prueba.setAutoResizeMode(Tabla_prueba.AUTO_RESIZE_ALL_COLUMNS);
            Tabla_prueba.getTableHeader().setReorderingAllowed(false);
            Tabla_prueba.doLayout();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR AL MOSTRAR LOS DATOS");
        }
    
    }
    
    
>>>>>>> 0dbfb8eb1131c998dfb5e7f074b55ef99aa093fe
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
<<<<<<< HEAD
    private rojerusan.RSTableMetro Tabla_prueba;
    private javax.swing.JButton bt_consulta_constancias;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_pdfConstanciasExistentes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
=======
    public rojerusan.RSTableMetro Tabla_prueba;
    private javax.swing.JButton bt_buscar;
    private javax.swing.JButton bt_buscar_aceptar;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_consulta_constancias;
    private javax.swing.JButton bt_consutar_info;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_regresar;
    private javax.swing.JButton bt_sel_modo;
>>>>>>> 0dbfb8eb1131c998dfb5e7f074b55ef99aa093fe
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
