package Parte_1_Metodos_y_Retorno.Ejercicio_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el total de su compra: ");
        int precio = sc.nextInt();
        sc.nextLine();

        Descuento cliente = new Descuento();

        cliente.calcularIVA(precio);

    }
}
