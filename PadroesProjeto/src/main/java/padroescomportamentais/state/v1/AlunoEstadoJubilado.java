package padroescomportamentais.state.v1;

public class AlunoEstadoJubilado extends AlunoEstado{
    private AlunoEstadoJubilado() {};
    private static AlunoEstadoJubilado instance = new AlunoEstadoJubilado();
    public static AlunoEstadoJubilado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Jubilado";
    }

}
