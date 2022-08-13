package ativ1;

public class Circulo implements FormaGeo  {

  private double raio;


  public Circulo() {
  }

  public Circulo(double raio) {
    this.raio = raio;
  }

  
  public double getRaio() {
    return raio;
  }
  
  public void setRaio(float raio) {
    this.raio = raio;
  }
  
  
  @Override
  public double calcArea() {
    return Math.PI * (raio * raio);
  }
}
