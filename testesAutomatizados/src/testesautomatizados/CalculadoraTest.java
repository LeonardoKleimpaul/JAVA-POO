package testesautomatizados;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
  @Test
  public void deveriaSomarDoisNumerosPositivos() {
    // Arrange
    Calculadora calc = new Calculadora();

    // Act
    int soma = calc.somar(41, 1);

    // Assert
    Assert.assertEquals(42, soma);
  }

  @Test
  public void deveriaSomarUmNumeroPositivoComZero() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(10, 0);
    Assert.assertEquals(10, soma);
  }

  @Test
  public void deveriaSomarUmNumeroNegativoComPositivo() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(5, -5);
    Assert.assertEquals(0, soma);
  }

  @Test
  public void deveriaSomarDoisNumerosNegativos() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(-2, -3);
    Assert.assertEquals(-5, soma);
  }
}
