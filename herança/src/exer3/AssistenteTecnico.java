package exer3;

public class AssistenteTecnico extends Assistente {

  private float bonusSalarial;

  public void exibeDados() {
    super.exibeDados();
    System.out.println("Bônus Salarial: " + getBonusSalarial());
  }

  public void bonusSalarial(float bonusSalarial) {
    setSalario(bonusSalarial + getSalario());
    setBonusSalarial(bonusSalarial);
  }

  public AssistenteTecnico() {
  }

  // get set
  public float getBonusSalarial() {
    return bonusSalarial;
  }

  public void setBonusSalarial(float bonusSalarial) {
    this.bonusSalarial = bonusSalarial;
  }

}
