package Parte_2_Validacion_Metodos.Ejercicio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Juego juego = new Juego();

        while (true) {
            System.out.print("Ingrese puntos para sumar (0 para salir): ");
            String entrada = sc.nextLine();

            if (entrada.equals("0")) {
                System.out.println("Saliendo del juego.");
                break;
            }

            try {
                int puntos = Integer.parseInt(entrada);
                if (!juego.sumarPuntos(puntos)) {
                    System.out.println("No se pueden sumar puntos negativos.");
                } else {
                    System.out.println("Puntuación actual: " + juego.GetPuntuacion());
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Debe ingresar un numero entero.");
            }
        }

        sc.close();
    }
}



