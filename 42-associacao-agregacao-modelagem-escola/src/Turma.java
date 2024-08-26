import java.util.ArrayList;
import java.util.List;

public class Turma {
  private Curso curso;
  private String dataInicio;
  private String dataFim;
  private int vagas;
  private List<Matricula> matriculas;
  private boolean iniciar;
  private boolean cancelada;
  private boolean concluida;

  public Turma(Curso curso, String dataInicio, String dataFim, int vagas) {
    this.curso = new Curso(curso.getNome());
    for(Componente c : curso.getComponentes()){
      this.curso.addComponente(new Componente(c.getNome(), c.getCargaHoraria()));
    }
    this.dataInicio = dataInicio;
    this.dataFim = dataFim;
    this.vagas = vagas;
    this.matriculas = new ArrayList<>();
    this.iniciar = false;
    this.cancelada = false;
    this.concluida = false;
  }

public Curso getCurso() {
	return curso;
}

public int getCargaHoraria() {
  return curso.getCargaHoraria();
}

public int getVagas() {
	return vagas;
}

public boolean temVagas() {
  int cont = 0;
  for (Matricula matricula : matriculas) {
    if(!matricula.isCancelada()){
      cont++;
    }
  }
  return cont < vagas;
}

public void matricular(Aluno aluno){
  if(temVagas()){
    matriculas.add(new Matricula(aluno, this));
  } else{
    throw new IllegalStateException("Máximo 3 vagas.");
  }
}

public int getQuantidadeAlunos() {
	return matriculas.size();
}

public boolean isNova() {
  return !iniciar && !cancelada && !concluida;
}

public boolean isAndamento() {
    return iniciar && !cancelada && !concluida;
}

public boolean isCancelada() {
  return cancelada;
}

public boolean isConcluida() {
  return concluida;
}

public void comecar() {
  if(isNova()){
    this.iniciar = true;
  } else{
     throw new IllegalStateException("A turma deve ser nova para começar.");
  }
}

public int getQuantidadeAlunosAtivos() {
  int cont = 0;
  for (Matricula matricula : matriculas) {
    if(matricula.isCancelada()){
      cont++;
    }
  }
  return matriculas.size() - cont;
}

public void cancelarMatricula(Aluno aluno) {
  for (Matricula matricula : matriculas) {
    if(matricula.getAluno().equals(aluno)){
      matricula.cancelar();
    }    
  }
}

public void cancelar() {
    if (isAndamento()) {
      throw new IllegalStateException("Não é possível cancelar uma turma em andamento.");
    }
    this.cancelada = true;
    for (Matricula matricula : matriculas) {
      matricula.cancelar();
    }
  }

  public void concluir() {
    if (isConcluida()) {
        throw new IllegalStateException("A turma já foi concluída.");
    }
    if (!isAndamento()) {
        throw new IllegalStateException("Não é possível concluir uma turma que não está em andamento.");
    }
    this.concluida = true;
  }   
  public Matricula getAluno(Aluno aluno) {
    for (Matricula matricula : matriculas) {
      if (matricula.getAluno().equals(aluno)) {
        return matricula;
      }
    }
    return null;
  }

  public Matricula getAluno(int i) {
        if (i >= 0 && i <= matriculas.size()) {
            return matriculas.get(i - 1);
        } else {
            return null; 
        }
    }

}
