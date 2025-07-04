package padroescomportamentais.templatemethod;

public abstract class Imposto {
    private String nome;
    private double valor;




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double verificarAlicota();

    public double calcularImposto() {
        return (valor * this.verificarAlicota());
    }




    public String getTipo() {
        return "Imposto";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "valor=" + this.valor +
                ", nome='" + this.nome + '\'' +
                ", alicota=" + this.verificarAlicota() +
                '}';
    }
}
