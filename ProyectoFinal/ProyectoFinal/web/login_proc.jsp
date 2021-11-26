<%-- 
    Document   : login_proc
    Created on : Nov 20, 2021, 12:19:37 PM
    Author     : Yosshua
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
    </head>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0); // Proxies.
            try {                      
                ws_login.WSLogin_Service service = new ws_login.WSLogin_Service();
                ws_login.WSLogin port = service.getWSLoginPort();
                java.lang.String username = request.getParameter("username");
                java.lang.String password = request.getParameter("pwd");
                
                // TODO process result here
                java.lang.Boolean result = port.login(username, password);
                if (result) {
                    session.setAttribute("clvUsuario", username);
                    request.getRequestDispatcher("indexRegistro.jsp").forward(request, response);
                } else {
                    session.removeAttribute("clvUsuario");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }                

            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
    </body>
</html>
