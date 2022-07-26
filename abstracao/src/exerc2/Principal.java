package exerc2;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String nome;
    int idade;
    double n1, n2, n3;

    System.out.println("Digite o nome do aluno: ");
    nome = scan.nextLine();
    System.out.println("Digite a idade do aluno: ");
    idade = scan.nextInt();

    System.out.println("");
    System.out.println("Aluno " + nome + ".");

    System.out.println("Digite a primeira nota: ");
    n1 = scan.nextDouble();
    System.out.println("Digite a segunda nota: ");
    n2 = scan.nextDouble();
    System.out.println("Digite a terceira nota: ");
    n3 = scan.nextDouble();

    Aluno aluno = new Aluno(nome, idade, n1, n2, n3);

    System.out.println("");
    aluno.infoAluno();
    aluno.calcularMedia();
    aluno.verificarAprovacao();

  }

}
