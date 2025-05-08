package Parte_3_Encapsulamiento.Ejercicio_2;

public class Main {
    public static void main(String[] args) {

        // Creo un objeto 'Automovil'
        Automovil a1 = new Automovil("Nissan", 0);

        // Llamada los metodos
        a1.acelerar(5);
        a1.acelerar(3);
        a1.acelerar(60);

        a1.frenar(52);
        a1.frenar(2);
        a1.frenar(6);

    }
}