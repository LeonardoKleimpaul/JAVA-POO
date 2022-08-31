import java.util.Scanner;

public class PontosFlutuantes {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    try {
      System.out.println("Entre com o seu primeiro salário: ");
      String str1 = scan.nextLine();
      str1 = str1.replaceAll(",", ".");
      double sal1 = Double.parseDouble(str1);

      System.out.println("Entre com o seu segundo salário: ");
      String str2 = scan.nextLine();
      str2 = str2.replaceAll(",", ".");
      double sal2 = Double.parseDouble(str2);

      System.out.println("Entre com o seu terceiro salário: ");
      String str3 = scan.nextLine();
      str3 = str3.replaceAll(",", ".");
      double sal3 = Double.parseDouble(str3);

      double mediaSal = (sal1 + sal2 + sal3) / 3;

      System.out.println("A média salarial é de: " + mediaSal);
    } catch (NumberFormatException e) {
      System.out.println("Digite somente numeros.");
    } finally {
      scan.close();
    }
  }
}