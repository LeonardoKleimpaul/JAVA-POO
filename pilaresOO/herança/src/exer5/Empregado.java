package exer5;

public class Empregado extends Pessoa {

  private int codSetor;
  private float salBase;
  private float imposto;

  public Empregado() {
  }

  public int getCodSetor() {
    return codSetor;
  }

  public void setCodSetor(int codSetor) {
    this.codSetor = codSetor;
  }

  public float getSalBase() {
    return salBase;
  }

  public void setSalBase(float salBase) {
    this.salBase = salBase;
  }

  public float getImposto() {
    return imposto;
  }

  public void setImposto(float imposto) {
    this.imposto = imposto;
  }

  public float calcSal() {
    return getSalBase() - (getSalBase() * getImposto() / 100);
  }

  public void infoEmpregado() {
    super.infoP();
    System.out.println("Setor: " + getCodSetor());
    System.out.println("Salário Liquido: " + calcSal());
  }
}
