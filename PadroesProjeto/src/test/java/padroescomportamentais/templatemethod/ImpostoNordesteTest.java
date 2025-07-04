package padroescomportamentais.templatemethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImpostoNordesteTest {
    @Test
    void deveRetornarValorImposto(){
        ImpostoNordeste imposto = new ImpostoNordeste();
        imposto.setValor(5000.00);
        assertEquals(1250.00, imposto.calcularImposto());
    }

    @Test
    void deveRetornarInformacoes(){
        ImpostoNordeste imposto = new ImpostoNordeste();
        imposto.setValor(5000.00);
        imposto.setNome("SSX");
        assertEquals("Imposto{valor=5000.0, nome='SSX', alicota=0.25}", imposto.getInfo());
    }

}
