package exerc3;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int opcao, numConta;
    double deposito, saque;

    Conta contaCorrente = new Conta("Conta Corrente", "Leonardo", 01, 0);
    Conta contaPoupanca = new Conta("Conta Poupança", "Leonardo", 02, 0);

    do {
      System.out.println("");
      System.out.println("1 - Depositar.");
      System.out.println("2 - Sacar.");
      System.out.println("3 - Verificar saldo.");
      System.out.println("4 - Encerrar.");
      opcao = scan.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Em qual conta deseja depositar");
          System.out.println("CC 01 | CP 02");
          numConta = scan.nextInt();
          if (numConta == 01) {
            System.out.println("Qual valor deseja depositar?");
            deposito = scan.nextDouble();
            contaCorrente.depositar(deposito);
          } else if (numConta == 02) {
            System.out.println("Qual valor deseja depositar?");
            deposito = scan.nextDouble();
            contaPoupanca.depositar(deposito);
          } else {
            System.out.println("Numero de conta inválido.");
          }
          break;

        case 2:
          System.out.println("De qual conta voce deseja sacar?");
          System.out.println("CC 01 | CP 02");
          numConta = scan.nextInt();
          if (numConta == 01) {
            System.out.println("Qual valor deseja sacar?");
            saque = scan.nextDouble();
            contaCorrente.sacar(saque);
          } else if (numConta == 02) {
            System.out.println("Qual valor deseja sacar?");
            saque = scan.nextDouble();
            contaPoupanca.sacar(saque);
          } else {
            System.out.println("Numero de conta inválido.");
          }
          break;

        case 3:
          System.out.println("");
          System.out.println("   ---Saldo da Conta Corrente---");
          System.out.println("");
          contaCorrente.verificarSaldo();
          System.out.println("");
          System.out.println("   ---Saldo da Conta Poupança---");
          System.out.println("");
          contaPoupanca.verificarSaldo();
          break;

        default:
          System.out.println("Sistema Encerrado.");
          break;
      }
    } while (opcao != 4);
  }

}
