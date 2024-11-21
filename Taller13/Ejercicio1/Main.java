
public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(3.0, 4.0);
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());

        Figura triangulo = new Triangulo(7.0, 2.0);
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
    }
}

