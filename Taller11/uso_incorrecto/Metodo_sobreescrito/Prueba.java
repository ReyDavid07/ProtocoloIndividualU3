package uso_incorrecto.Metodo_sobreescrito;

public class Prueba {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Samuel Ramirez", 1000);
        gerente.calcularSalario(); 
        
    }
}

