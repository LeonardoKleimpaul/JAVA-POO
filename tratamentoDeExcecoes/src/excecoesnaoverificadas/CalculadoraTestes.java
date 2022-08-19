package excecoesnaoverificadas;

public class CalculadoraTestes {
  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    int soma = 0;

    soma = calc.somar(41, 1);
    if (soma == 42) {
      System.out.println("Correto!");
    } else {
      System.out.println("Problema.");
    }

    try {
      soma = calc.somar(Integer.MAX_VALUE, 1);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

}
