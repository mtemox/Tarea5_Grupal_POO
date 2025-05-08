package Parte_2_Validacion_Metodos.Ejercicio_3;

public class Juego {
    private int puntuacion = 0;

    public boolean sumarPuntos(int puntos) {
        if (puntos <= 0) return false;
        puntuacion += puntos;
        return true;
    }

    public int GetPuntuacion() {
        return puntuacion;
    }
}
