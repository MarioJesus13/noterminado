<%@page import="controller.controladorEjercicios" %>
<%
    int idejercicio = Integer.parseInt(request.getParameter("idejercicio"));
    controladorEjercicios ce = new controladorEjercicios();
    if (ce.eliminarEjercicios(idejercicio)){
        response.sendRedirect("ejercicios.jsp");
    }else {
        response.sendRedirect("ejercicios.jsp");
    }
%>