package controller;

import include.ejercicios;
import modelos.modeloEjercicios;

import java.util.ArrayList;

public class controladorEjercicios {
    public boolean agregarEjercicio(ejercicios ejerci){
        modeloEjercicios ejer = new modeloEjercicios();
        return ejer.insertEjercicio(ejerci);
    }

    public ArrayList<ejercicios>obtenerejercicios(){
        modeloEjercicios ejercicio = new modeloEjercicios();
        return ejercicio.obtenerEjercicios();
    }
    public ArrayList<ejercicios>obtenerTemas(){
        modeloEjercicios ejercicio = new modeloEjercicios();
        return ejercicio.obtenertemas();
    }
    public ArrayList<ejercicios> obtenerejercicios(int clave) {
        modeloEjercicios ejercicios = new modeloEjercicios();
        return ejercicios.obtenerEjercicios(clave);

    }
    public boolean actualizarejercicios(ejercicios ejercicios){
        modeloEjercicios ejercicios1 = new modeloEjercicios();
        return ejercicios1.actualizarejercicios(ejercicios);
    }
    public boolean eliminarEjercicios(int clave){
        modeloEjercicios ejercicios1 = new modeloEjercicios();
        return ejercicios1.borrarejercicios(clave);
    }
    public static void main(String[] args) {
        controladorEjercicios cc = new controladorEjercicios();
        //Agregar un elemento
        //System.out.println(cc.agregarEjercicio(new ejercicios (3,"sistemas",2,4)));
        //System.out.println(cc.agregarEjercicio(new ejercicios (4,"diseño",5,3)));


        //listar todos los elementos de la tabla

        modeloEjercicios ce = new modeloEjercicios();
        //System.out.println(ce.insertEjercicio(new ejercicios(2, "ejercicio1", 10)))
        ArrayList<ejercicios> ejercici = new ArrayList<ejercicios>();
        ejercici = ce.obtenertemas();
        for (int i = 0; i < ejercici.size(); i++) {
            System.out.println(ejercici.get(i).getId_temas());
        }

        //Modificar un elemento
        //System.out.println(cc.actualizarejercicios(new ejercicios(1,"",2)));

        //Modificar un elemento
        //System.out.println(cc.eliminarEjercicios(2));

    }

}

