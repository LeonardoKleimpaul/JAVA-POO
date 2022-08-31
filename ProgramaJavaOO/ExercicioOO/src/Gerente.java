public class Gerente extends Funcionario {

  private String area;

  public Gerente() {
  }

  public Gerente(String nome, float salario, String area) {
    super(nome, salario);
    this.area = area;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String imprimeDados() {
    return "\nNome: " + getNome() +
        "\nSalário: " + getSalario() +
        "\nImposto sobre o salário: " + calculaImposto() +
        "\nÁrea: " + getArea();
  }

  public Float calculaImposto() {
    return getSalario() * 0.05f;
  }
}
