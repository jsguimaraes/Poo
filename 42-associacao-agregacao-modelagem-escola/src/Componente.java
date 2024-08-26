
import java.util.Objects;


public class Componente {
  private String nome;
  private int cargaHoraria;

  public Componente(String nome, int cargaHoraria) {
    this.nome = nome;
    this.cargaHoraria = cargaHoraria;
  }

  public String getNome() {
    return nome;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return nome + " " + cargaHoraria + "h";
  }

   @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;

    final Componente other = (Componente) obj;
    return cargaHoraria == other.cargaHoraria && nome.equals(other.nome);
  }

  @Override
  public int hashCode() {
      return Objects.hash(nome, cargaHoraria);
  }

}
