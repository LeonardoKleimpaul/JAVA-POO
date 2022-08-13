package exer6;

public class ContaPoupanca extends ContaBancaria {

  private int diaDeRendimento;

  public ContaPoupanca() {
  }

  public int getDiaDeRendimento() {
    return diaDeRendimento;
  }

  public void setDiaDeRendimento(int diaDeRendimento) {
    this.diaDeRendimento = diaDeRendimento;
  }

  public void infoConta() {
    System.out.println("Cliente: " + getCliente());
    System.out.println("Nr da conta: " + getNumConta());
    System.out.println("Saldo com juros: " + getSaldo());

  }

  public void calcularNovoSaldo() {
    setSaldo(getSaldo() + (getSaldo() * (getDiaDeRendimento() / 30) / 100));
  }

}
