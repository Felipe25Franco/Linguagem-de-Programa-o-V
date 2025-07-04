package padroescomportamentais.templatemethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ImpostoSuldesteTest {
    @Test
    void deveRetornarValorImposto(){
        ImpostoSuldeste imposto = new ImpostoSuldeste();
        imposto.setValor(5000.00);
        assertEquals(4000.00, imposto.calcularImposto());
    }

    @Test
    void deveRetornarInformacoes(){
        ImpostoSuldeste imposto = new ImpostoSuldeste();
        imposto.setValor(5000.00);
        imposto.setNome("SSX");
        assertEquals("Imposto{valor=5000.0, nome='SSX', alicota=0.8}", imposto.getInfo());
    }

}
