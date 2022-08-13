package exer4;

public class Novo extends Imovel {

  private float adicional;

  public void infoImovel() {
    super.infoImovel();
    System.out.println(getAdicional() + "% de acréscimo");
    System.out.println("Preço novo: " + getPreco());
  }

  public void aumentar() {
    setPreco(getPreco() * (getAdicional() / 100 + 1));
  }

  public Novo() {
  }

  public float getAdicional() {
    return adicional;
  }

  public void setAdicional(float adicional) {
    this.adicional = adicional;
  }

}
