// Record para o Círculo
public record Circulo(double raio) implements Forma {

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}