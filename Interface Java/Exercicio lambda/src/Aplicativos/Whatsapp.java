package Aplicativos;
public class Whatsapp implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mandando WhatsApp: " + mensagem);
        // aqui a integração com WhatsApp Business API, por exemplo
    }
}