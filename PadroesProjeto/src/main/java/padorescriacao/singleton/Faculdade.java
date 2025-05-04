package padorescriacao.singleton;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private Faculdade(){};
    private static Faculdade instancia = new Faculdade();

    public static Faculdade getInstancia() {
        return instancia;
    }

    private String nome;
    private List<Curso> cursos = new ArrayList<>();



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
