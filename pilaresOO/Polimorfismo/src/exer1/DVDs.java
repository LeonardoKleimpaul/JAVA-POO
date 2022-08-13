package exer1;

public class DVDs extends Produtos {

  private float duracao;

  public DVDs() {
  }

  public DVDs(String nome, float preco, float duracao) {
    super.setNome(nome);
    super.setPreco(preco);
    this.duracao = duracao;
  }

  public float getDuracao() {
    return duracao;
  }

  public void setDuracao(float duracao) {
    this.duracao = duracao;
  }

  @Override
  public String toString() {
    return " " +
        "\nNome: " + getNome() +
        "\nPreço: " + getPreco() +
        "\nDuração: " + getDuracao();
  }
}
