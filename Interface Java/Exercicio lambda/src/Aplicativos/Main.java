package Aplicativos;
// 3) No main, escolha o serviço pelo nome e envie
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Para qual serviço (SMS, Email, RedesSociais, WhatsApp)? ");
        String escolha = scan.nextLine().trim();

        System.out.print("Digite a mensagem de marketing: ");
        String msg = scan.nextLine();

        ServicoMensagem servico;
        switch (escolha.toLowerCase()) {
            case "sms":
                servico = new SMS();
                break;
            case "email":
                servico = new Email();
                break;
            case "redessociais":
                servico = new RedesSociais();
                break;
            case "whatsapp":
                servico = new Whatsapp();
                break;
            default:
                System.out.println("Serviço não reconhecido.");
                scan.close();
                return;
        }

        servico.enviarMensagem(msg);
        scan.close();
    }
}
