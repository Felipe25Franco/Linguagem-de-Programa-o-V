package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcessoTest {
    FuncionarioCEO ceo;
    FuncionarioGerenteTI gerente;
    FuncionarioDiretorTI diretor;

    @BeforeEach
    void setUp() {
        diretor = new FuncionarioDiretorTI(null);
        gerente = new FuncionarioGerenteTI(diretor);
        ceo = new FuncionarioCEO(gerente);
    }

    @Test
    void deveAutorizarAcessoParaCEO() {
        assertEquals("CEO", ceo.autorizarAcesso(new Acesso(TipoAcessoFinanceiro.getTipoAcessoFinanceiro())));
    }
    @Test
    void deveAutorizarAcessoParaDiretorTI() {
        assertEquals("Diretor de TI", ceo.autorizarAcesso(new Acesso(TipoAcessoRede.getTipoAcessoRede())));
    }

    @Test
    void deveAutorizarAcessoParaGerenteTI() {
        assertEquals("Gerente de TI", ceo.autorizarAcesso(new Acesso(TipoAcessoSistema.getTipoAcessoSistema())));
    }

    @Test
    void deveNegarAcessoParaDiretorTIComAcessoFinanceiro() {
        assertEquals("Acesso negado", diretor.autorizarAcesso(new Acesso(TipoAcessoFinanceiro.getTipoAcessoFinanceiro())));
    }

    @Test
    void deveNegarAcessoParaGerenteTIComAcessoFinanceiro() {
        assertEquals("Acesso negado", gerente.autorizarAcesso(new Acesso(TipoAcessoFinanceiro.getTipoAcessoFinanceiro())));
    }

}