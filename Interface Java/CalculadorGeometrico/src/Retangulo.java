// Record para o Retângulo
public record Retangulo(double base, double altura) implements Forma {

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
