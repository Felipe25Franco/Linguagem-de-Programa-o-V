package padroescomportamentais.state.v2;

public class JogadorEstadoEmprestado extends JogadorEstado{
    private JogadorEstadoEmprestado() {};
    private static JogadorEstadoEmprestado instance = new JogadorEstadoEmprestado();
    public static JogadorEstadoEmprestado getInstance(){return instance;}
    public String getEstado(){return "Emprestado";}


}
