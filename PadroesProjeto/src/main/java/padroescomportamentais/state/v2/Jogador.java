package padroescomportamentais.state.v2;

public class Jogador {
    private String nome;
    private JogadorEstado estado;

    public Jogador(){this.estado = JogadorEstadoContratado.getInstance();}
    public void setEstado(JogadorEstado estado){this.estado = estado;}
    public boolean contratar(){return estado.contratar(this);}
    public boolean emprestar(){return estado.emprestar(this);}

    public JogadorEstado getEstado(){return estado;}
}
