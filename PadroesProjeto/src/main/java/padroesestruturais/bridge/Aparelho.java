package padroesestruturais.bridge;

public abstract class Aparelho {
    protected Voltagem voltagem;

    public void setVoltagem(Voltagem voltagem) {
        this.voltagem = voltagem;
    }

    public abstract float calcularConsumo();
}
