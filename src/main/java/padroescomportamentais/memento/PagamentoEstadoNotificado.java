package padroescomportamentais.memento;

public class PagamentoEstadoNotificado implements PagamentoEstado{

    private PagamentoEstadoNotificado() {};
    private static PagamentoEstadoNotificado instance = new PagamentoEstadoNotificado();

    public static PagamentoEstadoNotificado getInstance(){
        return instance;
    }

    public String getNomeEstado() {
        return "Notificação efetuada!";
    }
}
