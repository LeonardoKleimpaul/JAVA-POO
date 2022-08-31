package exer4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try {
      int[] numeros = new int[2];

      System.out.println("Digite o primeiro número: ");
      numeros[0] = scan.nextInt();

      System.out.println("Digite o primeiro número: ");
      numeros[1] = scan.nextInt();

      System.out.println(numeros[0] / numeros[1]);
    } catch (ArithmeticException e) {
      System.out.println("Erro de divisão por zero.");
      System.out.println(e.getMessage());
    } catch (InputMismatchException e) {
      System.out.println("Erro capturado.");
      System.out.println(e.getMessage());
    }
  }

}
