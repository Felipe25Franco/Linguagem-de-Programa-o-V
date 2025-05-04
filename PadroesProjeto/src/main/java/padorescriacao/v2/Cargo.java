package padorescriacao.v2;

public class Cargo {
    private String nome;
    private double salarioBase;

    public Cargo(String nome) {
        this.nome = nome.toLowerCase();

        switch (this.nome) {
            case "gerente":
                this.salarioBase = 5000.0;
                break;
            case "analista":
                this.salarioBase = 3000.0;
                break;
            case "operador":
                this.salarioBase = 2000.0;
                break;
            default:
                throw new IllegalArgumentException("Cargo inválido: " + nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}

