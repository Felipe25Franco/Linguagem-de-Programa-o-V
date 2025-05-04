package padroescriacoes.singleton;

import org.junit.jupiter.api.Test;
import padorescriacao.singleton.Aluno;
import padorescriacao.singleton.Curso;
import padorescriacao.singleton.Faculdade;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FaculdadeTest {

    @Test
    public void deveRetornarNome() {
        Faculdade.getInstancia().setNome("Universidade Federal");
        assertEquals("Universidade Federal", Faculdade.getInstancia().getNome());
    }

    @Test
    public void deveAdicionarCurso() {
        Curso curso = new Curso("Engenharia de Software");
        Faculdade.getInstancia().adicionarCurso(curso);

        List<Curso> cursos = Faculdade.getInstancia().getCursos();
        assertTrue(cursos.contains(curso));
    }

    @Test
    public void deveAdicionarAlunoAoCurso() {
        Aluno aluno = new Aluno("Ana Souza", "20241001");
        Curso curso = new Curso("Direito");

        curso.adicionarAluno(aluno);
        Faculdade.getInstancia().adicionarCurso(curso);

        Curso cursoAdicionado = Faculdade.getInstancia().getCursos().stream()
                .filter(c -> c.getNome().equals("Direito"))
                .findFirst()
                .orElse(null);

        assertEquals("Ana Souza", cursoAdicionado.getAlunos().get(0).getNome());
        assertEquals("20241001", cursoAdicionado.getAlunos().get(0).getMatricula());
    }
}
