package padroescomportamentais.chainofresponsability;

public class TipoAcessoRede implements TipoAcesso {
    private static TipoAcessoRede tipoAcessoRede = new TipoAcessoRede();

    private TipoAcessoRede() {}

    public static TipoAcessoRede getTipoAcessoRede() {
        return tipoAcessoRede;
    }
}