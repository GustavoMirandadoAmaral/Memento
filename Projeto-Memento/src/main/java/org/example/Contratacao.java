package org.example;

import java.util.ArrayList;
import java.util.List;

public class Contratacao {

    private ContratacaoEstado estado;
    private List<ContratacaoEstado> memento = new ArrayList<>();

    public ContratacaoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ContratacaoEstado estado){
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice){
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ContratacaoEstado> getEstados(){return this.memento;}
}
