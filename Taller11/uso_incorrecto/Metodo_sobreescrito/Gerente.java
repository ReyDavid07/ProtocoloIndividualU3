package uso_incorrecto.Metodo_sobreescrito;

public class Gerente extends Empleado {
    private double bonificacion;

    public Gerente(String nombre, double bonificacion) {
        super(nombre);
        this.bonificacion = bonificacion;
    }

    // No hay garantía de que este método se sobrescriba
    @Override
    public void calcularSalario() {
        System.out.println("Calculando salario del gerente con bonificación.");
    }
}

