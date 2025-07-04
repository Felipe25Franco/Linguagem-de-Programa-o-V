package padroescriacoes.factorymethod;
import org.junit.jupiter.api.Test;
import padorescriacao.factorymethod.ITransporte;
import padorescriacao.factorymethod.TransporteFactory;

import static org.junit.jupiter.api.Assertions.*;
public class TransporteCaminhaoTest {
    @Test
    void deveEntregarPorCaminhao() {
        ITransporte transporte = TransporteFactory.obterEntrega("Caminhao");
        assertEquals("Entrega realizada por caminhão", transporte.entregar());
    }

    @Test
    void deveCancelarEntregarPorCaminhao() {
        ITransporte transporte = TransporteFactory.obterEntrega("Caminhao");
        assertEquals("Entrega por caminhão cancelada", transporte.cancelarEntrega());
    }
}