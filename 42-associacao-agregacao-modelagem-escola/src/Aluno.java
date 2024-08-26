
import java.util.Objects;


public class Aluno {

  private String nome;
  private final String cpf;
  
  public Aluno(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  @Override
  public String toString() {
    return nome + " (" + cpf + ")";
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    final Aluno other = (Aluno) obj;
    return cpf.equals(other.cpf);
  }


  @Override
  public int hashCode() {
      return Objects.hash(cpf);
  }



}
