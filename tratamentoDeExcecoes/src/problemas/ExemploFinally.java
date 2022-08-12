package problemas;
import java.util.Scanner;

public class ExemploFinally {
  public static void main(String[] args) {
    final int NUMERADOR = 42;
    Scanner scan = new Scanner(System.in);

    try {
      System.out.println("Digite o denominador: ");
      int denominador = scan.nextInt();

      int result = NUMERADOR / denominador;

      System.out.println("\nResultado de 42 / " + denominador + " = " + result);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      scan.close();
    }
    System.out.println("Fim do programa");
  }

}
