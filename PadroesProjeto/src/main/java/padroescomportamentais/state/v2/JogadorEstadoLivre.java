package padroescomportamentais.state.v2;

public class JogadorEstadoLivre extends JogadorEstado{
    private JogadorEstadoLivre() {};
    private static JogadorEstadoLivre instance = new JogadorEstadoLivre();
    private static JogadorEstadoLivre getInstance(){return instance;}
    public String getEstado(){return "Livre";}
}
