package problemas;
public class PilhaDeChamadas {
  public static void main(String[] args) {
    int n = 42;
    System.out.println("***Início do método main()***");
    metodo1();
    System.out.println("***Fim do método main()***");
  }

  private static void metodo1() {
    System.out.println("\t***Início do método metodo1()***");
    metodo2();
    System.out.println("\t***Fim do método metodo1()***");
  }

  private static void metodo2() {
    System.out.println("\t\t***Início do método metodo2()***");
    metodo3();
    System.out.println("\t\t***Fim do método metodo2()***");
  }

  private static void metodo3() {
    System.out.println("\t\t\t***Início do método metodo3()***");
    try {
      Double.parseDouble("10,25");
    } catch (NumberFormatException e) {
      System.out.println("Problema detectado.");
      System.out.println(e.getMessage());
    }
    System.out.println("\t\t\t***Fim do método metodo3()***");
  }
}
