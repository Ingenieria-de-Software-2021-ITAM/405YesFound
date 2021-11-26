/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_info;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import proyectos.ClsGestorProyectos;
import proyectos.MiModelo;

/**
 *
 * @author Yosshua
 */
@WebService(serviceName = "WS_Info")
public class WS_Info {

    
    @WebMethod(operationName = "getContiendas")
    public String[] getContiendas() {
        ClsGestorProyectos miGestor = new ClsGestorProyectos();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();        
        MiModelo ans = miGestor.obtenContiendas(dtf.format(now).toString());     
        String[] end = new String[ans.getRowCount()];
        int ind = 0;
        for(Vector<String> v : ans.renglones){
            String cur = "";
            for(String vs: v){
                cur+= vs + "__";
            }
            end[ind++] = cur;            
        }
        return end;
    }
    @WebMethod(operationName = "getProyectos")
    public String[] getProyectos(String clvContienda) {
        ClsGestorProyectos miGestor = new ClsGestorProyectos();                
        MiModelo ans = miGestor.obtenProyectos(clvContienda);
        String[] end = new String[ans.getRowCount()];
        int ind = 0;
        for(Vector<String> v : ans.renglones){
            String cur = "";
            for(String vs: v){
                cur+= vs + "__";
            }
            end[ind++] = cur;            
        }
        return end;
    }
    @WebMethod(operationName = "getStatistics")
    public String[] getStatistics() {
        ClsGestorProyectos miGestor = new ClsGestorProyectos();            
        
        MiModelo ans = miGestor.obtenVotos();
        
        String[] end = new String[ans.getRowCount()];
        int ind = 0;
        for(Vector<String> v : ans.renglones){
            String cur = "";
            for(String vs: v){
                cur+= vs + "__";
            }
            end[ind++] = cur;            
        }        
        return end;
    }
    
}
