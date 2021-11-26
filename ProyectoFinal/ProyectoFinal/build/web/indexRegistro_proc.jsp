<%-- 
    Document   : indexRegistro_proc
    Created on : Nov 21, 2021, 10:42:06 AM
    Author     : Yosshua
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="CSS/topnav.css">
        <link rel="stylesheet" href="CSS/tarjetas.css">   
        <link rel="stylesheet" href="CSS/botones.css">   
        <link rel="stylesheet" href="CSS/drop.css">
        <link rel="stylesheet" href="CSS/form.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    </head>
    <body>
        <div class="topnav" id="myTopnav">
            <a href="index.html" class="active"><i class="fa fa-fw fa-home"></i>Inicio</a>
            <a href="votar.jsp"><i class="fa fa-fw fa-thumbs-o-up"></i>Votación</a>
            <a href="login.jsp"><i class="fa fa-fw fa-plus-square-o"></i>Registro de proyectos</a>
            <a href="about.html"><i class="fa fa-fw fa-info"></i>Acerca de</a>
            <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                <i class="fa fa-bars"></i>
            </a>
        </div>
        <h2>Registro de proyectos</h2>
        <script>
            function myFunction() {
                var x = document.getElementById("myTopnav");
                if (x.className === "topnav") {
                    x.className += " responsive";
                } else {
                    x.className = "topnav";
                }
            }
        </script>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0); // Proxies.
            if (request.getParameter("Cancelar") != null) {
                session.removeAttribute("clvUsuario");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {                
                try {
                    ws_alta.WSAlta_Service service = new ws_alta.WSAlta_Service();
                    ws_alta.WSAlta port = service.getWSAltaPort();                    
                    java.lang.String clvContienda = request.getParameter("clvContienda");
                    java.lang.String nomProye = request.getParameter("nombrePro");
                    java.lang.String descCorta = request.getParameter("descBreve");
                    java.lang.String desc = request.getParameter("desc");
                    
                    java.lang.String result = port.registrarProyecto(clvContienda, nomProye, descCorta, desc);
                    out.print("<br><h3>"+result+"</h3>");
                    session.removeAttribute("clvUsuario");
                } catch (Exception ex) {
                    out.println("<br><h3>Hubo un error al registrar el proyecto</h3>");
                }

            }
        %>

    </body>
</html>
