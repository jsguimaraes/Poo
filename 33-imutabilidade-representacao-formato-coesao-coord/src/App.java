class App {
  public static void main(String[] args) {

    System.out.println("Olá mundo!");
    // construtores:
    Coord c1 = new Coord();
    System.out.println(c1.latitude == 0.0);
    System.out.println(c1.longitude == 0.0);

    Coord c2 = new Coord(50.0, 134.0);
    System.out.println(c2.latitude == 50.0);
    System.out.println(c2.longitude == 134.0);

    Coord c3 = new Coord(-90.0, -180.0);
    System.out.println(c3.latitude == -90.0);
    System.out.println(c3.longitude == -180.0);

    // // estas coordenadas são inválidas e devem lançar exceção
    // // faça serem rejeitadas e depois comente-as para não parar o programa
    // new Coord(-91.0, 0.0);
    // new Coord(100.0, 0.0);
    // new Coord(10.0, -182.0);
    // new Coord(10.0, 200.0);
    // new Coord(-95.0, -200.0);

    // imutabilidade: as linhas a seguir devem causar erro de compilação
    // verifique se está de acordo e depois comente-as
    // Coord c4 = new Coord();
    // c4.latitude = 30.0;  // não deve permitir reatribuição
    // c4.longitude = 80.0; // não deve permitir reatribuição

    // operações/comandos:
    Coord in = new Coord(30.0, 50.0);
    Coord out = in.norte(5.0);
    System.out.println(in.latitude == 30.0); // deve ser imutável
    System.out.println(out.latitude == 35.0);
    out.norte(5.0); // sem reatribuição sem alteração
    System.out.println(out.latitude == 35.0);
    out = out.norte(5.0); // reatribuindo
    System.out.println(out.latitude == 40.0);
    out = out.sul(60.0);
    System.out.println(out.latitude == -20.0);
    out = out.sul(30.0);
    System.out.println(out.latitude == -50.0);
    out = out.sul(-10.0);
    System.out.println(out.latitude == -40.0);
    out = out.norte(-10.0);
    System.out.println(out.latitude == -50.0);
    System.out.println(out.longitude == 50.0);
    out = out.leste(50.0);
    System.out.println(out.longitude == 100.0);
    out = out.oeste(180.0);
    System.out.println(out.longitude == -80.0);
    out = out.oeste(-10.0);
    System.out.println(out.longitude == -70.0);
    out = out.leste(-10.0);
    System.out.println(out.longitude == -80.0);

    // consultas:
    Coord q = new Coord();
    System.out.println(q.latitude == 0);
    System.out.println(q.longitude == 0);
    System.out.println(q.noEquador() == true);
    System.out.println(q.emGreenwich() == true);
    q = q.norte(10.0);
    System.out.println(q.latitude == 10);
    System.out.println(q.noEquador() == false);
    q = q.leste(10.0);
    System.out.println(q.emGreenwich() == false);
    q = q.leste(170.0);
    System.out.println(q.longitude == 180.0);
    System.out.println(q.emGreenwich() == false);
    q = q.oeste(200.0);
    System.out.println(q.longitude == -20.0);
    System.out.println(q.emGreenwich() == false);
    q = q.leste(5.0).leste(5.0).leste(5.0).leste(5.0);
    System.out.println(q.longitude == 0.0);
    System.out.println(q.emGreenwich() == true);

    Coord r = new Coord(30.0, 70.0);
    System.out.println(r.latitude == 30.0);
    System.out.println(r.longitude == 70.0);
    System.out.println(r.noNorte() == true);
    System.out.println(r.noSul() == false);
    System.out.println(r.noOriente() == true);
    System.out.println(r.noOcidente() == false);
    r = r.oeste(140.0).sul(60.0);
    System.out.println(r.latitude == -30.0);
    System.out.println(r.longitude == -70.0);
    System.out.println(r.noNorte() == false);
    System.out.println(r.noSul() == true);
    System.out.println(r.noOriente() == false);
    System.out.println(r.noOcidente() == true);

  }
}
