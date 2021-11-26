<%-- 
    Document   : votar_proc
    Created on : Nov 20, 2021, 11:55:03 PM
    Author     : Yosshua
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proyectos ITAM</title>        

    </head>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0);
            String clvProyecto = request.getParameter("selector");
            String clvContienda = request.getParameter("idcont");
            String clvAlumno = request.getParameter("txtCU");

            if (clvProyecto.equals("0")) {
                session.setAttribute("Votado", "Seleccionar proyecto");
                request.getRequestDispatcher("votar.jsp").forward(request, response);
            } else if (clvAlumno.equals("")) {
                session.setAttribute("Votado", "Ingresar CU");
                request.getRequestDispatcher("votar.jsp").forward(request, response);
            } else {

                try {
                    ws_votar.WSVotar_Service service = new ws_votar.WSVotar_Service();
                    ws_votar.WSVotar port = service.getWSVotarPort();
                    // TODO initialize WS operation arguments here
                    // TODO process result here
                    java.lang.String result = port.votar(clvAlumno, clvContienda, clvProyecto);                    
                    session.setAttribute("Votado", result);
                } catch (Exception ex) {
                    session.setAttribute("Votado", "Hubo un error al registrar tu voto.");
                }                
                request.getRequestDispatcher("votar.jsp").forward(request, response);
            }

        %>

    </body>
</html>
