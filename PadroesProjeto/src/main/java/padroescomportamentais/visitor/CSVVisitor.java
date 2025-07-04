package padroescomportamentais.visitor;
public class CSVVisitor implements Visitor {

    @Override
    public String exibirAluno(Aluno aluno) {
        return String.format("Aluno,%d,%s,%s",
                aluno.getMatricula(), aluno.getNome(), aluno.getNomeCurso());
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return String.format("Professor,%d,%s,%s",
                professor.getMatricula(), professor.getNome(), professor.getTitulacao());
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return String.format("Funcionario,%d,%s,%s",
                funcionario.getCodigo(), funcionario.getNome(), funcionario.getSalario());
    }
}
