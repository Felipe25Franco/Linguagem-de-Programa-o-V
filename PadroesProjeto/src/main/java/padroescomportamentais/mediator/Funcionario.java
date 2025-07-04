package padroescomportamentais.mediator;

public class Funcionario {

    public String receberSolicitacao(String mensagem) {
        return Ouvidoria.getInstancia().receberSolicitacaoRh(mensagem);
    }

    public String receberFeedback(String mensagem) {
        return Ouvidoria.getInstancia().receberFeedbackRh(mensagem);
    }

    public String receberRelatorio(String mensagem) {

        return Ouvidoria.getInstancia().receberRelatorioRh(mensagem);
    }
}