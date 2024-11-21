package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
       
        Figura circulo = new Circulo(5.0); // Radio = 5.0
        System.out.println("Detalles del Círculo:");
        circulo.mostrarArea();

        System.out.println();

       
        Figura rectangulo = new Rectangulo(4.0, 6.0); 
        System.out.println("Detalles del Rectángulo:");
        rectangulo.mostrarArea();
    }
}
