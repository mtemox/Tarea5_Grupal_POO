package Parte_1_Metodos_y_Retorno.Ejercicio_2;

public class Descuento {

    private int total;
    private int precio;

    public Descuento() {

    }
    public double calcularIVA(double precio) {
        double total = precio * 0.21;
        System.out.println("El IVA es: " + total);
        return total;
    }

}
