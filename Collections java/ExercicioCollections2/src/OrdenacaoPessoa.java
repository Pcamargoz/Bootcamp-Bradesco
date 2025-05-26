import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    // Atributos
    private List<Pessoa> pessoalList;
    
    public OrdenacaoPessoa(){
        this.pessoalList = new ArrayList<>();
    }
    public void adicionarPessoa(Pessoa pessoa, int idade , double altura){
        pessoalList.add(new Pessoa("Pedro", 18, 1.80));
        
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
        Collections.sort(pessoasPorAltura, new ComparadorPorAltura());
        return pessoasPorAltura;
    }

}
