package exer3;

public class Comissionado extends Empregado {

  private double totalVendas;
  private double taxaComissao;

  public Comissionado(String nome, String sobrenome, String cpf, double totalVendas, double taxaComissao) {
    super(nome, sobrenome, cpf);
    this.totalVendas = totalVendas;
    this.taxaComissao = taxaComissao;
  }

  public double getTotalVendas() {
    return totalVendas;
  }

  public void setTotalVendas(double totalVendas) {
    this.totalVendas = totalVendas;
  }

  public double getTaxaComissao() {
    return taxaComissao;
  }

  public void setTaxaComissao(double taxaComissao) {
    this.taxaComissao = taxaComissao;
  }

  @Override
  public double vencimento() {
    return getTotalVendas() * (getTaxaComissao() / 100);

  }

  public void infoFuncionarios() {
    super.infoFuncionarios();
  }
}
