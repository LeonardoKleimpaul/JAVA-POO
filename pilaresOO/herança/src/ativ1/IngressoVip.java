package ativ1;

public class IngressoVip extends Ingresso {

  private float valorAdicional;

  public IngressoVip() {
  }

  public IngressoVip(float valor, float valorAdicional) {
    super(valor);
    this.valorAdicional = valorAdicional;
  }

  public void valorIngressoVip() {
    System.out.println(super.getValor());
    System.out.println("O valor do ingresso vip: " + getValorAdicional());
  }

  // get set
  public float getValorAdicional() {
    return valorAdicional;
  }

  public void setValorAdicional(float valorAdicional) {
    this.valorAdicional = valorAdicional;
  }

  // to string
  @Override
  public String toString() {
    return "IngressoVip = " + (super.getValor() + valorAdicional) +
        " Ingresso normal = " + super.getValor();
  }

}
