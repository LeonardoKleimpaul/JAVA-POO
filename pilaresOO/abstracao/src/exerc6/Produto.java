package exerc6;

public class Produto {

  String nome;
  double peso, preco, precoAux, aumento;

  public Produto(String nome, double peso, double preco) {
    this.nome = nome;
    this.peso = peso;
    this.preco = preco;
  }

  void aumentarPreco(Produto produto) {
    if (preco <= 50) {
      aumento = preco + (preco * 0.20);
      precoAux = aumento - preco;
    } else if (preco > 50) {
      aumento = preco + (preco * 0.10);
      precoAux = aumento - preco;
    }
    System.out.println("Reajuste de " + precoAux);
    System.out.println("Novo preco: " + aumento);
  }

}
