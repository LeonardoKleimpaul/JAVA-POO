public class Produto {

  private String nome;
  private double preco;
  private int quantEstoque;

  public Produto() {
  }

  public Produto(String nome, double preco, int quantEstoque) {
    this.nome = nome;
    this.preco = preco;
    this.quantEstoque = quantEstoque;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantEstoque() {
    return quantEstoque;
  }

  public void setQuantEstoque(int quantEstoque) {
    this.quantEstoque = quantEstoque;
  }

  public boolean verificarEstoque(Produto p) {
    if (p.getQuantEstoque() != 0) {
      return true;
    } else {
      return false;
    }

  }
}
