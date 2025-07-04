package padroescriacoes.factorymethod;

import org.junit.jupiter.api.Test;
import padorescriacao.factorymethod.ITransporte;
import padorescriacao.factorymethod.TransporteFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransportePatineteTest {

    @Test
    void deveEntregarPorPatinete() {
        ITransporte transporte = TransporteFactory.obterEntrega("Caminhao");
        assertEquals("Entrega realizada por patinete", transporte.entregar());
    }

    @Test
    void deveCancelarEntregarPorPatinete() {
        ITransporte transporte = TransporteFactory.obterEntrega("Caminhao");
        assertEquals("Entrega por patinete cancelada", transporte.cancelarEntrega());
    }
}
