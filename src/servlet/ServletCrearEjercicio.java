package servlet;

import  controller.controladorEjercicios;
import  include.ejercicios;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCrearEjericio", urlPatterns = {"/crearejercicio"})
public class ServletCrearEjercicio extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre_ejercicio = request.getParameter("Nombre");
        int id_ejercicio = 0;
        int puntaje = 0;
        int id_temas = 0;
        try {
            id_ejercicio= Integer.parseInt(request.getParameter("Id_Ejercicio"));
            puntaje = Integer.parseInt(request.getParameter("Puntaje"));
            id_temas= Integer.parseInt(request.getParameter("temafk"));
        } catch (NumberFormatException e) {

        }


        ejercicios nuevosejercicios = new ejercicios(id_ejercicio, nombre_ejercicio,puntaje,id_temas);
        controladorEjercicios cc = new controladorEjercicios();
        if (cc.agregarEjercicio(nuevosejercicios)) {
            response.sendRedirect("ejercicios.jsp");
        } else {
            response.sendRedirect("Agregar_Ejercicio.jsp");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
