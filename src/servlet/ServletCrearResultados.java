package servlet;

import controller.controladorResultados;
import include.resultados;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCrearResultados",urlPatterns = {"/crearresultado"})
public class ServletCrearResultados extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String repuestas_correctas = request.getParameter("correctas");
        int id_resultados = 0;
        int respuestas_incorrectas = 0;
        int id_ejercicio = 0;
        int id_usuario = 0;
        try {
            id_resultados = Integer.parseInt(request.getParameter("Id_Resultado"));
            respuestas_incorrectas = Integer.parseInt(request.getParameter("Incorrectas"));
            id_ejercicio = Integer.parseInt(request.getParameter("ejercici"));
            id_usuario = Integer.parseInt(request.getParameter("Id_Usuario"));
        } catch (NumberFormatException e) {

        }
        resultados nuevosresultados = new resultados(id_resultados, repuestas_correctas, respuestas_incorrectas, id_ejercicio, id_usuario);
        controladorResultados cc = new controladorResultados();
        if (cc.agregarResultados(nuevosresultados)) {
            response.sendRedirect("resultados.jsp");
        } else {
            response.sendRedirect("Agregar_Resultado.jsp");
        }

    }
}