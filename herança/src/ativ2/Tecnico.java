package ativ2;

public class Tecnico extends Funcionario {

  private double horaExtra;

  public void infoTecnico() {
    super.infoFuncionario();
    System.out.println("Hora extra R$: " + getHoraExtra());
  }

  @Override
  public double calcSalario() {
    setCalcSal(getHoraExtra() + getSal());
    System.out.println("Salário Total: " + getCalcSal());
    return 0;
  }

  // get set
  public double getHoraExtra() {
    return horaExtra;
  }

  public void setHoraExtra(double horaExtra) {
    this.horaExtra = horaExtra;
  }

}
