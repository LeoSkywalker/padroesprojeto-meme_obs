package padroescomportamentais.observer;

import java.util.Observable;

public class Pagamento extends Observable {

    private double conta;
    private double digitoConta;
    private double agencia;
    private String nomeBanco;
    private double valor;

    public Pagamento(double conta, double digitoConta,
                     double agencia, String nomeBanco,
                     double valor) {
        this.conta = conta;
        this.digitoConta = digitoConta;
        this.agencia = agencia;
        this.nomeBanco = nomeBanco;
        this.valor = valor;
    }

    public void realizarPagamento(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString(){
        return "Pagamento{" + "Conta=" + conta +
                ", digitoConta=" + digitoConta +
                ", agencia=" + agencia +
                ", nomeBanco=" + nomeBanco +
                ", valor=" + valor + '}';
    }
}
