import java.util.Scanner;
public class main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Alimentos ali = new Alimentos();
        BemEstar bem = new BemEstar();
        Cultura cul = new Cultura();
        vestuario vest = new vestuario();

        System.out.println("=== MENU DE COMPRAS ===");
        System.out.println("1 - Comprar Alimentos");
        System.out.println("2 - Comprar Itens de Bem‑Estar");
        System.out.println("3 - Comprar Produtos Culturais");
        System.out.println("4 - Comprar Vestuário");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        String opcao = scan.nextLine();
        switch (opcao) {
            case "1":
                ali.listadeProdutos();
                ali.efetuarCompra();
                break;
            case "2":
                bem.listadeProdutos();
                bem.efetuarCompra();
                break;
            case "3":
                cul.listadeProdutos();
                cul.efetuarCompra();
                break;
            case "4":
                vest.listadeProdutos();
                vest.efetuarCompra();
                break;
            case "0":
                System.out.println("Encerrando programa...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
