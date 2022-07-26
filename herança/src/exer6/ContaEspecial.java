package exer6;

public class ContaEspecial extends ContaBancaria {

  private float limite;

  public ContaEspecial() {
  }

  public float getLimite() {
    return limite;
  }

  public void setLimite(float limite) {
    this.limite = limite;
  }

  @Override
  public void sacar(float saque) {
    if (saque <= (getSaldo() + getLimite())) {
      setSaldo(getSaldo() - saque);
      System.out.println("Saque de R$" + saque);
      System.out.println("Saldo: " + getSaldo());
    } else {
      System.out.println("Limite insuficiente!!!");
    }
  }
}
