public class Main {
    public static void main(String[] args) {

        Forma quadrado = new Quadrado(4);
        Forma retangulo = new Retangulo(5, 3);
        Forma circulo = new Circulo(2);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());

    }
}