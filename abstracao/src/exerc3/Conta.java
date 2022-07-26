package exerc3;

public class Conta {

  // atributos
  String tipoConta, titularConta;
  int numConta;
  double saldo;

  // construtor
  public Conta(String tipoConta, String titularConta, int numConta, double saldo) {
    this.tipoConta = tipoConta;
    this.titularConta = titularConta;
    this.numConta = numConta;
    this.saldo = saldo;
  }

  // metodos
  void depositar(double deposito) {
    saldo = saldo + deposito;
  }

  void sacar(double saque) {
    if (saque > saldo) {
      System.out.println("Saldo insuficiente.");
    } else {
      this.saldo = saldo - saque;
    }
  }

  void verificarSaldo() {
    System.out.println("Titular da conta: " + this.titularConta);
    System.out.println("Tipo da conta: " + this.tipoConta);
    System.out.println("Numero da conta: " + this.numConta);
    System.out.println("Saldo da conta: " + this.saldo);
  }
}
