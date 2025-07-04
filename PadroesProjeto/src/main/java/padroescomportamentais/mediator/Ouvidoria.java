package padroescomportamentais.mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberSolicitacaoRh(String mensagem) {
        return "A Ouvidoria agradece seu contato."+
                " O RH respondeu sua demanda conforme mensagem a seguir." +
                ">>" + Rh.getInstancia().receberSolicitacao(mensagem);
    }

    public String receberFeedbackRh(String mensagem) {
        return "A Ouvidoria agradece seu contato."+
                " O RH respondeu sua demanda conforme mensagem a seguir." +
                ">>" + Rh.getInstancia().receberFeedback(mensagem);
    }

    public String receberRelatorioRh(String mensagem) {
        return "A Ouvidoria agradece seu contato."+
                " O RH respondeu sua demanda conforme mensagem a seguir." +
                ">>" + Rh.getInstancia().receberRelatorio(mensagem);
    }

}