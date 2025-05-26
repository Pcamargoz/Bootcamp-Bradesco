
import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    // Atributos
    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
     public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
    // comparação por altura que faz a organização se a altura for maior ou menor e igual
    // o comparator é uma interface que tem um metodo compare
    static class ComparadorPorAltura implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }
}
    

