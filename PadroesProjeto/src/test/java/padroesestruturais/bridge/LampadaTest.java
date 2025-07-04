package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class LampadaTest {
    @Test
    void deveRetornarConsumoLampada110V() {
        Voltagem voltagem = new Voltagem110V();
        Lampada lampada = new Lampada();
        lampada.setVoltagem(voltagem);
        assertEquals(60.0f, lampada.calcularConsumo(), 0.01f);
    }

    @Test
    void deveRetornarConsumoLampada220V() {
        Voltagem voltagem = new Voltagem220V();
        Lampada lampada = new Lampada();
        lampada.setVoltagem(voltagem);
        assertEquals(90.0f, lampada.calcularConsumo(), 0.01f);
    }

    @Test
    void deveRetornarConsumoLampadaMultivoltagem() {
        Voltagem voltagem = new VoltagemMultiVoltagem();
        Lampada lampada = new Lampada();
        lampada.setVoltagem(voltagem);
        assertEquals(72.0f, lampada.calcularConsumo(), 0.01f);
    }
}