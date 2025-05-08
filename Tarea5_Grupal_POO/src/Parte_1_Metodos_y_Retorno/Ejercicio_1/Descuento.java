package Parte_1_Metodos_y_Retorno.Ejercicio_1;

public class Descuento {
    private int total;
    private int precio;
    public String nombre;

    public Descuento() {
    }

    public Descuento(  int total, int precio ) {
        this.total = total;
        this.precio = precio;
    }

    public static int calcularDescuento(double precioOriginal, double porcentajeDescuento) {
        double descuento = precioOriginal * (porcentajeDescuento / 100.0);
        System.out.println("El descuento es: " + descuento);
        return (int) descuento;
    }
}
