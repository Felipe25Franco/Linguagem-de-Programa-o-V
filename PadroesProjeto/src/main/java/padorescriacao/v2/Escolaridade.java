package padorescriacao.v2;

public class Escolaridade {
    private String nivel;
    private double bonusPercentual;

    public Escolaridade(String nivel) {
        this.nivel = nivel.toLowerCase();

        switch (this.nivel) {
            case "fundamental":
                this.bonusPercentual = 0.05;
                break;
            case "medio":
                this.bonusPercentual = 0.10;
                break;
            case "graduacao":
                this.bonusPercentual = 0.20;
                break;
            default:
                throw new IllegalArgumentException("Escolaridade inválida: " + nivel);
        }
    }

    public String getNivel() {
        return nivel;
    }

    public double getBonusPercentual() {
        return bonusPercentual;
    }
}
