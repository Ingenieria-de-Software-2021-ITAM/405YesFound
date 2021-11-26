/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_login;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import proyectos.ClsGestorProyectos;

/**
 *
 * @author Yosshua
 */
@WebService(serviceName = "WS_Login")
public class WS_Login {

    
    
    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        ClsGestorProyectos miGestor = new ClsGestorProyectos();
        Boolean valid = miGestor.conectaBD(username, password);
        return valid;
    }
    
    
}
