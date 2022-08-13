package exer4;

public class Velho extends Imovel {

  private float desconto;

  public void infoImovel() {
    super.infoImovel();
    System.out.println(getDesconto() + "% de desconto.");
    System.out.println("Preço novo: " + getPreco());
  }

  public void descontar() {
    setPreco(getPreco() - (getPreco() * getDesconto() / 100));
  }

  public Velho() {
  }

  public float getDesconto() {
    return desconto;
  }

  public void setDesconto(float desconto) {
    this.desconto = desconto;
  }

}
