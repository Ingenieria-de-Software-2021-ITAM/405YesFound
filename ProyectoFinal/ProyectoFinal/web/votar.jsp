<%-- 
    Document   : votar
    Created on : Nov 20, 2021, 9:20:17 PM
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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

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
            if (session.getAttribute("Votado") != null) {
        %>
        <script>
                    alert("<%=session.getAttribute("Votado")%>");
        </script>

        <%
                session.removeAttribute("Votado");
            }
        %>
        <div class="wrapper">
            <h1>Proyectos</h1>
            <hr style="margin-bottom: 10px">
            <%
                try {
                    ws_info.WSInfo_Service service = new ws_info.WSInfo_Service();
                    ws_info.WSInfo port = service.getWSInfoPort();
                    // TODO process result here
                    java.util.List<java.lang.String> cont = port.getContiendas();

                    for (String s : cont) {
                        String[] ops = s.split("__");
                        out.print("<h2 style=\"text-align: center; \">" + ops[1] + "</h2>");
                        java.util.List<java.lang.String> p = port.getProyectos(ops[0]);
                        out.print("<div class=\"cols\">");
                        for (String pro : p) {
                            String[] p_rows = pro.split("__");
                            String proye = "<div class=\"col\" ontouchstart=\"this.classList.toggle('hover');\"> "
                                    + "<div class=\"container\">"
                                    + "<div class=\"front\" style=\"background-image: url('Images/" + p_rows[0] + ".png')\">"
                                    + "<div class=\"inner\">"
                                    + "<p>"
                                    + p_rows[1]
                                    + "</p>"
                                    + "<span>" + p_rows[4] + "</span>"
                                    + "</div>"
                                    + "</div>"
                                    + "<div class=\"back\">"
                                    + "<div class=\"inner\">"
                                    + "<p>"
                                    + p_rows[2]
                                    + "</p>"
                                    + "</div>"
                                    + "</div>"
                                    + "</div>"
                                    + "</div>";
                            out.println(proye);
                        }
                        out.print("</div>");
                        //Acaba div de cols
                        out.print("<form name=\"solicitaLogin\" method=\"POST\" action=\"votar_proc.jsp\">");
                        out.print("<div class=\"custom-select\" style=\"width:200px;margin-left: auto; margin-right: 0; \">");
                        out.print("<div style=\"margin-bottom: 10px\">");
                        out.println("<p> Ingresa tu clave única </p>");
                        out.println("<input type=\"text\" value=\"\" name=\"txtCU\" />");
                        out.print("</div>");

                        out.print("<select name=\"selector\">");
                        out.print("<option value=\"0\">Seleccionar proyecto:</option>");
                        for (String pro : p) {
                            String[] p_rows = pro.split("__");
                            String opt = "<option value=\"" + p_rows[0] + "\">" + p_rows[1] + "</option>";
                            out.print(opt);
                        }
                        out.print("</select>");
                        out.print("</div>");
                        out.print("<div style=\"width:200px; margin-left: auto; margin-right: 0;\">");
                        out.print("<input type=\"hidden\" value=\"" + ops[0] + "\" name=\"idcont\" />");
                        out.print("<input type=\"submit\" class=\"input input8px\" value=\"Votar\" name=\"btnVoto\" />");
                        out.print("</div>");
                        out.print("</form>");
                        out.print("<hr style=\"margin-bottom: 10px; margin-top:10px\">");
                    }
                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                }
            %>
            <script>
                var x, i, j, l, ll, selElmnt, a, b, c;
                /*look for any elements with the class "custom-select":*/
                x = document.getElementsByClassName("custom-select");
                l = x.length;
                for (i = 0; i < l; i++) {
                    selElmnt = x[i].getElementsByTagName("select")[0];
                    ll = selElmnt.length;
                    /*for each element, create a new DIV that will act as the selected item:*/
                    a = document.createElement("DIV");
                    a.setAttribute("class", "select-selected");
                    a.innerHTML = selElmnt.options[selElmnt.selectedIndex].innerHTML;
                    x[i].appendChild(a);
                    /*for each element, create a new DIV that will contain the option list:*/
                    b = document.createElement("DIV");
                    b.setAttribute("class", "select-items select-hide");
                    for (j = 1; j < ll; j++) {
                        /*for each option in the original select element,
                         create a new DIV that will act as an option item:*/
                        c = document.createElement("DIV");
                        c.innerHTML = selElmnt.options[j].innerHTML;
                        c.addEventListener("click", function (e) {
                            /*when an item is clicked, update the original select box,
                             and the selected item:*/
                            var y, i, k, s, h, sl, yl;
                            s = this.parentNode.parentNode.getElementsByTagName("select")[0];
                            sl = s.length;
                            h = this.parentNode.previousSibling;
                            for (i = 0; i < sl; i++) {
                                if (s.options[i].innerHTML == this.innerHTML) {
                                    s.selectedIndex = i;
                                    h.innerHTML = this.innerHTML;
                                    y = this.parentNode.getElementsByClassName("same-as-selected");
                                    yl = y.length;
                                    for (k = 0; k < yl; k++) {
                                        y[k].removeAttribute("class");
                                    }
                                    this.setAttribute("class", "same-as-selected");
                                    break;
                                }
                            }
                            h.click();
                        });
                        b.appendChild(c);
                    }
                    x[i].appendChild(b);
                    a.addEventListener("click", function (e) {
                        /*when the select box is clicked, close any other select boxes,
                         and open/close the current select box:*/
                        e.stopPropagation();
                        closeAllSelect(this);
                        this.nextSibling.classList.toggle("select-hide");
                        this.classList.toggle("select-arrow-active");
                    });
                }
                function closeAllSelect(elmnt) {
                    /*a function that will close all select boxes in the document,
                     except the current select box:*/
                    var x, y, i, xl, yl, arrNo = [];
                    x = document.getElementsByClassName("select-items");
                    y = document.getElementsByClassName("select-selected");
                    xl = x.length;
                    yl = y.length;
                    for (i = 0; i < yl; i++) {
                        if (elmnt == y[i]) {
                            arrNo.push(i)
                        } else {
                            y[i].classList.remove("select-arrow-active");
                        }
                    }
                    for (i = 0; i < xl; i++) {
                        if (arrNo.indexOf(i)) {
                            x[i].classList.add("select-hide");
                        }
                    }
                }
                /*if the user clicks anywhere outside the select box,
                 then close all select boxes:*/
                document.addEventListener("click", closeAllSelect);
            </script>

        </div>

    </body>
</html>
