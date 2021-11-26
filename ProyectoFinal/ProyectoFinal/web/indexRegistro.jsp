<%-- 
    Document   : indexRegistro
    Created on : Nov 20, 2021, 12:25:03 PM
    Author     : Yosshua
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Proyectos ITAM</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="CSS/topnav.css">
        <link rel="stylesheet" href="CSS/form.css">
    </head>
    <body>
        <div class="topnav" id="myTopnav">
            <a href="index.html" class="active"><i class="fa fa-fw fa-home"></i>Inicio</a>
            <a href="votar.jsp"><i class="fa fa-fw fa-thumbs-o-up"></i>Votación</a>
            <a href="resultados.jsp"><i class="fa fa-fw fa-pie-chart"></i>Resultados</a>
            <a href="login.jsp"><i class="fa fa-fw fa-plus-square-o"></i>Registro de proyectos</a>
            <a href="about.html"><i class="fa fa-fw fa-info"></i>Acerca de</a>
            <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                <i class="fa fa-bars"></i>
            </a>
        </div>
        <h2>Bienvenido al registro de proyectos</h2>
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
        %>
        <div class="container">
            <form action="indexRegistro_proc.jsp" method="POST">
                <div class="row">
                    <div class="col-25">
                        <label for="fname">Nombre del proyecto</label>
                    </div>
                    <div class="col-75">
                        <input required type="text" id="nombrePro" name="nombrePro" placeholder="El nombre de tu proyecto.." value="">
                    </div>
                </div>                

                <div class="row">
                    <div class="col-25">
                        <label for  = "contienda" > Contienda </label>  
                    </div> 
                    <div class="col-75">
                        <select name="clvContienda" >
                            <%
                                ws_info.WSInfo_Service service = new ws_info.WSInfo_Service();
                                ws_info.WSInfo port = service.getWSInfoPort();
                                java.util.List<java.lang.String> cont = port.getContiendas();

                                for (String s : cont) {
                                    String[] ops = s.split("__");
                                    String op = "<option value=\"" + ops[0] + "\">" + ops[1] + "</option>";
                                    out.print(op);
                                }
                            %>
                        </select>
                    </div>        
                </div>                
                <div class="row">
                    <div class="col-25">
                        <label for="lname">Descripción breve...</label>
                    </div>
                    <div class="col-75">
                        <input required type="text" id="descBreve" name="descBreve" placeholder="Agrega una descripción corta del proyecto.." value="">
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="subject">Descripción</label>
                    </div>
                    <div class="col-75">
                        <textarea required id="subject" value="" name="desc" placeholder="Agrega la descripción completa aquí.." style="height:200px"></textarea>
                    </div>
                </div>
                <br>
                <div class="row">                                        
                    <input type="submit" value="Registrar proyecto">                    
                </div>
            </form>
            <form action="indexRegistro_proc.jsp" method="POST">
                <div class="row">
                    <br>
                    <input type="submit" value="Cancelar registro" name ="Cancelar" >
                </div>
            </form>
        </div>

    </body>
</html>
