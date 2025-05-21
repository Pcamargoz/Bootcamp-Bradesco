public class vestuario implements Interface {
    public void listadeProdutos(){
        int Camisa = 10;
        int Calca = 22;
        int Bone = 30;
        int imposto = 5;

        String[] vestuario  = { "Camisa", "Calça", "Boné" };
        String escolha = "Camisa"; // ou "Filme"

        switch (escolha) {
            case "Camisa":
                System.out.println("Você escolheu Livro. Valor total: R$" + (Camisa + imposto));
                break;
            case "Calça":
                System.out.println("Você escolheu Filme. Valor total: R$" + (Calca + imposto));
                break;
            case "Bone":
                System.out.println("Você escolhe bone. valor total R$" + (Bone + imposto));
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
