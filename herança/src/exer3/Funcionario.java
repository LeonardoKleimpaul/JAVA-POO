package exer3;

public abstract class Funcionario {

  private String nome;
  private float salario;
  private float salarioAnual;

  public void addAumento(float aumento) {
    setSalario(getSalario() + aumento);
  }

  public void ganhoAnual() {
    setSalarioAnual(getSalario() * 12);
  }

  public void exibeDados() {
    System.out.println("Nome: " + getNome());
    System.out.println("Salário: " + getSalario());
    System.out.println("Salário Anual: " + getSalarioAnual());
  }

  public Funcionario() {
  }

  public Funcionario(String nome, float salario) {
    this.nome = nome;
    this.salario = salario;
  }

  // get set
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public float getSalarioAnual() {
    return salarioAnual;
  }

  public void setSalarioAnual(float salarioAnual) {
    this.salarioAnual = salarioAnual;
  }
}
