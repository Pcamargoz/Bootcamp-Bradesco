public class Alimentos  implements Interface {
    public void listadeProdutos(){
        int arroz = 6;
        int feijao = 10;
        int macarra = 9;
        int imposto = 5;
        String[] alimentos  = { "Arroz", "Feijão", "Macarrão" };
        String escolha = "Arroz"; // ou "Filme"

        switch (escolha) {
            case "Arroz":
                System.out.println("Você escolheu Livro. Valor total: R$" + (arroz + imposto));
                break;
            case "Feijão":
                System.out.println("Você escolheu Filme. Valor total: R$" + (feijao + imposto));
                break;
            case "Macarrão":
                System.out.println("Você escolheu Filme. Valor total: R$" + (macarra + imposto));
                break;
                default:
                System.out.println("Opção inválida.");
                break;
        }
    }
    public void efetuarCompra(){
        System.out.println("Compra efetuada com sucesso.");
    }
}
