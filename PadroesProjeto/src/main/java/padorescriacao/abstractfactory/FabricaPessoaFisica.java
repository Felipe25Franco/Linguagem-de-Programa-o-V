package padorescriacao.abstractfactory;

public class FabricaPessoaFisica implements FabricaAbstrata{
    @Override
    public Procuracao createProcuracao(){
        return new ProcuracaoPessoaFisica();
    }

    @Override
    public Processo createProcesso(){
        return new ProcessoPessoaFisica();
    }

    @Override
    public Contrato createContrato() { return new ContratoPessoaFisica();}
    @Override
    public Peticao createPeticao() { return new PeticaoPessoaFisica();}
}
