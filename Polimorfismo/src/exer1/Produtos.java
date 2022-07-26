package exer1;

public abstract class Produtos {

  private String nome;
  private float preco;

  public Produtos() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  @Override
  public abstract String toString();

}
