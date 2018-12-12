package controller;

import include.resultados;
import modelos.modeloResultados;

import java.util.ArrayList;

public class controladorResultados {
    public boolean agregarResultados(resultados resu){
        modeloResultados resul = new modeloResultados();
        return resul.insertResultados(resu);

    }
    public ArrayList<resultados>obtenerresultados(){
        modeloResultados resultados = new modeloResultados();
        return resultados.obtenerResultados();
    }
    public ArrayList<resultados> obtenerejercicio() {
        modeloResultados resultados = new modeloResultados();
        return resultados.obtenerResultados();

    }
    public ArrayList<resultados> obtenerresultados(int clave){
        modeloResultados resultados = new modeloResultados();
        return resultados.obtenerResultados(clave);
    }
    public boolean actualizarresultados(resultados resultados){
        modeloResultados resultados1 = new modeloResultados();
        return resultados1.actualizarresultados(resultados);
    }
    public boolean eliminarResultados(int clave){
        modeloResultados resultados1 = new modeloResultados();
        return resultados1.borrarresultados(clave);
    }
    public static void main (String[] args){
        controladorResultados cc = new controladorResultados();
        //Agregar un elemento
        System.out.println(cc.agregarResultados(new resultados(3,4,2,5,2)));
        //System.out.println(cc.agregarResultados(new resultados(1,2,3,4,5)));


        //listar todos los elementos de la tabla

        modeloResultados ce = new modeloResultados();
        //System.out.println(ce.insertResultados(new resultados(1, 2, 3, 4, 5)));
        ArrayList<resultados> resul = new ArrayList<resultados>();
        resul = ce.obtenerResultados();
        for (int i = 0; i < resul.size(); i++) {
            System.out.println(resul.get (i).getId_ejercicio());
            System.out.println(resul.get (i).getId_usuario());
        }

        //Modificar un elemento
        //System.out.println(cc.actualizarresultados(new resultados(1,2,3,4,5)));

        //Modificar un elemento
        //System.out.println(cc.eliminarResultados(1));


    }


}
