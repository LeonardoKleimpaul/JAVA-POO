package exer5;

public class Fornecedor extends Pessoa {

  private float valorCredito;
  private float valorDivida;

  public Fornecedor() {
  }

  public float getValorCredito() {
    return valorCredito;
  }

  public void setValorCredito(float valorCredito) {
    this.valorCredito = valorCredito;
  }

  public float getValorDivida() {
    return valorDivida;
  }

  public void setValorDivida(float valorDivida) {
    this.valorDivida = valorDivida;
  }

  public float obterSaldo() {
    return getValorCredito() - getValorDivida();
  }

  public void infoFornecedor() {
    super.infoP();
    System.out.println("Saldo do Fornecedor: " + obterSaldo());
  }
}
