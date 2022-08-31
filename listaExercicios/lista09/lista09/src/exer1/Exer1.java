package exer1;

public class Exer1 {
  public static void main(String[] args) {

    try {
      int[] numeros = { 10, 0 };

      System.out.println(numeros[0] / numeros[2]);
    } catch (Exception e) {
      System.out.println("Erro capturado!!!");
      System.out.println(e.getMessage());
    }
  }
}
