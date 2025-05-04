package padorescriacao.abstractfactory;

public class Cliente {
    private Procuracao procuracao;
    private Processo processo;
    private Contrato contrato;
    private Peticao peticao;



    public Cliente (FabricaAbstrata fabrica){
        this.procuracao = fabrica.createProcuracao();
        this.processo = fabrica.createProcesso();
        this.contrato = fabrica.createContrato();
        this.peticao = fabrica.createPeticao();
    }



    public String emitirProcuracao() {
        return this.procuracao.emitir();
    }
    public String emitirProcesso() {
        return this.processo.emitir();
    }
    public String emitirContrato() { return this.contrato.emitir();}
    public String emitirPeticao() { return  this.peticao.emitir();}
}
