package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TelevisaoTest {
    @Test
    void deveRetornarConsumoTelevisao110V() {
        Voltagem voltagem = new Voltagem110V();
        Televisao televisao = new Televisao();
        televisao.setVoltagem(voltagem);
        assertEquals(120.0f, televisao.calcularConsumo(), 0.01f);
    }
    @Test
    void deveRetornarConsumoTelevisao220V() {
        Voltagem voltagem = new Voltagem220V();
        Televisao televisao = new Televisao();
        televisao.setVoltagem(voltagem);
        assertEquals(180.0f, televisao.calcularConsumo(), 0.01f); // 120 * 1.5
    }

    @Test
    void deveRetornarConsumoTelevisaoMultivoltagem() {
        Voltagem voltagem = new VoltagemMultiVoltagem();
        Televisao televisao = new Televisao();
        televisao.setVoltagem(voltagem);
        assertEquals(144.0f, televisao.calcularConsumo(), 0.01f); // 120 * 1.2
    }

}