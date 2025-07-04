package padroesestruturais.bridge;

public class Lampada extends Aparelho {
    public float calcularConsumo() {
        return 60 * voltagem.ajustarCusto();  // 60W para a lâmpada, ajustado pela voltagem
    }
}