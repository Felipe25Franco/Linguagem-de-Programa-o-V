package padorescriacao.abstractfactory;

public class FabricaPessoaJuridica implements FabricaAbstrata{
    @Override
    public Procuracao createProcuracao(){
        return new ProcuracaoPessoaJuridica();
    }

    @Override
    public Processo createProcesso(){
        return new ProcessoPessoaJuridica();
    }
    @Override
    public Contrato createContrato() { return new ContratoPessoaJuridica(); }
    @Override
    public Peticao createPeticao() { return new PeticaoPessoaJuridica(); }
}
