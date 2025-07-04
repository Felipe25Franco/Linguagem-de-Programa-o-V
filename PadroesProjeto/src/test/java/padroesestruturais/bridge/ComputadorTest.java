package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ComputadorTest {
    @Test
    void deveRetornarConsumoComputador110V() {
        Voltagem voltagem = new Voltagem110V();
        Computador computador = new Computador();
        computador.setVoltagem(voltagem);
        assertEquals(250.0f, computador.calcularConsumo(), 0.01f);
    }

    @Test
    void deveRetornarConsumoComputador220V() {
        Voltagem voltagem = new Voltagem220V();
        Computador computador = new Computador();
        computador.setVoltagem(voltagem);
        assertEquals(375.0f, computador.calcularConsumo(), 0.01f);
    }

    @Test
    void deveRetornarConsumoComputadorMultivoltagem() {
        Voltagem voltagem = new VoltagemMultiVoltagem();
        Computador computador = new Computador();
        computador.setVoltagem(voltagem);
        assertEquals(300.0f, computador.calcularConsumo(), 0.01f);
    }
}
