package org.example;

public class ContratacaoEstadoAberta implements ContratacaoEstado{

    private ContratacaoEstadoAberta() {};
    private static ContratacaoEstadoAberta instance = new ContratacaoEstadoAberta();
    public static ContratacaoEstadoAberta getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contratação aberta";
    }

}
