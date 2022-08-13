package ativ2;

public abstract class Funcionario {

  private String nome;
  private String funcao;
  private double sal;
  private double calcSal;

  public void infoFuncionario() {
    System.out.println("Nome: " + getNome());
    System.out.println("Função: " + getFuncao());
    System.out.println("Salário R$: " + getSal());
  }

  public abstract double calcSalario();

  // get set
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getFuncao() {
    return funcao;
  }

  public void setFuncao(String funcao) {
    this.funcao = funcao;
  }

  public double getSal() {
    return sal;
  }

  public void setSal(double sal) {
    this.sal = sal;
  }

  public double getCalcSal() {
    return calcSal;
  }

  public void setCalcSal(double calcSal) {
    this.calcSal = calcSal;
  }

}
