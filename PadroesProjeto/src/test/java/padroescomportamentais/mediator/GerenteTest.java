package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GerenteTest {

    @Test
    void deveSolicitarRh() {
        Gerente gerente = new Gerente();
        assertEquals("A Ouvidoria agradece seu contato. O RH respondeu sua demanda conforme mensagem a seguir." +
                        ">>O RH recebeu a solicitação: Favor gerar folha de ponto",
                gerente.receberSolicitacao("Favor gerar folha de ponto"));
    }

    @Test
    void deveDarFeedbackRh() {
        Gerente gerente = new Gerente();
        assertEquals("A Ouvidoria agradece seu contato. O RH respondeu sua demanda conforme mensagem a seguir." +
                        ">>O RH recebeu o feedback: Feedback mal elaborado",
                gerente.receberFeedback("Feedback mal elaborado"));
    }

    @Test
    void deveReceberRelatorioRh() {
        Gerente gerente = new Gerente();
        assertEquals("A Ouvidoria agradece seu contato. O RH respondeu sua demanda conforme mensagem a seguir." +
                        ">>O RH recebeu o relatorio: Relatorio de produção de funcionarios",
                gerente.receberRelatorio("Relatorio de produção de funcionarios"));
    }
}