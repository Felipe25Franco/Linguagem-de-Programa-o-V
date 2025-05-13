package padroescomportamentais.state.v2;

public class JogadorEstadoContratado extends JogadorEstado{
    private JogadorEstadoContratado() {};
    private static JogadorEstadoContratado instance = new JogadorEstadoContratado();
    public static JogadorEstadoContratado getInstance(){return instance;}
    public String getEstado(){return "Contratado";}

    public boolean emprestar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoEmprestado.getInstance());
        return true;
    }
}
