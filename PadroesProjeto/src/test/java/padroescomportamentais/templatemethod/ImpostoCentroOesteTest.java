package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImpostoCentroOesteTest {

    @Test
    void deveRetornarValorImposto(){
        ImpostoCentroOeste imposto = new ImpostoCentroOeste();
        imposto.setValor(5000.00);
        assertEquals(2750.00, imposto.calcularImposto());
    }

    @Test
    void deveRetornarInformacoes(){
        ImpostoCentroOeste imposto = new ImpostoCentroOeste();
        imposto.setValor(5000.00);
        imposto.setNome("SSX");
        assertEquals("Imposto{valor=5000.0, nome='SSX', alicota=0.55}", imposto.getInfo());
    }
}
