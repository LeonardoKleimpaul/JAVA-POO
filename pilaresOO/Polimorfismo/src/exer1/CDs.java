package exer1;

public class CDs extends Produtos {

  private int nFaixas;

  public CDs() {
  }

  public CDs(String nome, float preco, int nFaixas) {
    super.setNome(nome);
    super.setPreco(preco);
    this.nFaixas = nFaixas;
  }

  public int getnFaixas() {
    return nFaixas;
  }

  public void setnFaixas(int nFaixas) {
    this.nFaixas = nFaixas;
  }

  @Override
  public String toString() {
    return " " +
        "\nNome: " + getNome() +
        "\nPreço: " + getPreco() +
        "\nNumero de Faixas: " + getnFaixas();
  }
}
