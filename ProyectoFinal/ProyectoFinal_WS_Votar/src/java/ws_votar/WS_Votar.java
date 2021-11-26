/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_votar;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import proyectos.ClsGestorProyectos;
import proyectos.MiModelo;

/**
 *
 * @author Yosshua
 */
@WebService(serviceName = "WS_Votar")
public class WS_Votar {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "votar")
    public String votar(@WebParam(name = "clvAlumno") String clvAlumno, @WebParam(name = "clvContienda") String clvContienda, @WebParam(name = "clvProyecto") String clvProyecto) {
        ClsGestorProyectos miGestor = new ClsGestorProyectos();
        MiModelo alum = miGestor.obtenAlumno(clvAlumno);
        // 0 - ApM , 1 - ApP, 2 - Nombre, 3 - CU, 4 - activo
        String ans = "";
        if (alum.getRowCount() > 0) {
            MiModelo voto = miGestor.obtenVoto(clvAlumno, clvContienda);
            if (voto.getRowCount() == 0) {
                String[] arr_nomCampos = {"CLVALUMNO", "CLVCONTIENDA", "CLVPROYECTO"};
                String[] arr_datos = {clvAlumno, clvContienda, clvProyecto};
                Boolean votado = miGestor.altaVoto(arr_nomCampos, arr_datos);
                if (votado) {
                    ans = "Voto registrado";
                } else {
                    ans = "No se pudo registrar el voto";
                }
            } else {
                ans = "Ya votaste para esta contienda";
            }
        } else {
            ans = "No se pudo realizar el voto";
        }
        return ans;
    }

}
