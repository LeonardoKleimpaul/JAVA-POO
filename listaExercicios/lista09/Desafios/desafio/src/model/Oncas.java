package model;

import interfaces.IRugido;

public class Oncas extends Felino implements IRugido {

  public Oncas(String tipoFelino) {
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
}
