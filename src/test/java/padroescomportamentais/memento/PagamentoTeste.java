package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTeste {

    @Test
    void deveArmazenarEstadosPagamento() {
        Pagamento pagamento = new Pagamento();
        pagamento.setEstado(PagamentoEstadoCompra.getInstance());
        pagamento.setEstado(PagamentoEstadoMultado.getInstance());
        assertEquals(2, pagamento.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pagamento pagamento = new Pagamento();
        pagamento.setEstado(PagamentoEstadoCompra.getInstance());
        pagamento.setEstado(PagamentoEstadoMultado.getInstance());
        pagamento.restauraEstado(0);
        assertEquals(PagamentoEstadoCompra.getInstance(), pagamento.getEstado());
    }

    @Test
    void deveReotornarEstadoAnterior() {
        Pagamento pagamento = new Pagamento();
        pagamento.setEstado(PagamentoEstadoCompra.getInstance());
        pagamento.setEstado(PagamentoEstadoMultado.getInstance());
        pagamento.setEstado(PagamentoEstadoNotificado.getInstance());
        pagamento.setEstado(PagamentoEstadoCompra.getInstance());
        pagamento.restauraEstado(3);
        assertEquals(PagamentoEstadoCompra.getInstance(), pagamento.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pagamento pagamento = new Pagamento();
            pagamento.restauraEstado(0);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Índice inválido!", e.getMessage());
        }
    }
}
