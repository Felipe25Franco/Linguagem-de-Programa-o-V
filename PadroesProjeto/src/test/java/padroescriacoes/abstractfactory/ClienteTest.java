package padroescriacoes.abstractfactory;
import org.junit.jupiter.api.Test;
import padorescriacao.abstractfactory.Cliente;
import padorescriacao.abstractfactory.FabricaAbstrata;
import padorescriacao.abstractfactory.FabricaPessoaFisica;
import padorescriacao.abstractfactory.FabricaPessoaJuridica;

import static org.junit.jupiter.api.Assertions.*;
public class ClienteTest {
    @Test
    void deveEmitirProcessoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Processo n: 0001", cliente.emitirProcesso());
    }

    @Test
    void deveEmitirProcessoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Processo: 55879", cliente.emitirProcesso());
    }

    @Test
    void deveEmitirContratoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato n: 00005", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato n: 0009", cliente.emitirContrato());
    }

    @Test
    void deveEmitirPeticaoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Petição n: 123", cliente.emitirPeticao());
    }

    @Test
    void deveEmitirPeticaoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Petição n: 456", cliente.emitirPeticao());
    }

    @Test
    void deveEmitirProcuracaoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração: 741", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração: 7418", cliente.emitirProcuracao());
    }

}
