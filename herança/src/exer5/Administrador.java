package exer5;

public class Administrador extends Empregado {

  private float ajudaDeCusto;

  public Administrador() {
  }

  public float getAjudaDeCusto() {
    return ajudaDeCusto;
  }

  public void setAjudaDeCusto(float ajudaDeCusto) {
    this.ajudaDeCusto = ajudaDeCusto;
  }

  public float calcSal() {
    return super.calcSal() + getAjudaDeCusto();
  }

  public void infoAdministrador() {
    super.infoP();
    System.out.println("Setor: " + getCodSetor());
    System.out.println("Salário com ajuda de custo: " + this.calcSal());
  }
}
