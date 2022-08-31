package exer2;

public class Exer2 {
  public static void main(String[] args) {

    try {
      int[] numeros = { 10, 0 };

      System.out.println(numeros[0] / numeros[2]);
    } catch (RuntimeException e) {
      System.out.println("Erro de runtime identificado.");
      System.out.println(e.getMessage());
    }
  }
}
