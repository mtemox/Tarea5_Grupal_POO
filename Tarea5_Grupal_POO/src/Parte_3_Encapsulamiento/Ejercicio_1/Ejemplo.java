package Parte_3_Encapsulamiento.Ejercicio_1;

public class Ejemplo {
    private double saldo;

    public Ejemplo(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a depositar debe ser mayor que cero.");
            return false;
        }
        saldo += monto;
        return true;
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor que cero.");
            return false;
        }
        if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes.");
            return false;
        }
        saldo -= monto;
        return true;

    }
}