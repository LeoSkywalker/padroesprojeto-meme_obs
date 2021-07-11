package padroescomportamentais.memento;

public class PagamentoEstadoMultado implements PagamentoEstado{

    private PagamentoEstadoMultado() {};
    private static PagamentoEstadoMultado instance = new PagamentoEstadoMultado();

    public static PagamentoEstadoMultado getInstance(){
        return instance;
    }

    public String getNomeEstado() {
        return "Multa efetuada!";
    }
}
