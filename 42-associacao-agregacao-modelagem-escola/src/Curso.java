
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Curso {
  private String nome;
  private List<Componente> componentes;

  public Curso(String nome) {
    this.nome = nome;
    this.componentes = new ArrayList<>();
  }

  public void addComponente(Componente c){
    componentes.add(c);
  }

  public String getNome(){
    return nome;
  }

  public List<Componente> getComponentes(){
    return componentes;
  }

  public int getCargaHoraria() {
    int cargaHorariaTotal = 0;
    for(Componente c : componentes){
      cargaHorariaTotal += c.getCargaHoraria();
    }
    return cargaHorariaTotal;
  }

  public int getComponenteCurricular(int i){
    if(i >= 0 && i < componentes.size()){
      return componentes.get(i).getCargaHoraria();
    } else{
      throw new IndexOutOfBoundsException("I fora do limite");
    }
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;

    Curso other = (Curso) obj;
    return nome.equals(other.nome) && componentes.equals(other.componentes);
  }

  @Override
  public int hashCode() {
      return Objects.hash(nome, componentes);
  }

}
