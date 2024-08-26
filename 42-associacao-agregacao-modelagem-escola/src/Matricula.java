import java.util.Objects;

public class Matricula {
   private Aluno aluno;
   private Turma turma;
   private boolean cancelada;
    
   
   public Matricula(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
        this.cancelada = cancelada;
    }


    public Aluno getAluno() {
        return aluno;
    }


    public Turma getTurma() {
        return turma;
    }
    
    
    public boolean isCancelada() {
        return cancelada;
    }
    
    public boolean isConcluida() {
        return turma.isConcluida();
    }
    public void cancelar() {
        if (turma.isConcluida()) {
            throw new IllegalStateException("Não pode cancelar matrícula em uma turma concluída.");
        }
        this.cancelada = true;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Matricula matricula = (Matricula) obj;
        return aluno.equals(matricula.aluno) && turma.equals(matricula.turma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno, turma);
    }

    @Override
    public String toString() {
        return aluno + " matriculado na turma " + turma.getCurso().getNome();
    }


}
