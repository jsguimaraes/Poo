class App {
  public static void main(String[] args) {

    System.out.println("Olá mundo!");
    Fibonacci fib1 = new Fibonacci();
    System.out.println(fib1.value() == 0);
    // sobrescreva o toString
    System.out.println(fib1.toString()); // 0
    System.out.println(fib1.toString().equals("0"));
    fib1.next();
    System.out.println(fib1.value() == 1);
    fib1.next();
    System.out.println(fib1.value() == 1);
    fib1.next();
    System.out.println(fib1.value() == 2);
    fib1.next();
    System.out.println(fib1.value() == 3);
    System.out.println(fib1.value() == 3);
    fib1.next();
    System.out.println(fib1.value() == 5);
    fib1.next();
    System.out.println(fib1.value() == 8);
    fib1.next();
    System.out.println(fib1.value() == 13);
    System.out.println(fib1); // 13
    System.out.println(fib1.toString().equals("13"));

    fib1.previous();
    System.out.println(fib1.value() == 8);
    fib1.previous();
    System.out.println(fib1.value() == 5);
    System.out.println(fib1.value() == 5);
    fib1.previous(5);
    System.out.println(fib1.value() == 0);
    fib1.previous();
    System.out.println(fib1.value() == 0);
    try {
      fib1.previous(50);
      System.out.println(fib1.value() == 0);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    fib1.next(10);
    System.out.println(fib1.value() == 55);
    try{
      fib1.previous(-3);
      System.out.println(fib1.value() == 55);
    } catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
    }
    try {
      fib1.next(-3);
      System.out.println(fib1.value() == 55);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    fib1.reset();
    System.out.println(fib1.value() == 0);

    Fibonacci fib2 = new Fibonacci();
    int[] vetFib = fib2.getVetFib();
    for (int sample : vetFib) {
      System.out.println(fib2.value() == sample);
      fib2.next();
    }

    Fibonacci fib3 = new Fibonacci();
    fib3.next(13);
    System.out.println(fib3.value() == 233);

    Fibonacci fib4 = new Fibonacci();
    fib4.next(13);
    // sobrescrever o equals
    System.out.println(fib4.equals(fib3) == true);
    System.out.println(fib4.equals(fib2) == false);

    fib4.near(10);
    System.out.println(fib4.value() == 8);
    fib4.near(20);
    System.out.println(fib4.value() == 21);
    fib4.near(300);
    System.out.println(fib4.value() == 233);
    fib4.near(4);
    System.out.println(fib4.value() == 3);
    fib4.near(89);
    System.out.println(fib4.value() == 89);
    fib4.under(1000);
    System.out.println(fib4.value() == 987);
    fib4.above(1000);
    System.out.println(fib4.value() == 1597);

    // construtor == under
    Fibonacci fib5 = new Fibonacci(300);
    System.out.println(fib5.value() == 233);
    Fibonacci fib6 = new Fibonacci(20);
    System.out.println(fib6.value() == 13);

    System.out.println(fib5.compareTo(fib6)  > 0); // fib5 é maior que fib6
    System.out.println(fib5.compareTo(fib5) == 0); // fib5 é igual a fib5
    System.out.println(fib5.compareTo(fib4)  < 0); // fib5 é menor que fib4

    // outros métodos auxiliares, implemente usando o compareTo
    System.out.println(fib5.greater(fib6) == true);
    System.out.println(fib5.less(fib6) == false);
    System.out.println(fib5.less(fib5) == false);
    System.out.println(fib5.greater(fib5) == false);
    System.out.println(fib5.equals(fib5) == true);

  }
}
