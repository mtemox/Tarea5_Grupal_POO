package Parte_2_Validacion_Metodos.Ejercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposito = 0.0;

        // Validar monto a depositar
        while (true) {
            System.out.print("Escriba el monto a depositar: ");
            try {
                double nuevodeposito = Double.parseDouble(sc.nextLine());
                if (nuevodeposito < 0) {
                    System.out.println("Monto inválido. No se permiten valores negativos.");
                } else {
                    deposito = nuevodeposito;
                    System.out.println("Usted ha depositado: " + deposito);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número válido.");
            }
        }

        // Validar monto a retirar
        while (true) {
            System.out.print("Escriba el monto a retirar: ");
            try {
                double retiro = Double.parseDouble(sc.nextLine());
                if (retiro < 0) {
                    System.out.println("Monto inválido. No se permiten retiros negativos.");
                } else if (retiro > deposito) {
                    System.out.println("Monto inválido. No puede retirar más de su saldo.");
                } else {
                    System.out.println("Usted ha retirado: " + retiro);
                    deposito -= retiro;
                    System.out.println("Su saldo actual es: " + deposito);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número válido.");
            }
        }

        sc.close();
    }
}