package padorescriacao.abstractfactory;

public interface FabricaAbstrata {
    Procuracao createProcuracao();
    Processo createProcesso();
    Contrato createContrato();
    Peticao createPeticao();
}
