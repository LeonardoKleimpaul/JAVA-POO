package app;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

import dao.ProdutoDAO;
import model.Produto;

public class Main {
  public static void main(String[] args) {
    SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
    Locale.setDefault(new Locale("pt", "BR"));
    NumberFormat fm = NumberFormat.getCurrencyInstance();

    ProdutoDAO dao = new ProdutoDAO();

    /*
     * Produto prod = new Produto(null, "TV",
     * java.sql.Date.valueOf(LocalDate.now()), 20, new BigDecimal("8000.0"));
     * dao.adicionar(prod);
     

    Produto prod = new Produto(3,
        "Notebook",
        java.sql.Date.valueOf("2022-01-01"),
        30,
        new BigDecimal("20000.0"));

    dao.alterar(prod); 
    dao.excluir(3);



    List<Produto> lista = dao.listarTodos();

    System.out.println("+-----------------+");
    System.out.println("|Lista de Produtos|");
    System.out.println("+-----------------+");
    System.out.println("");

    for (Produto produto : lista) {
      System.out.println("Id...........: " + produto.getIdProd());
      System.out.println("Nome Produto.: " + produto.getNomeProduto());
      System.out.println("Data Cadastro: " + fd.format(produto.getDataCadastro()));
      System.out.println("Quantidade...: " + produto.getQuantidade());
      System.out.println("Preço........: " + fm.format(produto.getPreco()));
      System.out.println("");
    }*/

    Produto produto = dao.buscarPorId(3);
    if (produto != null) {
      System.out.println("Id...........: " + produto.getIdProd());
      System.out.println("Nome Produto.: " + produto.getNomeProduto());
      System.out.println("Data Cadastro: " + fd.format(produto.getDataCadastro()));
      System.out.println("Quantidade...: " + produto.getQuantidade());
      System.out.println("Preço........: " + fm.format(produto.getPreco()));
      System.out.println("");
    } else {
      System.out.println("Produto não encontrado!");
    }
  }
}
