package padroescriacoes.factorymethod;

import org.junit.jupiter.api.Test;
import padorescriacao.factorymethod.IServico;
import padorescriacao.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.*;
public class ServicoFormaturaTest {
    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("Formatura");
        assertEquals("Formatura efetivada", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("Formatura");
        assertEquals("Formatura cancelada", servico.cancelar());
    }

}
