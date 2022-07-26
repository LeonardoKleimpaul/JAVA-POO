package exer1;

public class Vendedor extends Empregado {

  float percentualComissao;
  double comissao;

  public void calcSal() {
    setComissao(getSal() * (getPercentualComissao() / 100 + 1));
  }

  @Override
  public String toString() {
    return "Vendedor" +
        "\nNome: " + getNome() +
        "\nSalário: " + getSal() +
        "\nSalário com comissão: " + getComissao() +
        "\nPercentual da comissao: " + getPercentualComissao();
  }

  public Vendedor(String nome, float sal, float percentualComissao) {
    super.setNome(nome);
    super.sal = sal;
    this.percentualComissao = percentualComissao;
  }

  // get set
  public float getPercentualComissao() {
    return percentualComissao;
  }

  public void setPercentualComissao(float percentualComissao) {
    this.percentualComissao = percentualComissao;
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

}
