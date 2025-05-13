package org.example.COmportamentalAluno;

public class EstadoTransferido extends Estado {
    
    private EstadoTransferido() {};
    private static EstadoTransferido instance = new EstadoTransferido();
    public static EstadoTransferido getInstance() {
        return instance;
    }
}
