package padroescomportamentais.templatemethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ImpostoNorteTest {

    @Test
    void deveRetornarValorImposto(){
        ImpostoNorte imposto = new ImpostoNorte();
        imposto.setValor(5000.00);
        assertEquals(1500.00, imposto.calcularImposto());
    }

    @Test
    void deveRetornarInformacoes(){
        ImpostoNorte imposto = new ImpostoNorte();
        imposto.setValor(5000.00);
        imposto.setNome("SSX");
        assertEquals("Imposto{valor=5000.0, nome='SSX', alicota=0.3}", imposto.getInfo());
    }
}
