package padroescriacoes.factorymethod;

import org.junit.jupiter.api.Test;
import padorescriacao.factorymethod.IServico;
import padorescriacao.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.*;
public class ServicoMatriculaTest {
    @Test
    void deveExecutarMatricula() {
        IServico servico = ServicoFactory.obterServico("Matricula");
        assertEquals("Matrícula efetivada", servico.executar());
    }

    @Test
    void deveCancelarMatricula() {
        IServico servico = ServicoFactory.obterServico("Matricula");
        assertEquals("Matrícula cancelada", servico.cancelar());
    }

}
