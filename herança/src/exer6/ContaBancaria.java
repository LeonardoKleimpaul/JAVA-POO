package exer6;

public class ContaBancaria {

  private String Cliente;
  private int numConta;
  private float saldo;

  public ContaBancaria() {
  }

  public String getCliente() {
    return Cliente;
  }

  public void setCliente(String cliente) {
    Cliente = cliente;
  }

  public int getNumConta() {
    return numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public void sacar(float saque) {
    if (saque <= getSaldo()) {
      setSaldo(getSaldo() - saque);
      System.out.println("Saque de R$" + saque);
      System.out.println("Saldo: " + getSaldo());
    } else {
      System.out.println("Saldo insuficiente!!!");
    }
  }

  public void depositar(float deposito) {
    setSaldo(getSaldo() + deposito);
    System.out.println("Deposito de R$" + deposito);
    System.out.println("Saldo: " + getSaldo());
  }

  public void infoConta() {
    System.out.println("Cliente: " + getCliente());
    System.out.println("Nr da conta: " + getNumConta());
    System.out.println("Saldo: " + getSaldo());
  }

}
