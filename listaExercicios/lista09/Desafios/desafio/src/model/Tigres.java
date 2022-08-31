package model;

import interfaces.INadadores;
import interfaces.IRugido;

public class Tigres extends Felino implements IRugido, INadadores {

  public Tigres(String tipoFelino) {
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
  public String nadoExcelentemente() {
    return "Sou um excelente nadador.";

  }
}
