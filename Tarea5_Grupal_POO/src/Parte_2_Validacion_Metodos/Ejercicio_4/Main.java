package Parte_2_Validacion_Metodos.Ejercicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConfigUser config = new ConfigUser();

        // Elegir idioma
        while (true) {
            System.out.print("Elija idioma (Español, Ingles, Frances): ");
            String idioma = sc.nextLine();
            if (config.setIdioma(idioma)) {
                System.out.println("Idioma configurado a: " + idioma);
                break;
            } else {
                System.out.println("Idioma no valido.");
            }
        }

        // Configurar notificaciones
        while (true) {
            System.out.print("¿Desea activar notificaciones? (si/no): ");
            String respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("si")) {
                config.setNotificaciones(true);
                System.out.println("Notificaciones activadas.");
                break;
            } else if (respuesta.equals("no")) {
                config.setNotificaciones(false);
                System.out.println("Notificaciones desactivadas.");
                break;
            } else {
                System.out.println("Respuesta no valida. Escriba 'si' o 'no'.");
            }
        }

        sc.close();
    }
}

//import java.util.Set;
//
//public class ConfiguracionUsuario {
//    private String idioma;
//    private boolean notificaciones;
//    private static final Set<String> IDIOMAS_VALIDOS = Set.of("Español", "Inglés", "Francés");
//
//    public boolean setIdioma(String idioma) {
//        if (!IDIOMAS_VALIDOS.contains(idioma)) return false;
//        this.idioma = idioma;
//        return true;
//    }
//
//    public void setNotificaciones(boolean estado) {
//        this.notificaciones = estado;
//    }
//
//    public String getIdioma() {
//        return idioma;
//    }
//
//    public boolean isNotificacionesActivadas() {
//        return notificaciones;
//    }
//}