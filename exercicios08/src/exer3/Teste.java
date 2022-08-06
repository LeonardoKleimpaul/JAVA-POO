package exer3;

public class Teste {
  public static void main(String[] args) {

    // 3.a)
    double potencia = Math.pow(2, 10);
    System.out.println("\nPotencia de 2^10 = " + potencia);

    // 3.b)
    System.out.println("\nRaiz quadrada de 1000 = " + Math.sqrt(1000));

    // 3.c)
    System.out.println("\nValor absoluto de -10 = " + Math.abs(10));

    // 3.d)

    // 3.e)

    // 3.f)
    System.out.println("\n4,9 arredondado para cima = " + Math.ceil(4.9));

    // 3.g)
    System.out.println("\n4,9 arredondado para baixo = " + Math.floor(4.9));

    // 3.h)
    double seno = Math.toRadians(90);
    double cosseno = Math.toRadians(90);
    double tangente = Math.toRadians(45);

    System.out.println("\nSeno: " + Math.round(Math.sin(seno)) +
        "\nCosseno: " + Math.round(Math.cos(cosseno)) +
        "\nTangente: " + Math.round(Math.tan(tangente)));

  }

}
