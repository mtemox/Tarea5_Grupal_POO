package Parte_1_Metodos_y_Retorno.Ejercicio_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario: ");
        String usuario = sc.nextLine();

        Descuento cliente = new Descuento();
        cliente.saludarUsuario(usuario);

        
    }
}
