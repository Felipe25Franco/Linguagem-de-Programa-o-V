package padorescriacao.factorymethod;
public class TransporteNavio implements ITransporte {
    public String entregar() {
        return "Entrega realizada por navio";
    }

    public String cancelarEntrega() {
        return "Entrega por navio cancelada";
    }
}