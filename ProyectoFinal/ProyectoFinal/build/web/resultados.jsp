<%-- 
    Document   : resultados
    Created on : Nov 21, 2021, 8:54:46 PM
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
        <link rel="stylesheet" href="CSS/tarjetas.css">   
        <link rel="stylesheet" href="CSS/botones.css">   
        <link rel="stylesheet" href="CSS/drop.css">
        <link rel="stylesheet" href="CSS/form.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src='https://cdn.plot.ly/plotly-2.6.3.min.js'></script>
    </head>
    <body>
        <script language="javascript">
            function myFunction() {
                var x = document.getElementById("myTopnav");
                if (x.className === "topnav") {
                    x.className += " responsive";
                } else {
                    x.className = "topnav";
                }
            }

        </script>
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
        <div style="text-align: center; margin-top: 10px"><h2>Resultados</h2> </div>        
        
        <div id='myDiv'><!-- Plotly chart will be drawn inside this DIV --></div>
        <script>
            var vals = [];
            var labs = [];
            var layout = {
                height: 400,
                width: 500,
                title: "Proporción de votos"                
            };

        </script>
        <%
            
            try {
                ws_info.WSInfo_Service service = new ws_info.WSInfo_Service();
                ws_info.WSInfo port = service.getWSInfoPort();
                // TODO process result here
                java.util.List<java.lang.String> result = port.getStatistics();

                for (String r : result) {
                    String[] ops = r.split("__");
                    // 0-Title, 1-Count
                    %>
                    <script> 
                        labs.push("<%=ops[0]%>");
                        vals.push(<%=ops[1]%>);
                    </script>
                    <%
                }
                
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <script>
            var data = [{                    
                values: vals,
                labels: labs,
                type: 'pie',
                textinfo: "percent",
                textposition: "inside",
                automargin: true
              }];
            Plotly.newPlot('myDiv', data, layout);
        </script>

    </body>
</html>
