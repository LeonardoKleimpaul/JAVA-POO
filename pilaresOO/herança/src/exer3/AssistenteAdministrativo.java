package exer3;

public class AssistenteAdministrativo extends Assistente {

  private float adicionalNoturno;

  public void exibeDados() {
    super.exibeDados();
    System.out.println("Adicional noturno: " + getAdicionalNoturno());
  }

  public void adicionalNoturno(float adicionalNoturno) {
    setSalario(adicionalNoturno + getSalario());
    setAdicionalNoturno(adicionalNoturno);
  }

  public AssistenteAdministrativo() {
  }

  // get set
  public float getAdicionalNoturno() {
    return adicionalNoturno;
  }

  public void setAdicionalNoturno(float adicionalNoturno) {
    this.adicionalNoturno = adicionalNoturno;
  }

}
