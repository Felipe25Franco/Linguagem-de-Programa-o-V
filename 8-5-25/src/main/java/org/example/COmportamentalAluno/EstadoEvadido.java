package org.example.COmportamentalAluno;

public class EstadoEvadido extends Estado {
    
    private EstadoEvadido() {};
    private static EstadoEvadido instance = new EstadoEvadido();
    public static EstadoEvadido getInstance() {
        return instance;
    }    
}
