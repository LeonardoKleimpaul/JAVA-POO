package exer4;

import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Digite seu peso: ");
      double peso = scan.nextDouble();

      System.out.println("Digite sua altura: ");
      double altura = scan.nextDouble();

      double imc = peso / Math.pow(altura, 2);

      if (imc < 18.5) {
        System.out.println("IMC: " + imc +
            "\nSituação: Magreza.");
      } else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println("IMC: " + imc +
            "\nSituação: Normal.");
      } else if (imc >= 25 && imc <= 29.9) {
        System.out.println("IMC: " + imc +
            "\nSituação: Sobrepeso.");
      } else if (imc >= 30 && imc <= 29.9) {
        System.out.println("IMC: " + imc +
            "\nSituação: Obesidade.");
      } else {
        System.out.println("IMC: " + imc +
            "\nSituação: Obesidade grave!");
      }
    }
  }

}
