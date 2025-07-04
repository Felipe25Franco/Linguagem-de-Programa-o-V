package padroescomportamentais.chainofresponsability;
public class FuncionarioGerenteTI extends Funcionario {
    public FuncionarioGerenteTI(Funcionario superior) {
        listaAcessos.add(TipoAcessoSistema.getTipoAcessoSistema());
        setSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente de TI";
    }
}