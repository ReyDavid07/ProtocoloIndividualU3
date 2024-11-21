package uso_incorrecto.Metodo_sobreescrito;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método concreto que debería ser sobrescrito
    public void calcularSalario() {
        System.out.println("Calculando salario en la clase Empleado.");
    }
}