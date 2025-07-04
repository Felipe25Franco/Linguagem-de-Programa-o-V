package padroescomportamentais.strategy;

public class OpcaoDinheiro implements OpcaoPagamento {
    @Override
    public double pagar(double valor) {
        return valor;
    }
}
