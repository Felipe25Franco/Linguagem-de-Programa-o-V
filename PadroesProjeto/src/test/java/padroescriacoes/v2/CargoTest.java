package padroescriacoes.v2;

import org.junit.jupiter.api.Test;
import padorescriacao.v2.Cargo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CargoTest {

    @Test
    public void testCargoGerente() {
        Cargo cargo = new Cargo("gerente");
        assertEquals("gerente", cargo.getNome());
        assertEquals(5000.0, cargo.getSalarioBase());
    }

    @Test
    public void testCargoAnalista() {
        Cargo cargo = new Cargo("analista");
        assertEquals("analista", cargo.getNome());
        assertEquals(3000.0, cargo.getSalarioBase());
    }

    @Test
    public void testCargoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Cargo("estagiario"));
    }
}
