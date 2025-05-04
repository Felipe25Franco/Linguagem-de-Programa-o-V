package padroescriacoes.v2;

import org.junit.jupiter.api.Test;
import padorescriacao.v2.Escolaridade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EscolaridadeTest {
    @Test
    public void testEscolaridadeFundamental() {
        Escolaridade esc = new Escolaridade("fundamental");
        assertEquals("fundamental", esc.getNivel());
        assertEquals(0.0, esc.getBonusPercentual());
    }

    @Test
    public void testEscolaridadeGraduacao() {
        Escolaridade esc = new Escolaridade("graduacao");
        assertEquals("graduacao", esc.getNivel());
        assertEquals(0.20, esc.getBonusPercentual());
    }

    @Test
    public void testEscolaridadeInvalida() {
        assertThrows(IllegalArgumentException.class, () -> new Escolaridade("mestrado"));
    }
}
