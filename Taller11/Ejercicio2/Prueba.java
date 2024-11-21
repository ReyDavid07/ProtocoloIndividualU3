package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        
        Empleado gerente = new Gerente("Ana", 3000, 1000); 
        System.out.println("Detalles del Gerente:");
        gerente.mostrarDetalles();

        System.out.println();

        
        Empleado vendedor = new Vendedor("Carlos", 2000, 500); 
        System.out.println("Detalles del Vendedor:");
        vendedor.mostrarDetalles();
    }
}
