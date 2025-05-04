package padorescriacao.v2;

public class Salario {
    private Cargo cargo;
    private Escolaridade escolaridade;

    public Salario(Cargo cargo, Escolaridade escolaridade) {
        this.cargo = cargo;
        this.escolaridade = escolaridade;
    }

    public double calcularSalarioFinal() {
        double base = cargo.getSalarioBase();
        double bonus = base * escolaridade.getBonusPercentual();
        return base + bonus;
    }

    public void exibirDetalhes() {
        System.out.println("Cargo: " + cargo.getNome());
        System.out.println("Escolaridade: " + escolaridade.getNivel());
        System.out.printf("Salário Final: R$ %.2f\n", calcularSalarioFinal());
    }
}

