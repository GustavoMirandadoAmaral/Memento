package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratacaoTest {

    @Test
    void deveArmazenarEstados() {
        Contratacao contratacao = new Contratacao();
        contratacao.setEstado(ContratacaoEstadoAberta.getInstance());
        contratacao.setEstado(ContratacaoEstadoEmAnalise.getInstance());
        assertEquals(2, contratacao.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Contratacao contratacao = new Contratacao();
        contratacao.setEstado(ContratacaoEstadoAprovada.getInstance());
        contratacao.setEstado(ContratacaoEstadoConcluida.getInstance());
        contratacao.restauraEstado(0);
        assertEquals(ContratacaoEstadoAprovada.getInstance(), contratacao.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Contratacao contratacao = new Contratacao();
        contratacao.setEstado(ContratacaoEstadoAberta.getInstance());
        contratacao.setEstado(ContratacaoEstadoEmAnalise.getInstance());
        contratacao.setEstado(ContratacaoEstadoAberta.getInstance());
        contratacao.setEstado(ContratacaoEstadoConcluida.getInstance());
        contratacao.restauraEstado(2);
        assertEquals(ContratacaoEstadoAberta.getInstance(), contratacao.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Contratacao contratacao = new Contratacao();
            contratacao.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}