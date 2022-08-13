package ativ1;

public class Retangulos implements FormaGeo {

  private float base;
  private float altura;


  public Retangulos() {
  }

  public Retangulos(float base, float altura) {
    this.base = base;
    this.altura = altura;
  }

  public float getBase() {
    return base;
  }

  public void setBase(float base) {
    this.base = base;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }


  @Override
  public double calcArea() {
    return base * altura;
  }

  
} 
