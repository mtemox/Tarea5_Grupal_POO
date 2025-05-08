package Parte_1_Metodos_y_Retorno.Ejercicio_5;

public class Main {
    public static void main(String[] args) {
        Verificacion persona1 = new Verificacion(19);
        if(persona1.verificacionEdad()){

            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
