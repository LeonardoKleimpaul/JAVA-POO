package exerc6;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String nome;
    double peso, preco;

    System.out.println("Digite o nome do produto: ");
    nome = scan.nextLine();
    System.out.println("Digite o peso do produto: ");
    peso = scan.nextDouble();
    System.out.println("Digite o preço do produto: ");
    preco = scan.nextDouble();
    Produto p1 = new Produto(nome, peso, preco);

    p1.aumentarPreco(p1);

    System.out.println("Digite o nome do produto: ");
    nome = scan.nextLine();
    if (scan.hasNextLine()) {
      scan.nextLine();
    }
    System.out.println("Digite o peso do produto: ");
    peso = scan.nextDouble();
    System.out.println("Digite o preço do produto: ");
    preco = scan.nextDouble();
    Produto p2 = new Produto(nome, peso, preco);

    p2.aumentarPreco(p2);

    System.out.println("Digite o nome do produto: ");
    nome = scan.nextLine();
    if (scan.hasNextLine()) {
      scan.nextLine();
    }
    System.out.println("Digite o peso do produto: ");
    peso = scan.nextDouble();
    System.out.println("Digite o preço do produto: ");
    preco = scan.nextDouble();
    Produto p3 = new Produto(nome, peso, preco);

    p3.aumentarPreco(p3);

    System.out.println("Digite o nome do produto: ");
    nome = scan.nextLine();
    if (scan.hasNextLine()) {
      scan.nextLine();
    }
    System.out.println("Digite o peso do produto: ");
    peso = scan.nextDouble();
    System.out.println("Digite o preço do produto: ");
    preco = scan.nextDouble();
    Produto p4 = new Produto(nome, peso, preco);

    p4.aumentarPreco(p4);

    System.out.println("Digite o nome do produto: ");
    nome = scan.nextLine();
    if (scan.hasNextLine()) {
      scan.nextLine();
    }
    System.out.println("Digite o peso do produto: ");
    peso = scan.nextDouble();
    System.out.println("Digite o preço do produto: ");
    preco = scan.nextDouble();
    Produto p5 = new Produto(nome, peso, preco);

    p5.aumentarPreco(p5);

  }

}
