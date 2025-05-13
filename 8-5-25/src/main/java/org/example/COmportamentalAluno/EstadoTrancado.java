package org.example.COmportamentalAluno;

public class EstadoTrancado extends Estado {
    
    private EstadoTrancado() {};
    private static EstadoTrancado instance = new EstadoTrancado();
    public static EstadoTrancado getInstance() {
        return instance;
    }

    @Override
    public Boolean matricular() {
        return true;
    }

    @Override
    public Boolean trasnferir() {
        return true;
    }
}
