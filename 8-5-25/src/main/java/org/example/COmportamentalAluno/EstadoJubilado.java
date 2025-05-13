package org.example.COmportamentalAluno;

public class EstadoJubilado extends Estado {
    
    private EstadoJubilado() {};
    private static EstadoJubilado instance = new EstadoJubilado();
    public static EstadoJubilado getInstance() {
        return instance;
    }
}
