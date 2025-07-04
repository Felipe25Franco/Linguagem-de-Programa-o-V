package padorescriacao.factorymethod;

public class TransporteFactory {
    public static ITransporte obterEntrega(String transporte) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Transporte" + transporte);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Transporte inexistente");
        }
        if (!(objeto instanceof ITransporte)) {
            throw new IllegalArgumentException("Transporte inválido");
        }
        return (ITransporte) objeto;
    }
}