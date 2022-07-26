package ativ1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int opcao;

    System.out.println("Qual forma Geométrica voce deseja formar?");
    System.out.println("1 - Quadrado" +
        "\n2 - Retângulo" +
        "\n3 - Circulo");
    opcao = scan.nextInt();

    switch (opcao) {
      case 1:
        System.out.println("Digite o tamanho do lado do quadrado: ");
        Quadrados quad = new Quadrados(scan.nextFloat());
        System.out.println("A area do quadrado é de " + quad.calcArea());
        break;
      case 2:
        System.out.println("Digite o tamanho da base e da altura do retangulo: ");
        Retangulos ret = new Retangulos(scan.nextFloat(), scan.nextFloat());
        System.out.println("A area do Retangulo é de " + ret.calcArea());
        break;
      case 3:
        System.out.println("Digite o tamanho do raio do circulo: ");
        Circulo circ = new Circulo(scan.nextDouble());
        System.out.println("A area do ciculo é de " + circ.calcArea());
        break;
      default:
        break;

    }

  }

}
