package Parte_3_Encapsulamiento.Ejercicio_3;

public class Juego {

    // Atributos
    private double puntuacion;

    // Metodo para sumar puntos
    public void sumarPuntos(int puntos) {

        if (puntos > 0) {
            puntuacion += puntos;
            System.out.println("Se sumaron " + puntos + " puntos, en total hay: " + puntuacion + "puntos.");

        } else {
            System.out.println("No se pueden sumar puntos negativos.");
        }

    }

    // Metodo para ver la puntuacion
    public double getPuntuacion() {
        return puntuacion;
    }

}
