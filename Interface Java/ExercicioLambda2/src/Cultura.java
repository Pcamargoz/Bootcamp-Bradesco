public class Cultura implements Interface {

    public void listadeProdutos() {
        int livro = 10;
        int filme = 22;
        int imposto = 5;

        String[] cultura = {"Livro", "Filme"};

        // Exemplo de seleção de item cultural:
        String escolha = "Livro"; // ou "Filme"

        switch (escolha) {
            case "Livro":
                System.out.println("Você escolheu Livro. Valor total: R$" + (livro + imposto));
                break;
            case "Filme":
                System.out.println("Você escolheu Filme. Valor total: R$" + (filme + imposto));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public void efetuarCompra() {
        System.out.println("Compra efetuada com sucesso.");
    }
}
