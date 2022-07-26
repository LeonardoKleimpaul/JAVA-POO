package exer3;

public class Assistente extends Funcionario {

  private int matricula;

  public void exibeDados() {
    super.exibeDados();
    System.out.println("Matrícula: " + getMatricula());
  }

  public Assistente() {
  }

  // get set
  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }
}
