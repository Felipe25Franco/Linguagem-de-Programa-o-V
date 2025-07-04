package padroescomportamentais.chainofresponsability;

public class TipoAcessoFinanceiro implements TipoAcesso {
    private static TipoAcessoFinanceiro tipoAcessoFinanceiro = new TipoAcessoFinanceiro();

    private TipoAcessoFinanceiro() {}

    public static TipoAcessoFinanceiro getTipoAcessoFinanceiro() {
        return tipoAcessoFinanceiro;
    }
}