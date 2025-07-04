package padroescomportamentais.strategy;

public class OpcaoBoleto implements OpcaoPagamento {
    @Override
    public double pagar(double valor) {
        return valor;
    }
}