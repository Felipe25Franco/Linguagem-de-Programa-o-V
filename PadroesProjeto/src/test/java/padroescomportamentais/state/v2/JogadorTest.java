package padroescomportamentais.state.v2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class JogadorTest {
    Jogador jogador;

    @BeforeEach
    public void setUp(){jogador = new Jogador();}

    // Jogador Contratado

    @Test
    public void deveEmprestarJogadorContratado() {
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        assertTrue(jogador.emprestar());
        assertEquals(JogadorEstadoEmprestado.getInstance(), jogador.getEstado());
    }
}
