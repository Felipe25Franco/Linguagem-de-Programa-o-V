package org.example.COmportamentalAluno;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    private Aluno aluno;

    @BeforeEach 
    void setUp (){
    }

    @Test
    void MatriculadoMatriculado() {
        aluno = new Aluno(EstadoMatriculado.getInstance());
        assertEquals(false, aluno.matricular());
    }

    @Test
    void MatriculadoTrancado() {
        aluno = new Aluno(EstadoMatriculado.getInstance());
        assertEquals(true, aluno.trancar());
    }

    @Test
    void MatriculadoTransferido() {
        aluno = new Aluno(EstadoMatriculado.getInstance());
        assertEquals(true, aluno.trasnferir());
    }

    @Test
    void MatriculadoEvadido() {
        aluno = new Aluno(EstadoMatriculado.getInstance());
        assertEquals(true, aluno.evadir());
    }

    @Test
    void MatriculadoFormado() {
        aluno = new Aluno(EstadoMatriculado.getInstance());
        assertEquals(true, aluno.formar());
    }

    @Test
    void MatriculadoJubilado() {
        aluno = new Aluno(EstadoMatriculado.getInstance());
        assertEquals(true, aluno.jubilar());
    }

    /////
    
    @Test
    void TrancadoMatriculado() {
        aluno = new Aluno(EstadoTrancado.getInstance());
        assertEquals(aluno.matricular(), true);
    }

    @Test
    void TrancadoTrancado() {
        aluno = new Aluno(EstadoTrancado.getInstance());
        assertEquals(aluno.trancar(), false);
    }

    @Test
    void TrancadoTransferido() {
        aluno = new Aluno(EstadoTrancado.getInstance());
        assertEquals(aluno.trasnferir(), true);
    }

    @Test
    void TrancadoEvadido() {
        aluno = new Aluno(EstadoTrancado.getInstance());
        assertEquals(aluno.evadir(), false);
    }

    @Test
    void TrancadoFormado() {
        aluno = new Aluno(EstadoTrancado.getInstance());
        assertEquals(aluno.formar(), false);
    }

    @Test
    void TrancadoJubilado() {
        aluno = new Aluno(EstadoTrancado.getInstance());
        assertEquals(aluno.jubilar(), false);
    }

    /////
    
    @Test
    void EvadidoMatriculado() {
        aluno = new Aluno(EstadoEvadido.getInstance());
        assertEquals(aluno.matricular(), false);
    }

    @Test
    void EvadidoTrancado() {
        aluno = new Aluno(EstadoEvadido.getInstance());
        assertEquals(aluno.trancar(), false);
    }

    @Test
    void EvadidoTransferido() {
        aluno = new Aluno(EstadoEvadido.getInstance());
        assertEquals(aluno.trasnferir(), false);
    }

    @Test
    void EvadidoEvadido() {
        aluno = new Aluno(EstadoEvadido.getInstance());
        assertEquals(aluno.evadir(), false);
    }

    @Test
    void EvadidoFormado() {
        aluno = new Aluno(EstadoEvadido.getInstance());
        assertEquals(aluno.formar(), false);
    }

    @Test
    void EvadidoJubilado() {
        aluno = new Aluno(EstadoEvadido.getInstance());
        assertEquals(aluno.jubilar(), false);
    }

    /////
    
    @Test
    void FormadoMatriculado() {
        aluno = new Aluno(EstadoFormado.getInstance());
        assertEquals(aluno.matricular(), false);
    }

    @Test
    void FormadoTrancado() {
        aluno = new Aluno(EstadoFormado.getInstance());
        assertEquals(aluno.trancar(), false);
    }

    @Test
    void FormadoTransferido() {
        aluno = new Aluno(EstadoFormado.getInstance());
        assertEquals(aluno.trasnferir(), false);
    }

    @Test
    void FormadoEvadido() {
        aluno = new Aluno(EstadoFormado.getInstance());
        assertEquals(aluno.evadir(), false);
    }

    @Test
    void FormadoFormado() {
        aluno = new Aluno(EstadoFormado.getInstance());
        assertEquals(aluno.formar(), false);
    }

    @Test
    void FormadoJubilado() {
        aluno = new Aluno(EstadoFormado.getInstance());
        assertEquals(aluno.jubilar(), false);
    }

    /////
    
    @Test
    void JubiladoMatriculado() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.matricular(), false);
    }

    @Test
    void JubiladoTrancado() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.trancar(), false);
    }

    @Test
    void JubiladoTransferido() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.trasnferir(), false);
    }

    @Test
    void JubiladoEvadido() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.evadir(), false);
    }

    @Test
    void JubiladoFormado() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.formar(), false);
    }

    @Test
    void JubiladoJubilado() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.jubilar(), false);
    }

    /////
    
    @Test
    void TransferidoMatriculado() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.matricular(), false);
    }

    @Test
    void TransferidoTrancado() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.trancar(), false);
    }

    @Test
    void TransferidoTransferido() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.trasnferir(), false);
    }

    @Test
    void TransferidoEvadido() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.evadir(), false);
    }

    @Test
    void TransferidoFormado() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.formar(), false);
    }

    @Test
    void TransferidoJubilado() {
        aluno = new Aluno(EstadoJubilado.getInstance());
        assertEquals(aluno.jubilar(), false);
    }
}
