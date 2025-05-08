package Parte_3_Encapsulamiento.Ejercicio_4;

public class Main {
    public static void main(String[] args) {

        // Creo un objeto 'AppMovil'
        AppMovil a1 = new AppMovil();

        a1.cambiarIdioma("Ingles");
        a1.cambiarIdioma("Frances");
        a1.activarNotificaciones(true);
        a1.activarNotificaciones(false);

    }
}