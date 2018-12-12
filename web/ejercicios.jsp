<%@ page import="include.ejercicios"%>
<%@ page import="controller.controladorEjercicios"%>
<%@ page import="java.util.ArrayList"%>

<jsp:include page="extends/header.jsp"></jsp:include>
<div class="container ">
    <div class="row">
        <div class="center input-field col s12">
            <h3>EJERCICIOS</h3>
        </div>
        <div class="col s12" align="right">
            <a href="Agregar_Ejercicio.jsp" class="btn">Nuevo</a>
        </div>
        <div class="col s12 m12">
            <table class="striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Puntaje</th>
                    <th>Tema</th>
                </tr>
                </thead>
                <%
                    String html = "<tbody>";
                    controladorEjercicios ce = new controladorEjercicios();
                    ArrayList<ejercicios> ejer = new ArrayList<>();
                    ejer = ce.obtenerejercicios();
                    if (ejer.size()>0){
                        for (int i=0;i<ejer.size();i++){
                            html += "<tr><td>"+ejer.get(i).getId_ejercicio()+
                                    "</td><td>"+ejer.get(i).getNombre_ejercicio()+
                                    "</td><td>"+ejer.get(i).getPuntaje()+
                                    "</td><td>"+ejer.get(i).getId_temas()+"</td><td><a class ='btn' href ='/modificar_Ejercicio.jsp?idejercicio=" + ejer.get(i).getId_ejercicio() + "'>Editar</a> <a class ='btn' onclick = 'Eliminar_Ejercicio("+ ejer.get(i).getId_ejercicio() + ")'>Eliminar</a></td></tr>";
                        }
                    }else {
                        html+="<tr><td colspan = '4'>Tabla Vacia</td></tr>";
                    }
                    html +="</body>";
                    out.print(html);
                %>
            </table>
        </div>
    </div>

</div>
<jsp:include page="extends/footer.jsp"></jsp:include>