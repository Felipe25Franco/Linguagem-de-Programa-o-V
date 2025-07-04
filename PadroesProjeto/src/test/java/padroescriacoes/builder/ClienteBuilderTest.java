package padroescriacoes.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import padorescriacao.builder.Cliente;
import padorescriacao.builder.ClienteBuilder;

import static org.junit.jupiter.api.Assertions.*;
public class ClienteBuilderTest {
    @Test
    void deveRetornarExcecaoParaClienteSemCpf() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNome("Felipe")
                    .setEmail("felipe@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaClienteSemNome() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setCpf("12345678911")
                    .setEmail("felipe@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarClienteValido() {
        ClienteBuilder clienteBuilder = new ClienteBuilder();
        Cliente cliente = clienteBuilder
                .setCpf("12345678911")
                .setNome("Felipe")
                .setEmail("felipe@email.com")
                .build();

        assertNotNull(cliente);
    }

}
