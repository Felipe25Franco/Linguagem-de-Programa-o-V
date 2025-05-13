package org.example.COmportamentalAluno;

public class AlunoOld {
    String estado;

    public AlunoOld() {
        this.estado = "matriculado";
    }

    public AlunoOld(String estado) {
        this.estado = estado;
    }

    public Boolean matricular() {
        if (estado=="trancado") {
            return true;
        }
        return false;
    }

    public Boolean trancar() {
        if (estado=="matriculado") {
            return true;
        }
        return false;
    }

    public Boolean trasnferir() {
        if (estado=="matriculado"||estado=="trancado") {
            return true;
        }
        return false;
    }

    public Boolean evadir() {
        if (estado=="matriculado") {
            return true;
        }
        return false;
    }

    public Boolean formar() {
        if (estado=="matriculado") {
            return true;
        }
        return false;
    }

    public Boolean jubilar() {
        if (estado=="matriculado") {
            return true;
        }
        return false;
    }
}
