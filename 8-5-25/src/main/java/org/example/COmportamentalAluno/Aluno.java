package org.example.COmportamentalAluno;

public class Aluno {
    Estado estado;

    public Aluno() {
    }

    public Aluno(Estado estado) {
        this.estado = estado;
    }

    public Boolean matricular() {
        return this.estado.matricular(); 
    }

    public Boolean trancar() {
        return this.estado.trancar(); 
    }

    public Boolean trasnferir() {
        return this.estado.trasnferir(); 
    }

    public Boolean evadir() {
        return this.estado.evadir(); 
    }

    public Boolean formar() {
        return this.estado.formar(); 
    }

    public Boolean jubilar() {
        return this.estado.jubilar(); 
    }
}
