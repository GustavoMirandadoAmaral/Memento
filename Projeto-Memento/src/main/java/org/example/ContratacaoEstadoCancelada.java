package org.example;

public class ContratacaoEstadoCancelada implements ContratacaoEstado{

    private ContratacaoEstadoCancelada() {};
    private static ContratacaoEstadoCancelada instance = new ContratacaoEstadoCancelada();
    public static ContratacaoEstadoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contratação cancelada com sucesso \n Te vemos em uma próxima!!";
    }

}
