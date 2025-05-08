package Parte_1_Metodos_y_Retorno.Ejercicio_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el precio base: ");
        float precio_base = sc.nextInt();
        System.out.println("Introduzca el descuento porcentual: ");
        float descuento = sc.nextInt();

        Total cliente = new Total();

        cliente.calcularPrecioConDescuento(precio_base,descuento);
        //double precio_final = precio_base - (precio_base * descuento / 100);
        //System.out.println("El precio final es: " + precio_final + " ");
    }
}