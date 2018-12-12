package include;

public class resultados {
    private int id_resultados;
    private int respuestas_correctas;
    private int respuestas_incorrectas;
    private int id_ejercicio;
    private int id_usuario;

    public resultados(int id_resultados,int respuestas_correctas,int respuestas_incorrectas,int id_ejercicio, int id_usuario) {
        this.id_resultados = id_resultados;
        this.respuestas_correctas = id_resultados;
        this.respuestas_incorrectas = id_resultados;
        this.id_ejercicio = id_resultados;
        this.id_usuario = id_resultados;

    }
    public resultados(int id_resultados, String repuestas_correctas, int respuestas_incorrectas, int idEjercicio, int id_ejercicio){
        this.id_ejercicio = id_ejercicio;
    }

    public int getId_resultados() { return id_resultados; }
    public void setId_resultados(int id_resultados){ this.id_resultados = id_resultados; }

    public int getRespuestas_correctas(){ return respuestas_correctas; }
    public void setRespuestas_correctas(int respuestas_correctas){
        this.respuestas_correctas = respuestas_correctas; }
    public int getRespuestas_incorrectas(){ return respuestas_incorrectas; }

    public void setRespuestas_incorrectas(int respuestas_incorrectas) {
        this.respuestas_incorrectas = respuestas_incorrectas;
    }
    public int getId_ejercicio() { return id_ejercicio;}
    public void setId_ejercicio(int id_ejercicio) {this.id_ejercicio = id_ejercicio;}

    public  int getId_usuario () {return id_usuario; }
    public void setId_usuario (int id_usuario) {this.id_usuario = id_usuario;}

}
