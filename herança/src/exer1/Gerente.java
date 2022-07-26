package exer1;

public class Gerente extends Empregado {

  private String departamento;

  @Override
  public String toString() {
    return "Gerente" +
        "\nDepartamento: " + getDepartamento() +
        "\nNome: " + getNome() +
        "\nSalário: " + getSal();
  }

  public Gerente() {
  }

  public Gerente(String nome, float sal, String departamento) {
    super.setNome(nome);
    super.sal = sal;
    this.departamento = departamento;
  }

  // get set
  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

}
