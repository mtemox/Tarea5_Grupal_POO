package Parte_1_Metodos_y_Retorno.Ejercicio_7;

public class Total {
    private int total;
    private int precio;

    public Total() {

    }

    public float calcularPrecioConDescuento(float precio, float descuento) {
        float total = precio - (precio * descuento / 100);
        System.out.println("El total con descuento es: " + total);
        return total;
    }
}
