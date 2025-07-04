package padroescomportamentais.chainofresponsability;

public class FuncionarioCEO extends Funcionario {
    public FuncionarioCEO(Funcionario superior) {
        listaAcessos.add(TipoAcessoFinanceiro.getTipoAcessoFinanceiro());
        setSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "CEO";
    }
}