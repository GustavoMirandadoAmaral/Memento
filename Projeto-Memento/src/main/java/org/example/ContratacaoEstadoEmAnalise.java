package org.example;

public class ContratacaoEstadoEmAnalise implements ContratacaoEstado{

    private ContratacaoEstadoEmAnalise() {};
    private static ContratacaoEstadoEmAnalise instance = new ContratacaoEstadoEmAnalise();
    public static ContratacaoEstadoEmAnalise getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contratação sendo analisada";
    }

}
