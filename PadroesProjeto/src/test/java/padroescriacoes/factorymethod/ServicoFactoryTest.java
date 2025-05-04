package padroescriacoes.factorymethod;

import org.junit.jupiter.api.Test;
import padorescriacao.factorymethod.IServico;
import padorescriacao.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.*;
public class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Jubilamento");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}
