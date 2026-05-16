package org.example;

public class ContratacaoEstadoConcluida implements ContratacaoEstado{

    private ContratacaoEstadoConcluida() {};
    private static ContratacaoEstadoConcluida instance = new ContratacaoEstadoConcluida();
    public static ContratacaoEstadoConcluida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contratação concluída com sucesso \n Parabéns!!";
    }

}
