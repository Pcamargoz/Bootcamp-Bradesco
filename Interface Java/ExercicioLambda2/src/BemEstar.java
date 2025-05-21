public class BemEstar implements Interface{
    public void listadeProdutos(){
        int shampoo = 100;
        int sabonete = 80;
        int cremeh = 70;
        int imposto = 5;
        String[] bemEstar   = { "Shampoo", "Sabonete", "Creme Hidratante" };
        String escolha = "Shampoo"; // ou "Filme"
        switch (escolha) {
            case "Shampoo":
                System.out.println("Você escolheu Livro. Valor total: R$" + (shampoo + imposto));
                break;
            case "Sabonete":
                System.out.println("Você escolheu Filme. Valor total: R$" + (sabonete + imposto));
                break;
            case "Creme Hidratante":
                System.out.println("Você escolhe bone. valor total R$" + (cremeh + imposto));
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
