package padroescomportamentais.templatemethod;
public class ImpostoSuldeste extends Imposto{

    @Override
    public double verificarAlicota() {
        return 0.8;
    }
}
