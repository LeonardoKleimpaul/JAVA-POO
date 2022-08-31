public class Funcionario extends Pessoa {

  private Float salario;

  public Funcionario() {
  }

  public Funcionario(String nome, float salario) {
    super(nome);
    this.salario = salario;
  }

  public Float getSalario() {
    return salario;
  }

  public void setSalario(Float salario) {
    this.salario = salario;
  }

  @Override
  public String imprimeDados() {
    return "\nNome: " + getNome() +
        "\nSalário: " + getSalario() +
        "\nImposto sobre o salário: " + calculaImposto();
  }

  public Float calculaImposto() {
    return salario * 0.03f;
  }
}
