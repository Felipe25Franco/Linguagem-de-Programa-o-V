package padorescriacao.factorymethod;

public class TransporteCaminhao  implements ITransporte {
    public String entregar() {
        return "Entrega realizada por caminhão";
    }

    public String cancelarEntrega() {
        return "Entrega por caminhão cancelada";
    }
}