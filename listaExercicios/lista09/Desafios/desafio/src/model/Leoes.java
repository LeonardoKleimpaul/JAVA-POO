package model;

import interfaces.IGrupo;
import interfaces.IRugido;

public class Leoes extends Felino implements IRugido, IGrupo {

  public Leoes(String tipoFelino) {
    super(tipoFelino);
  }

  @Override
  public String pelos() {
    return "Tenho pelos.";
  }

  @Override
  public String garras() {
    return "Possuo Garras.";
  }

  @Override
  public String rugir() {
    return "Eu posso rugir.";

  }

  @Override
  public String vivoEmGrupo() {
    return "Eu fico sempre em grupo.";

  }

}
