package padroescriacoes.factorymethod;
import org.junit.jupiter.api.Test;
import padorescriacao.factorymethod.ITransporte;
import padorescriacao.factorymethod.TransporteFactory;

import static org.junit.jupiter.api.Assertions.*;
public class TransporteFactoryTest {
    @Test
    void deveRetornarExcecaoParaTransporteInexistente() {
        try {
            ITransporte transporte = TransporteFactory.obterEntrega("Cavalo");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Transporte inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaTransporteInvalido() {
        try {
            ITransporte transporte = TransporteFactory.obterEntrega("Patinete");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Transporte inválido", e.getMessage());
        }
    }

}