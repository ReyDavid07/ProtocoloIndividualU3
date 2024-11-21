package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        
        Empleado gerente = new Gerente("Enrique", 2500, 1000); 
        System.out.println("Detalles del Gerente:");
        gerente.mostrarDetalles();

        System.out.println();

        
        Empleado vendedor = new Vendedor("Juan", 2000, 500); 
        System.out.println("Detalles del Vendedor:");
        vendedor.mostrarDetalles();
    }
}
