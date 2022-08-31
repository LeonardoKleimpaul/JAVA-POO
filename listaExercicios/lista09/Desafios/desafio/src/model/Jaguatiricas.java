package model;

public class Jaguatiricas extends Felino {

  public Jaguatiricas(String tipoFelino) {
    super(tipoFelino);
  }

  @Override
  public String pelos() {
    return "Tenho pelos";
  }

  @Override
  public String garras() {
    return "Possuo Garras.";
  }

}
