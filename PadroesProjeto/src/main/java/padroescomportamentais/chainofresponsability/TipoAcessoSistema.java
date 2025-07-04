package padroescomportamentais.chainofresponsability;
public class TipoAcessoSistema implements TipoAcesso {
    private static TipoAcessoSistema tipoAcessoSistema = new TipoAcessoSistema();

    private TipoAcessoSistema() {}

    public static TipoAcessoSistema getTipoAcessoSistema() {
        return tipoAcessoSistema;
    }
}