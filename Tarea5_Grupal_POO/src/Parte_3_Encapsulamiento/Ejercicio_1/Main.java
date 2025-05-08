package Parte_3_Encapsulamiento.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Ejemplo cuenta = new Ejemplo(500.0);

        cuenta.depositar(200);
        cuenta.retirar(100);
        cuenta.retirar(1000);
        cuenta.depositar(-50);

        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }
}
