package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Pagamento {

    private PagamentoEstado estado;
    private List<PagamentoEstado> memento = new ArrayList<PagamentoEstado>();

    public PagamentoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(PagamentoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int id){
        if(id < 0 || id > this.memento.size() - 1){
            throw new IllegalArgumentException("Índice inválido!");
        }
        this.estado = this.memento.get(id);
    }

    public List<PagamentoEstado> getEstados(){
        return this.memento;
    }
}
