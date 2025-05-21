// Record para o Quadrado
public record Quadrado(double lado) implements Forma {

    public double calcularArea() {
        return lado * lado;
    }
}