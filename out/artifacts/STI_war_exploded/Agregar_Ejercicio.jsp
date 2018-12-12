 <%@page import="controller.controladorEjercicios"%>
<%@page import="include.ejercicios" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page="extends/header.jsp"></jsp:include>
<%
  controladorEjercicios ce = new controladorEjercicios();
    ArrayList<ejercicios> ejer = new ArrayList<>();
    ejer = ce.obtenerTemas();

    String htmlSelect = "";
    htmlSelect += "<select name='temafk'>\n <option value='' selected disabled>Elegir Tema</option>\n";
    for (int i = 0; i < ejer.size(); i++) {
        htmlSelect += "<option value = '" + ejer.get(i).getId_temas() + "' > " + ejer.get(i).getId_temas() + "</option>\n";
    }
    htmlSelect += "</select>";
%>
 <form action="/crearejercicio" method="post">
     <div class="container">
         <div class="row">
             <div class="col s12">
                 <br><br>
                 <h3>Crear Nuevo Ejercicio</h3>
                 <br><br>
             </div>

             <div class="col s12">
                 <div class="col m2"></div>
                 <div class="input-field col m8">
                     <input id="id_Ejercicio" type="text" name="Id_Ejercicio"class="validate"required>
                     <label for="id_Ejercicio">ID</label>
                 </div>
                 <div class="col m2"></div>
             </div>
             <div class="col s12">
                 <div class="col m2"></div>
                 <div class="input-field col m8">
                     <input id="Nombre" type="text" name="Nombre"class="validate"required>
                     <label for="Nombre">Nombre</label>
                 </div>
                 <div class="col m2"></div>
             </div>
             <div class="col s12">
                 <div class="col m2"></div>
                 <div class="input-field col m8">
                     <input id="Puntaje" type="text" name="Puntaje"class="validate"required>
                     <label for="Puntaje">Puntaje</label>
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
