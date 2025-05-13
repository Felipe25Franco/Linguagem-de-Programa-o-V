package org.example.COmportamentalAluno;

public class EstadoFormado extends Estado {
    
    private EstadoFormado() {};
    private static EstadoFormado instance = new EstadoFormado();
    public static EstadoFormado getInstance() {
        return instance;
    }
}
