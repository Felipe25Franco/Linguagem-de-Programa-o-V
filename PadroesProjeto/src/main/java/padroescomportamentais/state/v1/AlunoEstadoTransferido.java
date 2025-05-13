package padroescomportamentais.state.v1;

public class AlunoEstadoTransferido extends AlunoEstado{
    private AlunoEstadoTransferido() {};
    private static AlunoEstadoTransferido instance = new AlunoEstadoTransferido();
    public static AlunoEstadoTransferido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Transferido";
    }

}
