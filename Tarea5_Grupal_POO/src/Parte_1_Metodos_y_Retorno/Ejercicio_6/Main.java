package Parte_1_Metodos_y_Retorno.Ejercicio_6;

public class Main {
    public static void main(String[] args) {
        //Creacion del objeto
        Calificaciones notas = new Calificaciones(9.75);
        // Obtener la  categoria
        char categoria = notas.categoriaDeCalificacion();
        System.out.println("La calificacion es " + notas.calificaciones + "tiene categoria de calificaciones"+ categoria);
    }
}