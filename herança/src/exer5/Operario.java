package exer5;

public class Operario extends Empregado {

  private float valorProducao;
  private float comissao;

  public Operario() {
  }

  public float getValorProducao() {
    return valorProducao;
  }

  public void setValorProducao(float valorProducao) {
    this.valorProducao = valorProducao;
  }

  public float getComissao() {
    return comissao;
  }

  public void setComissao(float comissao) {
    this.comissao = comissao;
  }

  public float calcSal() {
    return super.calcSal() + (getValorProducao() * getComissao() / 100);
  }

  public void infoOperario() {
    super.infoP();
    System.out.println("Setor: " + getCodSetor());
    System.out.println("Salário com comissão: "+ this.calcSal());
  }
}
