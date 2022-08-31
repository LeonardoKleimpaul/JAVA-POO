package model;

public abstract class Felino {

  protected String tipoFelino;

  public Felino(String tipoFelino) {
    this.tipoFelino = tipoFelino;
  }

  public String getTipoFelino() {
    return tipoFelino;
  }

  public void setTipoFelino(String tipoFelino) {
    this.tipoFelino = tipoFelino;
  }

  public abstract String pelos();

  public abstract String garras();
}
