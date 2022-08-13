package exer6;

public class ContasJava {
  public static void main(String[] args) {

    ContaEspecial ce = new ContaEspecial();

    ce.setCliente("Jorge");
    ce.setNumConta(10);
    ce.setSaldo(5000);
    ce.setLimite(10000);

    ce.sacar(2000);
    ce.depositar(2000);
    ce.sacar(6000);
    ce.sacar(9999);
    ce.sacar(9000);
    ce.sacar(1);

    System.out.println("------------------------");
    ce.infoConta();
    System.out.println("------------------------");

    ContaPoupanca cp = new ContaPoupanca();

    cp.setCliente("Ademar");
    cp.setNumConta(11);
    cp.setSaldo(20000);
    cp.setDiaDeRendimento(90);

    cp.sacar(21000);
    cp.sacar(5000);
    cp.depositar(5000);
    cp.calcularNovoSaldo();

    System.out.println("------------------------");
    cp.infoConta();
    System.out.println("------------------------");
  }

}
