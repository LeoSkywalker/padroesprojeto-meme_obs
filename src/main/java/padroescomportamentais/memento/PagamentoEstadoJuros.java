package padroescomportamentais.memento;

public class PagamentoEstadoJuros implements PagamentoEstado {

    private PagamentoEstadoJuros() {};
    private static PagamentoEstadoJuros instance = new PagamentoEstadoJuros();

    public static PagamentoEstadoJuros getInstance(){
        return instance;
    }

    public String getNomeEstado() {
        return "Acréscimo de juros efetuado!";
    }
}
