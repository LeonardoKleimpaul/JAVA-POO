package exer3;

public class Exer3 {
  public static void main(String[] args) {
    try {
      int[] numeros = { 10, 0 };
      System.out.println(numeros[0] / numeros[1]);

    } catch (ArithmeticException e) {
      System.out.println("Erro de divisão por zero.");
      System.out.println(e.getMessage());
    }
  }
}
