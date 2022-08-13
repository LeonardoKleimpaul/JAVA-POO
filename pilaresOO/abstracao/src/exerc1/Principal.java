package exerc1;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double n1, n2;

    System.out.println("Digite o primeiro numero: ");
    n1 = scan.nextDouble();
    System.out.println("Digite o segundo numero: ");
    n2 = scan.nextDouble();

    Calculadora calc = new Calculadora(n1, n2);

    calc.soma(n1, n2);
    calc.sub(n1, n2);
    calc.multi(n1, n2);
    calc.div(n1, n2);

  }

}
