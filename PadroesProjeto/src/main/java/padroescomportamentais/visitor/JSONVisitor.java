package padroescomportamentais.visitor;
public class JSONVisitor implements Visitor {

    @Override
    public String exibirAluno(Aluno aluno) {
        return String.format(
                "{ \"tipo\": \"Aluno\", \"matricula\": %d, \"nome\": \"%s\", \"curso\": \"%s\" }",
                aluno.getMatricula(), aluno.getNome(), aluno.getNomeCurso()
        );
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return String.format(
                "{ \"tipo\": \"Professor\", \"matricula\": %d, \"nome\": \"%s\", \"titulacao\": \"%s\" }",
                professor.getMatricula(), professor.getNome(), professor.getTitulacao()
        );
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return String.format(
                "{ \"tipo\": \"Funcionario\", \"codigo\": %d, \"nome\": \"%s\", \"salario\": %.2f }",
                funcionario.getCodigo(), funcionario.getNome(), funcionario.getSalario()
        );
    }
}
