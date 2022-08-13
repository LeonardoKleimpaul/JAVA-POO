package exer5;

public class Vendedor extends Empregado {

  private float valorVendas;
  private int comissaoVendedor;

  public Vendedor() {
  }

  public float getValorVendas() {
    return valorVendas;
  }

  public void setValorVendas(float valorVendas) {
    this.valorVendas = valorVendas;
  }

  public int getComissaoVendedor() {
    return comissaoVendedor;
  }

  public void setComissaoVendedor(int comissaoVendedor) {
    this.comissaoVendedor = comissaoVendedor;
  }

  public float calcSal() {
    return super.calcSal() + (getValorVendas() * getComissaoVendedor() / 100);
  }

  public void infoVendedor() {
    super.infoP();
    System.out.println("Setor: " + getCodSetor());
    System.out.println("Salário com comissão: " + this.calcSal());
  }

}
