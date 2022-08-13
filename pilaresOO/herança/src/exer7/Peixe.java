package exer7;

public class Peixe extends Animal {

  private String caracteristica;

  public Peixe() {
  }

  public Peixe(String nome, String cor, String ambiente, int comprimento, int patas, float velocidade,
      String caracteristica) {
    super(nome, cor, ambiente, comprimento, patas, velocidade);
    this.caracteristica = caracteristica;
  }

  public String getCaracteristica() {
    return caracteristica;
  }

  public void setCaracteristica(String caracteristica) {
    this.caracteristica = caracteristica;
  }

  public void dados() {
    super.dados();
    System.out.println("Caracterista: " + getCaracteristica());
  }
}
