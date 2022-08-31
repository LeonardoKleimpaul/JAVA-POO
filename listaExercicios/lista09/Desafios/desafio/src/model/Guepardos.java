package model;

import interfaces.IGarrasSemirretrateis;

public class Guepardos extends Felino implements IGarrasSemirretrateis {

  public Guepardos(String tipoFelino) {
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
  public String garrasSemirretrateis() {
    return "Minhas garras são Semirretráteis.";

  }

}
