package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Pessoa implements Observer {

    private String cpf;
    private String ultimaNotificacao;

    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    public void cadastrar(Pagamento pagamento){
        pagamento.addObserver(this);
    }

    public void update(Observable pagamento, Object arg1) {
        this.ultimaNotificacao = this.cpf + ", pagamento realizado " +
                pagamento.toString();
    }
}
