package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTeste {

    @Test
    void deveNotificarUmaPessoa(){
        Pagamento pagamento = new Pagamento(34567, 8, 825, "Banco do Brasil", 300);
        Pessoa pessoa = new Pessoa("11158785534");
        pessoa.cadastrar(pagamento);
        pagamento.realizarPagamento();
        assertEquals("11158785534, pagamento realizado Pagamento{Conta=34567.0, digitoConta=8.0, agencia=825.0, nomeBanco=Banco do Brasil, valor=300.0}", pessoa.getUltimaNotificacao());
    }

    @Test
    void deveNotificarPessoas(){
        Pagamento pagamento1 = new Pagamento(34567, 8, 825, "Banco do Brasil", 300);
        Pagamento pagamento2 = new Pagamento(34558, 7, 824, "Banco do Brasil", 400);
        Pessoa pessoa1 = new Pessoa("11158785534");
        Pessoa pessoa2 = new Pessoa("11159784633");
        pessoa1.cadastrar(pagamento1);
        pessoa2.cadastrar(pagamento2);
        pagamento1.realizarPagamento();
        pagamento2.realizarPagamento();
        assertEquals("11158785534, pagamento realizado Pagamento{Conta=34567.0, digitoConta=8.0, agencia=825.0, nomeBanco=Banco do Brasil, valor=300.0}", pessoa1.getUltimaNotificacao());
        assertEquals("11159784633, pagamento realizado Pagamento{Conta=34558.0, digitoConta=7.0, agencia=824.0, nomeBanco=Banco do Brasil, valor=400.0}", pessoa2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificar(){
        Pagamento pagamento = new Pagamento(34567, 8, 825, "Banco do Brasil", 300);
        Pessoa pessoa = new Pessoa("11158785534");
        pagamento.realizarPagamento();
        assertEquals(null, pessoa.getUltimaNotificacao());
    }

    @Test
    void deveNotificarPessoaPagamento1(){
        Pagamento pagamento1 = new Pagamento(34567, 8, 825, "Banco do Brasil", 300);
        Pagamento pagamento2 = new Pagamento(34558, 7, 824, "Banco do Brasil", 400);
        Pessoa pessoa1 = new Pessoa("11158785534");
        Pessoa pessoa2 = new Pessoa("11159784633");
        pessoa1.cadastrar(pagamento1);
        pessoa2.cadastrar(pagamento2);
        pagamento1.realizarPagamento();
        assertEquals("11158785534, pagamento realizado Pagamento{Conta=34567.0, digitoConta=8.0, agencia=825.0, nomeBanco=Banco do Brasil, valor=300.0}", pessoa1.getUltimaNotificacao());
        assertEquals(null, pessoa2.getUltimaNotificacao());
    }

}
