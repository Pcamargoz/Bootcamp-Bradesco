package Aplicativos;


public class Email implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando E‑mail: " + mensagem);
        // aqui a lógica de SMTP / API de e‑mail
    }
}