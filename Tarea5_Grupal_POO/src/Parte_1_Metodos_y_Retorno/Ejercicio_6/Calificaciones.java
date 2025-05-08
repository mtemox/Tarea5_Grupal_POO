package Parte_1_Metodos_y_Retorno.Ejercicio_6;

// creacion de la clase :)
class Calificaciones{
    //Atributos
    public double calificaciones;
    //Contructor
    public Calificaciones(double calificaciones){
        this.calificaciones = calificaciones;
    }
    //Metodos
    public char categoriaDeCalificacion(){
        if (calificaciones >= 10) {
            return 'A';
        } else if (calificaciones >= 9) {
            return 'B';
        } else if (calificaciones >= 8) {
            return 'C';
        } else if (calificaciones >= 7) {
            return 'D';
        } else  {
            return 'F';
        }


    }

}
