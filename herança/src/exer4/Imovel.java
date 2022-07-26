package exer4;

public class Imovel {

  private String endereco;
  private float preco;

  public void infoImovel() {
    System.out.println("Imóvel" +
        "\nEndereço: " + getEndereco() +
        "\nPreço: " + getPreco());
  }

  public Imovel() {
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

}
