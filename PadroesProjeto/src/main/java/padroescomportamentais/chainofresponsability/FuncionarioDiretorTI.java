package padroescomportamentais.chainofresponsability;

public class FuncionarioDiretorTI extends Funcionario {
    public FuncionarioDiretorTI(Funcionario superior) {
        listaAcessos.add(TipoAcessoRede.getTipoAcessoRede());
        setSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor de TI";
    }
}