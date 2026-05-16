package org.example;

public class ContratacaoEstadoRecusada implements ContratacaoEstado{

    private ContratacaoEstadoRecusada() {};
    private static ContratacaoEstadoRecusada instance = new ContratacaoEstadoRecusada();
    public static ContratacaoEstadoRecusada getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Contratação Recusada \n Espero nos vermos em um futuro próximo!";
    }
}
