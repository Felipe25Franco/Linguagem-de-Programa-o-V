package padroescomportamentais.templatemethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ImpostoSulTest {
    @Test
    void deveRetornarValorImposto(){
        ImpostoSul imposto = new ImpostoSul();
        imposto.setValor(5000.00);
        assertEquals(3000.00, imposto.calcularImposto());
    }
    @Test
    void deveRetornarInformacoes(){
        ImpostoSul imposto = new ImpostoSul();
        imposto.setValor(5000.00);
        imposto.setNome("SSX");
        assertEquals("Imposto{valor=5000.0, nome='SSX', alicota=0.6}", imposto.getInfo());
    }
}
