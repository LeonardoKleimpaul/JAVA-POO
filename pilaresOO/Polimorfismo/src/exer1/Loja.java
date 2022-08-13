package exer1;

import java.util.ArrayList;

public class Loja {
  public static void main(String[] args) {

    ArrayList<Produtos> produtos = new ArrayList<>();

    produtos.add(new Livros("Livro Legal", 35, "Marcelo"));
    produtos.add(new Livros("Livro bom", 30, "Pelé"));
    produtos.add(new CDs("Gustavo Lima", 50, 20));
    produtos.add(new DVDs("Vingadores", 45, 130));
    produtos.add(new DVDs("A Bela e a Fera", 25, 120));

    for (int i = 0; i < produtos.size(); i++) {
      System.out.println(produtos.get(i).toString());
    }

  }

}
