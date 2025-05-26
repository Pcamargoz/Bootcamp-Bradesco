import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    // Atributos
    private List<Pessoa> pessoalList;
    
    public OrdenacaoPessoa(){
        this.pessoalList = new ArrayList<>();
    }
    public void adicionarPessoa(String pessoa, int idade , double altura){
        pessoalList.add(new Pessoa(pessoa, idade, altura));
        
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoalList);
        // ele vai ordenar essa lista de pessoas por idade atraves do comparable
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoalList);
        // ele vai ordenar essa lista de pessoas por altura atraves do comparator
        Collections.sort(pessoasPorAltura, new Pessoa.ComparadorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("nome 1", 20, 1.76);
        ordenacaoPessoa.adicionarPessoa("nome 2", 20, 1.60);
        ordenacaoPessoa.adicionarPessoa("nome 3", 21, 1.82);
        ordenacaoPessoa.adicionarPessoa("nome 4", 22, 1.80);
        ordenacaoPessoa.adicionarPessoa("nome 2", 23, 1.76);

        // caso queira imprimir tudo que esta na lista 
        //System.out.println(ordenacaoPessoa.pessoalList);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
