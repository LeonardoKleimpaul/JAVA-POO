package exer1;

public class Empregado {

  private String nome;
  protected double sal;

  @Override
  public String toString() {
    return "Empregado" +
        "\nNome : " + getNome() +
        "\nSalário: " + getSal();
  }

  public Empregado() {
  }

  public Empregado(String nome, double sal) {
    this.nome = nome;
    this.sal = sal;
  }

  // get set
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSal() {
    return sal;
  }

  public void setSal(double sal) {
    this.sal = sal;
  }

}
