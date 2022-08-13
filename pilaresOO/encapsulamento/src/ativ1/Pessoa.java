package ativ1;

public class Pessoa {

  private String nome;
  private int anoNasc;
  private int idade;
  private double altura;

  public void exibirPessoa() {
    System.out.println("Nome: " + getNome());
    System.out.println("Ano de Nascimento: " + getAnoNasc());
    System.out.println("Altura: " + getAltura());
  }

  void calcIdade() {
    idade = 2022 - anoNasc;
    System.out.println("Idade: " + idade);
  }


  // get set

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAnoNasc() {
    return anoNasc;
  }

  public void setAnoNasc(int anoNasc) {
    this.anoNasc = anoNasc;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

}
