package calculadora;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculadoraTest {
  @Test
  public void deveriaSomarDoisNumerosPositivos() {
    // Arrange
    Calculadora calc = new Calculadora();

    // Act
    int soma = calc.somar(41, 1);

    // Assert
    Assertions.assertEquals(42, soma);
  }

  @Test
  public void deveriaSomarUmNumeroPositivoComZero() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(10, 0);
    Assertions.assertEquals(10, soma);
  }

  @Test
  public void deveriaSomarUmNumeroNegativoComPositivo() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(5, -5);
    Assertions.assertEquals(0, soma);
  }

  @Test
  public void deveriaSomarDoisNumerosNegativos() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(-2, -3);
    Assertions.assertEquals(-5, soma);
  }

  // ------ Subtração ------

  @Test
  public void deveriaSubtrairDoisNumerosPositivos() {
    Calculadora calc = new Calculadora();
    int subtrair = calc.subtrair(5, 3);
    Assertions.assertEquals(2, subtrair);
  }

  @Test
  public void deveriaSubtrairUmNumeroPositivoComZero() {
    Calculadora calc = new Calculadora();
    int subtrair = calc.subtrair(5, 0);
    Assertions.assertEquals(5, subtrair);
  }

  @Test
  public void deveriaSubtrairUmNumeroPositivoComPositivo() {
    Calculadora calc = new Calculadora();
    int subtrair = calc.subtrair(5, -3);
    Assertions.assertEquals(8, subtrair);
  }

  @Test
  public void deveriaSubtrairDoisNumerosNegativos() {
    Calculadora calc = new Calculadora();
    int subtrair = calc.subtrair(-5, -5);
    Assertions.assertEquals(0, subtrair);
  }

  // ------ Multiplicação ------

  @Test
  public void deveriaMultiplicarDoisNumerosPositivos() {
    Calculadora calc = new Calculadora();
    double multiplicar = calc.multiplicar(5, 5);
    Assertions.assertEquals(25, multiplicar);
  }

  @Test
  public void deveriaMultiplicarUmNumeroPositivoComZero() {
    Calculadora calc = new Calculadora();
    double multiplicar = calc.multiplicar(10, 0);
    Assertions.assertEquals(0, multiplicar);
  }

  @Test
  public void deveriaMultiplicarUmNumeroPositivoComNegativo() {
    Calculadora calc = new Calculadora();
    double multiplicar = calc.multiplicar(5, -5);
    Assertions.assertEquals(-25, multiplicar);
  }

  @Test
  public void deveriaMultiplicarDoisNumerosNegativos() {
    Calculadora calc = new Calculadora();
    double multiplicar = calc.multiplicar(-5, -5);
    Assertions.assertEquals(25, multiplicar);
  }

  // ------ Multiplicação ------

  @Test
  public void deveriaDividirDoisNumerosPositivos() {
    Calculadora calc = new Calculadora();
    double dividir = calc.dividir(10, 2);
    Assertions.assertEquals(5, dividir);
  }

  @Test
  public void deveriaDividirUmNumeroPositivoComNegativo() {
    Calculadora calc = new Calculadora();
    double dividir = calc.dividir(10, -2);
    Assertions.assertEquals(-5, dividir);
  }

  @Test
  public void deveriaDividirDoisNumerosNegativos() {
    Calculadora calc = new Calculadora();
    double dividir = calc.dividir(-10, -2);
    Assertions.assertEquals(5, dividir);
  }

}
