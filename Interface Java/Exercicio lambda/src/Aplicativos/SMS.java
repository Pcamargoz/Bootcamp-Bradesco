package Aplicativos;
// 2) Implemente cada canal
public class SMS implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
        // aqui poderia ir a API real de SMS
    }
}