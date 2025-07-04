package padroescomportamentais.strategy;

public class OpcaoPix implements OpcaoPagamento {
    @Override
    public double pagar(double valor) {
        return valor;
    }
}