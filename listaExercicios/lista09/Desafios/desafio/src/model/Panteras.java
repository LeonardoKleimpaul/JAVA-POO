package model;

import interfaces.ISemiarboricolas;

public class Panteras extends Felino implements ISemiarboricolas {

  public Panteras(String tipoFelino) {
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
  public String consegueViverEmArvores() {
    return "Posso viver em cima das árvores também.";

  }
}
