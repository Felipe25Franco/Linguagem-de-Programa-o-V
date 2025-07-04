package padroescriacoes.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padorescriacao.singleton.Autenticacao;
import padorescriacao.singleton.Usuario;

import static org.junit.jupiter.api.Assertions.*;

class AutenticacaoTest {

    private Usuario usuario;
    private Autenticacao autenticacao;

    @BeforeEach
    void setUp() {

        usuario = Usuario.getInstance();
        usuario.setNomeCliente("João Silva");
        usuario.setNumeroConta("123456789");
        autenticacao = Autenticacao.getInstance();
    }

    @Test
    void deveAutenticarUsuarioComSenhaCorreta() {

        boolean autenticado = autenticacao.autenticar(usuario, "senha123");

        assertTrue(autenticado, "O usuário deveria estar autenticado com a senha correta.");
        assertTrue(usuario.isAutenticado(), "O status de autenticação do usuário deveria ser true.");
    }

    @Test
    void naoDeveAutenticarUsuarioComSenhaIncorreta() {

        boolean autenticado = autenticacao.autenticar(usuario, "senhaErrada");

        assertFalse(autenticado, "O usuário não deveria estar autenticado com a senha incorreta.");
        assertFalse(usuario.isAutenticado(), "O status de autenticação do usuário deveria ser false.");
    }

    @Test
    void deveDeslogarUsuario() {

        autenticacao.autenticar(usuario, "senha123");
        assertTrue(usuario.isAutenticado(), "O usuário deveria estar autenticado.");


        autenticacao.deslogar(usuario);
        assertFalse(usuario.isAutenticado(), "O status de autenticação do usuário deveria ser false após o logout.");
    }
}