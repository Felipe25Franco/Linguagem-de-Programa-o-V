package padroescomportamentais.visitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirAluno() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Aluno{matricula=1, nome='Ana', curso=Sistemas de Informação}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessor() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Professor{matricula=1, nome='Maria', titulacao='Doutorado'}", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Pedro', salario=5000.0}", visitor.exibir(funcionario));
    }

    @Test
    void deveExibirAlunoEmJSON() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));
        JSONVisitor visitor = new JSONVisitor();

        String esperado = "{ \"tipo\": \"Aluno\", \"matricula\": 1, \"nome\": \"Ana\", \"curso\": \"Sistemas de Informação\" }";
        assertEquals(esperado, aluno.aceitar(visitor));
    }

    @Test
    void deveExibirProfessorEmJSON() {
        Professor professor = new Professor(2, "Carlos", "Mestrado");
        JSONVisitor visitor = new JSONVisitor();

        String esperado = "{ \"tipo\": \"Professor\", \"matricula\": 2, \"nome\": \"Carlos\", \"titulacao\": \"Mestrado\" }";
        assertEquals(esperado, professor.aceitar(visitor));
    }

    @Test
    void deveExibirFuncionarioEmJSON() {
        Funcionario funcionario = new Funcionario(3, "Beatriz", 4200.0f);
        JSONVisitor visitor = new JSONVisitor();

        String esperado = "{ \"tipo\": \"Funcionario\", \"codigo\": 3, \"nome\": \"Beatriz\", \"salario\": 4200,00 }";
        assertEquals(esperado, funcionario.aceitar(visitor));
    }

    @Test
    void deveExibirAlunoEmCSV() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));
        CSVVisitor visitor = new CSVVisitor();

        String esperado = "Aluno,1,Ana,Sistemas de Informação";
        assertEquals(esperado, aluno.aceitar(visitor));
    }

    @Test
    void deveExibirProfessorEmCSV() {
        Professor professor = new Professor(2, "Carlos", "Mestrado");
        CSVVisitor visitor = new CSVVisitor();

        String esperado = "Professor,2,Carlos,Mestrado";
        assertEquals(esperado, professor.aceitar(visitor));
    }

    @Test
    void deveExibirFuncionarioEmCSV() {
        Funcionario funcionario = new Funcionario(3, "Beatriz", 4200.0f);
        CSVVisitor visitor = new CSVVisitor();

        String esperado = "Funcionario,3,Beatriz,4200.0";
        assertEquals(esperado, funcionario.aceitar(visitor));
    }

}