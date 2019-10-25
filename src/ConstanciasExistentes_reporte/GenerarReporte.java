/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstanciasExistentes_reporte;

import Tablas.Constancia;
import comisaria_db.Conexion;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author hazel
 */
public class GenerarReporte {
    public void reporteconstancias (){
        try {
            Conexion con = new Conexion();
            con.conectar();
              JasperReport reporte =null;
              reporte=(JasperReport) JRLoader.loadObject("ConstanciasExistentes_Reporte.jasper");
              Map parametro = new HashMap();
              JasperPrint jprint= JasperFillManager.fillReport(reporte,parametro,con.conectar());
             
        } catch (Exception e) {
        }
 
    }
}
