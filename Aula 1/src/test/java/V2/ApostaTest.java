package V2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class ApostaTest {

    @Test
    public void testApostaValida() {
        Aposta aposta = new Aposta(Arrays.asList(12, 15, 21, 36, 45, 54));
        assertEquals(Arrays.asList(12, 15, 21, 36, 45, 54), aposta.getNumeros());
    }

    @Test
    public void testApostaInvalidaPoucosNumeros() {
        try {
            new Aposta(Arrays.asList(05, 12, 25, 32, 44));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aposta abaixo da mínima", e.getMessage());
        }
    }

    @Test
    public void testApostaInvalidaPoucosNumerosMock() {
        try {
            Aposta aposta = createMock(Aposta.class);
            expect(aposta.getNumeros()).andThrow(new IllegalArgumentException("Aposta ok"));
            replay(aposta);
            aposta.getNumeros();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aposta ok", e.getMessage());
        }
    }

    @Test
    public void testApostaInvalidaPoucosNumerosMock2() {
        try {
            List<Integer> numeros = createMock(ArrayList.class);
            expect(numeros.size()).andThrow(new IllegalArgumentException("Aposta ok"));
            replay(numeros);
            new Aposta(numeros);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aposta ok", e.getMessage());
        }
    }
}