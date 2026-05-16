package org.example;

public class ContratacaoEstadoAprovada implements ContratacaoEstado{

    private ContratacaoEstadoAprovada() {};
    private static ContratacaoEstadoAprovada instance = new ContratacaoEstadoAprovada();
    public static ContratacaoEstadoAprovada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contratação aprovada com sucesso \n Parabéns!!";
    }

}
