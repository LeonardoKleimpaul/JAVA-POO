package ativ2;

public class Docente extends Funcionario {

  private int nivel;

  public void infoDocente() {
    super.infoFuncionario();
    System.out.println("Nível: " + getNivel());
  }

  @Override
  public double calcSalario() {
    setCalcSal(getSal() * 1.5);
    System.out.println("Salário Total: " + getCalcSal());
    return 0;
  }

  // get set
  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

}
