/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_alta;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import proyectos.ClsGestorProyectos;
import proyectos.MiModelo;

/**
 *
 * @author Yosshua
 */
@WebService(serviceName = "WS_Alta")
public class WS_Alta {

    @WebMethod(operationName = "registrarProyecto")
    public String votar(@WebParam(name = "clvContienda") String clvContienda, @WebParam(name = "nomProye") String nomProye, @WebParam(name = "descCorta") String descCorta, @WebParam(name = "desc") String desc ) {
        ClsGestorProyectos miGestor = new ClsGestorProyectos();
        MiModelo proye = miGestor.obtenMaxId();
        String idProye = proye.getValueAt(0, 0).toString();
        idProye = idProye.substring(1);
        Integer idP  = Integer.parseInt(idProye);
        idP++;
        String clvProyecto = "P"+idP.toString();
        String ans = "";
        System.out.println("Clave p " + clvProyecto);
        String[] arr_nomCampos = {"CLVPROYECTO", "NOMBREPRO", "DESCRIPTION", "CLVCONTIENDA", "DESCCORTA"};
        String[] arr_datos = {clvProyecto, nomProye, desc, clvContienda, descCorta };
        Boolean registrado = miGestor.altaProyecto(arr_nomCampos, arr_datos);
        if (registrado) {
            ans = "Proyecto registrado";
        } else {
            ans = "No se pudo registrar el proyecto";
        }
                
        return ans;
    }
    
}
