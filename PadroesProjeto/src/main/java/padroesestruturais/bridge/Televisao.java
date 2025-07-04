package padroesestruturais.bridge;

public class Televisao extends Aparelho {
    public float calcularConsumo() {
        return 120 * voltagem.ajustarCusto();
    }
}
