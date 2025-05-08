package Parte_3_Encapsulamiento.Ejercicio_4;

public class AppMovil {

    // Atributos
    private String idioma;
    private boolean notificaciones;

    // Metodos
    // Metodo para cambiar el idioma
    public void cambiarIdioma(String idiomaEntrada) {

        if (idiomaEntrada == "Español" || idiomaEntrada == "Ingles" || idiomaEntrada == "Frances") {
            idioma = idiomaEntrada;
            System.out.println("Idioma cambiado a: " + idioma);
        } else {
            System.out.println("Idioma no válido.");
        }

    }

    // Metodo para activar las notificaciones
    public void activarNotificaciones(boolean estado) {
        notificaciones = estado;
        System.out.println("Notificaciones " + (notificaciones ? "activadas" : "desactivadas"));
    }

}
