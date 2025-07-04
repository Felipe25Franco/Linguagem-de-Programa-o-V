package padroescomportamentais.mediator;

public interface Setor {
    String receberSolicitacao(String mensagem);

    String receberFeedback(String mensagem);

    String receberRelatorio(String mensagem);
}