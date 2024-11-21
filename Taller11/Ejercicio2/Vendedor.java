package Ejercicio2;

public class Vendedor extends Empleado {
    private double comision; 

    // Constructor
    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }

    
    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}

