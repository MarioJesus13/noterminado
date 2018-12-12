<%@page import="controller.controladorResultados"%>
<%@page import="include.resultados" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page="extends/header.jsp"></jsp:include>
<%
    controladorResultados cr = new controladorResultados();
    ArrayList<resultados> resu = new ArrayList<>();
    resu = cr.obtenerejercicio();

    String htmlSelect = "";
    htmlSelect += "<select name='ejercici'>\n <option value='' selected disabled>Elegir Tema</option>\n";
    for (int i = 0; i < resu.size(); i++) {
        htmlSelect += "<option value = '" + resu.get(i).getId_ejercicio() + "' > " + resu.get(i).getId_ejercicio() + "</option>\n";
    }
    htmlSelect += "</select>";
%>
<form action="/crearresultado" method="post">
    <div class="container">
        <div class="row">
            <div class="col s12">
                <br><br>
                <h3>Crear Nuevo Resultado</h3>
                <br><br>
            </div>

            <div class="col s12">
                <div class="col m2"></div>
                <div class="input-field col m8">
                    <input id="id_Resultado" type="text" name="Id_Resultados"class="validate"required>
                    <label for="id_Resultado">ID</label>
                </div>
                <div class="col m2"></div>
            </div>
            <div class="col s12">
                <div class="col m2"></div>
                <div class="input-field col m8">
                    <input id="correctas" type="text" name="correctas"class="validate"required>
                    <label for="correctas">Respuestas Correctas</label>
                </div>
                <div class="col m2"></div>
            </div>
            <div class="col s12">
                <div class="col m2"></div>
                <div class="input-field col m8">
                    <input id="ejercici" type="text" name="ejercici"class="validate"required>
                    <label for="ejercici">ID Ejericio</label>
                </div>
                <div class="col s12">
                    <div class="col m2"></div>
                    <div class="input-field col m8">
                        <input id="Id_Usuario" type="text" name="Id_Usuario"class="validate"required>
                        <label for="Id_Usuario">ID Usuario</label>
                    </div>
                <div class="col m2"></div>
            </div>
            <div class="col s12">
                <div class="col m2"></div>
                <div class="input-field col m8">
                    <%
                        out.print(htmlSelect);
                    %>
                </div>
                <div class="col m2"></div>
            </div>
            <div class="col s12">
                <div class="col m2">

                </div>
                <div class="col m8">
                    <button type="submit" class="btn">Agregar</button>
                    <button class="btn">Cancelar</button>


                </div>
                <div class="col m2">

                </div>
            </div>
        </div>

    </div>
</form>
<jsp:include page="extends/footer.jsp"></jsp:include>
