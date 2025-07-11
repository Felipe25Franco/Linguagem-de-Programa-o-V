package padroescomportamentais.strategy;

public class Opcao {
    private double valor;

    public Opcao(double valor) {
        this.valor = valor;
    }
    public double executarPagamento(OpcaoPagamento opcao) {
        return opcao.pagar(valor);
    }
}