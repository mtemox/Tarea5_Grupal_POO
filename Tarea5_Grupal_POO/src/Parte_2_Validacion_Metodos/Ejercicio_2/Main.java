package Parte_2_Validacion_Metodos.Ejercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidad = -1;

        // Leer velocidad inicial
        while (true) {
            System.out.print("Ingrese la velocidad de su automóvil: ");
            String entrada = sc.nextLine();
            try {
                velocidad = Double.parseDouble(entrada);
                if (velocidad < 0) {
                    System.out.println("Velocidad inválida. No puede ser negativa.");
                } else {
                    break; // Salir del bucle si es válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debe ingresar un número.");
            }
        }

        // Validar exceso de velocidad
        if (velocidad > 200) {
            System.out.println("Su automóvil va demasiado rápido, infringió las leyes.");
        } else {
            double nuevaVelocidad = -1;

            // Leer nueva velocidad
            while (true) {
                System.out.print("Ingrese su nueva velocidad: ");
                String entradaNueva = sc.nextLine();
                try {
                    nuevaVelocidad = Double.parseDouble(entradaNueva);
                    if (nuevaVelocidad < 0) {
                        System.out.println("Velocidad inválida. No puede ser negativa.");
                    } else {
                        break; // Entrada válida
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Debe ingresar un número.");
                }
            }

            // Evaluar nueva velocidad
            if (nuevaVelocidad == 0) {
                System.out.println("Usted ha frenado el automóvil.");
            } else if (nuevaVelocidad > 200) {
                System.out.println("Su automóvil va demasiado rápido, infringió las leyes.");
            } else {
                System.out.println("Nueva velocidad registrada: " + nuevaVelocidad + " km/h");
            }
        }

        sc.close();
    }
}
