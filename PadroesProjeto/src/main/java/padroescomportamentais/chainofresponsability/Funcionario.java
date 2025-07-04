package padroescomportamentais.chainofresponsability;
import java.util.ArrayList;
public abstract class Funcionario {
    protected ArrayList listaAcessos = new ArrayList();
    private Funcionario superior;

    public Funcionario getSuperior() {
        return superior;
    }

    public void setSuperior(Funcionario superior) {
        this.superior = superior;
    }

    public abstract String getDescricaoCargo();

    public String autorizarAcesso(Acesso acesso) {
        if (listaAcessos.contains(acesso.getTipoAcesso())) {
            return getDescricaoCargo();
        } else {
            if (superior != null) {
                return superior.autorizarAcesso(acesso);
            } else {
                return "Acesso negado";
            }
        }
    }
}