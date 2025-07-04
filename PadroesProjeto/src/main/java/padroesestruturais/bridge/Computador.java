package padroesestruturais.bridge;

public class Computador extends Aparelho {
    public float calcularConsumo() {
        return 250 * voltagem.ajustarCusto();
    }
}
