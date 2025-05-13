package org.example.COmportamentalAluno;

public class EstadoMatriculado extends Estado {
    
    private EstadoMatriculado() {};
    private static EstadoMatriculado instance = new EstadoMatriculado();
    public static EstadoMatriculado getInstance() {
        return instance;
    }

    @Override
    public Boolean trancar() {
        return true;
    }
    @Override
    public Boolean trasnferir() {
        return true;
    }
    @Override
    public Boolean evadir() {
        return true;
    }
    @Override
    public Boolean formar() {
        return true;
    }
    @Override
    public Boolean jubilar() {
        return true;
    }
}
