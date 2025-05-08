package Parte_2_Validacion_Metodos.Ejercicio_4;

import java.util.Set;

public class ConfigUser {
    private String idioma;
    private boolean notificaciones;
    private static final Set<String> IDIOMAS_VALIDOS = Set.of("Español", "Inglés", "Francés");

    public boolean setIdioma(String idioma) {
        if (!IDIOMAS_VALIDOS.contains(idioma)) return false;
        this.idioma = idioma;
        return true;
    }

    public void setNotificaciones(boolean estado) {
        this.notificaciones = estado;
    }

    public String getIdioma() {
        return idioma;
    }

    public boolean isNotificacionesActivadas() {
        return notificaciones;
    }
}

