package model;

import interfaces.IRugido;
import interfaces.ISemiarboricolas;

public class Leopardos extends Felino implements IRugido, ISemiarboricolas {

  public Leopardos(String tipoFelino) {
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
  public String consegueViverEmArvores() {
    return "Posso viver em cima das árvores também.";

  }
}
