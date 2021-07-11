package padroescomportamentais.memento;

public class PagamentoEstadoCompra implements PagamentoEstado{

    private PagamentoEstadoCompra() {};
    private static PagamentoEstadoCompra instance = new PagamentoEstadoCompra();

    public static PagamentoEstadoCompra getInstance(){
        return instance;
    }

    public String getNomeEstado() {
        return "Compra efetuada!";
    }
}
