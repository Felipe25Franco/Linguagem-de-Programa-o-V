package padroescriacoes.factorymethod;

import org.junit.jupiter.api.Test;
import padorescriacao.factorymethod.IServico;
import padorescriacao.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.*;
public class ServicoTrancamentoTest {
    @Test
    void deveExecutarTrancamento() {
        IServico servico = ServicoFactory.obterServico("Trancamento");
        assertEquals("Trancamento efetivado", servico.executar());
    }

    @Test
    void deveCancelarTrancamento() {
        IServico servico = ServicoFactory.obterServico("Trancamento");
        assertEquals("Trancamento cancelado", servico.cancelar());
    }
}
