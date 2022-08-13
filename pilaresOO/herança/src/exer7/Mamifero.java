package exer7;

public class Mamifero extends Animal {

  private String alimento;

  public Mamifero() {
  }

  public Mamifero(String nome, String cor, String ambiente, int comprimento, int patas, float velocidade,
      String alimento) {
    super(nome, cor, ambiente, comprimento, patas, velocidade);
    this.alimento = alimento;
  }

  public String getAlimento() {
    return alimento;
  }

  public void setAlimento(String alimento) {
    this.alimento = alimento;
  }

  public void dados() {
    super.dados();
    System.out.println("Alimento: " + getAlimento());
  }
}
