import java.util.List;

class App {
  public static void main(String[] args) {

    System.out.println("Olá mundo!");

    Pessoa joey     = new Pessoa("Joey");
    Pessoa rachel   = new Pessoa("Rachel");
    Pessoa monica   = new Pessoa("Monica");
    Pessoa chandler = new Pessoa("Chandler");
    Pessoa phoebe   = new Pessoa("Phoebe");

    System.out.println(0 == joey.getContagemAmigos());
    System.out.println(rachel.getContagemAmigos() == 0);

    joey.adicionaAmigo(rachel);

    List<Pessoa> amigosDoJoey = joey.getAmigos();
    System.out.println(amigosDoJoey.size() == 1);

    System.out.println(joey.getAmigos().size() == 1);
    System.out.println(rachel.getAmigos().size() == 1);

    monica.adicionaAmigo(joey);
    System.out.println(joey.getAmigos().size() == 2);

    System.out.println(rachel.getAmigo(0).equals(joey));
    System.out.println(rachel.getAmigo(1) == null);
    
    System.out.println(joey.getAmigo(0).equals(rachel));
    System.out.println(joey.getAmigo(1).equals(monica));
    
    rachel.adicionaAmigo(monica);
    monica.adicionaAmigo(chandler);
    
    System.out.println(rachel.getAmigo(1).equals(monica));

    System.out.println(monica.getAmigo(0).equals(joey));
    System.out.println(monica.getAmigo(1).equals(rachel));
    System.out.println(monica.getAmigo(2).equals(chandler));

    phoebe.adicionaAmigo(joey);
    phoebe.adicionaAmigo(rachel);
    phoebe.adicionaAmigo(monica);
    phoebe.adicionaAmigo(chandler);

    System.out.println(phoebe.getAmigos().size() == 4);

    phoebe.removeAmigo(rachel);

    System.out.println(phoebe.getAmigos().size() == 3);
    System.out.println(phoebe.getAmigo(0).equals(joey));
    System.out.println(phoebe.getAmigo(1).equals(monica));
    System.out.println(phoebe.getAmigo(2).equals(chandler));    
  
    for (int i = 0; i < phoebe.getAmigos().size(); i++) {
      System.out.println(phoebe.getAmigo(i) != null);
    }  
  
    System.out.println(phoebe.getAmigo(0).getAmigo(0).equals(rachel));  

    System.out.println(phoebe.getAmigo(0).getAmigo(0).getAmigo(1).getAmigo(2).equals(chandler));    

    System.out.println(joey.getAmigos().size() == 3);

    joey.adicionaAmigo(joey);
    System.out.println(joey.getAmigos().size() == 3);

    joey.removeAmigo(0);
    joey.removeAmigo(0);
    joey.removeAmigo(0);
    
    System.out.println(joey.getAmigos().size() == 0);
  }
}
