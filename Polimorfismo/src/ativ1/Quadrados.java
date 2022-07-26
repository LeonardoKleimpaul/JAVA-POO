package ativ1;

public class Quadrados implements FormaGeo {

  private float lado;

  
  public Quadrados() {
  }
  
  public Quadrados(float lado) {
    this.lado = lado;
  }

  
  public float getLado() {
    return lado;
  }
  
  public void setLado(float lado) {
    this.lado = lado;
  }
  

  @Override
  public double calcArea() {
    return lado * lado;
  }
}
