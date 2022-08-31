package model;

import interfaces.IDomesticos;

public class Gatos extends Felino implements IDomesticos {

  public Gatos(String tipoFelino) {
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
  public String ficoEmCasa() {
    return "Fico em casa quando quero.";

  }

}
