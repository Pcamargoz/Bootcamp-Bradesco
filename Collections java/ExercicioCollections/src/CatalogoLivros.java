import java.util.ArrayList;
import java.util.List;
public class CatalogoLivros {

    //criando a lista de livro
    private List<Livro> livroList;

    public CatalogoLivros() { this.livroList = new ArrayList<>(); }

    public void adicionarlivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor , anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        // verificando se a a lista esta vazia e se estiver ele nein começa
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial,int anoFinal){
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        // verificando novamente se a lista esta vazia ou não
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    // vai adicionar a lista vazia criada so para isso
                    livroPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorIntervaloAnos;
    }
    // vai retornar o primeiro livro que achar
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarlivro("Livro1" , "Autor1" , 2020);
        catalogoLivros.adicionarlivro("Livro1" , "Autor2" , 2021);
        catalogoLivros.adicionarlivro("Livro2" , "Autor2" , 2022);
        catalogoLivros.adicionarlivro("Livro3" , "Autor3" , 2023);
        catalogoLivros.adicionarlivro("Livro4" , "Autor4" , 2024);
        catalogoLivros.adicionarlivro("Livro5" , "Autor5" , 1993);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        // aqui ele esta pesquisando de uma data inicial ate uma data final 
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        // aqui o primeiro livro que tiver esse titulo e for adicionado vai ser o primeiro a retornar 
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro1"));
    }

}
