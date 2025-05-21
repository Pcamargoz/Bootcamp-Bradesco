package Aplicativos;
public class RedesSociais implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Postando em Rede Social: " + mensagem);
        // aqui chama a API do Facebook/Twitter/Instagram…
    }
}