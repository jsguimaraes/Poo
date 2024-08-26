
public class Fibonacci {
  int [] vetFib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
    144, 233, 377, 610, 987, 1597, 2584};


  private int index;

  public Fibonacci() {
    this.index = 0;
  }

  public Fibonacci(int valor) {
    this();
    for(int i = 0; i < vetFib.length; i++){
      if (vetFib[i] <= valor) {
        this.index = i;
      } else {
          break;
      }
    }
  }

    public int getIndex() {
      return index;
    }

    public void setIndex(int index) {
      this.index = index;
    }

    public int[] getVetFib() {
      return vetFib;
    }

    public int value() {
      return vetFib[index];
    }

    public void next() {
      if(index < vetFib.length-1){
        index++;
      }
    }

    public void next(int i) {
      if(i > 0){
        index += i;
        if(index > vetFib.length-1){
          index = vetFib.length-1;
        }
      } else {
        throw new IllegalArgumentException("O passo deve ser positivo.");
      }
    }

    public void previous() {
      if(index > 0){
        index--;
      }
    }
    public void previous(int i) {
      if(i > 0){
        index -= i;
        if(index < 0){
          index = 0;
        }
      } else{
        throw new IllegalArgumentException("O passo deve ser positivo.");
      }
    }

    public void reset() {
      index = 0;
    }

    public void near(int valor) {
      int menorDif = 0;
      int menorDifEcontrada = Integer.MAX_VALUE;
      for(int i = 0; i < vetFib.length; i++){
        int diferenca = Math.abs(vetFib[i] - valor);
        if(diferenca < menorDifEcontrada){
          menorDifEcontrada = diferenca;
          menorDif = i;
        }
      }
      index = menorDif;
    }

    public void under(int valor) {
      int maiorIndex = 0;
      boolean encontrou = false;
      for(int i = 0; i < vetFib.length; i++){
        if(vetFib[i] < valor){
          maiorIndex = i;
          encontrou = true;
        } else{
          break;
        }
      }
      if(encontrou){
        index = maiorIndex;
      } else{
        index = 0;
      }
    }

    public void above(int valor) {
      int menorIndex = 0;
      boolean encontrou = false;
      for(int i = 0; i < vetFib.length; i++){
        if(vetFib[i] > valor){
          menorIndex = i;
          encontrou = true;
          break;
        }
      }
      if(encontrou){
        index = menorIndex;
      } else{
        index = vetFib.length-1;
      }
    }

    public int compareTo(Fibonacci otherFibonacci) {
      return Integer.compare(this.value(), otherFibonacci.value());
    }

    public boolean greater(Fibonacci otherFibonacci) {
      return this.compareTo(otherFibonacci) > 0;
    }

    public boolean less(Fibonacci otFibonacci) {
      return this.compareTo(otFibonacci) < 0;
    }

    @Override
    public String toString() {
      return Integer.toString(vetFib[index]);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fibonacci other = (Fibonacci) obj;
        return this.index == other.index;
    }


}
