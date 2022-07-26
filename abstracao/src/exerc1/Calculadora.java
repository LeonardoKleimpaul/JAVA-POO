package exerc1;

public class Calculadora {

  // atributos
  double result;

  // construtor
  public Calculadora(double n1, double n2) {
  }

  // metodos

  void soma(double n1, double n2) {
    result = n1 + n2;
    System.out.println("A soma de (" + n1 + " + " + n2 + ") é de : " + result);
  }

  void sub(double n1, double n2) {
    result = n1 - n2;
    System.out.println("A subtração de (" + n1 + " - " + n2 + ") é de : " + result);
  }

  void multi(double n1, double n2) {
    result = n1 * n2;
    System.out.println("A multiplicação de (" + n1 + " * " + n2 + ") é de : " + result);
  }

  void div(double n1, double n2) {
    result = n1 / n2;
    System.out.println("A divisão de (" + n1 + " ÷ " + n2 + ") é de : " + result);
  }

}
