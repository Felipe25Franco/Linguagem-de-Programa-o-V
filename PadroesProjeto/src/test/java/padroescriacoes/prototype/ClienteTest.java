package padroescriacoes.prototype;

import org.junit.jupiter.api.Test;
import padorescriacao.prototype.Cliente;
import padorescriacao.prototype.Endereco;

import static org.junit.jupiter.api.Assertions.*;
public class ClienteTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Cliente cliente = new Cliente("12345678911", "Aluno Original", new Endereco("Rua A", 1), "felipe@hotmail.com");

        Cliente clienteClone = cliente.clone();
        clienteClone.setCpf("45612378911");
        clienteClone.setNome("Aluno Clonado");
        clienteClone.getEndereco().setNumero(2);

        assertEquals("Cliente{CPF=12345678911, nome='Aluno Original', endereco=Endereco{logradouro='Rua A', numero=1}, email='felipe@hotmail.com'}", cliente.toString());
        assertEquals("Cliente{CPF=45612378911, nome='Aluno Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, email='felipe@hotmail.com'}", clienteClone.toString());
    }

}
