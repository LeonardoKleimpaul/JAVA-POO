package excecoesnaoverificadas;

public class Calculadora {
  public int somar(int num1, int num2) {
    long resultado = (long) num1 + (long) num2;

    if (resultado > Integer.MAX_VALUE) {
      throw new  IllegalArgumentException("\n*** Problema Detectado ***\n"+ "Resultado fora da faixa dos números inteiros!\n");
    }
    return num1 + num2;
  }
}
