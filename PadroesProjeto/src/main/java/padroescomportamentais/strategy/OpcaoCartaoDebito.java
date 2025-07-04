package padroescomportamentais.strategy;

public class OpcaoCartaoDebito implements OpcaoPagamento {
    @Override
    public double pagar(double valor) {
        return valor;
    }
}
