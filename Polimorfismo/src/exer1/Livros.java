package exer1;

public class Livros extends Produtos {

  private String autor;

  public Livros() {
  }

  public Livros(String nome, float preco, String autor) {
    super.setNome(nome);
    super.setPreco(preco);
    this.autor = autor;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  @Override
  public String toString() {
    return " " +
        "\nNome: " + getNome() +
        "\nPreço: " + getPreco() +
        "\nAutor: " + getAutor();
  }
}
