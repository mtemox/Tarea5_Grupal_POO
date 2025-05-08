package Parte_3_Encapsulamiento.Ejercicio_2;

public class Automovil {

    // Atributo de la clase
    public String modeloAutomovil;
    private double velocidad;

    // Metodo constructor

    public Automovil(String modeloAutomovil, double velocidad) {
        this.modeloAutomovil = modeloAutomovil;
        this.velocidad = velocidad;
    }

    // Métodos de la clase
    public void acelerar(double incremento) {

        if (this.velocidad == 0) {
            velocidad += incremento;
            System.out.println("El auto empezó a moverse a " + this.velocidad + " km/h");

        } else if ((this.velocidad > 0 && this.velocidad < 60) && incremento != 60) {
            velocidad += incremento;
            System.out.println("El auto incremento su velocidad a " + this.velocidad + " km/h");

        } else if (incremento >= 60 || this.velocidad >= 60) {
            this.velocidad = 60;
            System.out.println("El auto alcanzó su velocidad límite de " + this.velocidad + " km/h");
        }

    }

    public void frenar(double reduccion) {

        if (this.velocidad == 0) {
            System.out.println("El auto ya está detenido.");

        } else if ((this.velocidad > 0 && this.velocidad > 5) && reduccion != this.velocidad) {
            velocidad -= reduccion;
            System.out.println("El auto redujo su velocidad a " + this.velocidad + " km/h");

        } else if (reduccion >= this.velocidad || this.velocidad <= 5) {
            this.velocidad = 0;
            System.out.println("El auto se detuvo completamente.");
        }
    }


}
