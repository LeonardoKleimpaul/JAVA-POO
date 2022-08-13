package ativ1;

public class Ingresso {

  private float valor;

  // public void valorIngresso() {
  // System.out.println("O valor do ingresso é " + getValor());
  // }

  public Ingresso(float valor) {
    this.valor = valor;
  }

  public Ingresso() {
  }

  // get set
  public float getValor() {
    return valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  public String toString() {
    return "Ingresso [valor=" + valor + "]";
  }

}
