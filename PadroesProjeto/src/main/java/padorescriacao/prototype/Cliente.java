package padorescriacao.prototype;

public class Cliente implements Cloneable{
    private String cpf;
    private String nome;
    private Endereco endereco;
    private String email;

    public Cliente(String cpf, String nome, Endereco endereco, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public Cliente clone() throws CloneNotSupportedException {
        Cliente clienteClone = (Cliente) super.clone();
        clienteClone.endereco = (Endereco) clienteClone.endereco.clone();
        return clienteClone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "CPF=" + cpf +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", email='" + email + '\'' +
                '}';
    }

}
